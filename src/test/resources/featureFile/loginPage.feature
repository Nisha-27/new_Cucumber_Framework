	Feature: To validate the login page

  Scenario: validation of password reset link in login page
  Given user launches the url
  When user clicks the password reset link
  Then user should be on password reset page
  And user able to see the text box to enter the email address
    
   Scenario: validation of login functionality with valid credentials
   Given user need to launch the given url
   When user enters the username
   And user enter password
   And user clicks login button
   Then user should be on Home page
  
  
  