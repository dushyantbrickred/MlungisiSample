Project Specs:
JAVA VERSION : 11
APACHE MAVEN: 3.8.6
Latest Selenium Chome driver: Version 106
Latest Selenium FireFox Driver: 105.0.3 -64bit
Latest Selenium Edge Driver: Version 106.0.1370.42 

To Change browser navigate to MlungisiSample/serenity.properties and change webdriver.drive in line 3 and you will also see the location of windows, mac and linux selenium drivers location
To run go to terminate after the dependencies have installed correctly and run mvn clean verify
Once test is done navigate to MlungisiSample\src\test\resources\reports to see both extend and serenity report
