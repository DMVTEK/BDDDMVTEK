Feature: Home page elements verification

  @tc001 @regression  @smoke
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"

  @tc002 @regression
  Scenario: verify practice form elements in forms section
    Given User navigate to Forms
    Then User Scroll down to locate “Forms” card
    And Click on Forms
    Then User Verify left panel menu is displayed
    And Click on Practice Form
    Then Practice Form page should open correctly
    And User click on Submit button
    And User verify Mandatory Field Validation
    Then User verify that the form has not submitted
  @tc003 @regression  @smoke
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"
  @tc004 @regression
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"

  @tc005   @smoke
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"
  @tc006 @regression  @smoke
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"
  @tc007 @regression  @smoke
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"

