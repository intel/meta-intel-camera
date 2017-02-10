SUMMARY = "Intel PVL libraries"
HOMEPAGE = "www.intel.com"

LICENSE = "LICENSE.txt"
LICENSE_PATH += "${S}/usr/share/${PN}"
LIC_FILES_CHKSUM = "file://${S}/usr/share/${PN}/LICENSE.txt;md5=9378218e91b55799eb0c63695823d956"

SRC_URI = "http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/pvl-libs-1.0.tar.gz;name=pvl"
SRC_URI_append = " http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/pvl-libs-dev-1.0.tar.gz;name=pvl-dev"

SRC_URI[pvl.md5sum] = "9472b0a33155a55c37c1b3b54d08ce61"
SRC_URI[pvl-dev.md5sum] = "f5e610493864f9f7facbb16f9327f762"

INSANE_SKIP_${PN} = "ldflags already-stripped"

PACKAGES = "${PN} ${PN}-dev"

FILES_${PN} = "/usr/lib/*.so \
               /usr/lib/*.so.* \
               /usr/share/${PN}/LICENSE.txt"

FILES_${PN}-dev = "/usr/include/pvl/*.h \
                   /usr/lib/pkgconfig/pvl_libs.pc"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/usr/lib
    cp -r ${S}/usr/lib/* ${D}/usr/lib/
    install -d ${D}/usr/include/pvl
    cp -r ${S}/usr/include/pvl/* ${D}/usr/include/pvl/
    install -d ${D}/usr/share/${PN}
    install -m 0644 ${S}/usr/share/${PN}/LICENSE.txt ${D}/usr/share/${PN}/LICENSE.txt
}
