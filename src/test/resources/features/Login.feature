@all
Feature: login functionality
user login to the application with valid credentials 

Background: 
Given user navigate to the login page
And user clicks on the login button
 @all @Regression @smoke @dev @joshith
Scenario: user login to the application for access account with valid credentials

When  user enters the email as "subbu1234@gmail.com" to the email field
And user enters the password  as "1234" to the password field 

Then user should be succesfully logged

  @Regression @smoke @ignore
Scenario: user login to the application with invalid credentials

When user enters invalid email as "subba@gmail.com" to the email field
And user enters invalid password as "123456" to the password field 

Then user should be able to see warnning mesage successfully 

@all @Regression @wip
Scenario: user login to the application with invalid email and valid password

When user enters invalid email as "subba@gmail.com" to the email field
And   user enters the password  as "1234" to the password field 

Then user should be able to see warnning mesage successfully 

@smoke @wip
Scenario: user login to the application with valid email and invalid password

When user enters invalid email as "subbu1234@gmail.com" to the email field
And   user enters the password  as "12343456" to the password field 

Then user should be able to see warnning mesage successfully 

@Regression @ignore
Scenario: user login to the application without enters the credentials

When user not enters the email id and password into the fields

Then user should be able to see warnning mesage successfully

@smoke @dev
Scenario: user logged successfully when enters the invalid credentials 

When user enters invalid email as "subba@gmail.com" to the email field
And user enters invalid password as "123456" to the password field 

Then user should be able to see warnning mesage successfully 
But user should be able to see succsfully logged message 


















