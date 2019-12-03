
@mat
Feature: smoke11- Sprint 156,157 stories

  
  Scenario: MAT-9476 Measure Details - Delete Measure Button
  Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Cohort"
   Then I select patient based indicator as "No"
   Then I See Generate Identifier, Delete Measure button
   Then Owner to click delete button using tab
   Then I see the user is presented with a message thet states "Deleting a draft or version of a measure will permanently remove the designated measure draft or version from  the Measure Authoring Tool. Deleted measures cannot be recovered."
   Then I Verify password field and confirm Button
   Then Enter Invalid Password Verify the message "The entered password is invalid. Please try again."
   Then I Click close button in deletemeasure popup
   When I clicked Measure Library
   When I search measure name
   Then User select the created measure
   Then Delete the Measure
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
    When I clicked Measure Library
    Then I search for library "Smoke test"
    Then Verify the Measure cannot be deleted
    Then I search composite measure
    Then User select the created measure
    Then Delete the composite measure
    Then I search for library "Smoke test"
    Then User select the created measure
    Then Verify that, if the measure is removed as a component from all associated composite measures, the measure is able to be deleted as usual.
    When I clik on signout link
    
    




   @mat2
   Scenario: MAT-9477 Measure Details - General Measure Information Tab Part 2
      Given I launch MAT QA Website
      And  I should login page
      When I enter "PerformanceUser4" "Helloworld123?" "1234"
      When I clicked Sign into UMLS
      When I enter "skadaru" "Manoher123#"
      When I click create new composite measure
      Then I enter composite measure name as "Test composite"
      Then  I enter CQL title name as "Dummytitle"
      Then I enter composite measure Abbreviated title as "test"
      Then I select composite scoring method "Opportunity"
      And I select measure scoring "Proportion"
      Then I select patient-based-measure "Yes"
      When I Search measure name "2020 Cervical Cancer Screening"
      Then I Select the searched Measure
      When I Search measure name "Amblyopia in the Pediatric"
      Then I Select the searched Measure
      Then I enter alias name then click save and continue
      When I clicked Measure details
      Then I Verify "General Measure Information" is displayed successfylly
      When I clicked "General Measure Information" is show a header at the top of the page
      Then Verify the field heading "Measure Name" and "eCQM Abbreviated Title" are Required Editable fields
      Then Verify that on page load these fields fill in with the information that was chosen when the measure was created
      And Verify that there is a Save button at the bottom of the fields
#      This step is broken, cvasile 11/25/19
#   Then Verify that all buttons and options can be selected with keyboard only controls
      When I clicked Measure Library
      Then I seacrh read only measure
      Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
      Then Verify that the save button is disabled
      When I clicked Measure Library
      Then I search composite measure
      Then User select the created measure
   #When I clicked Measure details
      Then I change measure scoring as "Ratio"
      Then I Click Measure details save button
      Then Verify user is presented Warning message
      Then Verify the button Yes and No
      Then Click No button
      Then Verify the Created Measure details same as the Measure details page information
      Then Verify that user is presented with an orange checkmark
#      This step is broken, cvasile 11/25/19
#   Then Verify that all buttons and options can be selected with keyboard only controls
      When I clik on signout link


   Scenario: MAT-9599 Saved with Warning Messages on the CQL Workspace when an expression is saved
 	 Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I enter new measure name as "Smoke test"
   Then I enter CQL title name as "Smoketitle"
      Then I enter eCQM title name as "Smoke title"
 	 Then I select measure scoring type "Proportion"
 	 Then I select patient based indicator as "Yes"
   When I click CQL Workspace
   Then I click on the Definition
   When I create new definition with "Lab Has Equivalent Ratio" and context as patient
   Then Verify definition successfully saved warning message
   Then I select "first" logic from definition list
   Then I enter first Build CQL Expression
   Then Verify definition successfully saved with error message
   And I click on the Parameter
	 When I create parameter as "CommentParameterTest"
	 Then I save the parameter
   Then Verify Parameter successfully saved with error message
   Then I click on the function
	 Then I create function as "CommentFunctionTest"
   Then I should see comment box
   Then I save the function
   Then Verify Function successfully saved with error message
   When I clik on signout link

   Scenario: MAT-9195 Package and Upload to Bonnie" button on Measure Packager screen
      Given I launch MAT QA Website
      And  I should login page
      When I enter "PerformanceUser4" "Helloworld123?" "1234"
      When I clicked Sign into UMLS
      When I enter "skadaru" "Manoher123#"
      Then I verify Bonnie login deactive then sign into bonnie
      When I clicked Measure Library
      Then I see Measure Library page with Recent Activity, My Measures
      When I click on create button
      Then I see create new measure screen
      When I create new Measure "Measure"
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
      Then Verify a Package and Upload to Bonnie button has been added to the bottom of the Measure Packager screen
      Then The pachage and Uploadto bonnie tooltip read as "Click to Package and Upload to Bonnie"
      Then Verify the button displays on the same line as the Create Measure Package and Create Package and Export buttons
      Then Verify the Package and Upload to Bonnie button is blue with white font
      Then I Click Create Measure Package
      Then I Click Package and Upload to Bonnie
      Then Verify Successfully download a spreadsheet
      Then Verify the successfully Upload to bonnie message
      When I clicked Measure Library
      Then I search for library "Measure"
      Then I click export
      Then I click Upload to bonnie and Disconnect from bonnie
      Then Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page
      Then I search for library "Measure"
      Then User select the created measure
      Then Click on measure packager move all three to righ side
      Then Click on save grouping
      Then Verify the Packaged and Upload to Bonnie button is disabled
      When I clicked Measure Library
      Then I seacrh read only measure
      Then Click on measure packager move all three to righ side
      Then Click on save grouping
      Then Verify the Packaged and Upload to Bonnie button is disabled
      When I clik on signout link