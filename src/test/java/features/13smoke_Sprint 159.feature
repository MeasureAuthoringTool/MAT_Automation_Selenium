
@mat
Feature: smoke13: Sprint smoke stories


  Scenario: MAT-9487 Measure Details - General Information Tab - Dirty Check and MAT-9579
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
   When I Search measure name "2020 Cervical Cancer Screening"
   Then I Select the searched Measure
   When I Search measure name "Amblyopia in the Pediatric"
   Then I Select the searched Measure
   Then I enter alias name then click save and continue
   When I clicked Measure details
   Then I Verify "General Measure Information" is displayed successfylly
   When I clicked "General Measure Information" is show a header at the top of the page
   Then I Change Measure details Measure Scoring "Ratio"
   Then I click Measure Packager Tab
   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
   Then Verify the No button and save button
   Then Click Yes will not save and navigate successfully
   When I clicked Measure details
   Then I Change Measure details Measure Scoring "Ratio"
   Then I click Measure Packager Tab
   Then Click No will close the message and leave the user on the General Measure Information tab
   Then I click Measure Packager Tab
   Then Click Yes will not save and navigate successfully

   Scenario: MAT-9488 Measure Details - Components Tab - Dirty Check and MAT-9579
    When I clicked Measure details
    Then I Verify "Component Measures" is displayed successfylly
    When I clicked "Component Measures" is show a header at the top of the page
    Then Click Edit Component Measure
    Then I Change alias name "changeAlias"
    Then I click Measure Packager Tab
    Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
    Then Verify the No button and save button
    Then Click Yes will not save and navigate successfully
    When I clicked Measure details
    When I clicked "Component Measures" is show a header at the top of the page
    Then Click Edit Component Measure
    Then I Change alias name "changeAlias"
    Then I click Measure Packager Tab
    Then Click No will close the message and leave the user on the Components Tab
    Then I click Measure Packager Tab
    Then Click Yes will not save and navigate successfully

   Scenario: MAT-9554 Measure Details - Component Measures Tab - Save and Validations
    When I clicked Measure details
    When I clicked "Component Measures" is show a header at the top of the page
    Then Click Edit Component Measure
    Then I Change alias name "Alias_name"
    Then Verify the save and continue button
    Then Click save button Verify Successfully Updated message "Component Measures have been successfully updated"

   Scenario: MAT-9489 Measure Details - Measure Steward/Developer Tab - Dirty Check and MAT-9579
   Then I Verify "Measure Steward / Developer" is displayed successfylly
   When I clicked "Measure Steward / Developer" is show a header at the top of the page
   Then select Measure Steward List "Able Health"
   Then I click Measure Packager Tab
   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
   Then Verify the No button and save button
   Then Click Yes will not save and navigate successfully
   When I clicked Measure details
   When I clicked "Measure Steward / Developer" is show a header at the top of the page
   Then select Measure Steward List "Able Health"
   Then I click Measure Packager Tab
   Then Click No will close the message and leave the user on the Measure Steward / Developer
   When I Click Save button Verify the Success Message "Changes for the Measure Steward and Measure Developer section have been successfully saved."


 	Scenario: MAT-9490 Measure Details - Description - Dirty Check and MAT-9579
 	Then I Verify "Description" is displayed successfylly
 	When I clicked "Description" is show a header at the top of the page
 	Then Enter Description information "Text"
 	Then I click Measure Packager Tab
 	Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
  Then Verify the No button and save button
  Then Click Yes will not save and navigate successfully
 	When I clicked Measure details
	When I clicked "Description" is show a header at the top of the page
  Then Enter Description information "Text"
  Then I click Measure Packager Tab
  Then Click No will close the message and leave the user on the Description page
  When I Click Save button Verify the Success Message "Changes for the Description section have been successfully saved."


  Scenario: MAT-9493 Measure Details - Measure Type - Dirty Check and MAT-9579
  Then I Verify "Measure Type" is displayed successfylly
  When I clicked "Measure Type" is show a header at the top of the page
  Then I select Measure Type Efficiency
  Then I click Measure Packager Tab
 	Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
  Then Verify the No button and save button
  Then Click Yes will not save and navigate successfully
 	When I clicked Measure details
 	When I clicked "Measure Type" is show a header at the top of the page
 	Then I select Measure Type Efficiency
 	Then I click Measure Packager Tab
 	Then Click No will close the message and leave the user on the Measure Type page
  When I Click Save button Verify the Success Message "Changes for the Measure Type section have been successfully saved."


  Scenario: MAT-9494 Measure Details - Stratification - Dirty Check and MAT-9579
  Then I Verify "Stratification" is displayed successfylly
  When I clicked "Stratification" is show a header at the top of the page
  Then Enter Stratification information "Text"
 Then I click Measure Packager Tab
 	Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
  Then Verify the No button and save button
  Then Click Yes will not save and navigate successfully
 	When I clicked Measure details
 	When I clicked "Stratification" is show a header at the top of the page
 	Then Enter Stratification information "Text"
  Then I click Measure Packager Tab
 	Then Click No will close the message and leave the user on the Stratification page
 	When I Click Save button Verify the Success Message "Changes for the Stratification section have been successfully saved."


  Scenario: MAT-9495 Measure Details - Risk Adjustment - Dirty Check and MAT-9579
  Then I Verify "Risk Adjustment" is displayed successfylly
  When I clicked "Risk Adjustment" is show a header at the top of the page
  Then Enter Risk Adjustment information "Text"
  Then I click Measure Packager Tab
 	Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
  Then Verify the No button and save button
  Then Click Yes will not save and navigate successfully
 	When I clicked Measure details
 	When I clicked "Risk Adjustment" is show a header at the top of the page
 	Then Enter Risk Adjustment information "Text"
 	Then I click Measure Packager Tab
 	Then Click No will close the message and leave the user on the Risk Adjustment page
  When I Click Save button Verify the Success Message "Changes for the Risk Adjustment section have been successfully saved."


  Scenario: MAT-9496 Measure Details - Rate Aggregation - Dirty Check and MAT-9579
  Then I Verify "Rate Aggregation" is displayed successfylly
  When I clicked "Rate Aggregation" is show a header at the top of the page
  Then Enter Rate Aggregation information "Text"
  Then I click Measure Packager Tab
 	Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
  Then Verify the No button and save button
  Then Click Yes will not save and navigate successfully
 	When I clicked Measure details
 	When I clicked "Rate Aggregation" is show a header at the top of the page
  Then Enter Rate Aggregation information "Text"
  Then I click Measure Packager Tab
 	Then Click No will close the message and leave the user on the Rate Aggregation page
 	When I Click Save button Verify the Success Message "Changes for the Rate Aggregation section have been successfully saved."

  Scenario: MAT-9497 Measure Details - Rationale - Dirty Check and MAT-9579
 	 Then I Verify "Rationale" is displayed successfylly
   When I clicked "Rationale" is show a header at the top of the page
   Then Enter Rationale information "Text"
   Then I click Measure Packager Tab
 	 Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
   Then Verify the No button and save button
   Then Click Yes will not save and navigate successfully
   When I clicked Measure details
   When I clicked "Rationale" is show a header at the top of the page
   Then Enter Rationale information "Text"
  Then I click Measure Packager Tab
 	 Then Click No will close the message and leave the user on the Rationale page
 	 When I Click Save button Verify the Success Message "Changes for the Rationale section have been successfully saved."

   Scenario: MAT-9498 Measure Details - Clinical Recommendation Statement - Dirty Check and MAT-9579
    Then I Verify "Clinical Recommendation" is displayed successfylly
    When I clicked "Clinical Recommendation" is show a header at the top of the page
    Then Enter Clinical Recommendation information "Text"
    Then I click Measure Packager Tab
 	  Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
    Then Verify the No button and save button
    Then Click Yes will not save and navigate successfully
    When I clicked Measure details
    When I clicked "Clinical Recommendation" is show a header at the top of the page
    Then Enter Clinical Recommendation information "Text"
    Then I click Measure Packager Tab
 	  Then Click No will close the message and leave the user on the Clinical Recommendation page
 	  When I Click Save button Verify the Success Message "Changes for the Clinical Recommendation Statement section have been successfully saved."

    Scenario: MAT-9499 Measure Details - Improvement Notation - Dirty Check and MAT-9579
     Then I Verify "Improvement Notation" is displayed successfylly
     When I clicked "Improvement Notation" is show a header at the top of the page
     Then Enter Improvement Notation "Text"
     Then I click Measure Packager Tab
 	   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
     Then Verify the No button and save button
     Then Click Yes will not save and navigate successfully
     When I clicked Measure details
     When I clicked "Improvement Notation" is show a header at the top of the page
     Then Enter Improvement Notation "Text"
     Then I click Measure Packager Tab
 	   Then Click No will close the message and leave the user on the Improvement Notation page
 	   When I Click Save button Verify the Success Message "Changes for the Improvement Notation section have been successfully saved."

   Scenario: MAT-9500 Measure Details - Definition - Dirty Check and MAT-9579
      Then I Verify "Definition" is displayed successfylly
      When I clicked "Definition" is show a header at the top of the page
      Then Enter Definition "Text"
      Then I click Measure Packager Tab
 	    Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save and navigate successfully
      When I clicked Measure details
      When I clicked "Definition" is show a header at the top of the page
      Then Enter Definition "Text"
      Then I click Measure Packager Tab
 	    Then Click No will close the message and leave the user on the Definition page
      When I Click Save button Verify the Success Message "Changes for the Definition section have been successfully saved."



    Scenario: MAT-9501 Measure Details - References - Dirty Checks
      Then I Verify "References" is displayed successfylly
      When I clicked "References" is show a header at the top of the page
      Then Enter References information "Text1"
      Then I click Measure Packager Tab
      Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save and navigate successfully
      When I clicked Measure details
      When I clicked "References" is show a header at the top of the page
      Then Enter References information "Text1"
      Then I click Measure Packager Tab
      Then Click No will close the message and leave the user on the References page
      When I Click Save button Verify the Success Message "Changes for the References section have been successfully saved."
      Then Enter References information "Text12"
      Then Verify Click edit icon then text of that reference back into the text area
      Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save the changes made to the text field.
      Then I click Measure Packager Tab
      Then Click No will close the message and leave the user on the References page
      When I Click Save button Verify the Success Message "Changes for the References section have been successfully saved."

    Scenario: MAT-9502 Measure Details - Guidance - Dirty Check and MAT-9579
      Then I Verify "Guidance" is displayed successfylly
      When I clicked "Guidance" is show a header at the top of the page
      Then Enter Guidance "Text"
      Then I click Measure Packager Tab
 	    Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save and navigate successfully
      When I clicked Measure details
      When I clicked "Guidance" is show a header at the top of the page
      Then Enter Guidance "Text"
      Then I click Measure Packager Tab
 	    Then Click No will close the message and leave the user on the Guidance page
 	    When I Click Save button Verify the Success Message "Changes for the Guidance section have been successfully saved."

   Scenario: MAT-9503 Measure Detials - Transmission Format - Dirty Check   and MAT-9579
      Then I Verify "Transmission Format" is displayed successfylly
      When I clicked "Transmission Format" is show a header at the top of the page
      Then Enter Transmission Format "Text"
      Then I click Measure Packager Tab
 	    Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save and navigate successfully
      When I clicked Measure details
      When I clicked "Transmission Format" is show a header at the top of the page
      Then Enter Transmission Format "Text"
      Then I click Measure Packager Tab
      Then Click No will close the message and leave the user on the Transmission Format page
      When I Click Save button Verify the Success Message "Changes for the Transmission Format section have been successfully saved."

    Scenario: MAT-9504 Measure Details - Supplemental Data Elements - Dirty Check and MAT-9579
      Then I Verify "Supplemental Data Elements" is displayed successfylly
      When I clicked "Supplemental Data Elements" is show a header at the top of the page
      Then Enter Supplemental Data Elements "Text"
      Then I click Measure Packager Tab
 	    Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save and navigate successfully
      When I clicked Measure details
      When I clicked "Supplemental Data Elements" is show a header at the top of the page
      Then Enter Supplemental Data Elements "Text"
      Then I click Measure Packager Tab
      Then Click No will close the message and leave the user on the Supplemental Data Elements page
      When I Click Save button Verify the Success Message "Changes for the Supplemental Data Elements section have been successfully saved."


    Scenario: MAT-9524 Measure Details - Initial Population - Dirty Check  and MAT-9579
      When I clicked "Populations" is show a header at the top of the page
      Then I Verify "Initial Population" is displayed successfylly
   	  When I clicked "Initial Population" is show a header at the top of the page
   	  Then Enter Initial Population "Text"
   	  Then I click Measure Packager Tab
 	    Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
      Then Verify the No button and save button
      Then Click Yes will not save and navigate successfully
      When I clicked Measure details
      When I clicked "Populations" is show a header at the top of the page
   	  When I clicked "Initial Population" is show a header at the top of the page
   	  Then Enter Initial Population "Text"
   	  Then I click Measure Packager Tab
   	  Then Click No will close the message and leave the user on the Initial Population page
      When I Click Save button Verify the Success Message "Changes for the Populations > Initial Population section have been successfully saved."


    Scenario: MAT-9525 Measure Details - Denominator - Dirty Check and MAT-9579
     Then I Verify "Denominator" is displayed successfylly
     When I clicked "Denominator" is show a header at the top of the page
     Then Enter Denominator "Text"
     Then I click Measure Packager Tab
 	   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
     Then Verify the No button and save button
     Then Click Yes will not save and navigate successfully
     When I clicked Measure details
     When I clicked "Populations" is show a header at the top of the page
     When I clicked "Denominator" is show a header at the top of the page
     Then Enter Denominator "Text"
     Then I click Measure Packager Tab
   	 Then Click No will close the message and leave the user on the Denominator page
     When I Click Save button Verify the Success Message "Changes for the Populations > Denominator section have been successfully saved."



    Scenario: MAT-9526 Measure Details - Denominator Exclusions - Dirty Check and MAT-9579
     Then I Verify "Denominator Exclusions" is displayed successfylly
     When I clicked "Denominator Exclusions" is show a header at the top of the page
     Then Enter Denominator Exclusions "Text"
     Then I click Measure Packager Tab
 	   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
     Then Verify the No button and save button
     Then Click Yes will not save and navigate successfully
     When I clicked Measure details
     When I clicked "Populations" is show a header at the top of the page
     When I clicked "Denominator Exclusions" is show a header at the top of the page
     Then Enter Denominator Exclusions "Text"
     Then I click Measure Packager Tab
   	 Then Click No will close the message and leave the user on the Denominator Exclusions page
     When I Click Save button Verify the Success Message "Changes for the Populations > Denominator Exclusions section have been successfully saved."


   Scenario: MAT-9527 Measure Details - Numerator - Dirty Check  and MAT-9579
     Then I Verify "Numerator" is displayed successfylly
   	 When I clicked "Numerator" is show a header at the top of the page
     Then Enter Numerator "Text"
     Then I click Measure Packager Tab
 	   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
     Then Verify the No button and save button
     Then Click Yes will not save and navigate successfully
     When I clicked Measure details
     When I clicked "Populations" is show a header at the top of the page
     When I clicked "Numerator" is show a header at the top of the page
     Then Enter Numerator "Text"
     Then I click Measure Packager Tab
     Then Click No will close the message and leave the user on the Numerator page
		 When I Click Save button Verify the Success Message "Changes for the Populations > Numerator section have been successfully saved."


  Scenario: MAT-9529 Measure Details - Denominator Exceptions - Dirty Check and MAT-9579
     Then I Verify "Denominator Exceptions" is displayed successfylly
     When I clicked "Denominator Exceptions" is show a header at the top of the page
     Then Enter Denominator Exceptions "Text"
     Then I click Measure Packager Tab
 	   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
     Then Verify the No button and save button
     Then Click Yes will not save and navigate successfully
     When I clicked Measure details
     When I clicked "Populations" is show a header at the top of the page
     When I clicked "Denominator Exceptions" is show a header at the top of the page
     Then Enter Denominator Exceptions "Text"
     Then I click Measure Packager Tab
     Then Click No will close the message and leave the user on the Denominator Exceptions page
     When I Click Save button Verify the Success Message "Changes for the Populations > Denominator Exceptions section have been successfully saved."


   Scenario: MAT-9528 Measure Details - Numerator Exclusions - Dirty Check and MAT-9579
     Then I Verify "Numerator Exclusions" is displayed successfylly
     When I clicked "Numerator Exclusions" is show a header at the top of the page
     Then Enter Numerator Exclusions "Text"
     Then I click Measure Packager Tab
 	   Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
     Then Verify the No button and save button
     Then Click Yes will not save and navigate successfully
     When I clicked Measure details
     When I clicked "Populations" is show a header at the top of the page
     When I clicked "Numerator Exclusions" is show a header at the top of the page
     Then Enter Numerator Exclusions "Text"
     Then I click Measure Packager Tab
     Then Click No will close the message and leave the user on the Numerator Exclusions page
     When I Click Save button Verify the Success Message "Changes for the Populations > Numerator Exclusions section have been successfully saved."



   Scenario: MAT-9475 Measure Details - Component Measures Tab
      Then I Verify "Component Measures" is displayed successfylly
      When I clicked "Component Measures" is show a header at the top of the page
      Then Verify that the Heading Measure Name, Alias name and Version
      Then Verify the Edit Button titled "Edit Component Measures"
      Then Click Edit Component Measure
      Then I Search Component Measure
      Then Verify That the Component Measures List shows in the collapsible
      Then Verify that the Component Measures List is read-only and un-editable
      Then Verify the Save and Continue button blue with white text
      Then Verify that the list of returned results displays "15" and then paginates the remaining.
      Then I Change alias name "Alias_name"
      Then Verify the save and continue button
      Then Click save button Verify Successfully Updated message "Component Measures have been successfully updated"
      When I clik on signout link
     
     
     
  Scenario: MAT-9530 Measure Details - Measure Population - Dirty Check and MAT-9579
    Given I launch MAT QA Website
    And  I should login page
    When I enter "PerformanceUser4" "Helloworld123?" "1234"
    When I clicked Sign into UMLS
    When I enter "skadaru" "Manoher123#"
 	  Then I click New Measure Link
    Then I enter new measure name as "Smoke test"
    Then I enter CQL title name as "Smoketitle"
    Then I enter eCQM title name as "Smoke title"
    Then I select measure scoring type "Continuous Variable"
    Then I select patient based indicator as "No"
    When I clicked Measure details
    When I clicked "Populations" is show a header at the top of the page
    Then I Verify "Measure Population" is displayed successfylly
    When I clicked "Measure Population" is show a header at the top of the page
    Then Enter Measure Population "Text"
    Then I click Measure Packager Tab
 	  Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
    Then Verify the No button and save button
    Then Click Yes will not save and navigate successfully
    When I clicked Measure details
    When I clicked "Populations" is show a header at the top of the page
    When I clicked "Measure Population" is show a header at the top of the page
    Then Enter Measure Population "Text"
    Then I click Measure Packager Tab
    Then Click No will close the message and leave the user on the Measure Population page
    When I Click Save button Verify the Success Message "Changes for the Populations > Measure Population section have been successfully saved." 
    
    
  Scenario: MAT-9531 Measure Details - Measure Population Exclusions - Dirty Check and MAT-9579
    When I clicked "Measure Population Exclusions" is show a header at the top of the page
    Then I Verify "Measure Population Exclusions" is displayed successfylly
    Then Enter Measure Population Exclusions "Text"
    Then I click Measure Packager Tab
 	  Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
    Then Verify the No button and save button
    Then Click Yes will not save and navigate successfully
    When I clicked Measure details
    When I clicked "Populations" is show a header at the top of the page
    When I clicked "Measure Population Exclusions" is show a header at the top of the page
    Then Enter Measure Population Exclusions "Text"
    Then I click Measure Packager Tab
    Then Click No will close the message and leave the user on the Measure Population Exclusions page
    When I Click Save button Verify the Success Message "Changes for the Populations > Measure Population Exclusions section have been successfully saved." 
    
     
  Scenario: MAT-9532 Measure Details - Measure Observations - Dirty Check and MAT-9579
    Then I Verify "Measure Observations" is displayed successfylly
    When I clicked "Measure Observations" is show a header at the top of the page
    Then Enter Measure Observations "Text"
    Then I click Measure Packager Tab
 	  Then I see the error message in Measure details page "You have unsaved changes that will be discarded if you continue. Do you want to continue without saving?"
    Then Verify the No button and save button
    Then Click Yes will not save and navigate successfully
    When I clicked Measure details
    When I clicked "Populations" is show a header at the top of the page
    When I clicked "Measure Observations" is show a header at the top of the page
    Then Enter Measure Observations "Text"
    Then I click Measure Packager Tab
    Then Click No will close the message and leave the user on the Measure Observations page
    When I Click Save button Verify the Success Message "Changes for the Populations > Measure Observations section have been successfully saved."


  Scenario: MAT-9467 Measure Details - References
    Then I Verify "References" is displayed successfylly
    When I clicked "References" is show a header at the top of the page
    Then Verify that the table column Description Edit and Delete
    Then Verify that edit and delete icon and User information text field
    Then Enter References information "Text1" and click save button
    Then Verify the Item added in the table
    Then Verify The information text area is clear and ready for the next entry
    Then Enter References information "Text2" and click save button
    Then Enter References information "Text3" and click save button
    Then Enter References information "Text4" and click save button
    Then Enter References information "Text5" and click save button
    Then Verify Click edit icon then text of that reference back into the text area
    Then Enter References information "change thet ext" and click save button
    Then Click delete button
    Then I see the buttom Yes and No
    Then Click No Button verify leave the message
    Then Click delete button
    Then Click Yes button delete the referance
    When I Click Save button Verify the Success Message "Changes for the References section have been successfully saved."
    Then Verify Referance successfully saved the  user is presented with a green checkmark
    When I clicked Measure Library
    Then I seacrh read only measure
    Then Verify that the above listed Editable fields are not editable if the measure is in a read-only state
    Then Verify that the save button is disabled
    When I clik on signout link

 Scenario: MAT-9520 MAT Main Header - Disconnect from Bonnie
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I verify Bonnie login deactive then sign into bonnie
   Then Verify that the Bonnie login link changes to "Disconnect from Bonnie"
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
   Then Verify the Upload to Bonnie page heading reads as "My Measures > Upload to Bonnie"
   Then I Verify below the Bonnie ID field, there is a "Disconnect from Bonnie" link when the user is actively signed in
   Then Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page
   Then I click Disconnect from Bonnie Verify User Successfully disconnect the session
   When I search measure name
   Then User select the created measure
   Then Click Measure Package
   Then Verify Package and Upload to Bonnie Button is Disable

 Scenario: MAT-9522 MAT Main Header - Profile Icon
   Then Verify that to the right of the Bonnie login link is a user icon
   Then The icon should be the same blue as the Measure Authoring Tool Heading
   Then Verify that clicking on that icon presents the user with a dropdown
   And It contains static text and then  two options
   Then Verify Click MAT Account User in Personal Information Tab
   When I clik on signout link

  
   
   
 
   
   
   
   
    
   
   
    
    
    
  
   
     
   
     
     
     
     
     
     
     