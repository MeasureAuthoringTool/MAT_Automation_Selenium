package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateMeasurePage;
import pages.LoginPageUMLS;
import pages.MeasureLibrary;
import pages.PopulationWorkspacePage;

public class MeasureLibraryOR extends AbstractTestBase{
	
	SimpleDateFormat dateformat = new SimpleDateFormat("HHmmss");
	Date date = new Date();
	String time = dateformat.format(date);
	String Mesurename="test"+time;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@Then("^I click New Measure Link$")
	public void i_click_New_Measure_Link() throws Throwable {
		Thread.sleep(5000);
		click(MeasureLibrary.lnkNewMeasureLib, "New Measure");
		Thread.sleep(4000);
	}
	
	private String newmeasure_name;
	@Then("^I enter new measure name as \"([^\"]*)\"$")
	public void ente_new_measure_name(String newmeasure) throws Throwable {
      this.newmeasure_name=newmeasure+time;
		type(CreateMeasurePage.createNewMeasure_name, newmeasure_name, "New measure name");
	   Thread.sleep(2000);
		   
     }
	
	@Then("^I Search Measure$")
	public 
	void SearchMeasure() throws Throwable {
		Thread.sleep(3000);
	    clear(CreateMeasurePage.search_measure, "Search Field");
	    Thread.sleep(2000);
	   type(CreateMeasurePage.search_measure, newmeasure_name, "Enter the measure to search");
	   Thread.sleep(2000);
	   click(CreateMeasurePage.search_measure_btn, "Search for the measure");
	   Thread.sleep(3000);
	}
	
	@Then("^I enter CQL title name as \"([^\"]*)\"$")
	public void ente_new_z_title(String newMeasure_title) throws Throwable {

		type(CreateMeasurePage.cql_title, newMeasure_title+time , "CQL title name ");
		   Thread.sleep(2000);		   
     }
	
	@Then("^I enter eCQM title name as \"([^\"]*)\"$")
	public void ente_new_measureeCQM_title(String newMeasureeCQM_title) throws Throwable {

		type(CreateMeasurePage.ecqmTitle, newMeasureeCQM_title , "eCQM title name ");
		   Thread.sleep(2000);		   
     }
	
