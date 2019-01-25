build:
	mvn clean install

package:
	mvn clean install package

checkpackage:
	mvn versions:display-dependency-updates
