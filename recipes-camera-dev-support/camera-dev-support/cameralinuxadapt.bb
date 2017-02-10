SUMMARY = "Intel linux camera adaptation"
HOMEPAGE = "www.intel.com"
DEPENDS = "pkgconfig gtest iotivity"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRCREV = "250b33a7f22bb220d3a551003b447cf2449a1032"
SRC_URI = "git://github.com/Intel-5xx-Camera/intel-camera-dev-support.git;protocol=http;branch=master"

S = "${WORKDIR}/git"

inherit autotools

FILES_${PN}-dev = "${prefix}/include/*.h \
                   ${prefix}/include/androidheaders/system/core/include/backtrace/*.h \
                   ${prefix}/include/androidheaders/system/media/private/camera/include/*.h \
                   ${prefix}/include/androidheaders/*.h \
                   ${prefix}/include/androidheaders/*/*.h \
                   ${prefix}/lib/*.la \
                   ${prefix}/lib/*.so \
                   ${prefix}/lib/pkgconfig/libutils.pc"
