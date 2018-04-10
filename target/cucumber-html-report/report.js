$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/login/AMS_Login.feature");
formatter.feature({
  "line": 1,
  "name": "AMSLoginPage",
  "description": "",
  "id": "amsloginpage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19144013543,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify navigation to MY_PLANS_AND_BENEFITS",
  "description": "",
  "id": "amsloginpage;verify-navigation-to-my-plans-and-benefits",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regartion_MY_PLANS_AND_BENEFITS"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "navigate to application \"AMSWebSite\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Should able to click on \"OPEN_LOGIN_POPUP\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to click on \"UserName\" and enter \"AMSMcp1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be able to click on \"Password\" and enter \"password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Should able to click on \"LOGIN_Button\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Should able to click on \"MY_DETAILS\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AMSWebSite",
      "offset": 25
    }
  ],
  "location": "LoginToDiscoveryWebSite.navigateToApplication(String)"
});
formatter.result({
  "duration": 3316653202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "OPEN_LOGIN_POPUP",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 10311987532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName",
      "offset": 33
    },
    {
      "val": "AMSMcp1",
      "offset": 54
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldBeAbleToClickOnAndEnter(String,String)"
});
formatter.result({
  "duration": 217915619,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 33
    },
    {
      "val": "password1",
      "offset": 54
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldBeAbleToClickOnAndEnter(String,String)"
});
formatter.result({
  "duration": 303222710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOGIN_Button",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 16534913314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY_DETAILS",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 10346963463,
  "status": "passed"
});
formatter.after({
  "duration": 5215167575,
  "status": "passed"
});
});