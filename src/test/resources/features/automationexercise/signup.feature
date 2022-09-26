#it is user story
Feature: Sign up Functionality
  #test discription .It means what you are going to test here
  Scenario: Creating and deleting user
    Given User navigates to the automationExercise web page
    And User validates the url of the page
    When User clicks signUplogin button
    Then User verifies New User signUp is visible
    And User Enter name,email address and click signup Button

