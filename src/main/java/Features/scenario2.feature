Feature: Book Round Flight

  Scenario: Book a round flight
    Given I am on booking page
    When I select round trip
    And I enter Frankfurt departure city
    And I enter Budapest destination city
    And I select the required dates
    And I select two adult passengers and one Infant
    And I select Bussiness cabin class and I set advanced options
    And I click search button
    And I click the ratest button
    And I click  Book Now
    And I set attributes for three passangers
    And I click Credit card
    And I book a car
    And I fullfill the travellers's infos again
    And I enter cvv number
    And I fullfill the credit card's info
    And I enter city, zip code and address
    And I confirm the booking is done correctly


