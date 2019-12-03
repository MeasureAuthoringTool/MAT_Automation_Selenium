

@mat
Feature: smoke8-CompositeMeasure
   
   
   
   Scenario: Composite Measure
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I click create new composite measure
   Then I enter composite measure name as "Test composite"
   Then  I enter CQL title name as "Smoketitle"
   Then I enter composite measure Abbreviated title as "test"
   Then I Verify "Cohort" "Continuous Variable" "Proportion" "Ratio" are exist in Measure scoring
   Then I select composite scoring method "All or Nothing"
   Then I see "Proportion" and "Ratio" are in Measure scoring
   Then I select composite scoring method "Opportunity"
   Then I see "Proportion" and "Ratio" are in Measure scoring
   Then I select composite scoring method "Patient-level linear"
   Then I see "Continuous Variable" are in the Measure scoring
   Then I select composite scoring method "Opportunity"
   And I select measure scoring "Proportion"
   Then I select patient-based-measure "Yes"
   When I Search measure name "2020 Cervical Cancer Screening"
   Then I Select the searched Measure
   When I Search measure name "Amblyopia in the Pediatric"
   Then I Select the searched Measure
   Then I enter alias name then click save and continue
   When I click CQL Workspace
   When I click on Value Sets
   Then I enter "2.16.840.1.113883.3.600.1.1498"
   Then I click Retrive OID buttons
   Then I Click Apply OId button
   And I click on the function
   Then I create a function with period
   Then I click on the Definition
   Then I create a definition with period
   And I click on the Parameter
   Then I create a parameter with period
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info" and suffix "14"
   And I click on Retrieve
   Then I click on Apply
    When I clik on signout link
  
  
   Scenario: MAT-9107 Disconnect from Bonnie Function
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I verify Bonnie login deactive then sign into bonnie
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Cohort"
   Then I select patient based indicator as "No"
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
   When I search measure name
   Then I click export
   Then I click Upload to bonnie and Disconnect from bonnie
   Then Verify that a message will display saying "You have been disconnected from Bonnie. If you need to continue uploading measures to the Bonnie system you will need to click the login again."
   Then Verify the focus is directed to this message
   Then Verify that the indicator light next to the Sign Into Bonnie link in the header is now red and reads as "Sign in to Bonnie"
   Then Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page
   When I search measure name
   Then I click export
   Then Verify that if you navigate away from the Bonnie Upload screen and then come back, and are still not logged into Bonnie, you see the text that reads "Please sign into Bonnie."
   When I clik on signout link


   Scenario: MAT-9110 Upload a measure to Bonnie functionality
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   Then I verify Bonnie login deactive then sign into bonnie
   Then Verify Bonnie active
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Cohort"
   Then I select patient based indicator as "No"
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
   When I search measure name
   Then I click export
   Then Verify the Disconnect from Bonnie link can be selected using keyboard controls
   Then Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page
   When I search measure name
   Then I click export
   Then Verify that Upload button is disabled when a user is not actively signed into Bonnie
   And  The user field should remain blank when the user is not signed into Bonnie
   Then Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page
   Then I verify Bonnie login deactive then sign into bonnie
   When I search measure name
   Then I click export
   Then Verify that an enabled Upload button can be selected using keyboard controls
   Then Verify that if there is not an active UMLS connection, the user is presented with an error message that states "Please sign into UMLS"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then Verify that clicking on an enabled Upload button will show a loading bar
   Then Verify Successfully download a spreadsheet
   Then Verify that If the measure upload is successfully
   Then Verify that the focus is directed to the success message
   Then Verify that there is a browser popup that has Save, Open, or Cancel options available
   Then Verify the Disconnect from Bonnie link can be selected using keyboard controls
   When I clik on signout link
   
    
    
    
    
    
    
    
    
    
   
   
   
   
   
   
   
 
   
  
