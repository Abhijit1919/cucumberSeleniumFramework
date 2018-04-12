Feature: AMS_Navigation

  @Regartion_Nagigation_Give_Dependant_Access

  Scenario: Verify navigation to Give_Dependant_Access
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "AMSMcp1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "LOGIN_Button"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Give_Dependant_Access"

  @Regartion_Nagigation_Personal_Information
  Scenario: Verify navigation to Personal_Information
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "AMSMcp1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "LOGIN_Button"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Personal_Information"
    

  @Regartion_Nagigation_View_Dependants
  Scenario: Verify navigation to View_Dependants
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "AMSMcp1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "LOGIN_Button"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "View_Dependants"


  @Regartion_Nagigation_Manage_Consent
  Scenario: Verify navigation to Manage_Consent
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "AMSMcp1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "LOGIN_Button"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Manage_Consent"


  @Regartion_Nagigation_Website_preferences
  Scenario: Verify navigation to Website_preferences
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "AMSMcp1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "LOGIN_Button"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Website_preferences"

