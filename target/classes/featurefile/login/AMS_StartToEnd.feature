Feature: AMSLoginPage

  @All_AMS
  @AMS_My_Details
  Scenario: Verify navigation to My_Details
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--111562047"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"

  @All_AMS
  @AMS_Give_Dependant_Access
Scenario: Verify navigation to Give_Dependant_Access
Given navigate to application "AMSWebSite"
And User Should able to click on "OPEN_LOGIN_POPUP"
And User should be able to click on "UserName" and enter "test--1115620476"
And User should be able to click on "Password" and enter "feedmeseymour1"
And User Should able to click on "LOGIN_Button"
Then Verify Page Title "AMS_HomePage_Title"
Then User Should able to click on "MY_DETAILS"
Then User Should able to click on "Give_Dependant_Access"
And Enter OTP on "OTP_Text_Box" and enter "1115620476"
And User Should able to click on "OTP_Submit_Button"
Then Verify Page Title "Give_Dependant_Access_Title"

  @All_AMS
  @AMS_Personal_Information
  Scenario: Verify navigation to Personal_Information
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Personal_Information"
    And Enter OTP on "OTP_Text_Box" and enter "1115620476"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "AMS_Your_personal_information"


  @All_AMS
  @AMS_Personal_Information_Personal
    Scenario: Verify navigation to Personal_Information_Personal details
Given navigate to application "AMSWebSite"
And User Should able to click on "OPEN_LOGIN_POPUP"
And User should be able to click on "UserName" and enter "test--1115620476"
And User should be able to click on "Password" and enter "feedmeseymour1"
And User Should able to click on "LOGIN_Button"
Then Verify Page Title "AMS_HomePage_Title"
Then User Should able to click on "MY_DETAILS"
Then User Should able to click on "Personal_Information"
And Enter OTP on "OTP_Text_Box" and enter "1115620476"
And User Should able to click on "OTP_Submit_Button"
Then Verify Page Title "AMS_Your_personal_information"
And User Should able to click on "Name_ID_number_date_of_birth_gender"
Then Verify Page Title "Personal_details"
And User should be able to click on "FirstName" and enter "abc"
And User Should able to click on "Details_SubmitButton"


  @All_AMS
  @AMS_Personal_Information_Contact
Scenario: Verify navigation to Personal_Information_Contact details
Given navigate to application "AMSWebSite"
And User Should able to click on "OPEN_LOGIN_POPUP"
And User should be able to click on "UserName" and enter "test--1115620476"
And User should be able to click on "Password" and enter "feedmeseymour1"
And User Should able to click on "LOGIN_Button"
Then Verify Page Title "AMS_HomePage_Title"
Then User Should able to click on "MY_DETAILS"
Then User Should able to click on "Personal_Information"
And Enter OTP on "OTP_Text_Box" and enter "1115620476"
And User Should able to click on "OTP_Submit_Button"
Then Verify Page Title "AMS_Your_personal_information"
And User Should able to click on "Name_ID_number_date_of_birth_gender"
Then Verify Page Title "Personal_details"
And User Should able to click on "Contact_details"
And User Should able to click on "Details_SubmitButton"

  @All_AMS
  @AMS_Personal_Information_Residential_Address
  Scenario: Verify navigation to Personal_Information_Residential_Address
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Personal_Information"
    And Enter OTP on "OTP_Text_Box" and enter "1115620476"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "AMS_Your_personal_information"
    And User Should able to click on "Name_ID_number_date_of_birth_gender"
    Then Verify Page Title "Personal_details"
    And User Should able to click on "Residential_Address"
    And User Should able to click on "Common_Address_Edit"
    And User should be able to update "Select_your_address_category" and select "International Address" from the dropdown
    And User should be able to update "Select_your_address_country" and select "SOUTH AFRICA" from the dropdown
    And User should be able to click on "Street name" and enter "Katherine Street"
    And User should be able to click on "Suburb" and enter "Morningside"
    And User should be able to click on "City" and enter "Sandton"
    And User should be able to click on "Province" and enter "Gauteng"
    And User Should able to click on "Common_Submit_button"


  @All_AMS
  @AMS_Personal_Information_Residential_Address
  Scenario: Verify navigation to Personal_Information_Residential_Address
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Personal_Information"
    And Enter OTP on "OTP_Text_Box" and enter "1115620476"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "AMS_Your_personal_information"
    And User Should able to click on "Name_ID_number_date_of_birth_gender"
    Then Verify Page Title "Personal_details"
    And User Should able to click on "Work_Address"
    And User Should able to click on "Common_Address_Edit"
    And User should be able to update "Select_your_address_category" and select "International Address" from the dropdown
    And User should be able to update "Select_your_address_country" and select "SOUTH AFRICA" from the dropdown
    And User should be able to click on "Street name" and enter "Katherine Street"
    And User should be able to click on "Suburb" and enter "Morningside"
    And User should be able to click on "City" and enter "Sandton"
    And User should be able to click on "Province" and enter "Gauteng"
    And User Should able to click on "Common_Submit_button"


  @All_AMS
  @AMS_Personal_Information_Postal_Address
