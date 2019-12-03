
@mat
Feature: Sprint 125




Scenario: 1. Sprint 132 -  Denominators Work space verification-MAT 8894
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Proportion"
   When I click save and continue button
	 Then I select population workspace
   Then I click on Denominators link
   And  I verify Denominators view


 Scenario: 2. Sprint 132 -  Denominator Exclusion  Work space verification-MAT 8895
   When I clicked Measure Library
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Proportion"
   When I click save and continue button
	 Then I select population workspace
   Then I click on Denominator Exclusions link
   And  I verify Denominator Exclusions view
   When I clik on signout link


Scenario: 3. Sprint 129 - Cohort measure population work space verification
  Given I launch MAT QA Website
  And  I should login page
  When I enter "PerformanceUser4" "Helloworld123?" "1234"
  When I clicked Sign into UMLS
  When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Cohort"
   When I click save and continue button
   Then I See Generate Identifier, Delete Measure button
   Then I select population workspace
   Then I see Cohort Population Workspace
   When I clik on signout link



Scenario: 4. Sprint 130 -  Proportion measure population work space verification
  	Given I launch MAT QA Website
    And  I should login page
    When I enter "PerformanceUser4" "Helloworld123?" "1234"
    When I clicked Sign into UMLS
    When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Proportion"
   When I click save and continue button
   Then I See Generate Identifier, Delete Measure button
   Then I select population workspace
   Then I see Proportion Population Workspace
   When I clik on signout link



Scenario: 5. Sprint 131 - CV measure population work space verification
	  Given I launch MAT QA Website
    And  I should login page
    When I enter "PerformanceUser4" "Helloworld123?" "1234"
    When I clicked Sign into UMLS
    When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Continuous Variable"
   When I click save and continue button
   Then I See Generate Identifier, Delete Measure button
   Then I select population workspace
   Then I see  CV Population Workspace



Scenario: 6. Sprint 132 - Ratio measure population work space verification
   When I clicked Measure Library
   Then I click New Measure Link
   Then I create the measure
   Then I select measure scoring type "Ratio"
   When I click save and continue button
   Then I See Generate Identifier, Delete Measure button
   Then I select population workspace
   Then I see  Ratio Population Workspace


Scenario: 7. Sprint 135 - Share the measure with a user

    When I clicked Measure Library
    Then I see Measure Library page with Recent Activity, My Measures
    Then I click on search button
    And I select the share of the first measure
    When I am navigated to the share page I select the first user to be shared with
    Then I click on Save and Continue on the share page


Scenario: 8. Add 3 new measure types

   Then I click on search button
   When I click on create button
   Then I see create new measure screen
   Then I  create new measure screen
   And I add three new measure types
   When I click CQL Workspace


Scenario: 9. Definition/Function/Parameter containing period - Measure
   When I clicked Measure Library
   Then I click New Measure Link
   Then I  create new measure screen
   When I click CQL Workspace
   And I click on the function
   Then I create a function with period
   Then I click on the Definition
   Then I create a definition with period
   And I click on the Parameter
   Then I create a parameter with period


Scenario: 10. Location Period Test
	When I click on Value Sets
	Then I enter the OID "2.16.840.1.113883.3.600.1.1498" and suffix "1234"
  Then I click Retrive OID buttons
  Then I Click Apply OId button
  Then I click on the Definition
  Then I create the definitions for location Period


Scenario: 11. Sprint 136 - Add messaging when pasted codes are duplicates
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info" and suffix "14"
   And I click on Retrieve
   Then I click on Apply
  # And I click on the checkbox to copy the code
   Then I click copy
   When I click paste
   Then I verify a validation message for copying duplicate codes


 Scenario: 12. Verify the delete icon is disabled
   Then I click on the Definition
   Then I create definition using code
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodCompletionTrack/Info"
   And I click on Retrieve
   Then I click on Apply
   #And I verify the delete button of the used code is disabled

Scenario: 13. Sprint 126 - Information Icon - Definition/Function/Parameters tabs
   Then I click on the function
   Then I verify the information icon
   Then I click on the Definition
   Then I verify the information icon
   And I click on the Parameter
   Then I verify the information icon


