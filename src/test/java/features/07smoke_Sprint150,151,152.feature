
@mat
Feature: smoke7 - Sprint 150 , 151 and 152 stories

 Scenario: MAT-9368 Disable the Clone Icon for Composite Measures
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I click create new composite measure
   Then I enter composite measure name as "Test composite" 
   Then  I enter CQL title name as "Smoketitle"
   Then I enter composite measure Abbreviated title as "test"
   Then I select composite scoring method "All or Nothing"
   And I select measure scoring "Proportion"
   Then I select patient-based-measure "Yes"
   When I Search measure name "2020 Cervical Cancer Screening 1.0"
   Then I Select the searched Measure
   When I Search measure name "2020 Non-Recommended"
   Then I Select the searched Measure
   Then I enter alias name then click save and continue
   Then I clicked measure library
   Then I search composite measure
   Then Verify the Clone icon is Disabled
   Then The disabled clone icon tool tip read as "Composite measure not cloneable"
   
   
Scenario: MAT-9384 Prevent the deletion of a measure used as a component in a composite measure

   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
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
    When I clicked Measure Library
    Then I search for library "Smoke test"
    Then I click Create Version
    When I click create new composite measure
    Then I enter composite measure name as "Test composite"
    Then  I enter CQL title name as "Dummytitle"
    Then I enter composite measure Abbreviated title as "test"
    Then I select composite scoring method "All or Nothing"
    And I select measure scoring "Proportion"
    Then I select patient-based-measure "Yes"
    When I Search measure name "2020 Cervical Cancer Screening"
    Then I Select the searched Measure
    When I Search measure name "Amblyopia in the Pediatric"
    Then I Select the searched Measure
    Then I Search measure in Component Measure Page
    Then I Select the searched Measure
    Then I Enter alias name for the measure
    Then I enter alias name then click save and continue
    When I clicked Measure Library
    Then I search for library "Smoke test"
    Then User select the created measure
    Then I Delete the Measure error shows "can not be deleted as it has been used as a component measure"
    Then I Delete the Measure error shows "No measures returned. Please change your search criteria and search again."
    When I clicked Measure Library
    Then I search for library "Smoke test"
    Then Verify the Measure cannot be deleted
    Then I search composite measure
    Then User select the created measure
    Then Delete the composite measure
    Then I search for library "Smoke test"
    Then User select the created measure
    Then Verify that, if the measure is removed as a component from all associated composite measures, the measure is able to be deleted as usual.


 Scenario: MAT-9312 Changes to comment boxes to deal with special characters
   Then I click New Measure Link
   Then I  create new measure screen
   When I click CQL Workspace
   Then Verify Enter "*/ or /*" in command box and save display the error "Comments can not contain /* or */."
   Then Verify and the comment should not be saved
   Then Verify clicking outside of that comments box, presents the user with an error message
   Then Verify and the comment should not be saved
   Then Verify that the focus is directed to the error messages when they appear
   Then Verify that valid comments do not cause issues within the CQL file

 Scenario: MAT-9376 Deleting Arguments and then a function
   Then Create function with name "Has Equivalent Ratio"
   Then I Click on add argument
   Then Create argument with "resultRatio" and "Ratio" datatype
   Then Click the delete icon in-line with an argument in a function
   Then Receive a message asking you if you want to delete it
   And Click No
   Then Enter Build CQL Expression "resultRatio ~ checkRatio"
   Then save function
   When Click the delete icon above the CQL Editor to delete the function
   Then Verify Receive a message asking you if you want to delete it
   Then Click yes
   Then The Function and any associated arguments should be removed
   Then click function tab, then come back and the function has not return
   When I clik on signout link
   
   
   
   
   
   
  
  
   
   
   
