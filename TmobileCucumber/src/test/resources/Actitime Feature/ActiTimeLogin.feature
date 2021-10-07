Feature: Feature to verify Actitime login functionality 

Scenario Outline: check login is successfull with valid credentials

Given  user is on actitime login page
When user enter valid <username> n <password>
And user click on login button
Then  user should navigate to enter time-track page




Examples:
	|username|password|
	|admin|manager|