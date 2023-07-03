DESCRIPTION = "Simple calculator example"
SECTION = "examples"
LICENSE = "MIT"


LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "libcalc"
TARGET_CC_ARCH += "${LDFLAGS}"
SRC_URI = "file://cal.c"
S = "${WORKDIR}"

do_compile() {
	${CC} -o calc cal.c -lcalc
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 calc ${D}${bindir}
}