Scenario: 14. Sprint 126 - Add datatype template "Participation" to MAT
  Then I click on the Definition
   Then I create a definition for Participation datatype

Scenario: 15. Sprint 127 - Disable "Delete" while call to VSAC is in progress - Codes
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info"
   And I click on Retrieve


 Scenario: 16. Sprint 127 - GUI Duplicate Codes
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info" and suffix "1234"
   And I click on Retrieve
   Then I click on Apply
   Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info" and suffix "234"
   And I click on Retrieve
   Then I click on Apply
   Then I click on the Definition
   Then I create definition using code and suffix

 Scenario: 17. Sprint 129 -  Verifying the headers in the section
     When I click on General Information
     Then I verify the header for General Information "CQL Workspace > General Information"
  	 When I click on Includes
     Then I verify the header for Includes "CQL Workspace > Includes"
     When  I click on Value Sets
     Then I verify the header for Value Sets "CQL Workspace > Value Sets"
     Then I click on Codes
     Then I verify the header for Codes "CQL Workspace > Codes"
     And I click on the Parameter
     Then I verify the header for Parameter "CQL Workspace > Parameter"
     Then I click on the Definition
     Then I verify the header for Definition "CQL Workspace > Definition"
     Then I click on the function
     Then I verify the header for Function "CQL Workspace > Function"
     #When I click on View CQL
     #Then I verify the header for View CQL "CQL Workspace > View CQL"

 Scenario: 18. Sprint 129 -  Prevent users from entering multiple Birthdate Dead codes
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/LOINC/Version/2.54/Code/LA9627-6/Info"
   And I click on Retrieve
   Then I click on Apply
   #Then I verify the error message for Dead Code
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/LOINC/Version/2.44/Code/21112-8/Info"
   And I click on Retrieve
   Then I click on Apply
   Then I verify the error message for Birthdate Code


 Scenario: 19. Sprint 129 - Update from VSAC - removes Value Set suffix
   When  I click on Value Sets
   When I click Update from VSAC button
   Then I verify suffix in table

 Scenario: 20. Sprint 129 - 5.4 - Disable navigation while call to VSAC is in progress - Value Sets
   When  I click on Value Sets
   Then I enter the OID "2.16.840.1.113883.3.600.1.1498" and suffix "1234"
   Then I click Retrive OID buttons
   Then I Click Apply OId button
   When I click Update from VSAC button
   Then I click on edit icon of ValueSet

 Scenario: 21.Sprint 129 - 5.4 - Disable "Delete" while call to VSAC is in progress - Codes
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/LOINC/Version/2.54/Code/LA9627-6/Info"
   And I click on Retrieve
   Then I verify Codes left nav is disabled


 Scenario: 22. Comment box added to Definitions, Function, and Parameter sections

		Then I click on the Definition
		When I create definition as "CommentDefinitionTest"
		Then I should see comment box
		Then I enter the text "Testing comment functionality" for definition
  	Then I enter definition description as "true"
		Then I save the definition
		And I click on the Parameter
		When I create parameter as "CommentParameterTest"
		Then I should see comment box
		Then I enter the text "Testing comment functionality" for parameter
		Then I enter parameter description as "Interval<DateTime>"
		Then I save the parameter
		Then I click on the function
		Then I create function as "CommentFunctionTest"
  	Then I should see comment box
		Then I enter the text "Testing comment functionality" for function
		Then I enter function description as "true"
		Then I save the function

 Scenario: 23. Remove (as code) when codes are inserted into CQL Editor

   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/CPT/Version/2015/Code/1010806/Info"
   And I click on Retrieve
   Then I click on Apply
	 Then I click on the Definition
	 When I create definition as "AsCodeRemovalTest"
	 When I create definition where - as Code is not displayed
	 Then I save the definition

  Scenario: 24. Add Include Code System checkbox to GUI
    Then I click on Codes
    Then I enter the "CODE:/CodeSystem/ActMood/Version/HL7V3.0_2015-07/Code/_ActMoodActRequest/Info"
    And I click on Retrieve
    Then I click on Include Code System Version
    Then I click on Apply
   # Then I verify the check mark in the Codes table

