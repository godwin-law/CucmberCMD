Feature: Google Search String Feature
  
  Scenario: Google Search String Scenario
    Given User is  on google homepage
    When User enters a search string
    Then Search string is validated in the first search result
