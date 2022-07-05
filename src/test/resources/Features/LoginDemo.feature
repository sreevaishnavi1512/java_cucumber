Feature: Test Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username  | password |
      | Ele       |    12345 |
      | Ilia      |    12345 |
