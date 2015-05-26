require xorg-proto-common.inc

SUMMARY = "DRI2: Direct Rendering Infrastructure 2 headers"

DESCRIPTION = "This package provides the wire protocol for the Direct \
Rendering Ifnrastructure 2.  DIR is required for may hardware \
accelerated OpenGL drivers."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=2e396fa91834f8786032cad2da5638f3 \
                    file://dri2proto.h;endline=31;md5=22f28bf68d01b533f26195e94b3ed8ca"


SRC_URI[md5sum] = "b2721d5d24c04d9980a0c6540cb5396a"
SRC_URI[sha256sum] = "f9b55476def44fc7c459b2537d17dbc731e36ed5d416af7ca0b1e2e676f8aa04"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-dri2"
DEBIAN_PATCH_TYPE = "quilt"

debian_patch_quilt() {
        if [ ! -s ${DEBIAN_UNPACK_DIR}/debian/patches/series ]; then
                bbfatal "no patch in series"
        elif test $(ls ${DEBIAN_UNPACK_DIR}/debian/patches/ | wc -l) -ne 1; then
                QUILT_PATCHES=${DEBIAN_UNPACK_DIR}/debian/patches \
                        quilt --quiltrc /dev/null push -a
        fi
}
