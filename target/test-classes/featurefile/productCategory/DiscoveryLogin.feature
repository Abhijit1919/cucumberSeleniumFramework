@tag
Feature: DiscoveryLoginPage

#  @Regartion
#  Scenario: Verify Login
#    Given navigate to application "DiscoveryWebSite"
#    And User Should able to click on "OPEN_LOGIN_POPUP"
#    And User should be able to click on "UserName" and enter "test--1002631396"
#    And User should be able to click on "Password" and enter "feedmeseymour1"
#    And User Should able to click on "LOGIN_Button"
#    Then Verify Page Title "Discovery_HomePage_Title"
#    Then Verify Header "Your_Health_Plan"



  @Regartion_Navigation
  Scenario: Verify Login
    Given navigate to application "Ams"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1002631396"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    And User Should able to click on "Medical_Aid"
    And User Should able to click on "Manage_Your_Health_Plan"
    Then Verify Header "Your_Health_Plan"



