Feature: Feature to test google search functionality

Scenario: valid google search is working
Given browser is open
And user is on google page
When user enters a text in search text box
And user hits enter button
Then user is navigated to search results page