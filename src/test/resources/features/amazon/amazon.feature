@production
Feature: Amazon search functionality

  Scenario: Positive scenario for amazon search
    Given User navigates to the Amazon
    When User searches for iphone thirteen case
    Then User validates is fifty thousand results
    And User validates all headers contains IPhone