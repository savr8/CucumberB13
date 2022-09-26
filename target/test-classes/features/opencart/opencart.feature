Feature:Creating and validating employee address

  Scenario Outline: Sign Up Employee and Validating the Message
    Given User Provides valid username and password for openChart website
    And User click the close button from alert-pop up
    When User clicks customer button and validate the 'Customers'
    And User clicks add customer button and validate the header 'Customer List'
    And User clicks Address Button and provide '<firstName>','<lastName>','<address>','<city>','<country>','<region>'
    Then User clicks save Button and validate the message 'Warning: You do not have permission to modify customers!'

    Examples:
      | firstName | lastName | address     | city         | country | region |
      | Savr      | Much     | 8 bustleton | Philadelphia | Japan   | Akita  |
      | Gela      | Bad      | 8 bustleton | Philadelphia | Japan   | Akita  |
      | Alex      | Dj       | 8 bustleton | Philadelphia | Japan   | Akita  |