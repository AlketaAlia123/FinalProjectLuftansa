Feature: Book One Way Flight

  Scenario: Book a one way flight
    Given I am on the booking page
    When I select one way trip
    And I enter Frankfurt as the departure city
    And I enter Munich as the destination city
    And I select 2 adult passengers
    And I select Economy cabin class
    And I select a date on the upcoming month
    And I click search
    And I click ratest button
    And I click Book Now button
    And I set attributes for two passangers
    And I select seat 22A, or any available window seat
    And I confirm the booking

