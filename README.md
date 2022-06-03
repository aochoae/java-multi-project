# Multi-project Builds with Gradle

### Requirements

* Java 8
* Gradle

### Documentation

* [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html)
* [Executing Multi-Project Builds](https://docs.gradle.org/current/userguide/intro_multi_project_builds.html)

### Project

**Viewing the structure of a multi-project build**

    ./gradlew -q projects

    ...
    
    Root project 'java-multi-project'
    +--- Project ':application'
    \--- Project ':library'

**Executing the main application**

    ./gradlew application:run

    ...
    
    > Task :application:run
    The sum of first 5 natural numbers is 15.
    The sum of first 5 even natural numbers is 30.

**Building and Testing**

*Build a simple jar file*

A simple `jar` file doesn't include the dependencies.

    ./gradlew application:build

The `library-1.0.0.jar` file should be in the same directory.

    java -jar application-1.0.0.jar

*Build a uber jar file*

A `uber jar` includes the dependencies.

    ./gradlew application:uberJar

You just need to run the next command

    java -jar application-1.0.0-uber.jar

The output for both `jar` files should be

    The sum of first 5 natural numbers is 15.
    The sum of first 5 even natural numbers is 30.
