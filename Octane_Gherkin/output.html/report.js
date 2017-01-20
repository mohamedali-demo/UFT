$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Send message to multiple recipients_1573.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auto generated NGA revision tag"
    }
  ],
  "line": 3,
  "name": "Send message to multiple recipients",
  "description": "",
  "id": "send-message-to-multiple-recipients",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@TID1573REV0.2.0"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "User is sending a short mail to 3 recipients",
  "description": "",
  "id": "send-message-to-multiple-recipients;user-is-sending-a-short-mail-to-3-recipients",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens the send mail dialog",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "write a short message",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "add 3 recipients",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "send the mail",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "A success message appears",
  "keyword": "Then "
});
formatter.match({});