Scenario: 25. Sprint 129 - Disable Mode & Mode Details for attribute = id
    Then I click on the function
    Then I Click insert icon
    Then I select attribute "Attributes"
    Then select datatype "Adverse Event"
    Then I select "id" attribute
    Then I verify Mode dropdown is disabled
    Then I verify Mode Details dropdown is disabled
    Then I close the editor
    When I clik on signout link


 Scenario: 26. Sprint 126 - Modify create version of measure/library messaging

   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
   When I create new Measure "Measure"
   When I clicked Measure Library
   Then I search for library "Measure"
   Then I click Create Version
   Then I verify the success text
   When I clik on signout link


  Scenario: 27. Sprint 128 - Replace Library (Measure and CQL stand alone library)

   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
    When I click on CQL Library
   When I click New Library
   Then I create a library "LibGC"
   When I click on CQL Library
   Then I search for CQL library "LibGC"
   Then I click Create Version of Library
   When I clicked Measure Library
   When I click on CQL Library
   Then I search for CQL library "LibGC"
   Then I click Create Draft of Library
   When I clicked Measure Library
   When I click on CQL Library
   Then I search for CQL library "LibGC"
   #Then I click Create Version of Library
   When I click New Library
   Then I create a library "LibC"
   Then I click on Includes
   Then I search for a library "LibGC" and add alias "Alias1"
   Then I navigate to alias library "Alias1"
   Then I click on edit alias
   When I select the older version and click Apply
   When I clicked Measure Library
   When I click on CQL Library
   When I click on CQL Library
   Then I search for CQL library "LibC"
   Then I click Create Version of Library
   When I click on CQL Library
   Then I search for CQL library "LibC"
   Then I click Create Draft of Library
   When I clicked Measure Library
   When I click on CQL Library
   Then I search for CQL library "LibC"
   #Then I click Create Version of Library
   When I click New Library
   Then I create a library "LibC1"
   Then I click on Includes
   Then I search for a library "LibC" and add alias "Alias1"
   Then I navigate to alias library "Alias1"
   Then I click on edit alias
   When I select the older version and click Apply
   When I clik on signout link


 Scenario: 28. Add Author Datetime to three datatypes
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   	When I clicked Measure Library
    Then I see Measure Library page with Recent Activity, My Measures
    Then I click New Measure Link
    Then I create the measure
    Then I select measure scoring type "Ratio"
    When I click save and continue button
    Then I See Generate Identifier, Delete Measure button
    When I click CQL Workspace
    When I click on Value Sets
    Then I enter "2.16.840.1.113883.3.600.1.1498"
    Then I click Retrive OID buttons
    Then I Click Apply OId button
    Then I click on the Definition
    When I create the definition for different datatype and attribute
    When I clik on signout link

 Scenario: 29. ValueSet /Code containing period
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   	When I clicked Measure Library
    Then I see Measure Library page with Recent Activity, My Measures
    Then I click New Measure Link
    Then I create the measure
    Then I select measure scoring type "Ratio"
    When I click save and continue button
    Then I See Generate Identifier, Delete Measure button
    When I click CQL Workspace
    When I click on Value Sets
    Then I enter "2.16.840.1.113762.1.4.1146.71"
    Then I click Retrive OID buttons
    Then I Click Apply OId button
    Then I click on Codes
    Then I enter the "CODE:/CodeSystem/RXNORM/Version/2017-06/Code/1000000/Info"
    And I click on Retrieve
    Then I click on Apply
   # When I clik on signout link

Scenario: 30. CQL Workspace delete messages - Definition/Function/Parameter


   When I clicked Measure Library
   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
   Then I  create new measure screen
   When I click CQL Workspace
   And I click on the function
   Then I create a function with period
   Then I click on delete
   Then I accept the warning message for deletion
   Then I click on the Definition
   Then I create a definition with period
   Then I click on delete
   Then I accept the warning message for deletion
   And I click on the Parameter
   Then I create a parameter with period
   And I click on delete
   Then I accept the warning message for deletion
   #When I clik on signout link



