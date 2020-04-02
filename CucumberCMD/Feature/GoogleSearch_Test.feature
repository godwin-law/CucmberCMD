Feature: Google Search Feature
  
  Scenario: Google Search Scenario
    Given User is  on google homepage
    When User enters a search string
    Then Search string is validated in the first search result
