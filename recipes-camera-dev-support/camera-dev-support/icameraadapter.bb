SUMMARY = "icamera to camera3hal adapter"
HOMEPAGE = "www.intel.com"
DEPENDS = "pkgconfig camera3hal"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRCREV = "250b33a7f22bb220d3a551003b447cf2449a1032"
SRC_URI = "git://github.com/Intel-5xx-Camera/intel-camera-dev-support.git;protocol=http;branch=master"

S = "${WORKDIR}/git/icamera_adapter"

inherit autotools
