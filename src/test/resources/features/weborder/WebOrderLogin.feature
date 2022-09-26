 @regression
Feature: Login Functionality of WebOrder Page

  Background: Navigation to the website
  #  Given User navigates to the 'https://demo.weborder.net'

  Scenario: Validation of WebOrder Login Page(Happy Path)
   # Given User navigates to the 'https://demo.weborder.net'
    When User provides username "guest1@microworks.com" and password 'Guest1!'
    Then User validates the titles "ORDER DETAILS - Weborder" from homepage

  Scenario: Validation of WebOrder Login Page(Correct Username Wrong password )
   # Given User navigates to the 'https://demo.weborder.net'
    When User provides username "guest1@microworks.com" and password 'kshflk'
    Then User validates the message 'Sign in Failed' from login page

  Scenario: Validation of WebOrder Login Page( Wrong Username Correct password )
  #  Given User navigates to the 'https://demo.weborder.net'
    When User provides username "kjzdk@gmail.com" and password 'Guest1!'
    Then User validates the message 'Sign in Failed' from login page

  Scenario: Validation of WebOrder Login Page( Empty Username Empty password )
   # Given User navigates to the 'https://demo.weborder.net'
    When User provides username "" and password ''
   # Then User validates the message 'Sign in Failed' from login page