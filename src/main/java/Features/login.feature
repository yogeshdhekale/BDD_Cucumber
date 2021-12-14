Feature: Login into application

  #Without Examples keyword
  @Smoke
  Scenario: Successful login

    Given user is already on login screen
    When title of webpage is E-banking
    Then user enters "siliconyoga" and "@Sept2021"
    And user clicks on login button
    And user is on homepage

