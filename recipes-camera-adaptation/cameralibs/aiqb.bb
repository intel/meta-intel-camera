SUMMARY = "Intel cameralibs aiqb files"
HOMEPAGE = "www.intel.com"

S = "${WORKDIR}"

LICENSE = "LICENSE.txt"
LICENSE_PATH += "${S}/usr/share/${PN}"
LIC_FILES_CHKSUM = "file://${S}/usr/share/${PN}/LICENSE.txt;md5=9378218e91b55799eb0c63695823d956"

SRC_URI = "http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/aiqb-1.0.tar.gz"
SRC_URI[md5sum] = "42154b7f872163b4ea6b39df4d34acc7"

FILES_${PN} += "/etc/atomisp/*.aiqb"

do_install() {
    install -d ${D}/etc/atomisp
    install -m 0644 ${S}/etc/atomisp/00imx214.aiqb ${D}/etc/atomisp/
    install -m 0644 ${S}/etc/atomisp/01ov5670.aiqb ${D}/etc/atomisp
    install -d ${D}/usr/share/${PN}
    install -m 0644 ${S}/usr/share/${PN}/LICENSE.txt ${D}/usr/share/${PN}/LICENSE.txt
}