Scenario: Verify navigation to Personal_Information_Postal_Address
Given navigate to application "AMSWebSite"
#  Given navigate to application
   And User Should able to click on "OPEN_LOGIN_POPUP"
   And User should be able to click on "UserName" and enter "test--1115620476"
   And User should be able to click on "Password" and enter "feedmeseymour1"
   And User Should able to click on "LOGIN_Button"
   Then Verify Page Title "AMS_HomePage_Title"
   Then User Should able to click on "MY_DETAILS"
   Then User Should able to click on "Personal_Information"
   And Enter OTP on "OTP_Text_Box" and enter "1115620476"
   And User Should able to click on "OTP_Submit_Button"
   Then Verify Page Title "AMS_Your_personal_information"
   And User Should able to click on "Postal_Address"
   Then Verify Page Title "AMS_Postal_details_page"
   And User Should able to click on "Common_Address_Edit"
    And User should be able to update "Select_your_address_category" and select "International Address" from the dropdown
    And User should be able to update "Select_your_address_country" and select "SOUTH AFRICA" from the dropdown
    And User should be able to click on "Street name" and enter "Katherine Street"
    And User should be able to click on "Suburb" and enter "Morningside"
    And User should be able to click on "City" and enter "Sandton"
    And User should be able to click on "Province" and enter "Gauteng"
    And User Should able to click on "Common_Submit_button"


  @All
  @AMS_AMS_Personal_Information_Banking_Details
  Scenario: Verify navigation to Personal_Information_Banking_Details
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_DETAILS"
    Then User Should able to click on "Personal_Information"
    And Enter OTP on "OTP_Text_Box" and enter "1115620476"
    And User Should able to click on "OTP_Submit_Button"
    Then Verify Page Title "AMS_Your_personal_information"
    And User Should able to click on "Banking_details"
    Then Verify Page Title "Banking_details"
    And User Should able to click on "Common_Submit_button"

  @All
  @AMS_AMS_View_Dependants
Scenario: Verify navigation to View_Dependants
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_DETAILS"
  Then User Should able to click on "View_Dependants"
  Then Verify Page Title "My_Dependants"

  @All
  @AMS_AMS_Manage_Consent
Scenario: Verify navigation to Manage_Consent
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_DETAILS"
  Then User Should able to click on "Manage_Consent"
  And User should be able to click on "Select member" and enter "Mibbbfffffjc Edbbbfffffjc"
  And User Should able to click on "Common_Submit_button"

  @All
  @AMS_AMS_Website_preferences
Scenario: Verify navigation to Website_preferences
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_DETAILS"
  Then User Should able to click on "Website_preferences"

  @All
  @AMS_AMS_MY_PROCEDURES_AND_ADMISSIONS
Scenario: Verify navigation to MY_PROCEDURES_AND_ADMISSIONS
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_PROCEDURES_AND_ADMISSIONS"

   @All
  @AMS_AMS_Obtain_an_authorisation
Scenario: Verify navigation to Obtain_an_authorisation
Given navigate to application "AMSWebSite"
# Given navigate to application
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_PROCEDURES_AND_ADMISSIONS"
  Then User Should able to click on "Obtain_an_authorisation"
  Then Verify Page Title "AMS_Obtain_an_authorisation_Title"

  @All
  @AMS_AMS_Going_to_hospital
  Scenario: Verify navigation to Going_to_hospital
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_PROCEDURES_AND_ADMISSIONS"
    Then User Should able to click on "Going_to_hospital"
    Then Verify Page Title "AMS_Going_to_hospital_Title"


  @All
  @AMS_AMS_FIND_A_DOCUMENT
  Scenario: Verify navigation to FIND_A_DOCUMENT
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "FIND_A_DOCUMENT"

  @All
  @AMS_Membership_certificate
