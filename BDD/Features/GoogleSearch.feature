Feature: Google Verification

  Scenario Outline: Google Page search
    Given I opened the chrome browser
    When I Entered google.com in the addressbar
    Then I Enter "<Search value>" in the search box
    Then I should see "<result>" page
    Then I close the browser

    Examples: 
      | Search value | result                |
      | India        | India - Google Search |
      | USA          | USA - Google Search   |