	private String measurescoring;
	@Then("^I select measure scoring type \"([^\"]*)\"$")
	public void measure_scoring_type(String measurescoring) throws Throwable{
		this.measurescoring=measurescoring;
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, measurescoring, "Create Measure dropdown");
		Thread.sleep(2000);
	}
	
	@Then("^Verify measure scoring is equal to \"([^\"]*)\", \"([^\"]*)\" or \"([^\"]*)\", the Patient-based measure indicator is defauly \"([^\"]*)\"$")
	public void measure_scoring_typeVerify_default_patient(String scoring1, String scoring2, String scoring3, String patient) throws Throwable{
		try {
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring1, "Measure Scoring");
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd));
		String first = sel.getFirstSelectedOption().getText();
		if(first.equals(patient))
		{
			Reporter.addStepLog("Patient-based measure default set in 'Yes'");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring2, "Measure Scoring");
		Thread.sleep(2000);
		Select sel2 = new Select(driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd));
		String second = sel2.getFirstSelectedOption().getText();
		if(second.equals(patient))
		{
			Reporter.addStepLog("Patient-based measure default set in 'Yes'");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring3, "Measure Scoring");
		Thread.sleep(2000);
		Select sel3 = new Select(driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd));
		String third = sel3.getFirstSelectedOption().getText();
		if(third.equals(patient))
		{
			Reporter.addStepLog("Patient-based measure default set in 'Yes'");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
		
		}catch(Exception e)
		{
			Reporter.addStepLog("Element Not Found");
		}
	}
	
	@Then("^Verify measure scoring is equal to \"([^\"]*)\", the Patient-based measure indicator is defauly \"([^\"]*)\"$")
	public void measure_scoring_continueousVariableVerify_default_patient(String scoring1,String patient) throws Throwable{
		try {
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring1, "Measure Scoring");
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd));
		String first = sel.getFirstSelectedOption().getText();
		if(first.equals(patient))
		{
			Reporter.addStepLog("Patient-based measure default set in 'No'");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
		
		
		}catch(Exception e)
		{
			Reporter.addStepLog("Element Not Found");
		}
	}
	
	@Then("^Verify the Patient-based indicator field on the Measure Details > General Information is populated with the \"([^\"]*)\" value.$")
	public void measure_scoring_continueousVariableVerify_default_patientinmeasuredetailspage(String patient) throws Throwable{
		try {
		
		Select sel = new Select(driver.findElement(CreateMeasurePage.patientbasedscore));
		String first = sel.getFirstSelectedOption().getText();
		if(first.equals(patient))
		{
			Reporter.addStepLog("Patient-based measure default set in 'No'");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
		
		
		}catch(Exception e)
		{
			Reporter.addStepLog("Element Not Found");
		}
	}
	
	@Then("^Verify measure scoring is equal to \"([^\"]*)\", \"([^\"]*)\" or \"([^\"]*)\", the Patient-based measure indicator is  \"([^\"]*)\" to \"([^\"]*)\"$")
	public void measure_scoring_typeVerify_coresponding_patient(String scoring1, String scoring2, String scoring3, String yes,String no) throws Throwable{
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring1, "Measure Scoring");
		Thread.sleep(2000);
		try
		{
			int count = 0;
			String[] exp = {yes,no};
			WebElement selectElement = driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd);
			Select select = new Select(selectElement);
			List<WebElement> options = select.getOptions();
			    for (WebElement we : options) {
			        for (int i = 0; i < exp.length; i++) {
			            if (we.getText().equals(exp[i])) {
			                count++;
			            }
			        }
			    }
			    if (count == exp.length) {
//			        System.out.println("Corresponing Measure scoring are exist");
			        Reporter.addStepLog("Corresponing Patient-based scoring are exist");
			    } else {
//			        System.out.println("Does not exist, we have a problem.");
			        Reporter.addStepLog("Does not exist, we have a problem.");
			    }
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring2, "Measure Scoring");
		Thread.sleep(2000);
		try
		{
			int count = 0;
			String[] exp = {yes,no};
			WebElement selectElement = driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd);
			Select select = new Select(selectElement);
			List<WebElement> options = select.getOptions();
			    for (WebElement we : options) {
			        for (int i = 0; i < exp.length; i++) {
			            if (we.getText().equals(exp[i])) {
			                count++;
			            }
			        }
			    }
			    if (count == exp.length) {
//			        System.out.println("Corresponing Measure scoring are exist");
			        Reporter.addStepLog("Corresponing Patient-based scoring are exist");
			    } else {
//			        System.out.println("Does not exist, we have a problem.");
			        Reporter.addStepLog("Does not exist, we have a problem.");
			    }
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}	
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, scoring3, "Measure Scoring");
		Thread.sleep(2000);
		try
		{
			int count = 0;
			String[] exp = {yes,no};
			WebElement selectElement = driver.findElement(CreateMeasurePage.createNewMeasure_PatnBasedInd);
			Select select = new Select(selectElement);
			List<WebElement> options = select.getOptions();
			    for (WebElement we : options) {
			        for (int i = 0; i < exp.length; i++) {
			            if (we.getText().equals(exp[i])) {
			                count++;
			            }
			        }
			    }
			    if (count == exp.length) {
//			        System.out.println("Corresponing Measure scoring are exist");
			        Reporter.addStepLog("Corresponing Patient-based scoring are exist");
			    } else {
//			        System.out.println("Does not exist, we have a problem.");
			        Reporter.addStepLog("Does not exist, we have a problem.");
			    }
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
		}
	
	@When("^I click save and continue button$")
	public void Click_button_save_and_continue() throws Throwable {
		click(CreateMeasurePage.measyresavecont, "Save and Continue button");
		
		Thread.sleep(2000);
		click(CreateMeasurePage.popup, "Accept the pop up");
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
	}
	
	@When("^I select Endorsed by NQF \"([^\"]*)\"$")
	public void select_endorsed_by_nqf(String endorsed_by_nqf) throws Throwable {
		selectByVisibleText(CreateMeasurePage.endorsed_by_nqf, endorsed_by_nqf, "select Endorsed by NQF");
		Thread.sleep(3000);
		WebElement comboBox =driver.findElement(CreateMeasurePage.endorsed_by_nqf);
		Select selectedValue = new Select(comboBox);
		WebElement option = selectedValue.getFirstSelectedOption();
	    String a = option.getText();
		String b="No";
		String c="Yes";
	
		    if(a.equals(c))
			{
		    	type(CreateMeasurePage.nqf_number, time, "NQF Number");
			}

	}
	
	@When("^select NQF field \"([^\"]*)\" Verify the error \"([^\"]*)\"$")
	public void select_endorsed_by_nqf(String yes,String errormsg) throws Throwable {
		selectByVisibleText(CreateMeasurePage.endorsed_by_nqf, yes, "select Endorsed by NQF");
		Thread.sleep(3000);
		clickKeyboardControl(CreateMeasurePage.savebutton, "Save Button");
	    Thread.sleep(2000);
		String act = driver.findElement(CreateMeasurePage.nqferrormesg).getText();
		if(act.equals(errormsg))
		{
			Reporter.addStepLog("Successfully showing NGF Required error message");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}

	}
	
	@When("^I click save button$")
	public void click_save_button() throws Throwable {
		if(IsElementexistwait(CreateMeasurePage.btn_generate_identifire, "Generate identifire")) {
		click(CreateMeasurePage.btn_generate_identifire, "Generate identifire");
		Thread.sleep(2000);}
		
		click(CreateMeasurePage.btn_final_measure_save, "Save button");
		Thread.sleep(2000);
		String actual=driver.findElement(CreateMeasurePage.saved_success_message).getText();
		String expected="Changes are successfully saved.";
		if(actual.contains(expected))
		{
//			System.out.println("Successfully saved  measure details- Measure scoring="+measurescoring);
			Reporter.addStepLog("Successfully saved  measure details- Measure scoring= "+measurescoring);
		}
		else
		{
//			System.out.println("Create measure is doesnot complete");
			Reporter.addStepLog("Create measure is doesnot complete");
		}
		Thread.sleep(2000);
		
	}
	
	@Then("^I select patient based indicator as \"([^\"]*)\"$")
	public void select_patient_based_indicator(String patient_based_indicator) throws Throwable {
		
		selectByVisibleText(CreateMeasurePage.createNewMeasure_PatnBasedInd, patient_based_indicator, "patient based indicator as NO");
		Thread.sleep(2000);
		click(CreateMeasurePage.createNewMeasure_save, "Save and Continue button");
		Thread.sleep(4000);
		click(CreateMeasurePage.createNewMeasure_popupContinue, "Continue popup button");
		Thread.sleep(4000);
			   
   }

	
	@Then("^I select initial population$")
	public void select_initial_population() throws Throwable {

		   click(CreateMeasurePage.initial_population, "Select initial population");
		   Thread.sleep(2000);	   
    }
	
	@Then("^Verify that under the text field is a save button$")
	public void Verify_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.measuresettextarea, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	@Then("^Verify that under the text field is a save button in Supplemental Data Elements$")
	public void Verify_supplementtext_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.suplementsatasettextarea, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	@Then("^Verify that under the text field is a save button in Transmission Format$")
	public void Verify_trasmission_format_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.trasmissionformattextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String Transmission = "Text";
	@Then("^Enter Transmission Format information and click save button$")
	public void Enter_informationinTransmission_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.trasmissionformattextfield, Transmission, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Transmission Format is saved$")
	public void Verify_the_entered_transmissionInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.trasmissionformattextfield, Transmission, "Saved Transmission Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Initial Population$")
	public void Verify_initialPopulation_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.InitialPopulationtextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String initialpopulation = "Text";
	@Then("^Enter Initial Population information and click save button$")
	public void Enter_initialpotilationInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.InitialPopulationtextfield, initialpopulation, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Initial Population is saved$")
	public void Verify_the_entered_initialPopulationInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.InitialPopulationtextfield, initialpopulation, "Saved Initial Population Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Denominator$")
	public void Verify_deniminator_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.denominatortextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String deniminator = "Text";
	@Then("^Enter Denominator information and click save button$")
	public void Enter_deniminatorInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.denominatortextfield, deniminator, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Denominator is saved$")
	public void Verify_the_entered_deniminatorInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.denominatortextfield, deniminator, "Saved Denominator Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Denominator Exclusions$")
	public void Verify_deniminatorexclusion_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.denominatortextfieldexclusion, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String deniminatorexclusion = "Text";
	@Then("^Enter Denominator Exclusions information and click save button$")
	public void Enter_deniminatoexclusionrInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.denominatortextfieldexclusion, deniminatorexclusion, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Denominator Exclusions is saved$")
	public void Verify_the_entered_deniminatorexclusionInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.denominatortextfieldexclusion, deniminatorexclusion, "Saved Denominator Exclusion Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Numerator$")
	public void Verify_numerator_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.numeratortextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String numerator = "Text";
	@Then("^Enter Numerator information and click save button$")
	public void Enter_NumeratorInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.numeratortextfield, numerator, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Numerator is saved$")
	public void Verify_the_entered_NumeratorInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.numeratortextfield, numerator, "Saved Numerator Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Numerator Exclusions$")
	public void Verify_numeratorExclusions_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.numeratorexclosiontextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String numeratorExclusions = "Text";
	@Then("^Enter Numerator Exclusions information and click save button$")
	public void Enter_NumeratorExclusionsInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.numeratorexclosiontextfield, numeratorExclusions, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Numerator Exclusions is saved$")
	public void Verify_the_entered_NumeratorExclusionsInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.numeratorexclosiontextfield, numeratorExclusions, "Saved Numerator Exclusion Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Denominator Exceptions$")
	public void Verify_denominatorexceptions_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.denominatorexceptiontextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String denominatorexceptions = "Text";
	@Then("^Enter Denominator Exceptions information and click save button$")
	public void Enter_denominatorexceptionsInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.denominatorexceptiontextfield, denominatorexceptions, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Denominator Exceptions is saved$")
	public void Verify_the_entered_denominatorexceptionsInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.denominatorexceptiontextfield, denominatorexceptions, "Saved Denominator Exceptions Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Measure Population$")
	public void Verify_measure_population_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.measurepopulationtextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String measurepopulation = "Text";
	@Then("^Enter Measure Population information and click save button$")
	public void Enter_measure_populationInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.measurepopulationtextfield, measurepopulation, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Measure Population is saved$")
	public void Verify_the_entered_measure_populationInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.measurepopulationtextfield, measurepopulation, "Saved Measure Population Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Measure Population Exclusions$")
	public void Verify_measure_populationExcusions_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.measurepopulationexclusiontextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String measurepopulationexclusions = "Text";
	@Then("^Enter Measure Population Exclusions information and click save button$")
	public void Enter_measure_populationExclusionsInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.measurepopulationexclusiontextfield, measurepopulationexclusions, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Measure Population Exclusions is saved$")
	public void Verify_the_entered_measure_populationexclusionInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.measurepopulationexclusiontextfield, measurepopulationexclusions, "Saved Measure Population ExclusionsInformation");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Disclaimer$")
	public void Verify_Disclaimer_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.Disclaimer, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String Disclaimer = "Text";
	@Then("^Enter Disclaimer information and click save button$")
	public void Enter_DisclaimerInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.Disclaimer, Disclaimer, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Disclaimer is saved$")
	public void Verify_the_entered_DisclaimerInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.Disclaimer, Disclaimer, "Saved Disclaimer Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Copyright$")
	public void Verify_Copyright_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.Copyright, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String Copyright = "Text";
	@Then("^Enter Copyright information and click save button$")
	public void Enter_CopyrightInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.Copyright, Copyright, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Copyright is saved$")
	public void Verify_the_entered_CopyrightInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.Copyright, Copyright, "Saved Copyright Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Stratification$")
	public void Verify_Stratification_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.Stratification, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String Stratification = "Text";
	@Then("^Enter Stratification information and click save button$")
	public void Enter_StratificationInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.Stratification, Stratification, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Stratification is saved$")
	public void Verify_the_entered_StratificationInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.Stratification, Stratification, "Saved Stratification Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Risk Adjustment$")
	public void Verify_Risk_Adjustment_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.RiskAdjustmenttextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String Risk_Adjustment = "Text";
	@Then("^Enter Risk Adjustment information and click save button$")
	public void Enter_Risk_AdjustmentInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.RiskAdjustmenttextfield, Risk_Adjustment, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Risk Adjustment is saved$")
	public void Verify_the_entered_Risk_AdjustmentformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.RiskAdjustmenttextfield, Risk_Adjustment, "Saved Risk Adjustment Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Rate Aggregation$")
	public void Verify_rateaggregationtextfield_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.rateaggregationtextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String rateaggregationtextfield = "Text";
	@Then("^Enter Rate Aggregation information and click save button$")
	public void Enter_rateaggregationInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.rateaggregationtextfield, rateaggregationtextfield, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Rate Aggregation is saved$")
	public void Verify_the_entered_rateaggregationformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.rateaggregationtextfield, rateaggregationtextfield, "Saved Rate Aggregation Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Rationale$")
	public void Verify_Rationaletextfield_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.Rationaletextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String Rationaletextfield = "Text";
	@Then("^Enter Rationale information and click save button$")
	public void Enter_RationaleInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.Rationaletextfield, Rationaletextfield, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Rationale is saved$")
	public void Verify_the_entered_RationaleionformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.Rationaletextfield, Rationaletextfield, "Saved Rationale Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Clinical Recommendation$")
	public void Verify_clinicalrecotextfield_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.clinicalrecotextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String clinicalrecotextfield = "Text";
	@Then("^Enter Clinical Recommendation information and click save button$")
	public void Enter_clinicalInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.clinicalrecotextfield, clinicalrecotextfield, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Clinical Recommendation is saved$")
	public void Verify_the_entered_clinicalionformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.clinicalrecotextfield, clinicalrecotextfield, "Saved Clinical Recommendation Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Improvement Notation$")
	public void Verify_improvementnotationtextfield_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.improvementnotationtextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String improvementnotationtextfield = "Text";
	@Then("^Enter Improvement Notation information and click save button$")
	public void Enter_improvementNotationInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.improvementnotationtextfield, improvementnotationtextfield, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Improvement Notation is saved$")
	public void Verify_the_entered_improvementinfoionformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.improvementnotationtextfield, improvementnotationtextfield, "Saved Improvement Notation Information");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify that under the text field is a save button in Measure Observations$")
	public void Verify_measure_observation_text_field_and_buton() throws Throwable {

		  IsElementExists(CreateMeasurePage.measureobservationtextfield, "Text Field");
		  Thread.sleep(2000);	   
		  IsElementExists(CreateMeasurePage.savebutton, "Save Button");
		  Thread.sleep(2000);
    }
	
	private String measureObservation = "Text";
	@Then("^Enter Measure Observations information and click save button$")
	public void Enter_measure_observationInformation_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.measureobservationtextfield, measureObservation, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered Measure Observations is saved$")
	public void Verify_the_entered_measure_observationInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.measureobservationtextfield, measureObservation, "Saved Measure Observation Information");
		Thread.sleep(2000);
		
	}

	
	
	
	private String descriptiontext = "Text";
	@Then("^Enter information and click save button$")
	public void Enter_informationinmeasureset_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.measuresettextarea, descriptiontext, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered information is saved$")
	public void Verify_the_entered_InformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.measuresettextarea, descriptiontext, "Saved MeasureSet Information");
		Thread.sleep(2000);
		
	}
	private String supplemental = "Text";
	@Then("^Enter Supplemental information and click save button$")
	public void Enter_informationinsupplemental_and_click_save_button() throws Throwable {	
		
		type(CreateMeasurePage.suplementsatasettextarea, supplemental, "Informatin field");
		Thread.sleep(2000);
		click(CreateMeasurePage.savebutton, "Save Button");
		Thread.sleep(2000);
	}

	@Then("^Verify the entered supplemental information is saved$")
	public void Verify_the_entered_supplementalInformationIsSaved() throws Throwable {	
		verifyText(CreateMeasurePage.suplementsatasettextarea, supplemental, "Saved Supplemental Information");
		Thread.sleep(2000);
		
	}
	@Then("^I select initial population as \"([^\"]*)\"$")
	public void select_population(String initial_population) throws Throwable {
		Select dropdown = new Select(driver.findElement(By.id("definitionList_Initial Population 1")));
		dropdown.selectByVisibleText("SDE Ethnicity");
		Thread.sleep(2000);
		   
   }
	
	@Then("^I select save button on initial population$")
	public void select_initial_population_save() throws Throwable {

		   click(CreateMeasurePage.initial_population_save, "Select initial population save button");
		   Thread.sleep(2000);
	}
	
	@When("^I select measure pacakage tab$")
	public void select_measure_package_tab() throws Throwable {
		click(CreateMeasurePage.select_measure_package, "Select measure pacakge");
		   Thread.sleep(2000);
	}
	
	@Then("^I select initial population and arrow button$")
	public void select_initial_population_text() throws Throwable {
		click(CreateMeasurePage.select_initail_population, "Select initial population");
		Thread.sleep(2000);
		click(CreateMeasurePage.button_arrow, "Save initial population usingsave button");
		Thread.sleep(2000);	   
   }
	
	@Then("^I click save grouping button$")
	public void save_grouping() throws Throwable {
		click(CreateMeasurePage.save_grouping, "Save grouping");
		Thread.sleep(2000);
	}
	
	@Then("^I verify the grouping succes message$")
	public void verify_group_success_msg() throws Throwable {
       String expected = "Grouping has been saved.";
       String actualMsg=driver.findElement(CreateMeasurePage.SavedMessage).getText();
       if(actualMsg.equals(actualMsg))
       {
    	   System.out.println("I verify that success message is showing as- Group is successfully save");
       }
       else
       {
    	   System.out.println("I cannot verify group saving message");
       }
	}
	
	@Then("^I click save measure package button$")
	public void save_measure_packegeButton() throws Throwable {
		click(CreateMeasurePage.save_measure_packegeButton, "Save measure pacakgebutton");
		Thread.sleep(2000);
	}
	
	@Then("^I click export measure package button$")
	public void measure_packegeButtonExport() throws Throwable {
		click(CreateMeasurePage.measure_packegeButton_export, "export measure pacakgebutton");
		Thread.sleep(2000);
	}
	
	@Then("^I  create new measure screen$")
	public void create_new_measure() throws Throwable {
		
		
		String arg1="test";
		type(CreateMeasurePage.createNewMeasure_name, Mesurename, "Name");
		type(CreateMeasurePage.cql_title, "Tester"+time , "CQL title name ");
		type(CreateMeasurePage.ecqmTitle, "Tester Title" , "eCQM title name ");
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, "Continuous Variable", "Create Measure dropdown");
		click(CreateMeasurePage.measyresavecont, "Save and Continue button");
		
		Thread.sleep(2000);
		click(CreateMeasurePage.popup, "Accept the pop up");
		Thread.sleep(2000);

	}
	
	@When("^I create new Measure \"([^\"]*)\"$")
	public void i_create_new_Measure(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		type(CreateMeasurePage.createNewMeasure_name, arg1+time, "Name");
		type(CreateMeasurePage.cql_title, "Cqltitle"+time , "CQL title name ");
		type(CreateMeasurePage.ecqmTitle, "Tst", "Abbreviated Name");
		selectByVisibleText(CreateMeasurePage.dropdownMeasureScoring, "Ratio", "Create Measure dropdown");
		selectByVisibleText(CreateMeasurePage.createNewMeasure_PatnBasedInd, "Yes", "patient based indicator as NO");
		Thread.sleep(2000);
		click(CreateMeasurePage.btnSaveAndContinue, "Save and Continue button");
		Thread.sleep(4000);
		click(CreateMeasurePage.popup, "Accept the pop up");
		Thread.sleep(3000);
	}
	@Then("^I Search measure in Component Measure Page$")
	public void Search_measure_in_component_measure() throws Throwable {
		String text="Smoke test";
		clear(CreateMeasurePage.compositesearchField, "Measure Name");
		Thread.sleep(2000);
		type(CreateMeasurePage.compositesearchField, text+time, "Measure Name"); 
		Thread.sleep(2000);
		click(CreateMeasurePage.search_measure_btn, "Search button");
		Thread.sleep(4000);
	}
	
	
	@When("^I search measure name$")
	public void i_enter_the_Library() throws Throwable {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateMeasurePage.search_measure)).clear();;
	    clear(CreateMeasurePage.search_measure, "Searching measure");
	    Thread.sleep(2000);
	   type(CreateMeasurePage.search_measure, Mesurename , "Searching measure");
	   Thread.sleep(2000);
	   click(CreateMeasurePage.search_measure_btn, "Search button");
	   Thread.sleep(5000);
	   
	}
	

	@Then("^I create the measure$")
	public void create_same_measure() throws Throwable {
		
		Thread.sleep(5000);	
		String arg1="test";
		type(CreateMeasurePage.createNewMeasure_name, Mesurename, "Name");
		type(CreateMeasurePage.cql_title, "CQLName"+time , "CQL title name ");
		type(CreateMeasurePage.txtAbbreviatedName, "Tst", "Abbreviated Name");

	}
	
	
	@When("^I click Measure Library$")
	public void Click_measure_library() throws Throwable {
		click(CreateMeasurePage.tabMeasureLibrary, "Click Measure Library");
	    Thread.sleep(5000);	

	}
	
	
	@Then("^I See Generate Identifier, Delete Measure button$")
	public void i_See_Generate_Identifier_Delete_Measure_button() throws Throwable {
		 Thread.sleep(4000);
		 Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
		IsElementExists(CreateMeasurePage.btnGenerateIdentifier, "Generate Identifier button");
		Thread.sleep(3000);
		IsElementExists(CreateMeasurePage.deletebtn_compositemeasure, "Delete button");
		Thread.sleep(3000);
	}
	
	@When("^I clicked Measure Library$")
	public void i_clicked_Measure_Library() throws Throwable {
		Thread.sleep(3000);
		click(MeasureLibrary.tabMeasureLibrary, "Measure Library tab");
		Thread.sleep(5000);
	    
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Then("^I search for library \"([^\"]*)\"$")
	public void i_search_for_library(String arg1) throws Throwable {
		Thread.sleep(3000);
	    clear(CreateMeasurePage.search_measure, "Search Field");
	    Thread.sleep(2000);
	   type(CreateMeasurePage.search_measure, arg1+time, "Enter the measure to search");
	   Thread.sleep(2000);
	   click(CreateMeasurePage.search_measure_btn, "Search for the measure");
	   Thread.sleep(10000);
	}
	
	@Then("^I click Create Version$")
	public void i_click_Create_Version() throws Throwable {
		Thread.sleep(4000);
	   click(MeasureLibrary.iconTopVersion, "Icon to create version");
	   Thread.sleep(4000);
	   click(MeasureLibrary.radioMajor, "Major version");
	   Thread.sleep(4000);
	   click(MeasureLibrary.btnSaveVersion, "Save");
	   Thread.sleep(3000); 
	   if(!driver.findElements(MeasureLibrary.btnSavecontinueVersion).isEmpty()) {
		   Thread.sleep(4000);
		   click(MeasureLibrary.btnSavecontinueVersion, "Continue Button");
	   }
	   
	}
	
	@Then("^I verify the success text$")
	public void i_verify_the_success_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  String expected="MeasureSep06 v1.0 has been successfully created.";

		Thread.sleep(3000);
		IsElementExists(MeasureLibrary.versionsuccmsg, "Version Success");
		//verifyText(MeasureLibraryOR., expected, "Success message");
	   //click(CreateMeasurePage.btnWarningMsgContinue,"Pop up continue");
	   Thread.sleep(5000);
	}
	
	@Then("^I see Measure Library page with Recent Activity, My Measures$")
	public void i_see_Measure_Library_page_with_Recent_Activity_My_Measure() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		IsElementExists(MeasureLibrary.headerRecentActivity, "Recent Activity");
		Thread.sleep(1000);
		IsElementExists(MeasureLibrary.headerMyMeasure, "My Measure");
		Thread.sleep(1000);
	   
	}
	
	@Then("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(CreateMeasurePage.search_measure_btn, "Measure search button");
	    Thread.sleep(5000);
	}
	
	@Then("^I click Measure Packager Tab$")
	public void Click_measurePackagerTab() throws Throwable {
		click(PopulationWorkspacePage.tabMeasurePackager, "Measure Packager");
		Thread.sleep(3000);
	}
	
	@Then("^I select the share of the first measure$")
	public void i_select_the_share_of_the_first_measure() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(MeasureLibrary.topMeasureShareIcon, "Click on share icon");
	    Thread.sleep(5000);
	}
	
	@When("^I am navigated to the share page I select the first user to be shared with$")
	public void i_am_navigated_to_the_share_page_I_select_the_first_user_to_be_shared_with() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(3000);
	    click(MeasureLibrary.topShareMeasureWith, "Share the measure with a user");
	}
	
	@Then("^I click on Save and Continue on the share page$")
	public void i_click_on_Save_and_Continue_on_the_share_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   click(MeasureLibrary.btnSaveAndConShare, "Click Save and Continue on the share page");
	   Thread.sleep(5000);
	}
	
	
	@Then("^Owner to click delete button using tab$")
	public void clicking_delete_button_usingTab() throws Throwable {
	 WebElement element = driver.findElement(CreateMeasurePage.deletebtn_compositemeasure);
	 element.sendKeys(Keys.TAB);
	 element.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	}
	
	@Then("^I see the user is presented with a message thet states \"([^\"]*)\"$")
	public void User_is_presented_DeletinhMessahe(String message) throws Throwable {
	  verifyText(CreateMeasurePage.deletemeasureusrprestmsg, message, "User presented to delete the Measure Message");
	  Thread.sleep(2000);
	}
	
	@Then("^I Verify password field and confirm Button$")
	public void verify_passwordField_and_confirm_button() throws Throwable {
	 IsElementExists(CreateMeasurePage.deletepassfeld, "Password Field");
	 IsElementExists(CreateMeasurePage.confirmbtn, "Cancel Button");
	}
	
	@Then("^Enter Invalid Password Verify the message \"([^\"]*)\"$")
	public void Enter_invalid_password_verify_error_message(String message) throws Throwable {
		type(CreateMeasurePage.deletepassfeld, "Hello", "Password Field");
		Thread.sleep(2000);
		click(CreateMeasurePage.confirmbtn, "Confirm Button");
		Thread.sleep(3000);
	    verifyText(CreateMeasurePage.invalidpasswordmsg, message, "The entered password is invalid. Please try again.");
	    Thread.sleep(2000);
	}
	
	@Then("^I Click close button in deletemeasure popup$")
	public void Verify_closeButtonIn_deleteMeasure() throws Throwable {
	   click(CreateMeasurePage.closeicon, "Close Icon");
	   Thread.sleep(2000);
	}
	
	@Then("^I Search for Measure$")
	public void The_i_search_for_measure() throws Throwable {
		Thread.sleep(4000);
		 clear(MeasureLibrary.txtSearchMeasure, "Search Field");
		    Thread.sleep(2000);
		   type(MeasureLibrary.txtSearchMeasure, Mesurename, "Enter the measure to search");
		   Thread.sleep(2000);
		   click(MeasureLibrary.btnSearchMeasure, "Search for the measure");
		   Thread.sleep(3000);
	}
	
	@Then("^Delete the Measure$")
	public void MeasureSuccessfullY_deleting() throws Throwable {
		click(CreateMeasurePage.deletebtn_compositemeasure, "Delete Button");
		Thread.sleep(2000);
		String pass=config.getProperty("MatPassword");
		type(CreateMeasurePage.deletepassfeld, pass, "Password Field");
		Thread.sleep(2000);
		click(CreateMeasurePage.confirmbtn, "Confirm Button");
		Thread.sleep(2000);
		IsElementExists(CreateMeasurePage.successmsgDeletemeasure, "Measure successfully Measure");
	}
	
	@Then("^Verify a Package and Upload to Bonnie button has been added to the bottom of the Measure Packager screen$")
	public void verify_the_button_Package_and_upload_toBonnie() throws Throwable {
		IsElementExists(CreateMeasurePage.packageandUploadtobonniebtn, "Package and Upload to Bonnie");
		Thread.sleep(2000);
	}
	
	@Then("^The pachage and Uploadto bonnie tooltip read as \"([^\"]*)\"$")
	public void Package_and_upload_toBonnie_tiiltip_verification(String tooltip) throws Throwable {
		tooltip(CreateMeasurePage.packageandUploadtobonniebtn, tooltip, "title");
		Thread.sleep(2000);
	}
	
	@Then("^Verify the button displays on the same line as the Create Measure Package and Create Package and Export buttons$")
	public void Verify_the_buttons_are_same_line() throws Throwable {
		IsElementExists(CreateMeasurePage.samelinebutton, "The buttons displays in Same line");
		Thread.sleep(2000);
	}
	
	@Then("^Verify the Package and Upload to Bonnie button is blue with white font$")
	public void Verify_the_button_is_blue_with_white_text() throws Throwable {
		String element = driver.findElement(CreateMeasurePage.packageandUploadtobonniebtn).getCssValue("background-color");
		String font = driver.findElement(CreateMeasurePage.packageandUploadtobonniebtn).getCssValue("color");
		String[] hexValue = element.replace("rgba(", "").replace(")", "").split(",");
		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		String[] hexValuefont = font.replace("rgba(", "").replace(")", "").split(",");
		int hexValuefont1=Integer.parseInt(hexValuefont[0]);
		hexValuefont[1] = hexValuefont[1].trim();
		int hexValuefont2=Integer.parseInt(hexValuefont[1]);
		hexValuefont[2] = hexValuefont[2].trim();
		int hexValuefont3=Integer.parseInt(hexValuefont[2]);
		String actualfont = String.format("#%02x%02x%02x", hexValuefont1, hexValuefont2, hexValuefont3);
		String actual="#337ab7";
		String fontact = "#ffffff";
		if(actualColor.equals(actual))
		{
			if(actualfont.equals(fontact))
			{
				Reporter.addStepLog("The Package and Upload To Bonnie blue colour with white text");
			}
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
		Thread.sleep(1000);
	}
	@Then("^I Click Create Measure Package$")
	public void Click_create_measure_package() throws Throwable {
	    click(CreateMeasurePage.save_measure_packegeButton, "Create Measure Package");
	    Thread.sleep(5000);
	}
	
	@Then("^I Click Package and Upload to Bonnie$")
	public void Clcik_package_and_uoload_to_bonnie() throws Throwable {
	    click(CreateMeasurePage.packageandUploadtobonniebtn, "Measure search button");
	    Thread.sleep(5000);
	}
	
	@Then("^Verify the successfully Upload to bonnie message$")
	public void Verify_successfuly_uploadmessage() throws Throwable {
	    IsElementExists(CreateMeasurePage.seccessmsgpackagedbonnie, "has been successfully packaged and updated in Bonnie");
	    Thread.sleep(5000);
	}
	
	@Then("^Verify the Packaged and Upload to Bonnie button is disabled$")
	public void verifypackagedbutton_is_disabled() throws Throwable {
		FieldDisabled(CreateMeasurePage.disabledpackageandUploadtobonniebtn, "Disabled Packaged and Upload to Bonnie button");
		Thread.sleep(2000);
	}
	
	@Then("^Verify eCQM Identifier field and Generate Identifier Button is disabled$")
	public void Verify_ecqm_idebtifier_and_button_is_disabled() throws Throwable {
		FieldDisabled(CreateMeasurePage.eCQMID, "eCQM Identifier Field");
		Thread.sleep(2000);
		FieldDisabled(CreateMeasurePage.generateidentifier, "Generate Identifier Button");
		Thread.sleep(2000);
	}
	
	@Then("^Verify Endorsed by NQF  and NQF Number fields$")
	public void Verify_endorser_by_NQF_and_NQFNumber() throws Throwable {
	    IsElementExists(CreateMeasurePage.endorsed_by_nqf, "Endorsed by NQF");
	    Thread.sleep(2000);
	    IsElementExists(CreateMeasurePage.nqf_number, "NQF Number");
	    Thread.sleep(2000);
	}
	
	@Then("^Verify NQF Number field is disabled$")
	public void verifyNQF_Number_is_disabled() throws Throwable {
		FieldDisabled(CreateMeasurePage.nqf_number, "Disabled NQF Number");
		Thread.sleep(2000);
	}

	@Then("^Verify NQF Number field is required$")
	public void verifyNQF_Number_is_required() throws Throwable {
		IsElementExists(CreateMeasurePage.nqf_number, " Required NQF Number Field");
	    Thread.sleep(2000);
	}
	
	@Then("^I click Measure details save button$")
	public void Click_measure_details_save_button() throws Throwable {
		clickKeyboardControl(CreateMeasurePage.savebutton, "Save Button");
	    Thread.sleep(2000);
	}
	
	@Then("^Verify new eCQM Version Number is displayed$")
	public void verify_cCQMVersionisNew() throws Throwable {
		String newversion = "v1.0.000";
		String act = driver.findElement(CreateMeasurePage.eCQMIversiom).getText();
		if(newversion.equals(act))
		{
			Reporter.addStepLog("New eCQM Version is successfully displayed");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
		
	}
	
	@Then("^create Clone measure$")
	public void CreateCloneMeasure() throws Throwable {
		clickKeyboardControl(CreateMeasurePage.clonemeasure, "Clone Button");
	    Thread.sleep(2000);
	}
	
	@Then("^Verify NQF  designation and number is not transferred to the cloned measure$")
	public void Verify_nqf_number_in_clone_measure() throws Throwable {
		String newversion = "";
		String act = driver.findElement(CreateMeasurePage.nqf_number).getText();
		if(act.equals(newversion))
		{
			Reporter.addStepLog("NQF  designation and number is not transferred to the cloned measure");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
	}
	
	@Then("^I see the error message in Measure details page \"([^\"]*)\"$")
	public void verify_the_measure_detailsgeneralinfo_error_message(String error) throws Throwable {
		
		verifyText(CreateMeasurePage.measuredetailunsavederror, error, "Unsaved Error Message");
		Thread.sleep(2000);
		
	}

	@Then("^Verify the No button and save button$")
	public void Verify_unsaved_measuredetail_No_save_button() throws Throwable {
		IsElementExists(CreateMeasurePage.unsavedmeasureYesbtn, "No button");
		Thread.sleep(1000);
		IsElementExists(CreateMeasurePage.unsavedmeasureNobtn, "Yes button");
		Thread.sleep(1000);
	}
	
	
	@Then("^I click old Measure Details$")
	public void Click_old_measure_details() throws Throwable {
		click(CreateMeasurePage.oldmeasuredetailsTab, "Old Measure Details");
		Thread.sleep(2000);
	}
	
	

}
