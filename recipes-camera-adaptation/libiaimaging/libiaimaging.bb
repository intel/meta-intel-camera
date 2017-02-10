SUMMARY = "Intel imaging libraries"
HOMEPAGE = "www.intel.com"

S = "${WORKDIR}"

LICENSE = "LICENSE.txt"
LICENSE_PATH += "${S}/usr/share/${PN}"
LIC_FILES_CHKSUM = "file://${S}/usr/share/${PN}/LICENSE.txt;md5=9378218e91b55799eb0c63695823d956"

SRC_URI = "http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/libiaimaging-1.0.tar.gz"
SRC_URI[md5sum] = "8716287bc96aa443f244df96c1caa464"

INSANE_SKIP_${PN} = "ldflags already-stripped"

PACKAGES = "${PN}"

FILES_${PN} = "/usr/lib/*.so \
               /usr/lib/*.so.* \
               /usr/share/${PN}/LICENSE.txt"

do_install() {
    install -d ${D}/usr/lib
    cp -r ${S}/usr/lib/* ${D}/usr/lib/
    install -d ${D}/usr/share/${PN}
    install -m 0644 ${S}/usr/share/${PN}/LICENSE.txt ${D}/usr/share/${PN}/LICENSE.txt
}
