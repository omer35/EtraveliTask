Feature: TC-001 Flightnetwork features

     @FN-001
     Scenario Outline: User needs to complete all the required fields
          Given User lands on main page
          Then user selects flight type "<flightType>"
          When user selects departure airport "<departureAirport>"
          And user selects arrival airport "<arrivalAirport>"
          And user selects departure date "<departureDate>"
          And user selects return date "<returnDate>"
          And user selects adult number "<adultNumber>"
          And user selects children number "<childNumber>"
          And user selects infants number "<infantsNumber>"
          And user selects status "<statu>"
          And User can click direct flight button and search flight button
          Then user should see "<flightResult>"
          Then User can click Filter button and can be applied
          And User verify the changes

          Examples: Flight
               | flightType | departureAirport | arrivalAirport | departureDate   | returnDate      | adultNumber | childNumber | infantsNumber | statu    | flightResult                                               |
               | RETURN     | Athens           | Rome           | Thu Sep 15 2022 | Sun Sep 18 2022 | 1           | 2           | 0             | ECONOMY  | Athens - Rome Thu 15 Sep - Sun 18 Sep 1 adult, 2 children  |
              #| RETURN     | London           | Berlin         | Mon Sep 19 2022 | Fri Sep 23 2022 | 2           | 0           | 1             | BUSINESS | London - Berlin Mon 19 Sep - Fri 23 Sep 2 adults, 1 infant |
              #| RETURN     | Athens           | Madrid         | Sun Sep 25 2022 | Wed Sep 28 2022 | 2           | 0           | 0             | ECONOMY  | Athens - Madrid Sun 25 Sep - Wed 28 Sep 2 adults           |

