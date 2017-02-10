SUMMARY = "Intel camerasource"
HOMEPAGE = "www.intel.com"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base orc icameraadapter"

LICENSE = "LGPLv2.1"

DEBIAN_NOAUTONAME_${PN} = "1"
DEBIAN_NOAUTONAME_${PN}-dbg = "1"
DEBIAN_NOAUTONAME_${PN}-dev = "1"

# 17WW02 release
SRCREV = "8a4a9e575b382ff70f1950a4b52c9d835d982101"
SRC_URI = "git://github.com/01org/icamerasrc.git;branch=master"

S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=e431e272f5b8a6a4f948a910812f235e"

EXTRA_OECONF = "--with-headercheck=no --with-libcheck=no --with-cameralib=licamera_adapter --with-androidstubs=yes"

FILES_${PN} = "${prefix}/lib/gstreamer-1.0/* \
               ${prefix}/lib/*.so* \
"

inherit autotools

