# Basic commands

## Create a new Maven project
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart

## Compile
mvn compile

## Run tests
mvn test

## Skip tests
mvn package -DskipTests

## Clean and rebuild
mvn clean package

## Install locally
mvn clean install

## View dependency tree
mvn dependency:tree

## Check for dependency updates
mvn versions:display-dependency-updates

## Verify build
mvn verify

## Help on a plugin
mvn help:describe -Dplugin=org.apache.maven.plugins:maven-compiler-plugin

## Interactive help
mvn help:active-profiles

## JAR Commands
java -cp target/myapp.jar com.example.Main => Uses classpath directly; doesn’t need a manifest
java -jar target/myapp.jar                 => Uses the manifest’s Main-Class
jar tf target/myapp-1.0-shaded.jar.        => List files and directories of the JAR
