@product
Feature: Testing Tumbler Functionality

  Scenario: Tumbler Login
    Given User navigates to the Tumbler
    When User logges in with wrong crudential
    Then User validates error message