Feature: AMSLoginPage

@Regartion_MY_PLANS_AND_BENEFITS
Scenario: Verify navigation to MY_PLANS_AND_BENEFITS
  Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "AMSMcp1"
  And User should be able to click on "Password" and enter "password1"
  And User Should able to click on "LOGIN_Button"
  Then User Should able to click on "MY_DETAILS"

