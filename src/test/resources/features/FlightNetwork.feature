@FN-001
Feature: TC-001 Flightnetwork features

  Background: User lands on main page
    Given User lands on main page

  Scenario Outline: User needs to complete all the required fields, filter button function and verify
    When User selects "<DepartureAirport>", "<ArrivalAirport>", "<DepartureDate>", "<ReturnDate>" and clicks Search Flight Button
    Examples:
      |DepartureAirport|ArrivalAirport|DepartureDate  |ReturnDate     |
      |Athens          |Rome          |Thu Sep 15 2022|Sun Sep 18 2022|
    And User should see display all available flights, matching the searching criteria
    Then User can click Filter button and can be applied
    And User verify the changes