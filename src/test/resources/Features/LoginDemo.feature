Feature: Test Login functionality

  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to home page
