#
# base recipe: meta/recipes-graphics/xorg-proto/xcb-proto.inc 
# base branch: daisy
#
SUMMARY = "XCB: The X protocol C binding headers"
DESCRIPTION = "Function prototypes for the X protocol C-language Binding \
(XCB).  XCB is a replacement for Xlib featuring a small footprint, \
latency hiding, direct access to the protocol, improved threading \
support, and extensibility."
HOMEPAGE = "http://xcb.freedesktop.org"
BUGTRACKER = "https://bugs.freedesktop.org/enter_bug.cgi?product=XCB"

INC_PR = "r0"

inherit debian-package

LICENSE = "MIT-X"

inherit autotools pkgconfig pythonnative

PACKAGES += "python-xcbgen"

FILES_${PN}-dev += "${datadir}/xcb/*.xml ${datadir}/xcb/*.xsd"
FILES_python-xcbgen = "${libdir}/python*"

RDEPENDS_${PN}-dev = ""
RRECOMMENDS_${PN}-dbg = "${PN}-dev (= ${EXTENDPKGV})"

DEPENDS_append_class-native = " python-native"
BBCLASSEXTEND = "native nativesdk"
