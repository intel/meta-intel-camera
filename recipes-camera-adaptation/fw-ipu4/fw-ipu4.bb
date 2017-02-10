SUMMARY = "Intel camera IPU4 FW"
HOMEPAGE = "www.intel.com"
DEPENDS = ""

S = "${WORKDIR}"

LICENSE = "LICENSE.ipu4"
LICENSE_PATH += "${S}/lib/firmware"
LIC_FILES_CHKSUM = "file://${S}/lib/firmware/LICENSE.ipu4;md5=9378218e91b55799eb0c63695823d956"

SRC_URI = "http://github.com/Intel-5xx-Camera/intel-camera-adaptation/raw/master/fw-ipu4-1.0.tar.gz"
SRC_URI[md5sum] = "bdc8a11b42b2e3bda4265030d50eb2ce"

FILES_${PN} += "/lib/firmware/*"

do_install() {
    install -d ${D}/lib/firmware
    install -m 0644 ${S}/lib/firmware/ipu4_cpd_b0.bin ${D}/lib/firmware/
    install -m 0644 ${S}/lib/firmware/LICENSE.ipu4 ${D}/lib/firmware/LICENSE.ipu4
}
