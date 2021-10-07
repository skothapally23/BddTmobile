Feature: Feature to test invalid date.

Background:
Given i was on browser
When enter the url

Scenario Outline:  To check invalid data in login page
Given In login page
When i need to enter invalid <username> and <password>
And i need to click on sign in button.
Then i should not enter into the application.

Examples:
   |username|password|
   |rashmi@|123456|
   |sravanthi|sravanthi|
   |rashmi @dell.com|123456|
   |raghavSir|Raghav|
   |username|password|
   |123456|rashmi@dell.com|
