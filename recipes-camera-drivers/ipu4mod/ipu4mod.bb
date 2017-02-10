SUMMARY = "Intel camera modprobe"
HOMEPAGE = "www.intel.com"

LICENSE = "GPLv2"

do_install() {
    install -d ${D}/usr/bin
    install -m 0644 ${THISDIR}/files/camera-module-loading.sh ${D}/usr/bin/

    install -d ${D}/lib/systemd/system
    install -m 0644 ${THISDIR}/files/camera-module-loading.service ${D}/lib/systemd/system/camera-module-loading.service

    install -d ${D}/etc/systemd/system/multi-user.target.wants
    ln -sf /lib/systemd/system/camera-module-loading.service ${D}/etc/systemd/system/multi-user.target.wants/camera-module-loading.service
}

FILES_${PN} = "/usr/bin/camera-module-loading.sh \
    /etc/systemd/system/multi-user.target.wants/camera-module-loading.service \
    /lib/systemd/system/camera-module-loading.service \
"