Scenario: Verify navigation to Membership_certificate
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "FIND_A_DOCUMENT"
  Then User Should able to click on "Membership_certificate"
      Then Verify Page Title "AMS_Membership_certificate_Title"

  @All
  @AMS_AMS_Tax_certificate
Scenario: Verify navigation to Tax_certificate
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "FIND_A_DOCUMENT"
  Then User Should able to click on "Tax_certificate"
  Then Verify Page Title "AMS_Tax_certificate_Title"

  @All
  @AMS_New_card_order_form
Scenario: Verify navigation to New_card_order_form
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "FIND_A_DOCUMENT"
  Then User Should able to click on "New_card_order_form"
  Then Verify Page Title "AMS_New_card_order_form_Title"

  @All
  @AMS_Communication_archive
  Scenario: Verify navigation to Communication_archive
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "FIND_A_DOCUMENT"
    Then User Should able to click on "Communication_archive"
    Then Verify Page Title "AMS_Communication_archive_Title"

  @All
  @AMS_MY_CLAIMS
Scenario: Verify navigation to MY_CLAIMS
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_CLAIMS"

      @All
      @AMS_Submit_a_Claim
Scenario: Verify navigation to Submit_a_Claim
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_CLAIMS"
  Then User Should able to click on "Submit_a_Claim"
  Then Verify Page Title "AMS_Submit_a_Claim_Title"

  @All
  @AMS_Get_a_claims_statement
Scenario: Verify navigation to Get_a_claims_statement
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_CLAIMS"
  Then User Should able to click on "Get_a_claims_statement"
  Then Verify Page Title "AMS_Get_a_claims_statement_Title"

  @All
  @AMS_Search_for_a_claim
Scenario: Verify navigation to Search_for_a_claim
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on " MY_CLAIMS"
  Then User Should able to click on "Search_for_a_claim"
  Then Verify Page Title "AMS_Search_for_a_claim_Title"

  @All
  @AMS_Claims_Transaction_History
Scenario: Verify navigation to Claims_Transaction_History
Given navigate to application "AMS WebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_CLAIMS"
  Then User Should able to click on "Claims_Transaction_History"
  Then Verify Page Title "AMS_Claims_Transaction_History_Title"

  @All
  @AMS_View_hospital_claims
Scenario: Verify navigation to View_hospital_claims
Given navigate to application "AMSWebSite"
# Given navigate to application
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_CLAIMS"
  Then User Should able to click on "View_hospital_claims"
  Then Verify Page Title "AMS_View_hospital_claims_Title"

  @All
  @AMS_MY_SAVINGS
  Scenario: Verify navigation to MY_SAVINGS
    Given navigate to application "AMSWebSite"
# Given navigate to application
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_SAVINGS"
    

   @All
  @AMS_MY_SAVINGS
Scenario: Verify navigation to MY_SAVINGS
Given navigate to application "AMSWebSite"
#  Given navigate to application
   And User Should able to click on "OPEN_LOGIN_POPUP"
   And User should be able to click on "UserName" and enter "test--1115620476"
   And User should be able to click on "Password" and enter "feedmeseymour1"
   And User Should able to click on "LOGIN_Button"
   Then Verify Page Title "AMS_HomePage_Title"
   Then User Should able to click on "MY_SAVINGS"
   Then User Should able to click on "HealthCare_at_Clicks_and_Dis_chem"
   Then Verify Page Title "AMS_HealthCare_at_Clicks_and_Dis_chem_Title"
   
   @All
  @AMS_Get_a_claims_statement
Scenario: Verify navigation to Get_a_claims_statement
Given navigate to application "AMSWebSite"
#  Given navigate to application
   And User Should able to click on "OPEN_LOGIN_POPUP"
   And User should be able to click on "UserName" and enter "test--1115620476"
   And User should be able to click on "Password" and enter "feedmeseymour1"
   And User Should able to click on "LOGIN_Button"
   Then Verify Page Title "AMS_HomePage_Title"
   Then User Should able to click on "MY_SAVINGS"
   Then User Should able to click on "Optometry"
   Then Verify Page Title "AMS_Optometry_Title"

  @All
  @AMS_MY_SCHEME
Scenario: Verify navigation to MY_SCHEME
Given navigate to application "AMS WebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_SCHEME"
  Then User Should able to click on "Scheme_Rules"
  Then Verify Page Title "AMS_Scheme_Rules"

     
   @All
  @AMS_Annual_Financial_Statements
