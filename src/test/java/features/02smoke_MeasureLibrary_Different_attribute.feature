
@mat
Feature: smoke2: Measure Library Different attribute 

Scenario: 1. Design frame work for different attributes from excel file
  
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I  create new measure screen
   When I click CQL Workspace
   When I click on Value Sets
   Then I enter "2.16.840.1.113883.3.600.1.1498"
   Then I click Retrive OID buttons
   Then I Click Apply OId button
   Then I click on the Definition
   Then I Click insert icon
   Then I select attribute "Attributes"
   Then select datatype "Adverse Event"
   Then verify corresponding attributes
   When I clik on signout link
 
Scenario: 2. Create Measure: measure scoring- Proportion

   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I search measure name
   Then I click New Measure Link
   Then I create the measure 
   Then I select measure scoring type "Proportion"
   When I click save and continue button
   Then I select Endorsed by NQF "Yes"
   When I click save button
  
Scenario: 3. Create Measure: measure scoring- Continuous Variable
   
   When I click Measure Library
   Then I click New Measure Link
   Then I create the measure 	
   Then I select measure scoring type "Continuous Variable"
   When I click save and continue button
   Then I select Endorsed by NQF "Yes"
   When I click save button

Scenario: 4. Create Measure: measure scoring- Cohort
   
   When I click Measure Library
   Then I click New Measure Link
   Then I create the measure 	
   Then I select measure scoring type "Cohort"
   When I click save and continue button
   Then I select Endorsed by NQF "Yes"
   When I click save button   

Scenario: 5. Create Measure: measure scoring- Ratio
   
   When I click Measure Library
   Then I click New Measure Link
   Then I create the measure 	
   Then I select measure scoring type "Ratio"
   When I click save and continue button
   Then I select Endorsed by NQF "Yes"
   When I click save button
   When I clik on signout link
  
