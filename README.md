# Selenium_Grid_Sample
Parallel Automation Execution with SeleniumGrid

This is the starter Selenium grid with TestNG Automation framework which you download and start working on.

Once you open the framework, we have a driverscript class which contains different test cases.

In order to run Grid, we first need to run the Selenium Grid jar file, You can run the Selenium Grid jar file and the hub and node url in the Driverscript class with your url. 

Command to run selenium grid for hub :
 java -jar selenium-server-standalone.jar -role hub

Command to run selenium grid for node :
java -jar selenium-server-standalone-2.53.0.jar -role webdriver -hub http://192.168.1.6:4444/grid/register -browser browserName=chrome –port 5566

http://192.168.1.6:4444/grid/register : {Grid Url}

I am running my test cases in google chrome, You might use any other browoser of your choice.



