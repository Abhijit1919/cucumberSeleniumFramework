$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/login/AMS_Login.feature");
formatter.feature({
  "line": 1,
  "name": "AMSLoginPage",
  "description": "",
  "id": "amsloginpage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16402827062,
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
  "name": "Verify Page Title \"AMS_HomePage_Title\"",
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
  "duration": 5329193087,
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
  "duration": 10345640691,
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
  "duration": 209357432,
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
  "duration": 304969876,
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
  "duration": 16639733728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AMS_HomePage_Title",
      "offset": 19
    }
  ],
  "location": "LoginToDiscoveryWebSite.verifyPageTitle(String)"
});
formatter.result({
  "duration": 18251456,
  "status": "passed"
});
formatter.after({
  "duration": 4551004050,
  "status": "passed"
});
formatter.uri("featurefile/login/AMS_Nagithion_To_MyDetails.feature");
formatter.feature({
  "line": 1,
  "name": "AMS_Navigation",
  "description": "",
  "id": "ams-navigation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14440579556,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify navigation to Give_Dependant_Access",
  "description": "",
  "id": "ams-navigation;verify-navigation-to-give-dependant-access",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regartion_Nagigation_Give_Dependant_Access"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "navigate to application \"AMSWebSite\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Should able to click on \"OPEN_LOGIN_POPUP\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be able to click on \"UserName\" and enter \"AMSMcp1\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be able to click on \"Password\" and enter \"password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Should able to click on \"LOGIN_Button\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Should able to click on \"MY_DETAILS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Should able to click on \"Give_Dependant_Access\"",
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
  "duration": 2990750025,
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
  "duration": 10277196246,
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
  "duration": 216941827,
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
  "duration": 266954667,
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
  "duration": 20141622123,
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
  "duration": 10316389135,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Give_Dependant_Access",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 11722701037,
  "status": "passed"
});
formatter.after({
  "duration": 4444428642,
  "status": "passed"
});
formatter.before({
  "duration": 12055780741,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify navigation to Personal_Information",
  "description": "",
  "id": "ams-navigation;verify-navigation-to-personal-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Regartion_Nagigation_Personal_Information"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "navigate to application \"AMSWebSite\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User Should able to click on \"OPEN_LOGIN_POPUP\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be able to click on \"UserName\" and enter \"AMSMcp1\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should be able to click on \"Password\" and enter \"password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Should able to click on \"LOGIN_Button\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Should able to click on \"MY_DETAILS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Should able to click on \"Personal_Information\"",
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
  "duration": 3620173432,
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
  "duration": 10341694420,
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
  "duration": 217644641,
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
  "duration": 246962568,
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
  "duration": 15467912296,
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
  "duration": 10315405827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal_Information",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 10001354272,
  "status": "passed"
});
formatter.after({
  "duration": 3841670321,
  "status": "passed"
});
formatter.before({
  "duration": 13680427457,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify navigation to View_Dependants",
  "description": "",
  "id": "ams-navigation;verify-navigation-to-view-dependants",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Regartion_Nagigation_View_Dependants"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "navigate to application \"AMSWebSite\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User Should able to click on \"OPEN_LOGIN_POPUP\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User should be able to click on \"UserName\" and enter \"AMSMcp1\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User should be able to click on \"Password\" and enter \"password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Should able to click on \"LOGIN_Button\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Should able to click on \"MY_DETAILS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Should able to click on \"View_Dependants\"",
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
  "duration": 3809140938,
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
  "duration": 10337688889,
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
  "duration": 212967901,
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
  "duration": 243680790,
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
  "duration": 14813052840,
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
  "duration": 10296723358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "View_Dependants",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 10001181629,
  "status": "passed"
});
formatter.after({
  "duration": 4721094717,
  "status": "passed"
});
formatter.before({
  "duration": 11687190518,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify navigation to Manage_Consent",
  "description": "",
  "id": "ams-navigation;verify-navigation-to-manage-consent",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Regartion_Nagigation_Manage_Consent"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "navigate to application \"AMSWebSite\"",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "User Should able to click on \"OPEN_LOGIN_POPUP\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User should be able to click on \"UserName\" and enter \"AMSMcp1\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User should be able to click on \"Password\" and enter \"password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Should able to click on \"LOGIN_Button\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User Should able to click on \"MY_DETAILS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "User Should able to click on \"Manage_Consent\"",
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
  "duration": 3573660839,
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
  "duration": 10501609877,
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
  "duration": 201152000,
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
  "duration": 225584198,
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
  "duration": 15069252345,
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
  "duration": 10304589827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Manage_Consent",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 10001545481,
  "status": "passed"
});
formatter.after({
  "duration": 4789050074,
  "status": "passed"
});
formatter.before({
  "duration": 11912019754,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Verify navigation to Website_preferences",
  "description": "",
  "id": "ams-navigation;verify-navigation-to-website-preferences",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@Regartion_Nagigation_Website_preferences"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "navigate to application \"AMSWebSite\"",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "User Should able to click on \"OPEN_LOGIN_POPUP\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User should be able to click on \"UserName\" and enter \"AMSMcp1\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User should be able to click on \"Password\" and enter \"password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User Should able to click on \"LOGIN_Button\"",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User Should able to click on \"MY_DETAILS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "User Should able to click on \"Website_preferences\"",
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
  "duration": 2712558618,
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
  "duration": 10525813333,
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
  "duration": 210017186,
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
  "duration": 228565333,
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
  "duration": 16053381531,
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
  "duration": 10384726914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Website_preferences",
      "offset": 30
    }
  ],
  "location": "LoginToDiscoveryWebSite.userShouldAbleToClickOn(String)"
});
formatter.result({
  "duration": 11742146765,
  "status": "passed"
});
formatter.after({
  "duration": 4741086815,
  "status": "passed"
});
});