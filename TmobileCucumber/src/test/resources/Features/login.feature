Feature: feature to check login functionality


Scenario: check login is successfully with valid credentials
Given user is on login page
When user enters username and password
And user clicks on login button
Then user is on home page

