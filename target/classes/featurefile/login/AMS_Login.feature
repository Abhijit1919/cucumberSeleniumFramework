Feature: AMSLoginPage

#@Regartion_MY_PLANS_AND_BENEFITS
#Scenario: Verify navigation to MY_PLANS_AND_BENEFITS
#  Given navigate to application "AMSWebSite"
#  And User Should able to click on "Open_Login_PopUp"
#  And User should be able to click on "UserName" and enter "AMSMcp1"
#  And User should be able to click on "Password" and enter "password1"
#  And User Should able to click on "LOGIN_Button"
#  Then Verify Page Title "AMS_HomePage_Title"
#  Then User Should able to click on "MY_DETAILS"
#  Then User Should able to click on "Personal_Information"
#  And Enter OTP on "OTP_Text_Box" and enter "1114444472"
#  And User Should able to click on "OTP_Submit_Button"
#  Then Verify Page Title "AMS_HomePage_Title"


  @Regression_TestCase4
  Scenario: Verify navigation to Personal_Information_Personal details
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "AMSMcp1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Personal_Information"
    And Enter OTP on "OTP_Text_Box" and enter "1114444472"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "AMS_Your_personal_information"
    And User Should able to click on "Name_ID_number_date_of_birth_gender"
    Then Verify Page Title "Personal_details"
    And User should be able to click on "FirstName" and enter "abc"
    And User Should able to click on "Details_SubmitButton"