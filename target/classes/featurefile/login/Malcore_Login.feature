Feature: Malcore

  @All
  @Malcor_MY_PLANS_AND_BENEFITS
  Scenario: Verify navigation to Your Health Record
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"
    And User Should able to click on "Malcor_YOUR_DETAILS"
    And User Should able to click on "Malcor_Your_Health_Record"
    Then Verify Page Title "Malcor_Your_Health_Records_Page"
    And User Should be able to select value from dropdown "DropDown_requestToView"
    And User Should able to click on "Iagree_requestTCSection"
    And User Should able to click on "Request_Submit"
    Then Verify "Malcor_PopUp_Msg" text "A request for consent has been successfully sent."
    And User Should able to click on "Malcor_PopUp_Close"

  @All
  @Malcor_YOUR_DETAILS
  Scenario: Verify navigation to YOUR_DETAILS
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"

  @All
  @Malcor_POSTAL_ADDRESS
  Scenario: Verify navigation to Postal Address
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"
    Then User Should able to click on "Malcor_YOUR_DETAILS"
    Then User Should able to click on "Malcor_Postal_Address"
    And Enter OTP on "OTP_Text_Box" and enter "1106772955"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "Malcor_Postal_Address"
    And User Should able to click on "Common_Address_Edit"
    And User should be able to update "Select_your_address_category" and select "International Address" from the dropdown
    And User should be able to update "Select_your_address_country" and select "SOUTH AFRICA" from the dropdown
    And User should be able to click on "Street name" and enter "Katherine Street"
    And User should be able to click on "Suburb" and enter "Morningside"
    And User should be able to click on "City" and enter "Sandton"
    And User should be able to click on "Province" and enter "Gauteng"
    And User Should able to click on "Common_Submit_button"
#
  @All
  @Malcor_PERSONAL_DETAILS
  Scenario: Verify navigation to Personal Details
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"
    Then User Should able to click on "Malcor_YOUR_DETAILS"
    Then User Should able to click on "Malcor_Personal_Details"
    And Enter OTP on "OTP_Text_Box" and enter "1106772955"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "Malcor_Personal_details"
    And User should be able to click on "FirstName" and enter "abc"
    And User Should able to click on "Details_SubmitButton"
#
  @All
  @Malcor_CONTACT_DETAILS
  Scenario: Verify navigation to Contact Details
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"
    Then User Should able to click on "Malcor_YOUR_DETAILS"
    Then User Should able to click on "Malcor_Contact_Details"
    And Enter OTP on "OTP_Text_Box" and enter "1106772955"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "Malcor_Contact_details"
    And User Should able to click on "Details_SubmitButton"
#
  @All
  @Malcor_WORK_DETAILS
  Scenario: Verify navigation to Work Details
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"
    Then User Should able to click on "Malcor_YOUR_DETAILS"
    Then User Should able to click on "Malcor_Work_Details"
    And Enter OTP on "OTP_Text_Box" and enter "1106772955"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "Malcor_Work_address"
    And User Should able to click on "Common_Address_Edit"
    And User should be able to update "Select_your_address_category" and select "International Address" from the dropdown
    And User should be able to update "Select_your_address_country" and select "SOUTH AFRICA" from the dropdown
    And User should be able to click on "Street name" and enter "Katherine Street"
    And User should be able to click on "Suburb" and enter "Morningside"
    And User should be able to click on "City" and enter "Sandton"
    And User should be able to click on "Province" and enter "Gauteng"
    And User Should able to click on "Common_Submit_button"

    @All_Malcor
    @Malcor_Personal_Details_Residential_Address
Scenario: Verify navigation to Personal Details_Residential Address
Given navigate to application "MalcorWebSite"
And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
And User should be able to click on "UserName" and enter "MalcorB1"
And User should be able to click on "Password" and enter "password1"
And User Should able to click on "Malcor_LOGIN_Button"
Then Verify Page Title "Malcor_Home_Page"
And User Should able to click on "Malcor_YOUR_DETAILS"
And User Should able to click on "Malcor_Personal_Details"
And Enter OTP on "OTP_Text_Box" and enter "1106772955"
And User Should able to click on "OTP_Submit_Button"
Then Verify Page Title "Personal details"
And User Should able to click on "Malcor_Residential_Address"
Then Verify Page Title "Residential Address"
And User Should able to click on "Common_Address_Edit"
And User should be able to update "Select_your_address_category" and select "International Address" from the dropdown
And User should be able to update "Select_your_address_country" and select "SOUTH AFRICA" from the dropdown
And User should be able to click on "Street name" and enter "Katherine Street"
And User should be able to click on "Suburb" and enter "Morningside"
And User should be able to click on "City" and enter "Sandton"
And User should be able to click on "Province" and enter "Gauteng"
And User Should able to click on "Common_Submit_button"

  @All_Malcor
  @Malcor_Your_Health_Record
  Scenario: Verify navigation to Your Health Record
    Given navigate to application "MalcorWebSite"
    And User Should able to click on "Malcor_OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "MalcorB1"
    And User should be able to click on "Password" and enter "password1"
    And User Should able to click on "Malcor_LOGIN_Button"
    Then Verify Page Title "Malcor_Home_Page"
    And User Should able to click on "Malcor_Your_Details"
    And User Should able to click on "Malcor_Your_Health_Record"
    Then Verify Page Title "Malcor_Health_Record_Page"
    And User should be able to click on "Show health record for" and enter "STBMDHDGMFLC AVBMDHDGMFLC"
    And User should able to click on "View"
    And User should be able to click on "Malcor_grant_consent" and enter "Bebbcmghjddc Wrbbcmghjddc"
    And User should be able to click on "Malcor_view" and enter "STBMDHDGMFLC AVBMDHDGMFLC"
    And User should able to click on "Malcor_Terms_and_conditions"
    And User should able to click on "Malcor_Submit_button"