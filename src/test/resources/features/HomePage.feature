Feature: Home page elements verification

  @tc001 @regression  @smoke
  Scenario: verify homepage title
    Given User is on homepage
    Then User verify DemoQA website logo
    Then User verify page title as "DEMOQA"

