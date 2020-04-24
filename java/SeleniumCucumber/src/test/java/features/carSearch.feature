Feature: validation of car search page
  In order to validate car search
  as a buyer
  I navigate http://www.carsguide.com.au

  Scenario: Searching for a new car

    Given I am on the home page http://www.carsguide.com.au for carsguide website
    When I move to buy + sell
    And I click on Search Cars
    And I select Any Make as "BMW"
    And I select Any Model as "1 Series"
    And I select Any Location as "NSW - Sydney"
    And I select price(max) as "$10,000"
    And I click on Find My Next Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 10000 for Sale Sydney NSW | carsguide"
