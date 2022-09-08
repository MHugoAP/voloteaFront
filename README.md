# volotea Frontend Automation
***
Author: Miguel Hugo Alcántara Pérez (CTFL)
***
Automation of matching to the requested endpoints along with their method (POST, PUT, GET, DELETE).

##Background: https://www.volotea.com/es/

##Starting:
With this project we want to perform automated tests based on the SOLID principle, for better performance, BDD with Maven dependency manager is used in the reports. These tests will be in Frontend

##Table of Contents
1.	[GeneralInformation] (#general-information)
2.	[Tools] (#tools)
3.	[Installation] (#installation)
4.	[ProjectStructure] (#project-structure)
5.	[FeatureExecution] (#feature-execution)
6.	[ExecuteClassJava] (#execute-java-class)
***
#general-information
The automation of the request will be carried out by implementing various endpoints using the methods get, post; related to the backend applying a certain design pattern, environment variables and various tools that will help us in creating it. All this was done on a personal machine with the features: MSI, Windows 10, Intel Core i7 10Th, 32 GB RAM.
***
### tools
A list of the tools that will be used in the project:
•	[Java JDK] (https://www.oracle.com/mx/java/technologies/javase/javase8-archive-downloads.html): Version 1.8
•	[Maven] (https://maven.apache.org/download.cgi): Version 3.8.6
•	[Intelling IDE] (https://www.jetbrains.com/es-es/idea/download/#section=windows): Version 2022.2.1
•	[Git] (https://git-scm.com/download/win): Version 2.37.2###instalación
•	Cucumber
•	BDD
•	Serenity
•	design pattern: screen play architecture
***
### installation
A small introduction of the installation
1.	When you download java, it will leave you an .exe file, proceed to execute it and carry out the assigned steps. We proceed to find a video on how to set environment variables
2.	The same happens with Maven, it will ask you to select the path, and you proceed to the installation. We proceed to find a video on how to set environment variables
3.	In intellij you do the same, it gives you a default path (you can change it) you proceed with the installation, remember that our project is with java implementing Cucumber.
4.	We open Intellij, we go to the File section, now we go to the plugins section, in the magnifying glass we look for “Cucumber for java” and we proceed to install it.
5.	To install Git, we execute the .exe file, follow the steps requested from it and proceed to open said program. The next thing is to configure git globally, you have to have a registered account on GitHub (https://github.com/)
***
### project-structure
The project will have this structure

            voloteaFront > src > main > java > com.speedup.qa > interactions
					                                          > models > class.java (all the .java classes that will have the constructors, getter and setter)

                                                              > questions > class.javs (all the .java classes that will have the objective of validating and/or verifying that the tasks are correct)

                                                              > tasks > class.java (all the .java classes that will have the objective of carrying out the tasks that a "user" has to carry out)

                                                              > userinterface > class.java (all the .java classes that will have the objective of having the locators that we are going to implement)

		                        test > java > com.speedup.qa  > runners > class.java (all the .java that will be used to execute the feature and 
                                                                      translate from the gherkin language to java)
                                                              > stepdefiniton > class.java (all the steps to implement such as the given, when and then)
                                     > resource > features > NameFeature.feature (all .features to be used)
                                                        
                          chromedrive.exe (executable file for functionality when opening the browser)
                          pom.xml (all the necessary dependencies that were implemented in the project)
                          serenity.properties (serenity basic configuration)
***
### feature-execution
In order to execute the features, you need an execution order in the runners, its correct execution would be:
1. have the feature well defined
2. execute the class that has the runner folder according to the required feature
3. copy the result that I send you in the terminal and paste it to the step definition .java
4. finally perform the other operations, methods and import the necessary resources
***
### execute-java-class
To execute all the functionality, you must have the files that are needed in said implementation, with all this obtained, we proceed to execute the runner.java according to the required feature. We proceed to automate the web page, giving us a folder called taeget which will have the project report. To have a better report we will execute a command in the intellij terminal: mvn clean verify serenity:aggregate
It only remains to find that .html file and open it with our browser: target > site > > derenity > index.thml
***