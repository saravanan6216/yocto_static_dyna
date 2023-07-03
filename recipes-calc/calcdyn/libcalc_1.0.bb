
DESCRIPTION = "Simple calculator example dynamic library"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://add.c \
	  file://mul.c \
	  file://sub.c \
	  file://calc_dyn.pc"

S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
	${CC} -fPIC -g -c add.c mul.c sub.c
	${CC} -shared -Wl,-soname,libcalc.so.1 -o libcalc.so.1.0 add.o mul.o sub.o
}

do_install() {
	install -d ${D}${libdir}
	install -m 0755 libcalc.so.1.0 ${D}${libdir}
	ln -s libcalc.so.1.0 ${D}/${libdir}/libcalc.so.1
	ln -s libcalc.so.1 ${D}/${libdir}/libcalc.so
}
