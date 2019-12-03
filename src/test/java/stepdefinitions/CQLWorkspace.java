package stepdefinitions;

import Utilities.Excel;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CQLWorkspacepage;
import pages.CreateMeasurePage;
import pages.MeasureLibrary;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CQLWorkspace extends AbstractTestBase {
	
	SimpleDateFormat dateformat = new SimpleDateFormat("HHmmss");
	Date date = new Date();
	String time = dateformat.format(date);
	String Mesurename="test"+time;
	
	
	@When("^I click CQL Workspace$")
	public void i_click_on_CQL_Workspace() throws Throwable {
		
		Thread.sleep(3000);
		click(CQLWorkspacepage.tabCQLWorkspace, "CQL Workspace tab");
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@When("^Verify definition successfully saved warning message$")
	public void Verify_definition_warning_message() throws Throwable {
		IsElementExists(CreateMeasurePage.definitionwarningmsg, " Definition succesfully saved with errors");
		Thread.sleep(3000);
	}
	
	
	@When("^I click on Value Sets$")
	public void i_click_on_Value_Sets() throws Throwable {
		Thread.sleep(3000);
		click(CQLWorkspacepage.lnkValueSets, "Value Sets Link");  
		Thread.sleep(3000);
	}
	private String oid;
	@Then("^I enter \"([^\"]*)\"$")
	public void i_enter_OID(String oid) throws Throwable {
		Thread.sleep(4000);
		this.oid=oid;
		clear(CQLWorkspacepage.txtoidId, "OID textfield");
		type(CQLWorkspacepage.txtoidId, oid, "OID textfield");
		Thread.sleep(3000);
	}
	
	@Then("^I click Retrive OID buttons$")
	public void i_click_Retrive_OID_buttons() throws Throwable {
	  Thread.sleep(3000);
	  click(CQLWorkspacepage.btnRetVS,"Click Retrieve Button");
	  Thread.sleep(3000);
	}
	
	@Then("^I Click Apply OId button$")
	public void i_Click_Apply_OID_button() throws Throwable {
		click(CQLWorkspacepage.btnApply, "Apply button");
		Thread.sleep(3000);
	}
	
	@Then("^I click on the Definition$")
	public void i_click_on_the_Definition() throws Throwable {
		click(CQLWorkspacepage.lnkDefinition, "Definition Link");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Then("^I Click insert icon$")
	public void click_insert_icon() throws Throwable {
		click(CQLWorkspacepage.inserticon, "Click insert icon");
		Thread.sleep(4000);
	}
	
	@Then("^I select attribute \"([^\"]*)\"$")
	public void select_attribute(String attribute) throws Throwable {
		Thread.sleep(2000);
		selectByVisibleText(CQLWorkspacepage.selectattribute, attribute, "select attribute");
		Thread.sleep(2000);
	}
	
	private String datatype;
	@Then("^select datatype \"([^\"]*)\"$")
	public void select_datatype(String datatype) throws Throwable {
		this.datatype=datatype;
		Thread.sleep(2000);
		selectByVisibleText(CQLWorkspacepage.dropdownAttributeDatatype, datatype, "select datatype");
		Thread.sleep(2000);	
	}
	
	private int Attributes_By_Data_Type;

	@Then("^verify corresponding attributes$")
	public void verify_corresponding_attribute() throws Throwable {
		
		
     
        //String file="input\\Attribute.xlsx";

        String file = new File("input//Attribute.xlsx").getAbsolutePath();

        
		WebElement comboBox =driver.findElement(CQLWorkspacepage.dropdownAttributeDatatype);
		Select selectedValue = new Select(comboBox);
		WebElement option = selectedValue.getFirstSelectedOption();
	    String attributedatatype = option.getText();
	    
	    Excel.setExcelFile(file, "Sheet1");
	    Attributes_By_Data_Type=Excel.getRowContains(datatype, 0); 
	    
	    String attdatatype=Excel.getCellData(Attributes_By_Data_Type, 0);
	    if(datatype.equals(attdatatype))
	    {
		try
		{
			
			String Attributes="";
		    Attributes=Excel.getCellData(Attributes_By_Data_Type, 1);
		    WebElement dropdown = driver.findElement(CQLWorkspacepage.attributename);  
	        Select select = new Select(dropdown);
	        List<WebElement> options = select.getOptions();
	        ArrayList<String> items = new ArrayList(Arrays.asList(Attributes.split("\\s*,\\s*")));
			String[] array=items.toArray(new String[0]);
//			System.out.println(datatype+" corresponding attributes="+Arrays.toString(array));
			Reporter.addStepLog(datatype+" corresponding attributes="+Arrays.toString(array));
			int count=0;
	        for(WebElement we:options)  
	        {  
	        	
	         for (int i=0; i<array.length; i++){
	             if (we.getText().equals(array[i])){
	            	count++;
	             
	             } 
	           }
	        }
	        
	        if(count==array.length)
	        {
//	        	System.out.println("Matched- Verification successful: corresponding attributes are in the list box");
	        	Reporter.addStepLog("Matched- Verification successful: corresponding attributes are in the list box");
	        }
	        else
	        {
//	        	System.out.println("Verification incorrect - Then Attribute name doesnot match");
	        	Reporter.addStepLog("Verification incorrect - Then Attribute name doesnot match");
	        	
	        }
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	    }
	    else
	    {
	    	System.out.println("Verification incorrect - The Attribute doesnot match");
	    	Reporter.addStepLog("Verification incorrect - The Attribute doesnot match");
	    }
	    Thread.sleep(2000);
	    selectByVisibleText(CQLWorkspacepage.attributename, "code", "select Attribute");
		Thread.sleep(2000);	
	    click(CQLWorkspacepage.closeicon, "Click close button");
//	    click(CQLWorkspacepage.btnCancelInsertOptionsAttributes, "Click cancel button");
	    Thread.sleep(5000);
	    }
	
	
	@When("^I create new definition with \"([^\"]*)\" and context as patient$")
	public void create_new_definition(String DefinitionName) throws Throwable {
		click(CQLWorkspacepage.lnkDefinition, "Definition Link");
		
		Thread.sleep(2000);
		clear(CQLWorkspacepage.definitionNameTxt, "Definition Name");
		Thread.sleep(2000);
		click(CQLWorkspacepage.CrtDefinition, "Cretate new definition icon");
		Thread.sleep(2000);
		type(CQLWorkspacepage.definitionNameTxt , DefinitionName, "Definition Name");
		Thread.sleep(2000);
//		click(CreateMeasurePage.population_radio_btn, "Click context");
//		Thread.sleep(2000);
		click(CQLWorkspacepage.definitionSaveBtn, "Save definition button");
		Thread.sleep(2000);
	}
	

	@Then("^I select \"([^\"]*)\" logic from definition list$")
	public void select_first_logic_definition(String a) throws Throwable {
//		click(CQLWorkspacepage.definitionSelectFirst,"First Definition selection");
//		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(CQLWorkspacepage.definitionSelectFirst);

		//Double click
		action.doubleClick(element).perform();
		Thread.sleep(3000);
	}
	
	@Then("^I enter first Build CQL Expression$")
	public void enter_logic_definition() throws Throwable {

		String LogicName="exists [\"Laboratory Test, Performed\": \"Clinical Trial Participant\"] Lab where \"Has Equivalent Ratio\"(Lab.result as Ratio, 1: 2)";
        Thread.sleep(2000);
		type(CQLWorkspacepage.definitionBuildCQLCode, LogicName,"LogicName");
		Thread.sleep(2000);
		click(CQLWorkspacepage.definitionSaveBtn, "Save definition button");
		Thread.sleep(2000);
	}
	
	@Then("^I select \"([^\"]*)\" from the definition list$")
	public void select_second_logic_definition(String b) throws Throwable {
		
		click(CQLWorkspacepage.definitionSelectSecond,"Second Definition selection");
		Thread.sleep(2000);
	}
	
	@Then("^I enter second Build CQL Expression$")
	public void enter_logic_definition2() throws Throwable {

		String LogicName="exists [\"Medication, Order\": \"Above Normal Medications\"] MO where \"Occurred During January to June of Current Year\"(date from MO.authorDatetime)";
        Thread.sleep(2000);
		type(CQLWorkspacepage.definitionBuildCQLCode, LogicName,"LogicName");
		Thread.sleep(2000);
		click(CQLWorkspacepage.definitionSaveBtn, "Save definition button");
		Thread.sleep(2000);
	}
	
	@Then("^Create function with name \"([^\"]*)\"$")
	public void enter_function_name(String functionname) throws Throwable {
		click(CQLWorkspacepage.lnkFunction, "Click function");
		Thread.sleep(2000);
		type(CQLWorkspacepage.functionname, functionname,"Function name");
		Thread.sleep(2000);
//		click(CQLWorkspacepage.population_radio_btn, "Click context");
//		Thread.sleep(2000);
	}
	
	@Then("^I Click on add argument$")
	public void click_add_argument() throws Throwable {
		click(CQLWorkspacepage.addargument, "Click add argument");
		Thread.sleep(5000);

	}
	
	@Then("^Create argument with \"([^\"]*)\" and \"([^\"]*)\" datatype$")
	public void create_argument(String argumentname,String datatype) throws Throwable {
		Thread.sleep(3000);
		type(CQLWorkspacepage.argumentname, argumentname,"Argument name");
		Thread.sleep(2000);
		selectByVisibleText(CQLWorkspacepage.argument_available_datatype, datatype, "Argumrnt available datatypes");
		Thread.sleep(5000);
		click(CQLWorkspacepage.btn_argument_add, "Click add button in argument");
		Thread.sleep(5000);
		
	}
	
	@Then("^Create second argument with \"([^\"]*)\" and \"([^\"]*)\" datatype$")
	public void create_second_argument(String argumentname,String datatype) throws Throwable {
		Thread.sleep(3000);
		type(CQLWorkspacepage.argumentname, argumentname,"Argument name");
		Thread.sleep(3000);
		selectByVisibleText(CQLWorkspacepage.argument_available_datatype, datatype, "Argumrnt available datatypes");
		Thread.sleep(5000);
		click(CQLWorkspacepage.btn_argument_add, "Click add button in argument");
		Thread.sleep(5000);
	}
	
	@Then("^Enter Build CQL Expression \"([^\"]*)\"$")
	public void function_build_cql_expression(String functioncql) throws Throwable {
		
		type(CQLWorkspacepage.functionBuildCQLCode, functioncql,"Function Build CQLcode");
		Thread.sleep(4000);
	}
	
	@Then("^save function$")
	public void save_function() throws Throwable {
		click(CQLWorkspacepage.functionsavebtn, "Function save");
		Thread.sleep(2000);

	}
	
	@Then("^I click on the function$")
	public void i_click_on_the_function() throws Throwable {
		click(CQLWorkspacepage.lnkFunction, "Function Link");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	
	@Then("^I create a function with period$") 
	public void i_create_a_function_with_period() throws Throwable {
		type(CQLWorkspacepage.txtFuncName,"test.Function","Function Name with period");
		   type(CQLWorkspacepage.txtFuncdesc,"true","Function description");
		   Thread.sleep(4000);
		   click(CQLWorkspacepage.iconSave1, "Save Function");
		   Thread.sleep(3000);
		   /*Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);*/
		   
	}
	
	
	@Then("^I create a definition with period$")
	public void i_create_a_definition_with_period() throws Throwable {
		type(CQLWorkspacepage.txtDefiName,"test.Definition","Definition Name with period");
		   type(CQLWorkspacepage.txtDefidesc,"true","Definition description");
		   Thread.sleep(4000);
		   click(CQLWorkspacepage.iconSavedefinition, "Save Definition");
		   Thread.sleep(3000);
	}
	
	@Then("^I click on the Parameter$")
	public void i_click_on_the_Parameter() throws Throwable {
		Thread.sleep(3000);
		click(CQLWorkspacepage.lnkPara,"Click on Parameter link");
		Thread.sleep(3000);
	}
	
	@Then("^I create a parameter with period$")
	public void i_create_a_parameter_with_period() throws Throwable {
	   type(CQLWorkspacepage.txtParameterName,"test.Parameter","Parameter Name with period");
	   type(CQLWorkspacepage.txtParadesc,"Interval<DateTime>","Parameter description");
	   Thread.sleep(4000);
	   click(CQLWorkspacepage.iconSavePara, "Save Parameter");
	   Thread.sleep(3000);
	}
	
	@Then("^I enter the OID \"([^\"]*)\" and suffix \"([^\"]*)\"$")
	public void i_enter_and_suffix(String arg1, String arg2) throws Throwable {
	    Thread.sleep(2000);
	    type(CQLWorkspacepage.txtoidId, arg1, "Entered the OID");
	    type(CQLWorkspacepage.txtSuffixCode, arg2, "Entered the suffix code");
	}
	
	@Then("^I create the definitions for location Period$")
	public void i_create_the_definitions_for_location_Period() throws Throwable {
	  click(CQLWorkspacepage.lnkAddNew, "Add new Definition");
	  type(CQLWorkspacepage.txtDefiName, "LocationPeriodTest", "Keyed in the definition name");
	  type(CQLWorkspacepage.txtDefidesc, "exists [\"Encounter, Performed\": \"Above Normal Medications (1234)\"] E where exists ( E.facilityLocations fl where fl.locationPeriod is not null)", "Definition Description");
	  click(CQLWorkspacepage.iconSave, "Save Definition");
	  Thread.sleep(5000);
	}
	
	@Then("^I click on Codes$")
	public void i_click_on_Codes() throws Throwable {
		Thread.sleep(3000);
		
		click(CQLWorkspacepage.lnkCodes, "Click the link Codes");
	
		Thread.sleep(2000);
	}
	
	@Then("^I enter the \"([^\"]*)\" and suffix \"([^\"]*)\"$")
	public void i_enter_the_and_suffix(String arg1, String arg2) throws Throwable {
		click(CQLWorkspacepage.codeurl, "Focuse in Codes");
	    type(CQLWorkspacepage.codeurl, arg1, "Code URL entered");		 
	    type(CQLWorkspacepage.txtSuffixCode, arg2, "Suffix for Code");
	}
	
	@Then("^I click on Retrieve$")
	public void i_click_on_Retrieve() throws Throwable {
	    click(CQLWorkspacepage.btnRetrieve, "Click button Retrieve");
	    Thread.sleep(5000);
	}
	
	@Then("^I click on Apply$")
	public void i_click_on_Apply() throws Throwable {
		click(MeasureLibrary.btnApply, "Click button Apply");
	    Thread.sleep(5000);
	}
	
	@Then("^I click on the checkbox to copy the code$")
	public void i_click_on_the_checkbox_to_copy_the_code() throws Throwable {
	   click(CQLWorkspacepage.chkboxTopCopyPasteCode, "Click the checkbox for the code to be copied"); 
	}
	
	@Then("^I click copy$")
	public void i_click_copy() throws Throwable {
	  click(CQLWorkspacepage.lnkCopyCode, "Click copy for copying the code");
	}
	
	@When("^I click paste$")
	public void i_click_paste() throws Throwable {
	    click(CQLWorkspacepage.lnkPasteCode, "Paste the copied code");
	}
	
	@Then("^I verify a validation message for copying duplicate codes$")
	public void i_verify_a_validation_message_for_copying_duplicate_codes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    verifyText(by, expected, elementName);
	}
	
	@Then("^I create definition using code$")
	public void i_create_definition_using_code() throws Throwable {
	    type(CQLWorkspacepage.txtDefiName,"definition1","Enter the definition name");
	    type(CQLWorkspacepage.txtDefidesc, "[\"Adverse Event\": \"act request (14)\"]", "Enter the description");
	    click(CQLWorkspacepage.btnSaveDefi, "Save Definition");
	    Thread.sleep(2000);
	}
	
	@Then("^I enter the \"([^\"]*)\"$")
	public void i_enter_the(String arg1) throws Throwable {
		Thread.sleep(5000);
	    type(CQLWorkspacepage.txtCodeId, arg1, "Code URL entered");
	}
	
	@And("^I verify the delete button of the used code is disabled$")
	public void i_verify_the_delete_button_of_the_used_code_is_disabled() throws Throwable {
		Thread.sleep(3000);
	   buttonDisabled(CQLWorkspacepage.btnDelTopCode) ;
	}
	
	@Then("^I verify the information icon$")
	public void i_verify_the_information_icon() throws Throwable {
	   click(CQLWorkspacepage.iconInfo,"Click Info icon");
	}
	
	@Then("^I create a definition for Participation datatype$")
	public void i_create_a_definition_for_Participation_datatype() throws Throwable {

		String expected="Successfully saved with errors. You have an incorrect value set/code datatype combination.";
	   type(CQLWorkspacepage.txtDefiName, "ParticipationDefinition1", "Enter the definition name");
	   type(CQLWorkspacepage.txtDefidesc, "[\"Participation\": \"Dead\"]", "Enetr the description for the definition");
	   click(CQLWorkspacepage.iconSave, "Save definition");
	  // verifyText(MeasureLibraryOR.txtSaveMsg, expected, "Warning message on Save");
	   Thread.sleep(3000);
	   click(CQLWorkspacepage.lnkAddNew, "Add new definition");
	  
	   type(CQLWorkspacepage.txtDefiName, "ParticipationDefinition2", "Enter the definition name");
	   type(CQLWorkspacepage.txtDefidesc, "[\"Participation\": \"Birthdate\"]", "Enetr the description for the definition");
	   click(CQLWorkspacepage.iconSave, "Save definition");
	  // verifyText(MeasureLibraryOR.txtSaveMsg, expected, "Warning message on Save");
	   Thread.sleep(3000);
	   
	}
	
	@Then("^I create definition using code and suffix$")
	public void i_create_definition_using_code_and_suffix() throws Throwable {
		type(CQLWorkspacepage.txtDefiName,"CodeSuffixDefinition1","Enter the definition name");
	    type(CQLWorkspacepage.txtDefidesc, "[\"Adverse Event\": \"act request (1234)\"]", "Enter the description");
	    click(CQLWorkspacepage.btnSaveDefi, "Save Definition");
	    Thread.sleep(2000);
	}
	
	@When("^I click on General Information$")
	public void i_click_on_General_Information() throws Throwable {
	    click(CQLWorkspacepage.lnkGeneralInfo, "Click General Info section");
	}
	
	@Then("^I verify the header for General Information \"([^\"]*)\"$")
	public void i_verify_the_header_for_General_Information(String arg1) throws Throwable {
	   verifyText(CQLWorkspacepage.headerGenInfo, arg1, "Header found");
	   Thread.sleep(2000);	
	}
	
	@Then("^I click on Includes$")
	public void i_click_on_Includes() throws Throwable {
	   click(CQLWorkspacepage.lnkIncludes, "Click Includes section");
	   Thread.sleep(3000);
	}
	
	@Then("^I verify the header for Includes \"([^\"]*)\"$")
	public void i_verify_the_header_for_Includes(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerIncludes, arg1, "Includes Header");
		 Thread.sleep(2000);	
	}
	
	@Then("^I verify the header for Value Sets \"([^\"]*)\"$")
	public void i_verify_the_header_for_Value_Sets(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerValueSets, arg1, "Header found");
		 Thread.sleep(2000);	
	}
	
	@Then("^I verify the header for Codes \"([^\"]*)\"$")
	public void i_verify_the_header_for_Codes(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerCodes, arg1, "Header found");
		 Thread.sleep(2000);	
	}
	
	@Then("^I verify the header for Parameter \"([^\"]*)\"$")
	public void i_verify_the_header_for_Parameter(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerParameter, arg1, "Header found");
		 Thread.sleep(2000);	
	}
	
	@Then("^I verify the header for Definition \"([^\"]*)\"$")
	public void i_verify_the_header_for_Definition(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerDefinition, arg1, "Header found"); 
		 Thread.sleep(2000);	
	}
	
	@Then("^I verify the header for Function \"([^\"]*)\"$")
	public void i_verify_the_header_for_Function(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerFunctions, arg1, "Header found");
		 Thread.sleep(2000);
	}
	
	@When("^I click on View CQL$")
	public void i_click_on_View_CQL() throws Throwable {
		 click(CQLWorkspacepage.lnkViewCQL, "Click the link View CQL");
		 Thread.sleep(3000);
	}
	
	@Then("^I verify the header for View CQL \"([^\"]*)\"$")
	public void i_verify_the_header_for_View_CQL(String arg1) throws Throwable {
		 verifyText(CQLWorkspacepage.headerViewCQL, arg1, "Header found");
		 Thread.sleep(2000);	
	}
	
	@Then("^I verify the error message for Dead Code$")
	public void i_verify_the_error_message_for_Dead_Code() throws Throwable {
	    verifyText(CQLWorkspacepage.msgCodesMeasure, "Dead already exists. Please add a unique suffix", "Dead Code"); //Dead already exists. Please add a unique suffix.
	    Thread.sleep(2000);	
	}
	
	@Then("^I verify the error message for Birthdate Code$")
	public void i_verify_the_error_message_for_Birthdate_Code() throws Throwable {
	    verifyText(CQLWorkspacepage.msgCodesMeasure, "The LOINC Code 21112-8 is a default code already provided. Multiple instances of this code are not allowed.", "Birthdate Code");
	    Thread.sleep(2000);	
	}
	
	@When("^I click Update from VSAC button$")
	public void i_click_Update_from_VSAC_button() throws Throwable {
	    click(CQLWorkspacepage.btnUpdateFromVSAC, "Click update from VASC");
	    Thread.sleep(4000);
	}
	
	@Then("^I verify suffix in table$")
	public void i_verify_suffix_in_table() throws Throwable {
	   verifyText(CQLWorkspacepage.nameTopValueSet, "Above Normal Medications (1234) (E)", "Text from Applied Value Sets");
	}
	
	@Then("^I click on edit icon of ValueSet$")
	public void i_click_on_edit_icon_of_ValueSet() throws Throwable {
	    click(CQLWorkspacepage.editTopValueSet, "Edit the ValueSet");
	    Thread.sleep(3000);
	}
	
	@Then("^I verify Codes left nav is disabled$")
	public void i_verify_Codes_left_nav_is_disabled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//;txtBoxDisabled(CQLWorkspacepage.lnkCodes);
	}
	
	@When("^I create definition as \"([^\"]*)\"$")
	public void i_create_definition_as(String arg1) throws Throwable {
	  type(CQLWorkspacepage.txtDefiName, arg1, "Definition Name entered");
	}
	
	@Then("^I should see comment box$")
	public void i_should_see_comment_box() throws Throwable {
		IsElementExists(CQLWorkspacepage.txtCommentArea, "Comment area Exists");
		
	}
	
	@Then("^I enter the text \"([^\"]*)\" for definition$")
	public void i_enter_the_text_for_definition(String arg1) throws Throwable {
	   type(CQLWorkspacepage.txtCommentArea, arg1, "Text entered for definition comment box");
	}
	
	@Then("^I enter definition description as \"([^\"]*)\"$")
	public void i_enter_definition_description_as(String arg1) throws Throwable {
	   type(CQLWorkspacepage.txtDefidesc, arg1, "Definition description") ;
	}
	
	@Then("^I save the definition$")
	public void i_save_the_definition() throws Throwable {
		click(CQLWorkspacepage.iconSave, "Definition is saved");
		Thread.sleep(3000);
	}
	
	@When("^I create parameter as \"([^\"]*)\"$")
	public void i_create_parameter_as(String arg1) throws Throwable {
	    type(CQLWorkspacepage.txtParameterName, arg1, "Parameter Name entered");
	}
	
	@Then("^I enter the text \"([^\"]*)\" for parameter$")
	public void i_enter_the_text_for_parameter(String arg1) throws Throwable {
		type(CQLWorkspacepage.txtCommentArea, arg1, "Text entered for parameter comment box");
	}
	
	@Then("^I enter parameter description as \"([^\"]*)\"$")
	public void i_enter_parameter_description_as(String arg1) throws Throwable {
	    type(CQLWorkspacepage.txtParadesc, arg1, "Parameter description");
	}
	
	@Then("^I save the parameter$")
	public void i_save_the_parameter() throws Throwable {
		click(CQLWorkspacepage.iconSavePara, "Parameter is saved");
		Thread.sleep(3000);
	}
	
	@Then("^I create function as \"([^\"]*)\"$")
	public void i_create_function_as(String arg1) throws Throwable {
		type(CQLWorkspacepage.txtFuncName, arg1, "Function Name entered");
	}
	
	@Then("^I enter the text \"([^\"]*)\" for function$")
	public void i_enter_the_text_for_function(String arg1) throws Throwable {
		type(CQLWorkspacepage.txtCommentArea, arg1, "Text entered for function comment box"); 
	}
	
	@Then("^I enter function description as \"([^\"]*)\"$")
	public void i_enter_function_description_as(String arg1) throws Throwable {
	   type(CQLWorkspacepage.txtFuncdesc, arg1, "Function description");
	}
	
	@Then("^I save the function$")
	public void i_save_the_function() throws Throwable {
		click(CQLWorkspacepage.iconSaveFunc, "Function is saved");
		Thread.sleep(3000);
	}
	
	@When("^I create definition where - as Code is not displayed$")
	public void i_create_definition_where_as_Code_is_not_displayed() throws Throwable {
	    type(CQLWorkspacepage.txtDefidesc, "[\"Care Goal\": \"Doppler echocardiography, fetal, pulsed wave and/or continuous wave with spectral display\"] care where care.targetOutcome ~ \"Doppler echocardiography, fetal, pulsed wave and/or continuous wave with spectral display\"", "Definition Description entered");
	}
	
	@Then("^I click on Include Code System Version$")
	public void i_click_on_Include_Code_System_Version() throws Throwable {
		Thread.sleep(1000);
	    click(CQLWorkspacepage.chkboxIncludeCodeSystemVersion, "Select Include Code Version");
	    Thread.sleep(1000);
	}
	
	@Then("^I verify the check mark in the Codes table$")
	public void i_verify_the_check_mark_in_the_Codes_table() throws Throwable {
	   verifyAttributeValue(CQLWorkspacepage.topVersionIncludedCodesTable, "title", "Version Included", "Version included in the codes table");
	}
	
	@Then("^I select Attribute type$")
	public void i_select_Attribute_type() throws Throwable {
		gotoInsertOptionAttributes();
	}
	
	@Then("^I verify Mode dropdown is disabled$")
	public void i_verify_Mode_dropdown_is_disabled() throws Throwable {
	 verifyDisabled(CQLWorkspacepage.dropdownIOMode, "Mode Listbox");
	}
	
	@Then("^I verify Mode Details dropdown is disabled$")
	public void i_verify_Mode_Details_dropdown_is_disabled() throws Throwable {
	   verifyDisabled(CQLWorkspacepage.dropdownIOModeDetails, "Mode Details Listbox");
	}
	
	@Then("^I close the editor$")
	public void i_close_the_editor() throws Throwable {
	   closeAttribute(CQLWorkspacepage.closeicon, "Attribute builder is closed");
	   Thread.sleep(3000);
	}
	
	@Then("^I select \"([^\"]*)\" attribute$")
	public void i_select_attribute(String arg1) throws Throwable {
		Thread.sleep(2000);
		selectInsert(MeasureLibrary.dropdownIOAttribute, arg1, "Attribute selected");
	}

	@When("^I create the definition for different datatype and attribute$")
	public void i_create_the_definition_for_different_datatype_and_attribute() throws Throwable {
	    
	   click(CQLWorkspacepage.lnkAddNew, "Add New Link");
	   type(CQLWorkspacepage.txtDefiName, "Defi1", "Definition Name entered");
	   type(CQLWorkspacepage.txtDefidesc, "[\"Adverse Event\": \"Above Normal Medications\"]", "Definition Description entered");
	   click(CQLWorkspacepage.iconSave, "Save Parameter");
	   Thread.sleep(3000);
	   
	   click(CQLWorkspacepage.lnkAddNew, "Add New Link");
	   type(CQLWorkspacepage.txtDefiName, "Defi2", "Definition Name entered");
	   type(CQLWorkspacepage.txtDefidesc, "[\"Participation\": \"Above Normal Medications\"]part where part.participationPeriod is not null", "Definition Description entered");
	   click(CQLWorkspacepage.iconSave, "Save Parameter");
	   Thread.sleep(3000);
	}
	
	@Then("^I click on delete$")
	public void i_click_on_delete() throws Throwable {
	    Thread.sleep(2000);
		click(CQLWorkspacepage.iconDel,"Delete icon is clicked");
	    Thread.sleep(2000);	    
	}
	
	@Then("^I accept the warning message for deletion$")
	public void i_accept_the_warning_message_for_deletion() throws Throwable {
		Thread.sleep(3000);
	 click(CQLWorkspacepage.btonpkparameter, "Accepted the warning message");
	 Thread.sleep(2000);
	}
	
	@Then("^Definition try to save directly you should see definition name required error message$")
	public void definition_required_error_msg() throws Throwable {
		click(CQLWorkspacepage.iconSave, "Save Definition");
		Thread.sleep(1000);
		String expect = "Please enter definition name.";
		String actual =  driver.findElement(CQLWorkspacepage.definition_Requireserrormsg).getText();
		if(expect.contains(actual))
		{
			Reporter.addStepLog("Definition Required Error Message is showing");
		}
		else
		{
			Reporter.addStepLog("Definition Required Error Message is not showing- Error");
		}
		Thread.sleep(1000);
	}
	
	
	@And("^Definition start with special characters \"([^\"]*)\" and verify the Error message$")
	public void definition_special_charecter(String definition) throws Throwable {
		 type(CQLWorkspacepage.txtDefiName, definition, "Definition Name entered");
		 Thread.sleep(1000);
		 click(CQLWorkspacepage.iconSave, "Save Definition");
		 Thread.sleep(1000);
		 String expect="Definition "+definition+" successfully saved with errors.";
		 String actual = driver.findElement(By.xpath("//b[contains(text(),'Definition "+definition+" successfully saved with errors.')]")).getText();
		 if(expect.contains(actual))
		 {
			 Reporter.addStepLog("Definition start with spectial character error message is showing");
		 }
		 else
		 {
			 Reporter.addStepLog("Definition start with spectail character error message is not showing");
		 }
	}
	
	@Then("^Function try to save directly you should see function name required error message$")
	public void function_required_error_msg() throws Throwable {
		click(CQLWorkspacepage.iconSave, "Save Function");
		Thread.sleep(1000);
		String expect = "Please enter function name.";
		String actual =  driver.findElement(CQLWorkspacepage.function_Requireserrormsg).getText();
		if(expect.contains(actual))
		{
			Reporter.addStepLog("Function Required Error Message is showing");
		}
		else
		{
			Reporter.addStepLog("Function Required Error Message is not showing- Error");
		}
		Thread.sleep(1000);
	}
	
	@And("^Function start with special characters \"([^\"]*)\" and verify the error message$")
	public void function_special_charecter(String function) throws Throwable {
		 type(CQLWorkspacepage.txtFuncName, function, "Function Name entered");
		 Thread.sleep(1000);
		 click(CQLWorkspacepage.iconSave, "Save Function");
		 Thread.sleep(1000);
		 String expect="Function "+function+" successfully saved with errors.";
		 String actual = driver.findElement(By.xpath("//b[contains(text(),'Function "+function+" successfully saved with errors.')]")).getText();
		 if(expect.contains(actual))
		 {
			 Reporter.addStepLog("Function start with spectial character error message is showing");
		 }
		 else
		 {
			 Reporter.addStepLog("Function start with spectail character error message is not showing");
		 }
	}
	
	@Then("^Parameter try to save directly you should see parameter name required error message$")
	public void parameter_required_error_msg() throws Throwable {
		click(CQLWorkspacepage.iconSave, "Save Function");
		Thread.sleep(1000);
		String expect = "Please enter parameter name.";
		String actual =  driver.findElement(CQLWorkspacepage.parameter_Requireserrormsg).getText();
		if(expect.contains(actual))
		{
			Reporter.addStepLog("Parameter Required Error Message is showing");
		}
		else
		{
			Reporter.addStepLog("Parameter Required Error Message is not showing- Error");
		}
		Thread.sleep(1000);
	}
	
	@And("^Parameter start with special characters \"([^\"]*)\" and verify the error message$")
	public void parameter_special_charecter(String parameter) throws Throwable {
		 type(CQLWorkspacepage.txtParameterName, parameter, "Parameter Name entered");
		 Thread.sleep(1000);
		 click(CQLWorkspacepage.iconSave, "Save Function");
		 Thread.sleep(1000);
		 String expect="Parameter "+parameter+" successfully saved with errors.";
		 String actual = driver.findElement(By.xpath("//b[contains(text(),'Parameter "+parameter+" successfully saved with errors.')]")).getText();
		 if(expect.contains(actual))
		 {
			 Reporter.addStepLog("Parameter start with spectial character error message is showing");
		 }
		 else
		 {
			 Reporter.addStepLog("Parameter start with spectail character error message is not showing");
		 }
	}
	
	@Then("^Click the delete icon in-line with an argument in a function$")
	public void delete_function_argument() throws Throwable {
		click(CQLWorkspacepage.deleteArgumentbtn, "Delete Function Argument");
		 Thread.sleep(1000);
	}
	
	@Then("^Receive a message asking you if you want to delete it$")
	public void delete_function_argument_message() throws Throwable {
		String expect="You have selected to delete argument resultRatio. Please confirm that you want to remove this argument.";
		String actual=driver.findElement(CQLWorkspacepage.argumentdeletemsg).getText();
		if(expect.equals(actual))
		{
			Reporter.addStepLog("Successfully recieve a message");	
		}
		else
		{
			Reporter.addStepLog("Failed:- To show a message");
		}
	}
	
	@And("^Click No$")
	public void delete_function_argument_clickNo() throws Throwable {
		click(CQLWorkspacepage.argumentdeleteNobtn, "No button");
		 Thread.sleep(1000);
	}
	
	@When("^Click the delete icon above the CQL Editor to delete the function$")
	public void delete_function_cql_editor() throws Throwable {
		click(CQLWorkspacepage.iconDel, "No button");
		 Thread.sleep(1000);
	}
	
	@Then("^Verify Receive a message asking you if you want to delete it$")
	public void delete_function_cqleditor_message() throws Throwable {
		String expect="You have selected to delete function Has Equivalent Ratio.";
		String actual=driver.findElement(CQLWorkspacepage.argumentdeletemsg).getText();
		if(expect.equals(actual))
		{
			Reporter.addStepLog("Successfully recieve a message");	
		}
		else
		{
			Reporter.addStepLog("Failed:- To show a message");
		}
	}
	
	@Then("^Click yes$")
	public void delete_function_yes() throws Throwable {
		click(CQLWorkspacepage.functiondeleteYesbtn, "Yes button");
		 Thread.sleep(1000);
	}
	
	@Then("^The Function and any associated arguments should be removed$")
	public void verifyThe_function_are_removed() throws Throwable {
		String text = driver.findElement(CQLWorkspacepage.functionname).getText();
		if(text.isEmpty())
		{
			Reporter.addStepLog("Successfully removed the function and argument");
		}
		else
		{
			Reporter.addStepLog("Failed:- To delete the function and argument");
		}
		 Thread.sleep(1000);
	}
	
	@Then("^click function tab, then come back and the function has not return$")
	public void click_function_tab() throws Throwable {
		click(CQLWorkspacepage.lnkFunction, "Function Link");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		String text = driver.findElement(CQLWorkspacepage.functionbox).getText();
		if(text.isEmpty())
		{
			Reporter.addStepLog("The function has not return");
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
		 Thread.sleep(1000);
	}
	
	@Then("^Verify Enter \"([^\"]*)\" in command box and save display the error \"([^\"]*)\"$")
	public void cqlworkspace_generalinformation_commandBoc_verification(String command, String errormsg) throws Throwable {
		type(CQLWorkspacepage.commandboxCqlworkspace, command, "Command Box");
		Thread.sleep(1000);
		click(CQLWorkspacepage.saveiconCommandboxCQlworkspave, "Save icon");
		Thread.sleep(1000);
		String act = driver.findElement(CQLWorkspacepage.errormessagegeneralinfo).getText();
		String expect = errormsg+" "+command;
		if(act.equals(expect))
		{
			Reporter.addStepLog("Comments can not contain error message is successfully displayed");
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
	}
	
	@Then("^Verify and the comment should not be saved$")
	public void Verify_commentNotSaved() throws Throwable {
		try
		{
			if(driver.findElement(CQLWorkspacepage.errormessagegeneralinfo).isEnabled())
			{
				Reporter.addStepLog("Verification Successful");
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or element state not ready to perform action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	
	@Then("^Verify clicking outside of that comments box, presents the user with an error message$")
	public void clicking_outside_VerifyThe_error_msg_is_displayed() throws Throwable {
		try
		{
			click(CQLWorkspacepage.saveiconCommandboxCQlworkspave, "Out Side");
			Thread.sleep(1000);
			IsElementExists(CQLWorkspacepage.errormessagegeneralinfo, "General Informatio Error message");
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or element state not ready to perform action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	
	@Then("^Verify that the focus is directed to the error messages when they appear$")
	public void verifyfocusis_directed_tothe_errormessage() throws Throwable {
		try
		{
			if(driver.findElement(CQLWorkspacepage.errormessagegeneralinfo).isEnabled())
			{
				Reporter.addStepLog("Verification Successful");
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or element state not ready to perform action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	
	@Then("^Verify that valid comments do not cause issues within the CQL file$")
	public void validcommad_and_save() throws Throwable {
		clear(CQLWorkspacepage.commandboxCqlworkspace, "Command Box");
		type(CQLWorkspacepage.commandboxCqlworkspace, "Text", "Command Box");
		Thread.sleep(1000);
		click(CQLWorkspacepage.saveiconCommandboxCQlworkspave, "Save icon");
		Thread.sleep(3000);
		IsElementExists(CQLWorkspacepage.sucessmessagegeneralinfo, "Success Message");
		Thread.sleep(1000);
	}

	@Then("^I click Edit icon previously entered value set$")
	public void Click_the_edit_icon() throws Throwable {
		click(CQLWorkspacepage.ValuesetEditicon, "Edit icon");
		Thread.sleep(2000);
	}
	
	@Then("^Verify The Program field is enabled$")
	public void Verify_program_fieldIs_enabled() throws Throwable {
		IsElementExists(CQLWorkspacepage.ValuesetProgram, "Program Field");
		Thread.sleep(1000);
	}
	
	@Then("^I select a program \"([^\"]*)\"$")
	public void select_valueset_program(String program) throws Throwable {
		selectByVisibleText(CQLWorkspacepage.ValuesetProgram, program, "CMS eCQM");
		Thread.sleep(1000);
	}
	
	@Then("^Verify the Applied Value Sets table column with the heading$")
	public void verify_valueset_applied_valueset_column_andheading() throws Throwable {
		IsElementExists(CQLWorkspacepage.Valuesetappliedvalueset_label, "Applied Value Sets Header");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetname_label, "Applied Value Sets column- Name");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetoid_label, "Applied Value Sets column- OID");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetprogram_label, "Applied Value Sets column- Program");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetrelease_label, "Applied Value Sets column- Release");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetedit_label, "Applied Value Sets column- Edit");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetdelete_label, "Applied Value Sets column- Delete");
		IsElementExists(CQLWorkspacepage.Valuesetappliedvaluesetcopy_label, "Applied Value Sets column- Copy");
	}
	
	@Then("^Verify applying a Value Set with a program, the program selected shows in the Program column of the Applied Value Sets Table$")
	public void successfullyapplayingvalueset_the_verifyTabel() throws Throwable {
		try
		{
			if(driver.findElement(By.xpath("//span[contains(text(),'"+oid+"')]")).isEnabled())
			{
				Reporter.addStepLog("Verification Successful");
			}
			else
			{
				Reporter.addStepLog("Failed:-Verification Failed");
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or element state not ready to perform action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	 
	 @Then("^Click Update button Verify table is updated to include the new program column$")
     public void click_update_button_then_verifyTable() throws Throwable {
	    	click(CQLWorkspacepage.btnUpdateFromVSAC, "Click update from VASC");
		    Thread.sleep(4000);
		    
		    IsElementExists(CQLWorkspacepage.successfulyupdatesymbal, "Successfully updated VASA symbal");
	    }
	 
	 @Then("^Verify Value sets are human readable export as expected$")
     public void Verify_appled_valueset_humen_readable() throws Throwable {
		 IsElementExists(CQLWorkspacepage.appliedvaluesettable, "Applied Value Sets Table"); 
		 Thread.sleep(1000);
	 }
	 
	 @Then("^Verify Codes are human readable export as expected$")
     public void Verify_appled_codes_humen_readable() throws Throwable {
		 IsElementExists(CQLWorkspacepage.appliedcodestable, "Appled Codes Table");
		 Thread.sleep(1000);
	 }
	 
	 @Then("^Verify Value set information in the terminology section is sorted alphanumerically$")
     public void Verify_appled_Valueset_information_is_sorted() throws Throwable {
		 String temp=null;
		List<WebElement> element = driver.findElements(CQLWorkspacepage.appliedvaluesettabledata);
		String strArray[] = new String[element.size()];
		for(int i=0; i<element.size();i++)
		{
			Reporter.addStepLog("Retriver the table data:- "+element.get(i).getText());
			strArray[i] = element.get(i).getText();
		}
		for(int i=0; i<strArray.length;i++)
		{
			for(int j=i+1; j<strArray.length;j++)
			{
				if(strArray[i].compareTo(strArray[j])>0)
				{
					temp=strArray[i];
					strArray[1]=strArray[j];
					strArray[j]=temp;
				}
			}
		}
		
		boolean result = true;
		for(int i =0;i<strArray.length;i++)
		{
			//System.out.println(strArray[i]+"###"+element.get(i).getText());
			if(strArray[i].compareTo(element.get(i).getText())!=0)
			{
 
				result = false;
				Reporter.addStepLog("Elements in the table are not sorted ");
				break;
			}
		}
		Reporter.addStepLog("Elements in the dynamic table are sorted::"+ result); 
		
	 }
	    	
	  
	 @Then("^Verify Codes information in the terminology section is sorted alphanumerically$")
     public void Verify_appled_codes_information_is_sorted() throws Throwable {
		 String temp=null;
		List<WebElement> element = driver.findElements(CQLWorkspacepage.appliedcodestabledata);
		String strArray[] = new String[element.size()];
		for(int i=0; i<element.size();i++)
		{
			Reporter.addStepLog("Retriver the table data:- "+element.get(i).getText());
			strArray[i] = element.get(i).getText();
		}
		for(int i=0; i<strArray.length;i++)
		{
			for(int j=i+1; j<strArray.length;j++)
			{
				if(strArray[i].compareTo(strArray[j])>0)
				{
					temp=strArray[i];
					strArray[1]=strArray[j];
					strArray[j]=temp;
				}
			}
		}
		
		boolean result = true;
		for(int i =0;i<strArray.length;i++)
		{
			//System.out.println(strArray[i]+"###"+element.get(i).getText());
			if(strArray[i].compareTo(element.get(i).getText())!=0)
			{
 
				result = false;
				Reporter.addStepLog("Elements in the table are not sorted ");
				break;
			}
		}
		Reporter.addStepLog("Elements in the dynamic table are sorted::"+ result); 
		
	 }
	 
	 @Then("^Verify definition successfully saved with error message$")
     public void Verify_definition_saved_warning_message() throws Throwable {
		IsElementExists(CQLWorkspacepage.definitionsavedWarningmsg, "Definition Successfuly saved with Errors");
		Thread.sleep(2000);
	 }
	 
	 @Then("^Verify Parameter successfully saved with error message$")
     public void Verify_Parameter_saved_warning_message() throws Throwable {
		IsElementExists(CQLWorkspacepage.parametersavedWarningmsg, "Parameter Successfuly saved with Errors");
		Thread.sleep(2000);
	 }
	 
	 @Then("^Verify Function successfully saved with error message$")
     public void Verify_Function_saved_warning_message() throws Throwable {
		IsElementExists(CQLWorkspacepage.functionsavedWarningmsg, "Function Successfuly saved with Errors");
		Thread.sleep(2000);
	 }
	 
	 @Then("^I click View CQL$")
     public void click_view_cql() throws Throwable {
		 click(CQLWorkspacepage.viewcqllink, "CQL View"); 
			Thread.sleep(2000);
	 }
	 
	 @Then("^I see the error message \"([^\"]*)\"$")
     public void Veirify_the_error_messageInView_cql(String error) throws Throwable {
		 verifyText(CQLWorkspacepage.viewCqlerror, error, "View CQL Error Message");
			Thread.sleep(2000);
	 }
	 
	 @Then("^I See the warning message view CQL windows$")
     public void Parameter_warning_message_in_cql_view_window() throws Throwable {
		click(CQLWorkspacepage.viewcqllink, "CQL View"); 
		Thread.sleep(2000);
		IsElementExists(CQLWorkspacepage.viewcqlwarningmesg, "");
	 }
}
