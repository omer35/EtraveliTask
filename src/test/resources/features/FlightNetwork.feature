@FN-001
Feature: TC-001 Flightnetwork features

  Scenario: User needs to complete all the required fields, filter button function and verify
    Given User lands on main page
    When User can complete all the required fields
    And User can click Search Flights Button
    And User should see display all available flights, matching the searching criteria
    Then User can click Filter button and can be applied
    And User verify the changes