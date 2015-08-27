#
# base recipe: meta/recipes-devtools/intltool/intltool_0.50.2.bb
# base branch: daisy
#

PR = "r0"

require intltool.inc

inherit debian-package

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

NATIVEPATCHES = "file://noperlcheck.patch \
                 file://remove-xml-check.patch"
NATIVEPATCHES_class-native = "file://use-nativeperl.patch" 

SRC_URI += "file://intltool-nowarn.patch \
           file://uclibc.patch \
           ${NATIVEPATCHES} \
           "
