
Feature: Registartion functionality

new user registering the account with mandatory fields

@Regression @smoke @sanity
Scenario: new user registering with mandotory fileds 
Given user navigates to the registering page
When i enter firstName as "subash" into FN field
And i enter LastName as "chandra Bose" into LN field
And i enter emailaddress as "subash@gmail.com" into email field
And i enter phone number as "1234567890" into phone field
And i enter the password "12345" into password field
And i enter the password "12345" into confirm password field
And i click on checkbox for privacy policy field
And i click on continue button
Then i should be able to registartion  successfully .
