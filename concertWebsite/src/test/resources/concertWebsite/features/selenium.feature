
Feature: selenium
  
  @Google
  Scenario: Search something in Google
  Given I am on the Google page
  When I search for "cucumber"
  Then the url of result 1 is "https://cucumber.io"