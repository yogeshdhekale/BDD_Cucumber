Feature: Login into application

  Scenario: Successful login

    Given user is already on login screen
    When title of webpage is E-banking
    Then user enters username and password
    And user clicks on login button
    And user is on homepage