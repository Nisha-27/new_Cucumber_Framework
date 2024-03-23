
@scenario
Feature: Orange HRM login page 

Background: 
   Given user launch the Orange HRM url

Scenario: validation of login functionality  // providing the username and password in step definition
   When user enters the username in Login page
   And user enter password in login page
   And user clicks login button in login page
   Then user should be on Orange HRM page

Scenario: validation of login functionality by passing parameter
   When user enters the username "Admin" in Login page
   And user enter password "admin123" in login page
   And user clicks login button in login page
   Then user should be on Orange HRM page

   @smoke
   Scenario Outline: validation of login functionality with different test data
   When user enters the username "<UName>" in Login page
   And user enter password "<Pass>" in login page
   And user clicks login button in login page
   Then user should be on Orange HRM page
   
   Examples:
   |UName|Pass|
   |Admin|admin123|
   |Admin|hello123|
   |hello|admin123|
   |vv5tui|jiyyf|
   |gmail|ytrf09|
   
  