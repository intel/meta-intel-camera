SECURITY_CFLAGS_pn-cameralinuxadapt = "${SECURITY_NO_PIE_CFLAGS}"
SECURITY_CFLAGS_pn-camerasource = "${SECURITY_NO_PIE_CFLAGS}"
SECURITY_CFLAGS_pn-icameraadapter = "${SECURITY_NO_PIE_CFLAGS}"

REFKIT_IMAGE_EXTRA_INSTALL_intel-corei7-64 += "fw-ipu4 camera3hal icameraadapter cameraunittests aiqb ipu4mod camerasource pvl-gst pvl-cvtrace pvl-libs"

SUPPORTED_RECIPES_append = " ${META_INTEL_CAMERA_BASE}/conf/distro/include/intel-camera-supported-recipes.txt"
