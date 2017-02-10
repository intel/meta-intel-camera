SUMMARY = "Intel linux camera unittests"
HOMEPAGE = "www.intel.com"
DEPENDS = "pkgconfig gtest iotivity camera3hal valgrind"
RDEPENDS_${PN} += "bash"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRCREV = "250b33a7f22bb220d3a551003b447cf2449a1032"
SRC_URI = "git://github.com/Intel-5xx-Camera/intel-camera-dev-support.git;protocol=http;branch=master"

S = "${WORKDIR}/git/unittests"

inherit autotools

FILES_${PN} += "/usr/share/camera_subsys_test/unittest.supp"
