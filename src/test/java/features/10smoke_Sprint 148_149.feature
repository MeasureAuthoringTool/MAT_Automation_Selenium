@mat
Feature: smoke10-Sprint 148 and 149 stories


  Scenario: MAT-9266 Ability to retrieve an OID with a program selected but not a release

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
   Then I click Edit icon previously entered value set
   Then Verify The Program field is enabled
   Then I select a program "CMS eCQM"
   Then Verify the Applied Value Sets table column with the heading
   Then Verify applying a Value Set with a program, the program selected shows in the Program column of the Applied Value Sets Table
   Then Click Update button Verify table is updated to include the new program column
   When I clik on signout link

   @mat1
   Scenario: MAT-9303 Composite Measure Edit Screens
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I clicked Measure Library
   When I click create new composite measure
   Then I enter composite measure name as "Test composite"
   Then  I enter CQL title name as "Smoketitle"
   Then I enter composite measure Abbreviated title as "test"
   Then I select composite scoring method "All or Nothing"
   And I select measure scoring "Proportion"
   Then I select patient-based-measure "Yes"
   When I Search measure name "2020 Cervical Cancer Screening"
   Then I Select the searched Measure
   When I Search measure name "Amblyopia in the Pediatric"
   Then I Select the searched Measure
   Then I enter alias name then click save and continue
   Then I clicked measure library
   Then I search composite measure
   Then User click on searched measure edit pencil icon
   Then Verify the Name, eCQM Abbreviated Title, Composite Scoring Method, Measure Scoring, and Patient-based Measure fields are populated with the current information

   Then I clicked measure library
   Then I search composite measure
   Then User click on searched measure edit pencil icon
#   Then I select composite scoring method "Opportunity"
#   And I select measure scoring "Ratio"
#   Then I select patient-based-measure "Yes"
#   Then I Breadcrumb heading should read "My Measures > Edit Composite Measure > Update Component Measures."
#   Then Verify that the Applied Component Measure Replace,Delete icon
#    Then I click save button
#    Then Verify that Composite scoring method Warning message
#   Then Click the created measure
   Then Delete The Composite Measure
    When I click create new composite measure
   Then I enter composite measure name as "Test composite"
   Then  I enter CQL title name as "Smoketitle"
   Then I enter composite measure Abbreviated title as "test"
   Then I select composite scoring method "All or Nothing"
   And I select measure scoring "Proportion"
   Then I select patient-based-measure "Yes"
   When I Search measure name "2020 Cervical Cancer Screening"
   Then I Select the searched Measure
   When I Search measure name "Amblyopia in the Pediatric"
   Then I Select the searched Measure
   Then I enter alias name then click save and continue
   Then I clicked measure library
   Then I search composite measure
      Then User click on searched measure edit pencil icon
   When I clicked Measure details
   Then Verify the Created Measure details same as the Measure details page information
#   Then Verify that all buttons and options can be selected with keyboard only controls
   When I clicked Measure Library
    When I click create new composite measure
   Then I enter composite measure name as "Test composite"
   Then  I enter CQL title name as "Smoketitle2"
   Then I enter composite measure Abbreviated title as "test"
   Then I select composite scoring method "All or Nothing"
   And I select measure scoring "Proportion"
   Then I select patient-based-measure "Yes"
   When I Search measure name "2020 Cervical Cancer Screening"
   Then I Select the searched Measure
   When I Search measure name "Amblyopia in the Pediatric"
   Then I Select the searched Measure
   Then Enter special characters in alias field Verify the Error Message


   Scenario: MAT-9372 Design the Applied Component Measures table so that the Alias is saved without having to click away before pressing the Save and Continue Button.
   Then Verify that the column title "Measure Name" "Version" "Measure Scoring" "Patient-based Indicator" "Owner" "Select"
   Then I See the Selected measure and its details
   Then Verify the Alias field included in the Applied component measure
   Then Verify that using only keyboard controls you can get to and type into the field to assign an alias
    When I clik on signout link



#   This scenario needs to be rewritten with new element definitions. Might also need more data, cvasile 11/25/19
#   Scenario: MAT-9304 Replace Component Measure Functionality
#   Given I launch MAT QA Website
#   And  I should login page
#   When I enter "PerformanceUser4" "Helloworld123?" "1234"
#   When I clicked Sign into UMLS
#   When I enter "skadaru" "Manoher123#"
#   When I click create new composite measure
#   Then I enter composite measure name as "Test composite"
#   Then  I enter CQL title name as "Smoketitle"
#   Then I enter composite measure Abbreviated title as "test"
#   Then I select composite scoring method "All or Nothing"
#   And I select measure scoring "Proportion"
#   Then I select patient-based-measure "Yes"
#   When I Search measure name "2020 Cervical Cancer Screening"
#   Then I Select the searched Measure
#   When I Search measure name "Amblyopia in the Pediatric"
#   Then I Select the searched Measure
#   Then I enter alias name then click save and continue
#   Then I clicked measure library
#   Then I search composite measure
#   Then User click on searched measure edit pencil icon
#   Then I Click component Measures
#   When Click Edit Component Measure
#   Then Verify that clicking on the replace icon in-line with one of the component measures
#   Then Verify that the list of available measure versions shows a checkbox in-line with each available version
#   Then Verify that only one checkbox can be selected at a time
#   Then Verify that there are two buttons at the bottom; Apply Blue with white text and Cancel Red with white text
#   Then I Click Cancel Button
#   Then I Breadcrumb heading should read "My Measures > Edit Composite Measure > Update Component Measures."
#   Then Verify that clicking on the replace icon in-line with one of the component measures
#   Then Clicking apply Verify version of the Applied Component Measure with the newly selected version in the Applied Component Measures list
#   Then I click component Cancel Button
#   Then Verify User In Measure Library Page
#    When I click create new composite measure
#   Then I enter composite measure name as "Test composite"
#   Then  I enter CQL title name as "Smoketitle"
#   Then I enter composite measure Abbreviated title as "test"
#   Then I select composite scoring method "All or Nothing"
#   And I select measure scoring "Proportion"
#   Then I select patient-based-measure "Yes"
#   When I Search measure name "2020 Cervical Cancer Screening"
#   Then I Select the searched Measure
#   When I Search measure name "Amblyopia in the Pediatric"
#   Then I Select the searched Measure
#   Then I enter alias name then click save and continue
#   Then Verify User in Measure details Page
#   When I click CQL Workspace
#   Then I Click component Measure
#   Then Verify the Measure details in CQLWorkspace Component Measure
#   Then I clicked measure library
#   When I click create new composite measure
#   Then Verify the breadcrumb heading at the top reads "My Measures > Create New Composite Measure"
#   Then I enter composite measure name as "Test composite"
#   Then  I enter CQL title name as "Smoketitle"
#   Then I enter composite measure Abbreviated title as "test"
#   Then I select composite scoring method "All or Nothing"
#   And I select measure scoring "Proportion"
#   Then I select patient-based-measure "Yes"
#   Then I Breadcrumb heading should read "My Measures > Create New Composite Measure > Component Measures"
#   When I Search measure name "2020 Cervical Cancer Screening"
#   Then I Select the searched Measure
#   When I Search measure name "Amblyopia in the Pediatric"
#   Then I Select the searched Measure
#   Then I enter alias name then click save and continue
#   When I clik on signout link
   