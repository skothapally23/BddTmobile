Feature: Feature to test login crm Application

  Scenario Outline: Login to Tmobile application to check whether login is successful or not.
    Given user is in browser page
    When user is login page
    And user gives login <username> and <password>
    And user click on sign in button
    Then user navigate to home page

    Examples: 
      | username        | password |
      | rashmi@dell.com |   123456 |
