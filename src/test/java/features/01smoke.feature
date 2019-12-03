@mat
Feature: smoke1: Sprint smoke stories 


Scenario: 1. Initial population as SDE Ethincity
  Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then I enter CQL title name as "Smoketitle"
   Then I enter eCQM title name as "Smoke title"
   Then I select measure scoring type "Cohort"
   Then I select patient based indicator as "No"
   Then I select population workspace
   Then I select initial population
   Then I select initial population as "SDE Ethnicity"
   Then I select save button on initial population
   
Scenario: 2. Measure pacakge 
   
   When I select measure pacakage tab
   Then I select initial population and arrow button
   Then I click save grouping button
   Then I verify the grouping succes message
   Then I click save measure package button
   Then I click export measure package button
   When I clik on signout link