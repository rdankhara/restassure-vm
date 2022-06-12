$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ExactLocation.feature");
formatter.feature({
  "line": 2,
  "name": "User should able to find location latitude and longitude",
  "description": "",
  "id": "user-should-able-to-find-location-latitude-and-longitude",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test1"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "As a user I want to verify that the city Frankfurt is in Germany",
  "description": "and return their corresponded latitude and longitude",
  "id": "user-should-able-to-find-location-latitude-and-longitude;as-a-user-i-want-to-verify-that-the-city-frankfurt-is-in-germany",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user send ApI request",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user receive success response",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should verify that frankfurt is in germany",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user receive unsuccessful response",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should not verify the city location",
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
});