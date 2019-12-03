

@mat
Feature: smoke12- Sprint 158 stories


  Scenario: MAT-8602 Add New Measure Using Patient-based Measure Indicator
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then  I enter CQL title name as "DummyCQL"
   Then I enter eCQM title name as "DummyeCQM"
   Then Verify measure scoring is equal to "Proportion", "Cohort" or "Ratio", the Patient-based measure indicator is defauly "Yes"
   Then Verify measure scoring is equal to "Proportion", "Cohort" or "Ratio", the Patient-based measure indicator is  "Yes" to "No"
   Then Verify measure scoring is equal to "Continuous Variable", the Patient-based measure indicator is defauly "No"
   When I click save and continue button
   Then Verify the Patient-based indicator field on the Measure Details > General Information is populated with the "No" value.
 
   Scenario: MAT-9486 Measure Details - Measure Set
   Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   Then I Verify "Supplemental Data Elements" is displayed successfylly
   Then I Verify "Measure Set" is displayed successfylly
   When I clicked "Measure Set" is show a header at the top of the page
   Then Verify that under the text field is a save button 
   Then Enter information and click save button
   Then Verify the entered information is saved
   Then Verify successfully saved the user is presented with a green checkmark
   When I clicked Measure Library
   Then I seacrh read only measure
   Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
   Then Verify that the save button is disabled
   
    Scenario: MAT-9485 Measure Details - Supplemental Data Elements
    When I clicked Measure Library
   	Then I click New Measure Link
   	Then I enter new measure name as "Smoke test"
   	Then I enter CQL title name as "DummyCQL"
    Then I enter eCQM title name as "Smoke title"
   	Then I select measure scoring type "Proportion"
   	Then I select patient based indicator as "Yes"
   	Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   	Then I Verify "Supplemental Data Elements" is displayed successfylly
   	When I clicked "Supplemental Data Elements" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Supplemental Data Elements
   	Then Enter Supplemental information and click save button
    Then Verify the entered supplemental information is saved
    Then Verify successfully saved the user is presented with a green checkmark
    When I clicked Measure Library
    Then I seacrh read only measure
    Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
    Then Verify that the save button is disabled

    Scenario: MAT-9483 Measure Details - Transmission Format
    When I clicked Measure Library
   	Then I click New Measure Link
   	Then I enter new measure name as "Smoke test"
   	Then I enter CQL title name as "DummyCQL"
    Then I enter eCQM title name as "Smoke title"
   	Then I select measure scoring type "Proportion"
   	Then I select patient based indicator as "Yes"
   	Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   	Then I Verify "Transmission Format" is displayed successfylly
   	When I clicked "Transmission Format" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Transmission Format
   	Then Enter Transmission Format information and click save button
    Then Verify the entered Transmission Format is saved
    Then Verify successfully saved the user is presented with a green checkmark
    When I clicked Measure Library
    Then I seacrh read only measure
    Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
    Then Verify that the save button is disabled

  
   Scenario: MAT-9506 Measure Details - Initial Population
    When I clicked Measure Library
   	Then I click New Measure Link
   	Then I enter new measure name as "Smoke test"
   	Then I enter CQL title name as "DummyCQL"
    Then I enter eCQM title name as "Smoke title"
   	Then I select measure scoring type "Proportion"
   	Then I select patient based indicator as "Yes"
   	When I clicked Measure details
   	Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   	Then I Verify "Populations" is displayed successfylly
   	When I clicked "Populations" is show a header at the top of the page
   	Then I Verify "Initial Population" is displayed successfylly
   	When I clicked "Initial Population" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Initial Population
   	Then Enter Initial Population information and click save button
    Then Verify the entered Initial Population is saved
    Then Verify successfully saved the user is presented with a green checkmark
    
    Scenario: MAT-9507 Measure Details - Denominator
    Then I Verify "Denominator" is displayed successfylly
   	When I clicked "Denominator" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Denominator
   	Then Enter Denominator information and click save button
    Then Verify the entered Denominator is saved
    Then Verify successfully saved the user is presented with a green checkmark
     
    Scenario: MAT-9508 Measure Details - Denominator Exclusions
    Then I Verify "Denominator Exclusions" is displayed successfylly
   	When I clicked "Denominator Exclusions" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Denominator Exclusions
   	Then Enter Denominator Exclusions information and click save button
    Then Verify the entered Denominator Exclusions is saved
    Then Verify successfully saved the user is presented with a green checkmark
    
    
     Scenario: MAT-9509 Measure Details - Numerator
    Then I Verify "Numerator" is displayed successfylly
   	When I clicked "Numerator" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Numerator
   	Then Enter Numerator information and click save button
    Then Verify the entered Numerator is saved
    Then Verify successfully saved the user is presented with a green checkmark
    
     
    Scenario: MAT-9510 Measure Details - Numerator Exclusions
    Then I Verify "Numerator Exclusions" is displayed successfylly
   	When I clicked "Numerator Exclusions" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Numerator Exclusions
   	Then Enter Numerator Exclusions information and click save button
    Then Verify the entered Numerator Exclusions is saved
    Then Verify successfully saved the user is presented with a green checkmark
    
    
    Scenario: MAT-9511 Measure Details - Denominator Exceptions
    Then I Verify "Denominator Exceptions" is displayed successfylly
   	When I clicked "Denominator Exceptions" is show a header at the top of the page
   	Then Verify that under the text field is a save button in Denominator Exceptions
   	Then Enter Denominator Exceptions information and click save button
    Then Verify the entered Denominator Exceptions is saved
    Then Verify successfully saved the user is presented with a green checkmark
    When I clicked Measure Library
    Then I seacrh read only measure
    Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
    Then Verify that the save button is disabled
    
    
    
    Scenario: MAT-9512 Measure Details - Measure Population
   When I clicked Measure Library
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then I enter CQL title name as "Smoketitle"
   Then I enter eCQM title name as "Smoke title"
   Then I select measure scoring type "Continuous Variable"
   Then I select patient based indicator as "Yes"
   When I clicked Measure details 
   Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   Then I Verify "Populations" is displayed successfylly
   When I clicked "Populations" is show a header at the top of the page
   Then I Verify "Measure Population" is displayed successfylly
   When I clicked "Measure Population" is show a header at the top of the page
   Then Verify that under the text field is a save button in Measure Population
   Then Enter Measure Population information and click save button
   Then Verify the entered Measure Population is saved
   Then Verify successfully saved the user is presented with a green checkmark
  
    Scenario: MAT-9513 Measure Details - Measure Population Exclusions
   Then I Verify "Measure Population Exclusions" is displayed successfylly
   When I clicked "Measure Population Exclusions" is show a header at the top of the page
   Then Verify that under the text field is a save button in Measure Population Exclusions
   Then Enter Measure Population Exclusions information and click save button
   Then Verify the entered Measure Population Exclusions is saved
   Then Verify successfully saved the user is presented with a green checkmark
   
    Scenario: MAT-9514 Measure Details - Measure Observations
   Then I Verify "Measure Observations" is displayed successfylly
   When I clicked "Measure Observations" is show a header at the top of the page
   Then Verify that under the text field is a save button in Measure Observations
   Then Enter Measure Observations information and click save button
   Then Verify the entered Measure Observations is saved
   Then Verify successfully saved the user is presented with a green checkmark
   When I clicked Measure Library
   Then I seacrh read only measure
   Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
   Then Verify that the save button is disabled
 
   
   
  
   Scenario: MAT-9457 Measure Details - Copyright
   When I clicked Measure Library
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then I enter CQL title name as "Smoketitle"
   Then I enter eCQM title name as "Smoke title"
   Then I select measure scoring type "Continuous Variable"
   Then I select patient based indicator as "Yes"
   When I clicked Measure details 
   Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   Then I Verify "Copyright" is displayed successfylly
   When I clicked "Copyright" is show a header at the top of the page
   Then Verify that under the text field is a save button in Copyright
   Then Enter Copyright information and click save button
   Then Verify the entered Copyright is saved
   Then Verify successfully saved the user is presented with a green checkmark 
   
   
   Scenario: MAT-9458 Measure Details - Disclaimer
   Then I Verify "Disclaimer" is displayed successfylly
   When I clicked "Disclaimer" is show a header at the top of the page
   Then Verify that under the text field is a save button in Disclaimer
   Then Enter Disclaimer information and click save button
   Then Verify the entered Disclaimer is saved
   Then Verify successfully saved the user is presented with a green checkmark 
   
   Scenario: MAT-9459 Measure Details - Stratification
   Then I Verify "Stratification" is displayed successfylly
   When I clicked "Stratification" is show a header at the top of the page
   Then Verify that under the text field is a save button in Stratification
   Then Enter Stratification information and click save button
   Then Verify the entered Stratification is saved
   Then Verify successfully saved the user is presented with a green checkmark 
  
    Scenario: MAT-9460 Measure Details - Risk Adjustment
   Then I Verify "Risk Adjustment" is displayed successfylly
   When I clicked "Risk Adjustment" is show a header at the top of the page
   Then Verify that under the text field is a save button in Risk Adjustment
   Then Enter Risk Adjustment information and click save button
   Then Verify the entered Risk Adjustment is saved
   Then Verify successfully saved the user is presented with a green checkmark 
   
    Scenario: MAT-9461 Measure Details - Rate Aggregation
   Then I Verify "Rate Aggregation" is displayed successfylly
   When I clicked "Rate Aggregation" is show a header at the top of the page
   Then Verify that under the text field is a save button in Rate Aggregation
   Then Enter Rate Aggregation information and click save button
   Then Verify the entered Rate Aggregation is saved
   Then Verify successfully saved the user is presented with a green checkmark
  
   Scenario: MAT-9464 Measure Details - Rationale
   Then I Verify "Rationale" is displayed successfylly
   When I clicked "Rationale" is show a header at the top of the page
   Then Verify that under the text field is a save button in Rationale
   Then Enter Rationale information and click save button
   Then Verify the entered Rationale is saved
   Then Verify successfully saved the user is presented with a green checkmark
   
   Scenario: MAT-9465 Measure Details - Clinical Recommendation Statement
   Then I Verify "Clinical Recommendation" is displayed successfylly
   When I clicked "Clinical Recommendation" is show a header at the top of the page
   Then Verify that under the text field is a save button in Clinical Recommendation
   Then Enter Clinical Recommendation information and click save button
   Then Verify the entered Clinical Recommendation is saved
   Then Verify successfully saved the user is presented with a green checkmark
   
   Scenario: MAT-9466 Measure Details - Improvement Notation
   Then I Verify "Improvement Notation" is displayed successfylly
   When I clicked "Improvement Notation" is show a header at the top of the page
   Then Verify that under the text field is a save button in Improvement Notation
   Then Enter Improvement Notation information and click save button
   Then Verify the entered Improvement Notation is saved
   Then Verify successfully saved the user is presented with a green checkmark
   When I clicked Measure Library
   Then I seacrh read only measure
   Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
   Then Verify that the save button is disabled


   Scenario: MAT-9474 Measure Details - General Measure Information Tab - eCQM Identifer
   When I clicked Measure Library
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then I enter CQL title name as "Smoketitle"
   Then I enter eCQM title name as "Smoke title"
   Then I select measure scoring type "Continuous Variable"
   Then I select patient based indicator as "Yes"
   When I clicked Measure details
   Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   Then I Verify "General Measure Information" is displayed successfylly
   When I clicked "General Measure Information" is show a header at the top of the page
   When I clicked Measure Library
   Then I Search Measure
   Then User select the created measure
   Then Verify that if a measure has had a previously assigned eCQM ID
   Then Verify eCQM Identifier field and Generate Identifier Button is disabled
   Then Verify that once the eCQM Identifier field has a number assigned to it
   Then Verify the eCQM Version Number
   When I clicked Measure Library
   Then I seacrh read only measure
   Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
   Then Verify that the save button is disabled
  
   Scenario: MAT-9479 Measure Details - General Measure Information Tab - NQF Fields
   When I clicked Measure Library
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then I enter CQL title name as "Smoketitle"
   Then I enter eCQM title name as "Smoke title"
   Then I select measure scoring type "Cohort"
   Then I select patient based indicator as "No"
   Then Verify that all buttons and options can be selected with keyboard only controls In measre details
   Then I Verify "General Measure Information" is displayed successfylly
   When I clicked "General Measure Information" is show a header at the top of the page
   And Verify that there is a Save button at the bottom of the fields
   Then Verify Endorsed by NQF  and NQF Number fields
   Then I select Endorsed by NQF "No"
   Then Verify NQF Number field is disabled
   When I click Measure details save button
   Then select NQF field "Yes" Verify the error "NQF Number is required when a measure is endorsed by NQF."
   Then I select Endorsed by NQF "Yes"
   Then Verify NQF Number field is required
   When I click Measure details save button
   Then I select population workspace
   Then I select initial population
   Then I select initial population as "SDE Ethnicity"
   Then I select save button on initial population
   When I select measure pacakage tab
   Then I select initial population and arrow button
   Then I click save grouping button
   Then I verify the grouping succes message
   Then I click save measure package button
   Then I click export measure package button
   When I clicked Measure Library
   Then I Search Measure
   Then I click Create Version
   Then I Search Measure
   Then User select the created measure
   Then Verify new eCQM Version Number is displayed
   When I clicked Measure Library
   Then I Search Measure
   Then create Clone measure
   Then I enter new measure name as "Clone Measure"
   Then I enter CQL title name as "CQLTitle"
    Then I enter eCQM title name as "eCQMtitle"
   Then I select measure scoring type "Cohort"
   Then I select patient based indicator as "No"
   When I clicked Measure details
   Then Verify NQF  designation and number is not transferred to the cloned measure
   When I clicked Measure Library
   Then I seacrh read only measure
   Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
   Then Verify that the save button is disabled 
 
   Scenario: MAT-9582 Correct the order in the Terminology Section of the Human readable.
    When I clicked Measure Library
    Then I click New Measure Link
    Then I enter new measure name as "Smoke test"
    Then I enter CQL title name as "Smoketitle"
    Then I enter eCQM title name as "Smoke title"
   	Then I select measure scoring type "Proportion"
   	Then I select patient based indicator as "Yes"
   	When I click CQL Workspace
   	When I click on Value Sets
   	Then I enter "2.16.840.1.113883.3.600.1.1498"
   	Then I click Retrive OID buttons
   	Then I Click Apply OId button
   	Then I enter "2.16.840.1.113883.3.526.2.1224"
   	Then I click Retrive OID buttons
   	Then  I Click Apply OId button
   	Then Verify Value sets are human readable export as expected
   	Then Verify Value set information in the terminology section is sorted alphanumerically
    Then I click on Codes
    Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info" and suffix "1234"
    And I click on Retrieve
    Then I click on Apply
    Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info" and suffix "234"
    And I click on Retrieve
    Then I click on Apply
    Then Verify Codes are human readable export as expected
    Then Verify Codes information in the terminology section is sorted alphanumerically
    When I clik on signout link 
   
   
 