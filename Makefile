run-dist:
	./build/install/app/bin/app
mkInstallDist: #build
	./gradlew clean
	./gradlew installDist
lint: #run Linter
	./gradlew checkstyleMain
dependency: 
	./gradlew dependencyUpdates
doc: #generate Javadoc
	./gradlew javadoc
