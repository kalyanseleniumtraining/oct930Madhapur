Feature: Google Verification

  Scenario: Google Page Validation
    Given I opened the chrome browser
    When I Entered google.com in the addressbar
    Then I should see Google page
