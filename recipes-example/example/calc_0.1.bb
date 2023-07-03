DESCRIPTION = "CALCULATOR PROGRAM"
PRIORITY = "optional"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://calc.c file://add.c file://sub.c file://mul.c file://div.c"
S = "${WORKDIR}"
do_compile() {
	${CC} ${CFLAGS} ${LDFLAGS} -c add.c -o add.o
	${CC} ${CFLAGS} ${LDFLAGS} -c sub.c -o sub.o 
	${CC} ${CFLAGS} ${LDFLAGS} -c mul.c -o mul.o 
	${CC} ${CFLAGS} ${LDFLAGS} -c div.c -o div.o
	${AR} rcs libcal.a add.o sub.o mul.o div.o
	${CC} ${CFLAGS} ${LDFLAGS} -static calc.c -o calc ./libcal.a  
}
do_install() {
	install -d ${D}${bindir}
	install -m 0755 calc ${D}${bindir}
	install -d ${D}${libdir}
        install -m 0644 libcal.a ${D}${libdir}
}
