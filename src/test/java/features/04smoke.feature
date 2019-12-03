
@mat
Feature: Smoke4: CQL workspace Error message verification
  

  Scenario: Verify error message in Definition, Function and parameters 
   Given I launch MAT QA Website
   And  I should login page
   When I enter "PerformanceUser4" "Helloworld123?" "1234"
   When I clicked Sign into UMLS
   When I enter "skadaru" "Manoher123#"
   Then I click New Measure Link
   Then I  create new measure screen
   When I click CQL Workspace
   Then I click on the Definition
   Then Definition try to save directly you should see definition name required error message
   And  Definition start with special characters "+@definition" and verify the Error message
   And  I click on the function
   Then Function try to save directly you should see function name required error message
   And  Function start with special characters "+!function" and verify the error message
   And  I click on the Parameter
   Then Parameter try to save directly you should see parameter name required error message
   And  Parameter start with special characters "+parameter" and verify the error message
   When I clik on signout link