Scenario: Verify navigation to Annual_Financial_Statements
Given navigate to application "AMS WebSite"
# Given navigate to application
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_SCHEME"
  Then User Should able to click on "Annual_Financial_Statements"
  Then Verify Page Title "AMS_Annual_Financial_Statements"


  @All
  @AMS_Annual_General_Meeting
  Scenario: Verify navigation to Annual_General_Meeting
    Given navigate to application "AMS WebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_SCHEME"
    Then User Should able to click on "Annual_General_Meeting"
    Then Verify Page Title "AMS_Annual_General_Meeting"

  @All
  @AMS_Digital_benefits
Scenario: Verify navigation to Digital_benefits
Given navigate to application "AMS WebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_SCHEME"
  Then User Should able to click on "Digital_benefits"
  Then Verify Page Title "AMS_Digital_benefits"

  @All
  @AMS_Plan_Details
  Scenario: Verify navigation to Plan_Details
    Given navigate to application "AMS WebSite"
  # Given navigate to application
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    And User Should able to click on "MY_PLANS_AND_BENEFITS"
    And User Should able to click on "Plan_Details"
    Then Verify Page Title "AMS_My_Plan_details"


  @All_AMS
  @AMS_Plan_Details_Tax_Certificate
  Scenario: Verify navigation to Plan_Details_Tax_Certificate
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_PLANS_AND_BENEFITS"
    Then User Should able to click on "Plan_Details"
    Then Verify Page Title "AMS_My_Plan_details"
    And User Should able to click on "Tax_Certificate"
    Then Verify "AMS_Tax_Certificate" text "Your tax certificate"


  @All
  @AMS_Plan_Details_Member_Certificate
  Scenario: Verify navigation to Plan_Details_Member_Certificate
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_PLANS_AND_BENEFITS"
    Then User Should able to click on "Plan_Details"
    Then Verify Page Title "AMS_My_Plan_details"
    And User Should able to click on "Member_Certificate"
    Then Verify "AMS_Member_Certificate" text "My membership certificate"

  @All
  @AMS_Benefit_Guide
Scenario: Verify navigation to Benefit_Guide
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_PLANS_AND_BENEFITS"
  Then User Should able to click on "Benefit_Guide"
  Then Verify Page Title "AMS_Benefit_Guide"


  @All
  @AMS_Interaction_Timeline
Scenario: Verify navigation to Interaction_Timeline
Given navigate to application "AMSWebSite"
  And User Should able to click on "OPEN_LOGIN_POPUP"
  And User should be able to click on "UserName" and enter "test--1115620476"
  And User should be able to click on "Password" and enter "feedmeseymour1"
  And User Should able to click on "LOGIN_Button"
  Then Verify Page Title "AMS_HomePage_Title"
  Then User Should able to click on "MY_PLANS_AND_BENEFITS"
  Then User Should able to click on "Interaction_Timeline"
  Then Verify Page Title "AMS_Interaction_Timeline"


#  @Regression_TestCase42
#  Scenario: Verify navigation to Chronic_Cover
#    Given navigate to application "AMSWebSite"
#    And User Should able to click on "OPEN_LOGIN_POPUP"
#    And User should be able to click on "UserName" and enter "test--1115620476"
#    And User should be able to click on "Password" and enter "feedmeseymour1"
#    And User Should able to click on "LOGIN_Button"
#    Then Verify Page Title "AMS_HomePage_Title"
#    Then User Should able to click on "MY_PLANS_AND_BENEFITS"
#    Then User Should able to click on "Chronic_Cover"
#    Then Verify Page Title "AMS_Chronic_Cover"



  @All
  @AMS_Search_for_a_provider
  Scenario: Verify navigation to Search_for_a_provider
    Given navigate to application "AMSWebSite"
    And User Should able to click on "OPEN_LOGIN_POPUP"
    And User should be able to click on "UserName" and enter "test--1115620476"
    And User should be able to click on "Password" and enter "feedmeseymour1"
    And User Should able to click on "LOGIN_Button"
    Then Verify Page Title "AMS_HomePage_Title"
    Then User Should able to click on "MY_PLANS_AND_BENEFITS"
    Then User Should able to click on "Search_for_a_provider"
    Then Verify Page Title "AMS_Search_for_a_provider"
