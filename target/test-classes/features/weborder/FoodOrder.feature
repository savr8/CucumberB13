Feature: WebOrder page food Order Functionality

Background: Until invite list
  # Given User navigates to the 'https://demo.weborder.net'
   And User provides username "guest1@microworks.com" and password 'Guest1!'
   When User validates the titles "ORDER DETAILS - Weborder" from homepage
   And User clicks Group Order box and Next Button
   And User sends the "Test" for Note to Invitees section
   And User sends e-mail addresses which are "savr@gmail.com" and "gela@gmail.com" to Invite List

   Scenario: Testing the webOrder functionality for House
#      Given User navigates to the 'https://demo.weborder.net'
#      And User provides username "guest1@microworks.com" and password 'Guest1!'
#      When User validates the titles "ORDER DETAILS - Weborder" from homepage
#      And User clicks Group Order box and Next Button
#      And User sends the "Test" for Note to Invitees section
#      And User sends e-mail addresses which are "savr@gmail.com" and "gela@gmail.com" to Invite List
      And User chooses the delivery address "My House" and validates the address "3137 Laguna Street"
      And User clicks create group order button
      Then User validates the header of page which is "View Group Order"
      And User validates total participant is 1

   Scenario: Testing the webOrder functionality for Office
#      Given User navigates to the 'https://demo.weborder.net'
#      And User provides username "guest1@microworks.com" and password 'Guest1!'
#      When User validates the titles "ORDER DETAILS - Weborder" from homepage
#      And User clicks Group Order box and Next Button
#      And User sends the "Test" for Note to Invitees section
#      And User sends e-mail addresses which are "savr@gmail.com" and "gela@gmail.com" to Invite List
      And User chooses the delivery address "Office" and validates the address "2012 EMPIRE BLVD"
      And User clicks create group order button
      Then User validates the header of page which is "View Group Order"
      And User validates total participant is 1





