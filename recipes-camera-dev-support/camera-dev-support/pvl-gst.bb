SUMMARY = "PVL Gstreamer plugin"
HOMEPAGE = "www.intel.com"
DEPENDS = "pkgconfig pvl-libs glib-2.0 gstreamer1.0 gstreamer1.0-plugins-base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit autotools pkgconfig

SRCREV = "250b33a7f22bb220d3a551003b447cf2449a1032"
SRC_URI = "git://github.com/Intel-5xx-Camera/intel-camera-dev-support.git;protocol=http;branch=master"

S = "${WORKDIR}/git/pvl/pvl-gst"

FILES_${PN} = " ${libdir}"
FILES_${PN}-dev = " ${includedir}"

INSANE_SKIP_${PN} += "dev-so debug-files"

PACKAGES = "${PN} ${PN}-dev"

