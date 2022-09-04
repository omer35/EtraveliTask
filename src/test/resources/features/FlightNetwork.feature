
Feature: TC-001 Flightnetwork features
  @FN-001
  Scenario Outline: User needs to complete all the required fields
    Given User lands on main page
    When user selects departure airport "<departureAirport>"
    And user selects arrival airport "<arrivalAirport>"
    And user selects departure date "<departureDate>"
    And user selects return date "<returnDate>"
    And user selects passenger number "<passengerNumber>"
    And user selects status "<statu>"
    And User can click direct flight button and search flight button
    Then user should see "<flightResult>"

    Examples: Flight
      | departureAirport | arrivalAirport | departureDate   | returnDate      | passengerNumber | statu   | flightResult                                  |
      | Athens           | Rome           | Thu Sep 15 2022 | Sun Sep 18 2022 | 1               | ECONOMY | Athens - Rome Thu 15 Sep - Sun 18 Sep 1 adult |
  @FN-002
    Scenario: User verifies data after filter
    Then User can click Filter button and can be applied
    And User verify the changes