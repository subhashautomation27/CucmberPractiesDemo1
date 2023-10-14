Feature: Registration by using  data table
# user able to registration with all required fileds 

Background: Given user navigate to the register page

#Scenario: new user rigistarion with manadotory fields 
#When user clicks on register link
#And user enters the Fn "subash" into firstNmae field
#And user enters the LN "chandra Bose" into lastName filed
#And user enters the email address "subash123@gmail.com" into email address filed
#And user enters the telephone number "1234567890" into telephone filed
#And user enters the password "123456" into password filed
#And user enters the password "123456" into confirm password field
#And user clicks the newsettlers yes button
#And user clicks the privacy policy check box filed
#And user clicks the continu button
#Then user should be succesfully registred 

 
@DDTwithfileds @ignore
Scenario: new user Registration
When user enter the below data into the fields

|firstName 		| subash       |
|lastName 		 |	chnadra Bose|
|email address	| abc@gmail.com|
|telephone      |1234567890|
|password				|12245|
|password confirm 			|12235|
And user clicks the newsettlers yes button
And user clicks the privacy policy check box filed
And user clicks the continu button
Then user should be succesfully registred 
