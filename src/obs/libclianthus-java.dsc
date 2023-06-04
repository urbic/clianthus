Format: 1.0
Version: @obs.package.version@-0
Source: lib@obs.package.name@-java
Binary: lib@obs.package.name@-java
Maintainer: @project.developer.name@ <@project.developer.email@>
Architecture: all
Build-Depends:
	debhelper (>=10),
	openjdk-11-jdk-headless,
	openjdk-11-doc,
	junit5,
	ant-optional,
	ivy-debian-helper,
	libjline-java,
	libjline-java-doc,
	libxslthl-java
Vcs-Git: @project.scm.url@.git
Vcs-Browser: @project.scm.url@
Homepage: @project.scm.url@
Debtransform-Tar: @project.name@-@obs.package.version@.tar.xz
Files:
	00000000000000000000000000000000 0 lib@obs.package.name@-java_@obs.package.version@.orig.tar.xz
	00000000000000000000000000000000 0 lib@obs.package.name@-java_@obs.package.version@-1.diff.tar.xz
