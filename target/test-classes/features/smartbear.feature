@smart
Feature: Smart Bear Functionality

#  Scenario: User login to smart bear website
#   When User login with valid  username and password
#    Then User validates title and clicks order button
#   When User provides product information 'MyMoney','3'
#   And User provides address information 'Savr','4415 N Drake Ave','Chicago','State','60625'
#    And User provides payment infomation card,'1234567','12/12','VISA'
#  And User clicks button and validates message "New order has been successfully added."


#  Scenario Outline: User login to smart bear website
#    When User login with valid  username and password
 #   Then User validates title and clicks order button
#    When User provides product information '<productName>','<quantity>'
#    And User provides address information '<customerName>','<street>','<city>','<State>','<zipcode>'
#    And User provides payment infomation card,'<curdNumber>','<expirationDate>','<cardType>'
#    And User clicks button and validates message "<message>"

#Examples:
#| productName | quantity | customerName | street    | city  | State | zipcode | curdNumber | expirationDate | cardType | message                                |
#| MyMoney     | 4        | Savr         | Bustleton | Phila | PA    | 19116   | 983379     | 12/24          | VISA     | New order has been successfully added. |
#| FamilyAlbum     | 3        | Savr         | Bustleton | Phila | PA    | 19116   | 983379     | 12/24          | MASTERCARD     | New order has been successfully added. |
#| ScreenSaver    |6        | Savr         | Bustleton | Phila | PA    | 19116   | 983379     | 12/24          | AMERICAN EXPRESS    | New order has been successfully added. |

  Scenario: User login to smart bear website
    When User login with valid  username and password
    Then User validates title and clicks order button
      | Title | Web Orders |
    When User provides product information
      | ProductName | MyMoney |
      | Quantity    | 4       |
    And User provides address information
      | CustomerName | Savr   |
      | Street       | Midway |
      | City         | Phila  |
      | State        | PA     |
      | ZipCode      | 19116  |
    And User provides payment infomation
      | CardNumber     | 2938487 |
      | ExpirationDate | 06/04   |
      | CardType       | VISA    |
    And User clicks button and validates message
   | New order has been successfully added. |