Scenario: 31. Attribute additions to multiple datatypes


   When I clicked Measure Library
   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
   Then I  create new measure screen
   When I click CQL Workspace
   And I click on the function
   Then I Click insert icon
   Then I select attribute "Attributes"
   Then select datatype "Communication, Performed"
   Then I select attribute "relatedTo"
   Then select datatype "Communication, Performed"
   Then I select attribute "relatedTo"
   Then select datatype "Communication, Performed"
   Then I select attribute "relatedTo"
   Then select datatype "Assessment, Performed"
   Then I select attribute "relatedTo"
   Then select datatype "Substance, Administered"
   Then I select attribute "frequency"
   Then select datatype "Substance, Recommended"
   Then I select attribute "frequency"
   Then select datatype "Medication, Order"
   Then I select attribute "relevantPeriod"
   Then select datatype "Medication, Dispensed"
   Then I select attribute "relevantPeriod"
   Then select datatype "Immunization, Order"
   Then I select attribute "activeDatetime"
   Then I close the editor
   #When I clik on signout link

Scenario: 32. Attribute additions to multiple datatypes


   When I clicked Measure Library
   When I click on CQL Library
   When I click New Library
   Then I create a library "name"
   And I click on the function
  When I clik on signout link


    Scenario: 33. Sprint 127 - "Replace Library" dropdown

      Given I launch MAT QA Website
      And  I should login page
      When I enter "PerformanceUser4" "Helloworld123?" "1234"
      When I clicked Sign into UMLS
      When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
   Then I  create new measure screen
   When I click CQL Workspace
   When I click on CQL Library
   When I click New Library
   Then I create a library "Child"
   When I click on CQL Library
   Then I search for CQL library "Child"
   Then I click Create Version of Library
   Then I search for CQL library "Child"
   #Then I click Create Draft of Library
   #Then I clicked Measure Library
   #When I click on CQL Library
   #Then I search for CQL library "Child"
   #Then I click Create Version of Library
   When I click New Library
   Then I create a library "LibC"
   Then I click on Includes
   Then I search for a library "Child" and add alias "Alias1"
   Then I navigate to alias library "Alias1"
   When I clik on signout link




Scenario: 34. Sprint 127 - GUI Duplicate ValueSets
  Given I launch MAT QA Website
  And  I should login page
  When I enter "PerformanceUser4" "Helloworld123?" "1234"
  When I clicked Sign into UMLS
  When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
   Then I  create new measure screen
    When I click CQL Workspace
   When I click on Value Sets
 	 Then I enter the OID "2.16.840.1.113883.3.600.1.1498" and suffix "1234"
   Then I click Retrive OID buttons
   Then I Click Apply OId button
   When I click on Value Sets
   Then I enter the OID "2.16.840.1.113883.3.600.1.1498" and suffix "1234"
   Then I click Retrive OID buttons
   Then  I Click Apply OId button
   When I clik on signout link





Scenario: 35. Sprint 128 -  Prevent users from entering multiple Birthdate and Dead codes

  Given I launch MAT QA Website
  And  I should login page
  When I enter "PerformanceUser4" "Helloworld123?" "1234"
  When I clicked Sign into UMLS
  When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   Then I see Measure Library page with Recent Activity, My Measures
   When I click on create button
   Then I see create new measure screen
   Then I  create new measure screen
   Then I See Generate Identifier, Delete Measure button
   When I click CQL Workspace
   When I click on CQL Library
   When I click New Library
   Then I create a library "TestLib"
   When I click on Value Sets
   Then I enter "2.16.840.1.113883.3.600.1.1498"
   Then I click Retrive OID buttons
   Then I Click Apply OId button
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/LOINC/Version/2.54/Code/LA9627-6/Info"
   And I click on Retrieve
   Then I click on Apply
   #Then I verify the Birthdate and Dead warning message in CQL Library
   Then I click on Codes
   Then I enter the "CODE:/CodeSystem/LOINC/Version/2.44/Code/21112-8/Info"
   And I click on Retrieve
   Then I click on Apply
   Then I verify the Code applied success message in CQL Library
   When I clik on signout link


