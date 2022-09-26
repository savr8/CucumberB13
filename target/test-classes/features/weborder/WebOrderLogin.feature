@regression
Feature: Login Functionality of WebOrder Page

#  Background: Navigation to the website
#  #  Given User navigates to the 'https://demo.weborder.net'
#
#  Scenario: Validation of WebOrder Login Page(Happy Path)
#   # Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "guest1@microworks.com" and password 'Guest1!'
#    Then User validates the titles "ORDER DETAILS - Weborder" from homepage
#
#  Scenario: Validation of WebOrder Login Page(Correct Username Wrong password )
#   # Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "guest1@microworks.com" and password 'kshflk'
#    Then User validates the message 'Sign in Failed' from login page
#
#  Scenario: Validation of WebOrder Login Page( Wrong Username Correct password )
#  #  Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "kjzdk@gmail.com" and password 'Guest1!'
#    Then User validates the message 'Sign in Failed' from login page
#
#  Scenario: Validation of WebOrder Login Page( Empty Username Empty password )
#   # Given User navigates to the 'https://demo.weborder.net'
#    When User provides username "" and password ''
#   # Then User validates the message 'Sign in Failed' from login page

  Scenario: Validation of WebOrder Login Page( Empty Username Empty password )
    When User provides username "<username>" and password '<password>'
    Then User validates the message '<message>' from login page

  Example:Correct Username Wrong password
  |username|password|message|
  |guest1@microworks.com|kshflk|Sign in Failed|
  |kjzdk@gmail.com|Guest1|Sign in Failed|
  |guest1@microworks.com||Sign in Failed|
  ||Guest1|Sign in Failed|
  |||Sign in Failed|
  |*&*&%&$|&^&$^%#%|Sign in Failed|
  |89967518@gmail.com|jagja|Sign in Failed|
  |^$%*%*@gmail.com|75878|Sign in Failed|












