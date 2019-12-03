


@mat
Feature: smoke9- Sprint 155 stories


  Scenario: MAT-9455 Measure Details - New Page Design and Navigation
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   When I click create new composite measure
   Then I enter composite measure name as "Test composite"
   Then  I enter CQL title name as "Smoketitle"
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
   Then I Verify "Component Measures" is displayed successfylly
   Then I Verify "Measure Steward / Developer" is displayed successfylly
   Then I Verify "Description" is displayed successfylly
   Then I Verify "Copyright" is displayed successfylly
   Then I Verify "Disclaimer" is displayed successfylly
   Then I Verify "Measure Type" is displayed successfylly
   Then I Verify "Stratification" is displayed successfylly
   Then I Verify "Risk Adjustment" is displayed successfylly
   Then I Verify "Rate Aggregation" is displayed successfylly
   Then I Verify "Rationale" is displayed successfylly
   Then I Verify "Clinical Recommendation" is displayed successfylly
   Then I Verify "Improvement Notation" is displayed successfylly
   Then I Verify "References" is displayed successfylly
   Then I Verify "Definition" is displayed successfylly
   Then I Verify "Guidance" is displayed successfylly
   Then I Verify "Transmission Format" is displayed successfylly
   Then I Verify "Populations" is displayed successfylly
   Then I Verify "Supplemental Data Elements" is displayed successfylly
   Then I Verify "Measure Set" is displayed successfylly
   When I clicked "General Measure Information" is show a header at the top of the page
   When I clicked "Component Measures" is show a header at the top of the page
   When I clicked "Measure Steward / Developer" is show a header at the top of the page
   When I clicked "Description" is show a header at the top of the page
   When I clicked "Copyright" is show a header at the top of the page
   When I clicked "Disclaimer" is show a header at the top of the page
   When I clicked "Measure Type" is show a header at the top of the page
   When I clicked "Stratification" is show a header at the top of the page
   When I clicked "Risk Adjustment" is show a header at the top of the page
   When I clicked "Rate Aggregation" is show a header at the top of the page
   When I clicked "Rationale" is show a header at the top of the page
   When I clicked "Clinical Recommendation" is show a header at the top of the page
   When I clicked "Improvement Notation" is show a header at the top of the page
   When I clicked "References" is show a header at the top of the page
   When I clicked "Definition" is show a header at the top of the page
   When I clicked "Guidance" is show a header at the top of the page
   When I clicked "Transmission Format" is show a header at the top of the page
   When I clicked "Populations" is show a header at the top of the page
   When I clicked "Supplemental Data Elements" is show a header at the top of the page
   When I clicked "Measure Set" is show a header at the top of the page
   Then I select population workspace
   Then I Verify "Initial Populations" is displayed in population workspace
   Then I Verify "Denominators" is displayed in population workspace
   Then I Verify "Denominator Exclusions" is displayed in population workspace
   Then I Verify "Numerators" is displayed in population workspace
   Then I Verify "Numerator Exclusions" is displayed in population workspace
   Then I Verify "Denominator Exceptions" is displayed in population workspace
   Then I Verify "Stratification" is displayed in population workspace
   When I clicked "Initial Populations" is show a header "Population Workspace > Initial Populations" at the top of the page
   When I clicked "Denominators" is show a header "Population Workspace > Denominators" at the top of the page
   When I clicked "Denominator Exclusions" is show a header "Population Workspace > Denominator Exclusions" at the top of the page
   When I clicked "Numerators" is show a header "Population Workspace > Numerators" at the top of the page
   When I clicked "Numerator Exclusions" is show a header "Population Workspace > Numerator Exclusions" at the top of the page
   When I clicked "Denominator Exceptions" is show a header "Population Workspace > Denominator Exceptions" at the top of the page
   When I clicked "Stratification" is show a header "Population Workspace > Stratification" at the top of the page
   
   
   
   Scenario: MAT-9452  Measure Details - General Measure Information Tab Part 1
    When I clicked Measure details
    When I clicked "General Measure Information" is show a header at the top of the page
    Then Verify the field heading "Measure Name" and "eCQM Abbreviated Title" are Required Editable fields
    Then Verify that on page load these fields fill in with the information that was chosen when the measure was created
    And Verify that there is a Save button at the bottom of the fields
    Then Verify that user is presented with an orange checkmark
    Then Verify that all buttons and options can be selected with keyboard only controls
    When I clicked Measure Library
    Then I seacrh read only measure
    Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
    Then Verify that the save button is disabled
    
    
     Scenario: MAT-9478  Measure Details - General Measure Information Tab Part 3
     Then Verify finalized data, GUID, and eCQM Version number field is disabled
     Then Verify that user is presented with an orange checkmark
     #Then Verify that on page load these fields fill in with the information that is stored regarding this measure
     
     
     Scenario: MAT-9560 Highlight General Measure Information Section on load of Measure Details Tab
     #When I clicked Measure details
     When I clicked "General Measure Information" is show a header at the top of the page
     Then Verify that the General Measure Information section is highlighted in the left-hand navigation

     When I clik on signout link
     
     
   
   
   
   