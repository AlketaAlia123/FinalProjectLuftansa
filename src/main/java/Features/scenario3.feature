Feature: Book One Way Flight

  Scenario: Book a multi destination flight
    Given I am on  booking page
    When I select multi destination trip
    And I enter the routes
    And I select three adult passengers and two children
    And I select  cabin class Economy
    And I click  search button
    And I click  ratest button
    And I click Book Now  button
    And I set attributes for three adults and two children
    And I add a hotel
    And I finally confirm the booking


