Feature: Feature to test google search functionality

  Scenario: validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then users navigates to search results
