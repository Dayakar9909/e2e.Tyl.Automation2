This repository contains a selenium-cucumber-java saucedemo project

Installation (pre-requisites)

JDK 1.8+ (make sure Java class path is set)
Maven (make sure .m2 class path is set)
Eclipse
Eclipse Plugins for
Maven
Cucumber
Browser driver (make sure you have your desired browser driver and class path is set)
Framework set up
Clone repository from git or download zip and set it up in your local workspace.


Building the project
mvn clean 

Confirm you can retrieve all dependencies by running
 mvn dependency:resolve

Running tests locally in Chrome browser
mvn verify -P chrome


Reporters

HTML Report:
To generate HTML report use mvn test -Dcucumber.options="–plugin html:target/result.html"

JSON Report:
To generate a JSON report Use mvn test -Dcucumber.options="–plugin json:target/result.json"

Tests are written in the Cucumber framework using the Gherkin Syntax

==========================================================
Additing this extra message to differentiate the Changes
==========================================================



