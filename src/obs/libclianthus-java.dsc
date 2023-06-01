Format: 1.0
Version: @obs.package.version@-0
Source: @obs.package.name@
Binary: @obs.package.name@
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
	00000000000000000000000000000000 0 @obs.package.name@_@obs.package.version@.orig.tar.xz
	00000000000000000000000000000000 0 @obs.package.name@_@obs.package.version@-0.diff.tar.xz
