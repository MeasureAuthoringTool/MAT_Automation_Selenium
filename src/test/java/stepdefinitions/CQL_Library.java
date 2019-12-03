package stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CQLLibrary;
import pages.MeasureLibrary;

public class CQL_Library extends AbstractTestBase {
	
	
	SimpleDateFormat dateformat = new SimpleDateFormat("HHmmss");
	Date date = new Date();
	String time = dateformat.format(date);
	String Mesurename="test"+time;
	
	
	@When("^I click on CQL Library$")
	public void i_click_on_CQL_Library() throws Throwable {
		Thread.sleep(3000);
		click(CQLLibrary.tabCQLLibrary, "Click CQL Library");
		Thread.sleep(5000);
	}
	
	@When("^I click New Library$")
	public void i_click_New_Library() throws Throwable {
		Thread.sleep(3000);
	   click(CQLLibrary.lnkNewCQLLib, "New CQL Library");
	}
	
	@Then("^I create a library \"([^\"]*)\"$")
	public void i_create_a_library(String arg1) throws Throwable {
	   Thread.sleep(3000);
	   type(CQLLibrary.txtCQLLibName, arg1 + time, "Library Name entered");
	   click(CQLLibrary.cqlnamesave, "Save the library");
	   Thread.sleep(3000);
	   click(CQLLibrary.btnYesPopup, "Accept the pop up");
	   Thread.sleep(4000);
	}
	
	@Then("^I search for CQL library \"([^\"]*)\"$")
	public void i_search_for_CQL_library(String argg) throws Throwable {
		Thread.sleep(3000);
		clear(CQLLibrary.txtSearchLib, "Search for library");
		type(CQLLibrary.txtSearchLib, argg+time, "Search for library");
	  click(CQLLibrary.btnSearchLib, "Search the library");
	  Thread.sleep(3000);
	}
	
	@Then("^I click Create Version of Library$")
	public void i_click_Create_Version_of_Library() throws Throwable {
	   click(CQLLibrary.iconCQLVer, "Click version creation");
	   Thread.sleep(3000);
	   click(MeasureLibrary.radioMajor2, "Select major version");
	   Thread.sleep(1000);
	   click(CQLLibrary.btnSavecqllibVersion, "Save the CQL Library");
	   Thread.sleep(3000);
		if(!driver.findElements(CQLLibrary.cqllibcontinurebtn).isEmpty())
		{
			click(CQLLibrary.cqllibcontinurebtn, "CQL Library continue button");
			   Thread.sleep(3000);
		
		}
	  
	}
	
	@Then("^I click Create Draft of Library$")
	public void i_click_Create_Draft_of_Library() throws Throwable {
		Thread.sleep(3000);
		click(CQLLibrary.iconCQLVer, "Click version creation");
		Thread.sleep(3000);
		//click(CQLLibrary.btnYesPopup, "Accept popup");
		
	}
	
	@Then("^I search for a library \"([^\"]*)\" and add alias \"([^\"]*)\"$")
	public void i_search_for_a_library_and_add_alias(String arg1, String arg2) throws Throwable {
	    type(CQLLibrary.txtAliasLib, arg2, "Enter the library name");
		type(CQLLibrary.txtSearchIncludes, arg1+time , "Search for library");
		click(CQLLibrary.btnSearchIncludes, "Click search button");
		Thread.sleep(9000);
	    click(CQLLibrary.chkboxTopSearchLibIncludes, "Select the search lib");
	    click(CQLLibrary.btnSaveIncludes, "Save the library");
	}
	
	@Then("^I navigate to alias library \"([^\"]*)\"$")
	public void i_navigate_to_alias_library(String arg1) throws Throwable {
		 click(CQLLibrary.lnkIncludes, "Click Includes section");
		 Thread.sleep(3000);
		 search(MeasureLibrary.txtSearchLeftNavAlias, arg1, "Navigating to Library");
		 Thread.sleep(3000);
	}
	
	@Then("^I click on edit alias$")
	public void i_click_on_edit_alias() throws Throwable {
	   click(CQLLibrary.iconEditAlias, "Click edit on Alais");
	   Thread.sleep(9000);
	}
	
	@When("^I select the older version and click Apply$")
	public void i_select_the_older_version_and_click_Apply() throws Throwable {
		if(!driver.findElements(CQLLibrary.chkboxTopReplaceLib).isEmpty()) {
	   click(CQLLibrary.chkboxTopReplaceLib, "Replace Library");
	   click(CQLLibrary.btnApplyEditLib, "Apply the selection of the Library");
		Thread.sleep(4000);}
		else {
			click(CQLLibrary.btncancelEditLib, "Cancel Button");
		}
	}
	
	@Then("^I verify the Birthdate and Dead warning message in CQL Library$")
	public void i_verify_the_Birthdate_and_Dead_warning_message_in_CQL_Library() throws Throwable {
		verifyText(CQLLibrary.msgCodesCQLLib, "Birthdate and Dead may only be applied once, duplicate Birthdate and Dead codes are not allowed.", "Error message for code - Dead, without suffix");
		Thread.sleep(2000);	
	}
	
	@Then("^I verify the Code applied success message in CQL Library$")
	public void i_verify_the_Code_applied_success_message_in_CQL_Library() throws Throwable {
		 verifyText(CQLLibrary.msgCodesCQLLib, "Code 21112-8 has been applied successfully.", "Successfully applied code - Birth date");
		 Thread.sleep(2000);	
	}
	
	
	
	
	
	

}
