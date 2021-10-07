Feature: Feature to test the multiple scenarios

  Background: I want to login
    Given I was on login page
    When Enter valid rashmi@dell.com and 123456
    And Click on login button
    Then Home page is displaying.

  Scenario Outline: create a campaign and check campaign List
    When I click on campaign Tab
    Then campaign list page is opened
    When I click on newcampaign button
    Then navigate to create Newcampaign page
    When i enter valid <campaign name> and <status>
    And click on savebutton
    Then user navigates to campaign List page

    Examples: 
      | campaign name | status |
      | junnu         | Active |

  Scenario Outline: create a lead and check Leads list
    When I click on Lead Tab
    Then Lead list page is opened
    When I click on newLead button
    Then navigate to create NewLead Page
    When user enters valid <last name> and <company name>
    And click on savebutton
    Then user navigate to lead list page.

    Examples: 
      | last name | company name |
      | nadendla  | Tcs          |
