
Feature: TC-001 Flightnetwork features
  @FN-001
  Scenario: User needs to complete all the required fields
    Given User lands on main page
    When user selects departure airport "Athens"
    And user selects arrival airport "Rome"
    And user selects departure date "Thu Sep 15 2022"
    And user selects return date "Sun Sep 18 2022"
    And user selects adult number "1"
    And user selects children number "2"
    And user selects infants number "0"
    And user selects status "ECONOMY"
    And User can click direct flight button and search flight button
    Then user should see "Athens - Rome Thu 15 Sep - Sun 18 Sep 1 adult, 2 children"
    Then User can click Filter button and can be applied
    And User verify the changes