Scenario: 36. Sprint 128 -  Add subheadings for CQL Workspace tabs
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I click on CQL Library
   When I click New Library
   Then I create a library "TestLib"
   Then I verify the header for General Information "CQL Workspace > General Information"
   When I click on Includes
   Then I verify the header for Includes "CQL Workspace > Includes"
   When  I click on Value Sets
   Then I verify the header for Value Sets "CQL Workspace > Value Sets"
   Then I click on Codes
   Then I verify the header for Codes "CQL Workspace > Codes"
   And I click on the Parameter
   Then I verify the header for Parameter "CQL Workspace > Parameter"
   Then I click on the Definition
   Then I verify the header for Definition "CQL Workspace > Definition"
   Then I click on the function
   Then I verify the header for Function "CQL Workspace > Function"
  # When I click on View CQL
   #Then I verify the header for View CQL "CQL Workspace > View CQL"
   #When I clik on signout link



Scenario: 37. Sprint 133 - Initial Populations Work space verification

    When I clicked Measure Library
    Then I see Measure Library page with Recent Activity, My Measures
    When I click on create button
    Then I see create new measure screen
    Then I  create new measure screen
    Then I See Generate Identifier, Delete Measure button
    Then I select population workspace
    Then I click on IntiaL Population link
    Then I verify Intial Population view
    When I clik on signout link


Scenario: 38. Sprint 131 - Numerators Work space verification

    Given I launch MAT QA Website
    And  I should login page
    When I enter "PerformanceUser4" "Helloworld123?" "1234"
    When I clicked Sign into UMLS
    When I enter "skadaru" "Manoher123#"
    Then I click New Measure Link
    Then I create the measure
    Then I select measure scoring type "Proportion"
    When I click save and continue button
 	  Then I select population workspace
    Then I click on Numerator Link
    Then I verify Numerator view
    When I clik on signout link


Scenario: 39. Sprint 131 - Numerator exclusion Work space verification
    Given I launch MAT QA Website
    And  I should login page
    When I enter "PerformanceUser4" "Helloworld123?" "1234"
    When I clicked Sign into UMLS
    When I enter "skadaru" "Manoher123#"
    Then I click New Measure Link
    Then I create the measure
    Then I select measure scoring type "Proportion"
    When I click save and continue button
 	  Then I select population workspace
    Then I click on Numerator exclusion link
    Then I verify Numerator exclusion view
    When I clik on signout link

#The following tests need to be fixed, cvasile 12/3/19
#  Scenario: MAT-9558 Message on View CQL when Measure/Library has Warnings
#    Given I launch MAT QA Website
#    And  I should login page
#    When I enter "PerformanceUser4" "Helloworld123?" "1234"
#    When I clicked Sign into UMLS
#    When I enter "skadaru" "Manoher123#"
#    Then I click New Measure Link
#    Then I enter new measure name as "Smoke test"
#    Then I enter eCQL title name as "Smoke title"
#    Then I select measure scoring type "Proportion"
#    Then I select patient based indicator as "Yes"
#    When I click CQL Workspace
#    When I create new definition with "Lab Has Equivalent Ratio" and context as patient
#    Then I save the definition
#    Then I click View CQL
#    Then I see the error message "You are viewing CQL with validation errors. Errors are marked with a red square on the line number."
#    Then I click on the Definition
#    Then I select "first" logic from definition list
#    Then I enter first Build CQL Expression
#    Then I click View CQL
#
#
#  Scenario: MAT-9553 Display Warning Messages On the Click To View CQL sections in the CQL Workspace and CQL Composer
#    Given I launch MAT QA Website
#    And  I should login page
#    When I enter "PerformanceUser4" "Helloworld123?" "1234"
#    When I clicked Sign into UMLS
#    When I enter "skadaru" "Manoher123#"
#    When I click create new composite measure
#    Then I enter composite measure name as "Test composite"
#    Then I enter composite measure Abbreviated title as "test"
#    Then I select composite scoring method "Opportunity"
#    And I select measure scoring "Proportion"
#    Then I select patient-based-measure "Yes"
#    When I Search measure name "ChildrenDentalDecay1"
#    Then I Select the searched Measure
#    When I Search measure name "Component for Composite"
#    Then I Select the searched Measure
#    Then I enter alias name then click save and continue
#    When I click CQL Workspac
#    And I click on the Parameter
#    When I create parameter as "abcd"
#    Then I save the parameter
#    Then I See the warning message view CQL windows
#    Then I Click component Measure






      