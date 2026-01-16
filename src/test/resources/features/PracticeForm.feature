Feature: practice form verification


    Background:
    Given User navigate to Forms
    When Click on Forms
    And Click on Practice Form

 @tc003 @regression @PracticeForm
  Scenario Outline: : verify practice form functionality
    And User provide firstname as "<firstName>" and last name as "<lastName>"
    And User provide Email as "<Email>" and provide phone number as "<phoneNumber>"
    And User Select geneder as "<gender>"
    And User click on Submit button
    Then user verify that Email address is matching with the "<Email>"


    Examples:
      |firstName|lastName|Email               |phoneNumber|gender|
      |Mike     |  Kabir | abcdsadsf@gmail.com|1234567890 | Male |
      |Rabia     | Jamil | abasdfw3f@gmail.com|1234111190 | Female|






