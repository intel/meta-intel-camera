SUMMARY = "Intel camera drivers"
HOMEPAGE = "www.intel.com"
DESCRIPTION = "Intel camera drivers"

LICENSE = "GPLv2"

S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRCREV = "55df76be9a3c3138470d75df6173630ee4288f42"
SRC_URI = "git://github.com/01org/intel-camera-drivers.git;protocol=http;branch=master"

INSANE_SKIP_${PN} += "dev-deps"

EXTRA_OEMAKE += "EXTERNAL_BUILD=1"

do_install_append() {
    install -d ${D}${includedir}/camera-drivers/linux
    install -m 0644 $(find ${S}/include/uapi/linux/ -name "*.h") ${D}${includedir}/camera-drivers/linux/
}

