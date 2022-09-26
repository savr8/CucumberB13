@regression
Feature: Etsy Search Functionality

  Scenario: Validation title of Etsy Search Hat
    When User searches for 'Hat'
    Then User validates the titles is 'Hat - Etsy'

  Scenario: Validation title of Etsy Search Key
    When User searches for 'Key'
    Then User validates the titles is 'Key - Etsy'
  Scenario: Validation title of Etsy Search Pin
    When User searches for 'Pin'
    Then User validates the titles is 'Pin - Etsy'
