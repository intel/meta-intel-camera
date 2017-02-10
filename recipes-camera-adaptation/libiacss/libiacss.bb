SUMMARY = "Intel libiacss"
HOMEPAGE = "www.intel.com"
DEPENDS = "pkgconfig expat libiaimaging cameralibs"

S = "${WORKDIR}"

LICENSE = "LICENSE.txt"
LICENSE_PATH += "${S}/usr/share/${PN}"
LIC_FILES_CHKSUM = "file://${S}/usr/share/${PN}/LICENSE.txt;md5=9378218e91b55799eb0c63695823d956"

SRC_URI = "http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/libiacss-1.0.tar.gz"
SRC_URI[md5sum] = "5167c34d0a49a78bb02b31c3c63c4ce5"

INSANE_SKIP_${PN} = "already-stripped"

FILES_${PN} += "/usr/lib/*"


do_install() {
    install -d ${D}/usr/lib
    cp -r ${S}/usr/lib/* ${D}/usr/lib/
    install -d ${D}/usr/share/${PN}
    install -m 0644 ${S}/usr/share/${PN}/LICENSE.txt ${D}/usr/share/${PN}/LICENSE.txt
}

