#
# resourceproto_1.2.0.bb
#
require xorg-proto-common.inc

SUMMARY = "XRes: X Resource extension headers"

DESCRIPTION = "This package provides the wire protocol for the X \
Resource extension.  XRes provides an interface that allows X clients to \
see and monitor X resource usage of various clients."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=604859305e662503077240fee8c77d97"

RCONFLICTS_${PN} = "resourceext"

PR = "r1"
PE = "1"

SRC_URI[md5sum] = "cfdb57dae221b71b2703f8e2980eaaf4"
SRC_URI[sha256sum] = "3c66003a6bdeb0f70932a9ed3cf57cc554234154378d301e0c5cfa189d8f6818"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-resource"
# There is not patch file
DEBIAN_PATCH_TYPE = "nopatch"
