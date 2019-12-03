
@mat
Feature: 05Smoke-Bonnie sign in, create a  measure, export meausre and disconnection
 

  
  Scenario: Bonnie sign in and disconnection
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
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
   Then I click Upload to bonnie and Disconnect from bonnie
   Then Verify Bonnie inactive
   When I clik on signout link
   
   
   
   
   
   
   
   
   
   
   
 
   
  
