#Author: Vaishnavi
#Date : 09-06-2022
#Description: practice
@smokeTest
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
