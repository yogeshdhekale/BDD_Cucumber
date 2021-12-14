
Feature: Amezon order page
  In order screen, I will check my order details.

  Background:
    Given user is registered on Amazon
    Given user is on Amazon login screen
    When user enters username and password
    And user navigates to Order details screen

  Scenario: Check previous order details
    When user clicks Orders tab
    Then user checks previous orders

  Scenario: Check open order details
    When user clicks Open Orders tab
    Then user checks open orders

  Scenario: Check cancelled order details
    When user clicks Cancelled Orders tab
    Then user checks cancelled orders