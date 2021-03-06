Feature: TruNarrative Web Page Load up
  This features is based on page load up via google search.

  Scenario: Go on to google.com and search TruNarrative.
    Given I navigate to google page
    When I enter key term "TruNarrative" in the google search
    Then I should see TruNarrative as the first result
    And shows TruNarrative website link "https://trunarrative.com/"

  Scenario: Use the web page link in the previous scenario to confirm TruNarrative web page load up.
    Given I navigate to TruNarrative web page
    Then I see the TrueNarrative strap line "Easy Onboarding.  Smooth Transactions.  Insightful Compliance."

  Scenario: Navigate to the TruNarrative team page and confirm there are three members having correct details.
    Given I am on TruNarrative homepage
    When I navigate to TruNarrative Team page
    Then I see "John Lord" as "Founder and CEO"
    And I see "David Eastaugh" as "CTO"
    And I see "Nicola Janney" as "Human Resources Manager"

  Scenario: Whilst on the TruNarrative team page confirm there are eight members in the leadership team shown on page.
    Given that I am on TruNarrative team page
    Then I see eight members of leadership team

