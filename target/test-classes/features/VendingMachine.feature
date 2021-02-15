@vendingMachine
  Feature: user should be able to buy product successfully
    Scenario: user should be able to buy drink successfully
      Given user has started Vending Machine
      When user insert valid coin
      And user select appropriate drink from menu list
      Then user able to take refund by cancelling the request
      And user able to reselect drink and remaining change if any
      And Supplier can able to reset the operation
      When user insert invalid coin
      Then vending machine will return the coin
