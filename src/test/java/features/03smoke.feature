
@mat
Feature: smoke3: Create measure with scoring type as Proportion, definition as Lab Has Equivalent Ratio and funtiona as Has Equivalent Ratio

Scenario: 1. Test case with scoring type as Proportion, definition as Lab Has Equivalent Ratio and funtiona as Has Equivalent Ratio
  
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
    Then I select patient based indicator as "Yes"
   	When I click CQL Workspace
   	When I click on Value Sets
   	Then I enter "2.16.840.1.113883.3.600.1.1498"
   	Then I click Retrive OID buttons
   	Then I Click Apply OId button
   	Then I enter "2.16.840.1.113883.3.526.2.1224"
   	Then I click Retrive OID buttons
   	Then  I Click Apply OId button
   	When I create new definition with "Lab Has Equivalent Ratio" and context as patient
    Then I select "first" logic from definition list
   	Then I enter first Build CQL Expression
   	When I create new definition with "Medication Order Occurred During January to June of Current Year" and context as patient
   	Then I select "second" from the definition list
    Then I enter second Build CQL Expression
    Then Create function with name "Has Equivalent Ratio"
    Then I Click on add argument
    Then Create argument with "resultRatio" and "Ratio" datatype
    Then I Click on add argument
  	Then Create second argument with "checkRatio" and "Ratio" datatype
   	Then Enter Build CQL Expression "resultRatio ~ checkRatio"
   	Then save function
   	Then Create function with name "Occurred During January to June of Current Year"
    Then I Click on add argument
    Then Create argument with "date" and "Date" datatype
   	Then Enter Build CQL Expression "month from date in Interval[1, 6] and year from date ~ year from Now()"
   	Then save function
   	Then I select population workspace
   	Then Click on initial population select "Medication Order Occurred During January to June of Current Year" save
   	Then Click on Denominators select "Lab Has Equivalent Ratio" save
   	Then Click on numerator select "Medication Order Occurred During January to June of Current Year" save
   	Then Click on measure packager move all three to righ side
    Then Click on save grouping 
    Then verify success message
    When I clik on signout link
   
   
   
   
