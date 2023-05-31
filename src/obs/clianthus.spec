#
# spec file for package @obs.package.name@
#
# Copyright (c) 2023 SUSE LLC
#
# All modifications and additions to the file contributed by third parties
# remain the property of their copyright owners, unless otherwise agreed
# upon. The license for this file, and modifications and additions to the
# file, is the same license as for the pristine package itself (unless the
# license for the pristine package is not an Open Source License, in which
# case the license is the MIT License). An "Open Source License" is a
# license that conforms to the Open Source Definition (Version 1.9)
# published by the Open Source Initiative.

# Please submit bugfixes or comments via https://bugs.opensuse.org/
#


Name:           @obs.package.name@
Version:        @obs.package.version@
Release:        0
Summary:        @obs.package.summary@
License:        Zlib
Group:          Development/Libraries/Java
URL:            https://github.com/urbic/%{name}
Source:         %{name}-%{version}.tar.xz
BuildRequires:  ivy-local
BuildRequires:  java-devel >= 17
BuildRequires:  java-javadoc >= 17
BuildRequires:  javacc
BuildRequires:  mvn(net.sf.docbook:docbook-xsl-saxon)
BuildRequires:  mvn(org.apache.ant:ant-junitlauncher)
BuildRequires:  mvn(org.junit.jupiter:junit-jupiter-api)
Requires:       java-headless >= 17
BuildArch:      noarch

%description
@obs.package.description@

%package javadoc
Summary:        Javadocs for %{name}
Group:          Documentation/HTML
BuildRequires:  fdupes
Requires:       jpackage-utils

%description javadoc
This package contains the API documentation for %{name}.

%prep
%setup -q
rm ivysettings.xml

%build
LC_ALL=C.UTF-8 \
	%{ant} -Divy.mode=local -v \
	build

%check
LC_ALL=C.UTF-8 \
	%{ant} -Divy.mode=local -v \
	test

%install
LANG=C.UTF-8 \
	%{ant} -Divy.mode=local -v \
	-Ddestdir=%{buildroot} \
	install
%fdupes %{buildroot}%{_javadocdir}/%{name}

%add_maven_depmap coneforest.%{name}.pom coneforest.%{name}.jar

%files -f .mfiles
%dir %{_defaultlicensedir}/%{name}
%license %{_defaultlicensedir}/%{name}/LICENSE
%doc %{_defaultdocdir}/%{name}

%files javadoc
%{_javadocdir}

#%%changelog
