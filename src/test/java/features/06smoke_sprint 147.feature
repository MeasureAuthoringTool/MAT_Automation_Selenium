

@mat
Feature: smoke6- Sprint 147 stories

 
   Scenario: MAT-9271 New Composite Measure button and Screen Creation
   Given I launch MAT QA Website
   And   I should login page
   When  I enter "PerformanceUser4" "Helloworld123?" "1234"
   When  I clicked Sign into UMLS
   When  I enter "skadaru" "Manoher123#"
   Then  I Verify composite measure read as "New Composite Measure"
   Then  Verify that the icon on the button is the sitemap icon with the words New Composite Measure
   Then  Verify that the composite measure can be selected with keyboard controls
   Then  Verify the breadcrumb heading at the top reads "My Measures > Create New Composite Measure"
   Then  Verify that just below the text that states All fields are required
   Then  Verify that all fields have been filled on the New Composite Measure screen
   Then  I enter composite measure name as "Test composite"
   Then  I enter CQL title name as "Smoketitle"
   Then  I enter composite measure Abbreviated title as "test"
   Then  Verify that the Composite Scoring Method dropdown is a required field
   Then  Verify that the Composite Scoring Method field contains "All or Nothing" "Opportunity" "Patient-level linear"
   And   I select measure scoring "Cohort"
   Then  I See Its corresponding patient based measure "Yes" and "No"
   And   I select measure scoring "Continuous Variable"
   Then  I See Its corresponding patient based measure "No"
   And   I select measure scoring "Proportion"
   Then  I See Its corresponding patient based measure "Yes" and "No"
   And   I select measure scoring "Ratio"
   Then  I See Its corresponding patient based measure "Yes" and "No"
   Then  I select composite scoring method "All or Nothing"
   Then  I see "Proportion" and "Ratio" are in Measure scoring
   Then  I select composite scoring method "Opportunity"
   Then  I see "Proportion" and "Ratio" are in Measure scoring
   Then  I select composite scoring method "Patient-level linear"
   Then  I see "Continuous Variable" are in the Measure scoring
   Then  Verify that there are two buttons A Continue button and a Cancel button
   And   These should be the same styling as the buttons on the New Measure Screen
   Then  Verify that the options within the fields can be read, accessed, and selected by keyboard controls
   Then  Verify that clicking on the Cancel button takes the user back to the Measure Library screen

   Scenario: MAT-9274 Component Measure Screen Creation - GUI
    When I click create new composite measure
    Then Verify that all fields have been filled on the New Composite Measure screen
    Then I click save composite measure
    Then I verify user should see an error message for the first field that is left blank
    Then I enter composite measure name as "Test composite"
    Then I click save composite measure
    Then I verify the error message CQL library name composite method
    Then  I enter CQL title name as "Smoketitle"
     Then I click save composite measure
    Then I verify the error message ecQMT title
    Then I enter composite measure Abbreviated title as "test"
    Then I click save composite measure
    Then I verify the error message composite scoring method
    Then I select composite scoring method "All or Nothing"
    Then I click save composite measure
    Then I verify the error message measure scoring
    And I select measure scoring "Proportion"
    Then I select patient-based-measure "Yes"
    Then I Breadcrumb heading should read "My Measures > Create New Composite Measure > Component Measures"
    Then I Verify that the screen has a search box with a search button at the top
    Then Verify that the column title "Measure Name" "Version" "Measure Scoring" "Patient-based Indicator" "Owner" "Select"
    When I Search measure name "2020 Metabolic Monitoring"
    Then I Select the searched Measure
    When I Search measure name "Amblyopia in the Pediatric"
    Then I Select the searched Measure
    Then I See the Selected measure and its details
    Then Verify the Go Back button blue with white text
    Then Verify the Save and Continue button blue with white text
    Then Verify the Cancel button and be red with white text
    Then Verify that there is a label for each section and button and a tooltip shows for each label

    Scenario: MAT-9277 Component Measure Screen Creation - Measure Selection
    Then I See the Selected measure and its details
    Then Verify the Alias field included in the Applied component measure
    When I click Search button
    Then Verify already selected measure returned applied component measure
    Then Unchecking measure will remove that measure from the Applied component measure
    Then I Select the searched Measure
    Then select and deseclect the measure using keyboard control
    Then Verify that using only keyboard controls you can get to and type into the field to assign an alias

    Scenario: MAT-9279 Component Measure Screen Creation - Save and Continue Validations
    Then I Select the searched Measure
    Then Clicked Save and Continue Verify the Error "A composite measure must have more than one component measure."
    Then I Click Go back Button
    And I select measure scoring "Proportion"
    Then I select patient-based-measure "Yes"
    When I Search measure name "2020 Metabolic Monitoring"
    Then I Select the searched Measure
    When I Search measure name "Amblyopia in the Pediatric"
    Then I Select the searched Measure
    Then Verify A component measure must have a measure package error message that reads Measurename "does not have a measure package and can not be used as a component measure."
    Then I Click Go back Button
    And I select measure scoring "Proportion"
    Then I select patient-based-measure "Yes"
    When I Search measure name "2020 Metabolic Monitoring"
    Then I Select the searched Measure
    When I Search measure name "Smoke test100040"
    Then I Select the searched Measure
    Then Verify A component measure must all have the same patient-based indicator setting
    Then I Breadcrumb heading should read "My Measures > Create New Composite Measure > Component Measures"
    Then I Click Go back Button
    And I select measure scoring "Proportion"
    Then I select patient-based-measure "Yes"
    When I Search measure name "2020 Metabolic Monitoring"
    Then I Select the searched Measure
    When I Search measure name "Amblyopia in the Pediatric"
    Then I Select the searched Measure
    Then Verify If the composite measure is a Proportion measure, the component measures must be Proportion or Ratio
    Then I Breadcrumb heading should read "My Measures > Create New Composite Measure > Component Measures"
    Then I Click Go back Button
    And I select measure scoring "Ratio"
    Then I select patient-based-measure "Yes"
    When I Search measure name "2020 Metabolic Monitoring"
    Then I Select the searched Measure
    When I Search measure name "Amblyopia in the Pediatric"
    Then I Select the searched Measure
    Then Verify If the composite measure is a Ratio measure, the component measures must be Proportion or Ratio
    Then I Breadcrumb heading should read "My Measures > Create New Composite Measure > Component Measures"
    Then I Click Go back Button
    And I select measure scoring "Proportion"
    Then I select patient-based-measure "Yes"
    When I Search measure name "2020 Metabolic Monitoring"
    Then I Select the searched Measure
    When I Search measure name "Amblyopia in the Pediatric"
    Then I Select the searched Measure
    Then Verify Each component measure must have an alias assigned
    Then I Breadcrumb heading should read "My Measures > Create New Composite Measure > Component Measures"
    When I clik on signout link


    Scenario: MAT-9300 Composite Measure - Measure Details
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
   When I click Search button
   Then Verify That the Component Measures List shows in the collapsible
   Then Verify that the Component Measures List is read-only and un-editable
   When I Search measure name "Smoke test113931"
   Then I Select the searched Measure
   When I Search measure name "Amblyopia in the Pediatric"
   Then I Select the searched Measure
   Then I enter alias name then click save and continue
   Then I clicked measure library
   Then I search composite measure
   Then User select the created measure
   #When I clicked Measure details
   Then I Verify "Component Measures" is displayed successfylly
   When I clicked "Component Measures" is show a header at the top of the page
   Then I Verify that the Add/Edit Component Measures button no longer exists on the Measure Details Page
   Then Verify that the Component Measures List does not show on the Measure Details Page
   When I clik on signout link


   Scenario: MAT-9196 Bonnie login link and status indicator
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   Then I verify bonnies sign in link is added to the top banner just below the Login to UMLS link
   Then This link should read as "  Sign in to Bonnie"
   And It have and indicator light the same as the UMLS Login
   Then The default light should be red
   When I clicked Sign Into Bonnie
   Then Verify that this link will present a user with message that "You are leaving the Measure Authoring Tool (MAT) and entering another website. The MAT can not attest to the accuracy of the information provided by linked sites. While on another website, you will be subject to that site's Privacy Policy. After a successful login you will be automatically redirected back to your open MAT session. Do you wish to continue?"
   Then I clicked No on the message should close the message,User in currect page
   When I clicked Sign Into Bonnie
   Then I clicked Yes on the message will redirect the user bonnie login area

    Scenario: MAT-9083 GUI - Create Upload to Bonnie page under My Measures > Export
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
   Then Verify two sub-tabs have been added, the current header "My Measures > Export"
   Then I Verify that the first tab is titled "Export"
   And The tool tip for the tab should read as "Select Exports"
   Then I Verify that the second tab is titled "Upload to Bonnie"
   And The tool tip for the second tab should read as "Upload to Bonnie"
   Then Verify that the active tab displays in blue with white text
   And The inactive tab displays with blue text on a white background
   Then Verify that users are able to toggle between the two tabs and that the tab design changes as each tab is chosen and made active/inactive.
   Then Verify the Upload to Bonnie page heading reads as "My Measures > Upload to Bonnie"
   And It displays with the same text styling as the Export tab
   Then Verify the Measure name displays at the top of the panel in the same format as the Export tab
   Then The measure name should display in blue font and underlined
   Then Verify Bonnie ID field format
   Then I Verify below the Bonnie ID field, there is a "Disconnect from Bonnie" link when the user is actively signed in
   Then Verify upload button is added in the Upload to bonnie
   And The tool tip for the button should read as "Upload to Bonnie"
   Then Verify cancel button is added in the Upload to bonnie
   And The tool tip for the cancel button should read as "Cancel"
   Then Verify the Upload button is a bootstrap icon and displays in blue with white text
   Then Verify the Cancel button is a bootstrap icon and displays in red with white text
   Then Verify the measure name displays as a link and redirects users to the Measure Details
   When I search measure name
   Then I click export
   Then Verify the Disconnect from Bonnie link can be selected using keyboard controls
   Then Verify that disconnect from link is hidden when a user is not actively signed into Bonnie
   Then Verify that Upload button is disabled when a user is not actively signed into Bonnie
   Then Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page
   When I search measure name
   Then I click export
   And  The user field should remain blank when the user is not signed into Bonnie
   When I clik on signout link
     
  
   
 
