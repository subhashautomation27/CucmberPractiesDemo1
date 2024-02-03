
Feature: login functionality

Here we are perform DDT in cucumber ,  for login functionality 

@smoke @wip 
Scenario Outline: user logging with valid credentials
Given user navigate to the login page
When i enter the email address <email>
And i enter the password <password> 
And i click on  the login  button
Then i should be able to logged succesfully . 

Examples: 
|email             | pwd| 
|abc@gmail.com    | 1234|
|xyz@gmail.com		|123456|
|pqr@gmail.com		|1234567| 
