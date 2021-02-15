@Test1
Feature: User should able to find location latitude and longitude

  Scenario: As a user I want to verify that the city Frankfurt is in Germany
  and return their corresponded latitude and longitude
    Given user send ApI request
    When user receive success response
    Then user should verify that frankfurt is in germany
    When user receive unsuccessful response
    Then user should not verify the city location