$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/VendingMachine.feature");
formatter.feature({
  "line": 2,
  "name": "user should be able to buy product successfully",
  "description": "",
  "id": "user-should-be-able-to-buy-product-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@vendingMachine"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "user should be able to buy drink successfully",
  "description": "",
  "id": "user-should-be-able-to-buy-product-successfully;user-should-be-able-to-buy-drink-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user has started Vending Machine",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user insert valid coin",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user select appropriate drink from menu list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user able to take refund by cancelling the request",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user able to reselect drink and remaining change if any",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Supplier can able to reset the operation",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user insert invalid coin",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "vending machine will return the coin",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});