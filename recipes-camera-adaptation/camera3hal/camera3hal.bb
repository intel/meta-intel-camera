SUMMARY = "Intel camera3hal"
HOMEPAGE = "www.intel.com"
DEPENDS = "jpeg libiaimaging cameralinuxadapt libiacss cameralibs pkgconfig gtest aiqb virtual/kernel iotivity pvl-libs camera-drivers"

DEBIAN_NOAUTONAME_${PN} = "1"
DEBIAN_NOAUTONAME_${PN}-dev = "1"

S = "${WORKDIR}"

LICENSE = "LICENSE.txt"
LICENSE_PATH += "${S}/usr/share/${PN}"
LIC_FILES_CHKSUM = "file://${S}/usr/share/${PN}/LICENSE.txt;md5=a6562ca6966e474e311b818275216fe5"

SRC_URI = "http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/camera3hal-1.0.tar.gz;name=hal"
SRC_URI_append = " http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/camera3hal-dev-1.0.tar.gz;name=hal-dev"
SRC_URI[hal.md5sum] = "636b3a742dec758ea599a85a4e997a38"
SRC_URI[hal-dev.md5sum] = "54832623b5c3a0f0c0521287fb7d6a7b"

INSANE_SKIP_${PN} = "already-stripped"

PACKAGES = "${PN} ${PN}-dev"

FILES_${PN} += "/etc/*"
FILES_${PN} += "/usr/lib/*.so.*"

FILES_${PN}-dev += "/usr/lib/*.so"

do_install() {
    install -d ${D}/etc
    install -m 0644 ${S}/etc/* ${D}/etc/
    install -d ${D}/usr/lib
    cp -r ${S}/usr/lib/* ${D}/usr/lib/
    install -d ${D}/usr/share/${PN}
    install -m 0644 ${S}/usr/share/${PN}/LICENSE.txt ${D}/usr/share/${PN}/LICENSE.txt
}

inherit remove-libtool
