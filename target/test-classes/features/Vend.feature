@vend
  Feature: vending machine should work as expected

    Scenario: machine accepts only valid coins
      Given machine is ready
      When user insert following coins
      |1|5|10|25|
      Then user should see total 41 paid
