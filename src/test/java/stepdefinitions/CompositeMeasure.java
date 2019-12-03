package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import engine.ActionEngine;
import pages.CQLWorkspacepage;
import pages.CreateMeasurePage;
import pages.MeasureLibrary;

public class CompositeMeasure extends ActionEngine{
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	SimpleDateFormat dateformat = new SimpleDateFormat("HHmmss");
	Date date = new Date();
	String time = dateformat.format(date);
	
	@When("^I click create new composite measure$")
	public void new_measure_composer() throws Throwable {
		Thread.sleep(3000);
		click(CreateMeasurePage.new_measure_composer, "Click measure composer");
		Thread.sleep(3000);
	}
	
	private String Composite;
	@Then("^I enter composite measure name as \"([^\"]*)\"$")
	public void ente_composite_measure_name(String Composite_name) throws Throwable {
		 Composite=Composite_name+time;
		type(CreateMeasurePage.composite_messure_name, Composite , "Composite name");
		   Thread.sleep(2000);
}
	private String title;
	@Then("^I enter composite measure Abbreviated title as \"([^\"]*)\"$")
	public void composite_measure_new(String title) throws Throwable {
		this.title=title;
		type(CreateMeasurePage.composite_messure_abbreviated, title, "Abbreviated Name");
		Thread.sleep(2000);
	}
	
	@Then("^I search composite measure$")
	public void search_compositemeasure() throws Throwable {
		Thread.sleep(2000);
		clear(CreateMeasurePage.search_measure, "Search Field");
		Thread.sleep(2000);
		 type(CreateMeasurePage.search_measure, Composite, "Enter the measure to search");
		   click(CreateMeasurePage.search_measure_btn, "Search for the measure");
		   Thread.sleep(4000);
		   
	}
	
	@Then("^I Verify \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" are exist in Measure scoring$")
	public void verifymeasurescoringtype(String cohert,String continousVar,String propotion,String ratio) throws Throwable {
		try
		{
			int count = 0;
			String[] exp = {cohert,continousVar,propotion,ratio};
			WebElement selectElement = driver.findElement(CreateMeasurePage.measurescoring);
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
			        Reporter.addStepLog("All Measure scoring are exist");
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
	
	
	private String method;
	@Then("^I select composite scoring method \"([^\"]*)\"$")
	public void select_composite_scoring(String Composite_scoring) throws Throwable {
		this.method=Composite_scoring;
		selectByVisibleText(CreateMeasurePage.composit_scoring_method, Composite_scoring, "Composite scoring Method");
		Thread.sleep(2000);
   }
	
	@Then("^I see \"([^\"]*)\" and \"([^\"]*)\" are in Measure scoring$")
	public void verifymeasurescoring(String propotion,String ratio) throws Throwable {
		try
		{
			int count = 0;
			String[] exp = {propotion,ratio};
			WebElement selectElement = driver.findElement(CreateMeasurePage.measurescoring);
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
			        Reporter.addStepLog("Corresponing Measure scoring are exist");
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
	
	@Then("^I see \"([^\"]*)\" are in the Measure scoring$")
	public void verifymeasurescoringcontinousVar(String continvar) throws Throwable {
		try
		{
			int count = 0;
			String[] exp = {continvar};
			WebElement selectElement = driver.findElement(CreateMeasurePage.measurescoring);
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
			        Reporter.addStepLog("Corresponing Measure scoring are exist");
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
	
	private String scoring;
	@And("^I select measure scoring \"([^\"]*)\"$")
	public void select_measure_scoring(String measure_scoring) throws Throwable {	
		this.scoring=measure_scoring;
		selectByVisibleText(CreateMeasurePage.composite_measure_scorint, measure_scoring, "Create  measure dropdown");
		Thread.sleep(2000);
   }
	
	private String patient;
	@Then("^I select patient-based-measure \"([^\"]*)\"$")
	public void select_patient_based_measure(String patientmeasure) throws Throwable {	
		this.patient=patientmeasure;
		selectByVisibleText(CreateMeasurePage.patientbasedscore, patientmeasure, "Create  measure dropdown");
		Thread.sleep(2000);
		click(CreateMeasurePage.composite_save_continue, "Save and Continue button");
		Thread.sleep(2000);
   }
	
	@Then("^I Search measure name \"([^\"]*)\"$")
	public void SearchMeasure_in_compositemeasurePage(String measure) throws Throwable {
		clear(CreateMeasurePage.compositesearchField, "Measure Name");
		Thread.sleep(2000);
		type(CreateMeasurePage.compositesearchField, measure, "Measure Name"); 
		Thread.sleep(2000);
		click(CreateMeasurePage.search_measure_btn, "Search button");
		Thread.sleep(4000);
   }


	@Then("^I DeSelect ChildrenDentalDecay1 and Component for Composite items$")
	public void deselectSearchedcompositeitem() throws Throwable {	
		click(CreateMeasurePage.compositesearched1, "Select searched item");
		Thread.sleep(2000);
		click(CreateMeasurePage.compositesearched2, "Select searched item");
		Thread.sleep(2000);		
   }
	
	@Then("^Clicked Save and Continue Verify the Error \"([^\"]*)\"$")
	public void click_saveAndContinue_verifyThe_error(String messsage) throws Throwable {	
		click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
		Thread.sleep(2000);
		verifyText(CreateMeasurePage.componenmeasuresavingerrormsg, messsage, "Component measure Error message");
   }
	
	@Then("^Verify A component measure must have a measure package error message that reads Measurename \"([^\"]*)\"$")
	public void click_saveAndContinue_verifyThe_pachaged_errorMsg(String messsage) throws Throwable {	
		click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
		Thread.sleep(2000);
		IsElementExists(CreateMeasurePage.nppackagederrormsg, "No measure Packaged Error Message");
   }
	@When("^I click Search button$")
	public void clicksearch_componentmeasure() throws Throwable {	
		click(CreateMeasurePage.search_measure_btn, "Search button");
		Thread.sleep(4000);
		waitForElementToBClickable(CreateMeasurePage.search_measure_btn, "Search button");
   }
	
	private String alias1;
	private String alias2;
	@Then("^I enter alias name then click save and continue$")
	public void entercompositealias() throws Throwable {
		//clear(CreateMeasurePage.compositesearched1Aliasname, "Alias name");
		//clear(CreateMeasurePage.compositesearched2aliasname, "Alias name");
		String alias1="Test1";
		this.alias1=alias1;
		String alias2="Test2";
		this.alias2=alias2;
		type(CreateMeasurePage.compositesearched2aliasname, alias1, "Alias name");
		Thread.sleep(3000);
		type(CreateMeasurePage.compositesearched3aliasname, alias2, "Alias name");
		Thread.sleep(4000);
		click(CreateMeasurePage.componenetMeasure_save, "Save and continue");
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateMeasurePage.createNewMeasure_popupContinue)).click();
		/*if(!driver.findElements(CreateMeasurePage.createNewMeasure_popupContinue).isEmpty()) {
			click(CreateMeasurePage.createNewMeasure_popupContinue, "Continue popup button");
			Thread.sleep(4000);
		}*/
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
   }
	
	@Then("^I save alias using save and continue button$")
	public void savecompositealias() throws Throwable {
		
		Thread.sleep(4000);
		click(CreateMeasurePage.componenetMeasure_save, "Save and continue");
		Thread.sleep(4000);
		//click(CreateMeasurePage.createNewMeasure_popupContinue, "Continue");
		//click(CreateMeasurePage.createNewMeasure_cancel, "Cancel");
		//Thread.sleep(2000);	
		if(!driver.findElements(CreateMeasurePage.createNewMeasure_popupContinue).isEmpty()) {
			click(CreateMeasurePage.createNewMeasure_popupContinue, "Continue popup button");
			Thread.sleep(4000);
		}
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
   }
	
	@Then("^I enter first alias name$")
	public void entercompositealiasName() throws Throwable {
		//clear(CreateMeasurePage.compositesearched1Aliasname, "Alias name");
		//clear(CreateMeasurePage.compositesearched2aliasname, "Alias name");
		String alias1="Test1";
		this.alias1=alias1;
		String alias2="Test2";
		this.alias2=alias2;
		type(CreateMeasurePage.compositesearched2aliasname, alias1, "Alias name");
		Thread.sleep(3000);
		//type(CreateMeasurePage.compositesearched3aliasname, alias2, "Alias name");
		
		}
	
	@Then("^I enter second alias name$")
	public void entercompositeSecondaliasName() throws Throwable {
		
		String alias2="Test2";
		this.alias2=alias2;
		//type(CreateMeasurePage.compositesearched2aliasname, alias1, "Alias name");
		Thread.sleep(3000);
		type(CreateMeasurePage.compositesearched3aliasname, alias2, "Alias name");
		
		}
	
	
		
	private String compo;
	@Then("^I Change alias name \"([^\"]*)\"$")
	public void Change_alias_name(String compo) throws Throwable {	
		this.compo = compo;
		clear(CreateMeasurePage.editalias, "Alias name");
		Thread.sleep(1000);
		type(CreateMeasurePage.editalias, compo, "Alias name");
		Thread.sleep(1000);
   }
	
	@Then("^Click No will close the message and leave the user on the Components Tab$")
	public void clickNo_button_user_in_ComponentMeasure() throws Throwable {
		
		click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
		Thread.sleep(2000);
		String actual=driver.findElement(CreateMeasurePage.compositesearched3aliasname).getText();	
		if (!actual.equals(compo)){
			
			Reporter.addStepLog("User in current page and successfully saved");
		} else {
			Reporter.addStepLog("Failed:- Verification Failed");
		}
		Thread.sleep(1000);
	}
	
	@When("^Verify the save and continue button$")
	public void Verify_save_and_continue_button() throws Throwable {	
		IsElementExists(CreateMeasurePage.compositesavebtn, "Save And Continue Button");
		Thread.sleep(2000);
		
   }
	
	@Then("^Click save button Verify Successfully Updated message \"([^\"]*)\"$")
	public void Update_componentMasure_Verify_success_msg(String successmsg) throws Throwable {	
		click(CreateMeasurePage.compositesavebtn, "Save and continue");
		Thread.sleep(2000);
		verifyText(CreateMeasurePage.editcomponentsuccessmsg, successmsg, successmsg);
		Thread.sleep(1000);
   }
	
	
	@When("^I clicked Measure details$")
	public void measure_details() throws Throwable {	
		click(CreateMeasurePage.measuredetaild, "Measure details");
		Thread.sleep(3000);
   }
	
	@Then("^I Verify \"([^\"]*)\" is displayed successfylly$")
	public void verifyMeasure_detailsField(String measuredetail) throws Throwable {	
		String general="General Measure Information";
		String compon ="Component Measures";
		String adjes ="Risk Adjustment";
		String popu = "Populations";
		String suppe ="Supplemental Data Elements";
		
		if(measuredetail.equals("General Measure Information"))
		{
			try
			{
				if(driver.findElement(By.xpath("(//*[contains(text(),'"+measuredetail+"')])[1]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
		if(measuredetail.equals("Measure Population"))
		{
			try
			{
				if(driver.findElement(By.xpath("(//*[contains(text(),'"+measuredetail+"')])[1]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
		if(measuredetail.equals("Component Measures"))
		{
			try
			{
				if(driver.findElement(By.xpath("(//*[contains(text(),'"+measuredetail+"')])[3]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
		if(measuredetail.equals("Risk Adjustment"))
		{
			try
			{
				if(driver.findElement(By.xpath("(//*[contains(text(),'"+measuredetail+"')])[1]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
		if(measuredetail.equals("Populations"))
		{
			try
			{
				if(driver.findElement(By.xpath("(//*[contains(text(),'"+measuredetail+"')])[1]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
		if(measuredetail.equals("Supplemental Data Elements"))
		{
			try
			{
				if(driver.findElement(By.xpath("(//*[contains(text(),'"+measuredetail+"')])[1]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
		
		if(measuredetail!=general && measuredetail!=compon && measuredetail!=adjes && measuredetail!=popu && measuredetail!=suppe)
		{
			try
			{
				if(driver.findElement(By.xpath("//*[contains(text(),'"+measuredetail+"')]")).isEnabled())
				{
					Reporter.addStepLog("The '"+measuredetail+"' is exist in the Measure details page :- Success");
				}
			}
			catch(Exception e)
			{
				Reporter.addStepLog("Failed :- The '"+measuredetail+"' is not fount");
			}
		}
   }
	
	@When("^I clicked \"([^\"]*)\" is show a header at the top of the page$")
	public void verifycompositemeasureDetaildheaderverification(String measure) throws Throwable {	
	try
	{
		if(measure.equals("Measure Steward / Developer"))
		{
			driver.findElement(By.xpath("//li[@title='"+measure+"']")).click();
			Thread.sleep(2000);
			Reporter.addStepLog("Clicked on the element: "+measure+" successfully");
			String actual=driver.findElement(By.xpath("//b[contains(text(),'Measure Steward and Measure Developer')]")).getText();	
			String measure1 = "Measure Steward and Measure Developer";
			if (actual.equals(measure1)){
				
				Reporter.addStepLog("Successfully displayed: "+measure1);
			} else {
				Reporter.addStepLog("Expected Text not displayed: "+measure1);
			}
			Thread.sleep(1000);
		}
		else
		{
		driver.findElement(By.xpath("//li[@title='"+measure+"']")).click();
		Thread.sleep(2000);
		Reporter.addStepLog("Clicked on the element: "+measure+" successfully");
		String actual=driver.findElement(By.xpath("//b[contains(text(),'"+measure+"')]")).getText();	
		
		if (actual.equals(measure)){
			
			Reporter.addStepLog("Successfully displayed: "+measure);
		} else {
			Reporter.addStepLog("Expected Text not displayed: "+measure);
		}
		Thread.sleep(1000);
	}
	}
	catch(Exception e)
	{
		Reporter.addStepLog("Failed to click on the element: "+measure+" .");
		throw new Exception ("Element Not found or Element state not ready to perform action");
	}
		
   }
	
	
	@Then("^I Verify \"([^\"]*)\" is displayed in population workspace$")
	public void verifypopulationworkspace(String population) throws Throwable {	
		try
		{
			driver.findElement(By.xpath("//li[@title='"+population+"']")).isEnabled();
			Thread.sleep(1000);
			Reporter.addStepLog("The element: '"+population +"' is displayed successfully.");
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
   }
	
	@When("^I clicked \"([^\"]*)\" is show a header \"([^\"]*)\" at the top of the page$")
	public void verifycompositemeasureDetaildheaderverification(String population, String populationheader) throws Throwable {	
	try
	{
		if(population.equals("Denominator Exclusions"))
		{
			driver.findElement(By.xpath("(//li[@title='"+population+"'])[2]")).click();
			Thread.sleep(2000);
			Reporter.addStepLog("Clicked on the element: "+population+" successfully");
			String actual=driver.findElement(By.xpath("//b[contains(text(),'"+populationheader+"')]")).getText();	
			
			if (actual.equals(populationheader)){
				
				Reporter.addStepLog("Successfully displayed: "+populationheader);
			} else {
				Reporter.addStepLog("Expected Text not displayed: "+populationheader);
			}
			Thread.sleep(1000);
		}
		if(population.equals("Numerator Exclusions"))
		{
			driver.findElement(By.xpath("(//li[@title='"+population+"'])[2]")).click();
			Thread.sleep(2000);
			Reporter.addStepLog("Clicked on the element: "+population+" successfully");
			String actual=driver.findElement(By.xpath("//b[contains(text(),'"+populationheader+"')]")).getText();	
			
			if (actual.equals(populationheader)){
				
				Reporter.addStepLog("Successfully displayed: "+populationheader);
			} else {
				Reporter.addStepLog("Expected Text not displayed: "+populationheader);
			}
			Thread.sleep(1000);
		}
		if(population.equals("Denominator Exceptions"))
		{
			driver.findElement(By.xpath("(//li[@title='"+population+"'])[2]")).click();
			Thread.sleep(2000);
			Reporter.addStepLog("Clicked on the element: "+population+" successfully");
			String actual=driver.findElement(By.xpath("//b[contains(text(),'"+populationheader+"')]")).getText();	
			
			if (actual.equals(populationheader)){
				
				Reporter.addStepLog("Successfully displayed: "+populationheader);
			} else {
				Reporter.addStepLog("Expected Text not displayed: "+populationheader);
			}
			Thread.sleep(1000);
		}
		if(population.equals("Stratification"))
		{
			driver.findElement(By.xpath("(//li[@title='"+population+"'])[2]")).click();
			Thread.sleep(2000);
			Reporter.addStepLog("Clicked on the element: "+population+" successfully");
			String actual=driver.findElement(By.xpath("//b[contains(text(),'"+populationheader+"')]")).getText();	
			
			if (actual.equals(populationheader)){
				
				Reporter.addStepLog("Successfully displayed: "+populationheader);
			} else {
				Reporter.addStepLog("Expected Text not displayed: "+populationheader);
			}
			Thread.sleep(1000);
		}
		if(population.equals("Initial Populations") || population.equals("Denominators") || population.equals("Numerators"))
		{
		driver.findElement(By.xpath("//li[@title='"+population+"']")).click();
		Thread.sleep(2000);
		Reporter.addStepLog("Clicked on the element: "+population+" successfully");
		String actual=driver.findElement(By.xpath("//b[contains(text(),'"+populationheader+"')]")).getText();	
		
		if (actual.equals(populationheader)){
			
			Reporter.addStepLog("Successfully displayed: "+populationheader);
		} else {
			Reporter.addStepLog("Expected Text not displayed: "+populationheader);
		}
		Thread.sleep(1000);
		}
	}
	catch(Exception e)
	{
		Reporter.addStepLog("Failed to click on the element: "+populationheader+" .");
		throw new Exception ("Element Not found or Element state not ready to perform action");
	}
		
   }
	
	
	@Then("^Verify the field heading \"([^\"]*)\" and \"([^\"]*)\" are Required Editable fields$")
	public void verify_measurename_Abrivatetitle(String measurename, String abrivatedtitle) throws Throwable {
		verifyText(CreateMeasurePage.measurenamelabel, measurename, "Measure Name");
		verifyText(CreateMeasurePage.abrivatedtitlelabel, abrivatedtitle, "eCQM Abbreviated Title");
		try
		{
			driver.findElement(CreateMeasurePage.measurenamefield).click();
				Reporter.addStepLog("The '"+measurename+"' is Editable field");
			driver.findElement(CreateMeasurePage.abrivatedtitlefield).click();
				Reporter.addStepLog("The '"+abrivatedtitle+"' is Editable field");	
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Failed to find the Field: '" +measurename+"'.");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	
	@Then("^Verify that on page load these fields fill in with the information that was chosen when the measure was created$")
	public void verify_losdthePage_measurewasCreated() throws Throwable {
		if(!driver.findElement(CreateMeasurePage.measurenamefield).equals(""))
		{
			Reporter.addStepLog("Verification Successful");
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
	}
	
	@And("^Verify that there is a Save button at the bottom of the fields$")
	public void VerifySaveButton_measuredetail() throws Throwable {
		IsElementExists(CreateMeasurePage.savebutton, "Save Button");
	}
	
	@Then("^Verify that user is presented with an orange checkmark$")
	public void VerifyUser_active_mark() throws Throwable {
		IsElementExists(CreateMeasurePage.useractiveMark, "User presented orange Mark");
	}
	
	@Then("^Verify that all buttons and options can be selected with keyboard only controls$")
	public void click_all_button_using_keyboardcontrol() throws Throwable {
		clickKeyboardControl(CreateMeasurePage.measurenamefield, "Measure Name");
		clickKeyboardControl(CreateMeasurePage.abrivatedtitlefield, "eCQM Abbreviated Title");
		clickKeyboardControl(CreateMeasurePage.measurescoring, "Measure scoring");
		clickKeyboardControl(CreateMeasurePage.measuredetailcompositescoring, "Composite Scoring");
		clickKeyboardControl(CreateMeasurePage.patientbasedscore, "Patient Based scoring");
		clickKeyboardControl(CreateMeasurePage.generateidentifier, "Generate Identifier");
		clickKeyboardControl(CreateMeasurePage.savebutton, "Save Button");
	}
	
    private String ecqmid;
	@Then("^Verify that all buttons and options can be selected with keyboard only controls In measre details$")
	public void click_all_button_using_keyboardcontrolinmeasuredetails() throws Throwable {
		clickKeyboardControl(CreateMeasurePage.measurenamefield, "Measure Name");
		clickKeyboardControl(CreateMeasurePage.abrivatedtitlefield, "eCQM Abbreviated Title");
		clickKeyboardControl(CreateMeasurePage.measurescoring2, "Measure scoring");
		clickKeyboardControl(CreateMeasurePage.patientbasedscore2, "Patient Based scoring");
		clickKeyboardControl(CreateMeasurePage.generateidentifier, "Generate Identifier");
		clickKeyboardControl(CreateMeasurePage.savebutton, "Save Button");
		String ecqm = driver.findElement(CreateMeasurePage.eCQMID).getText();
		this.ecqmid=ecqm;
	}
	
	@Then("^Verify that if a measure has had a previously assigned eCQM ID$")
	public void Verify_eCQM_id() throws Throwable {
		String actual = driver.findElement(CreateMeasurePage.eCQMID).getText();
		if(actual.equals(ecqmid))
		{
			Reporter.addStepLog("Success:- The assigned eCQM ID is previously addred eCQM ID");
		}
		else
		{
			Reporter.addStepLog("Verification Failed");
		}
	}
	
	@Then("^Verify that once the eCQM Identifier field has a number assigned to it$")
	public void Verify_eCQM_id_is_assignedIn_number() throws Throwable {
		String actual = driver.findElement(CreateMeasurePage.eCQMID).getText();
		Reporter.addStepLog(ecqmid);
		if (!actual.matches("[0-9]+")) {
			Reporter.addStepLog("Verification Failed");
        }
        else
        {
        	Reporter.addStepLog("Successfull:- eCQM Identifier field has a number");
        }
		Thread.sleep(2000);
	}
	
	@Then("^Verify the eCQM Version Number$")
	public void Verify_eCQM_Version() throws Throwable {
		Thread.sleep(2000);
		IsElementExists(CreateMeasurePage.eCQMIversiom, "eCQM Version");
		Thread.sleep(2000);
	}
	
	
	@Then("^I seacrh read only measure$")
	public void search_read_onlumeasure() throws Throwable {
		Thread.sleep(3000);
		click(CreateMeasurePage.searchmeasurecheckbox, "Search Measure check box");
		clear(CreateMeasurePage.search_measure, "measure to search");
		type(CreateMeasurePage.search_measure, "Measure", "Enter the measure to search");
	    click(CreateMeasurePage.search_measure_btn, "Search for the measure");
		Thread.sleep(2000);
		click(CreateMeasurePage.clicksearchedmeasure, "Searched Item");
		Thread.sleep(2000);
	}
	
	
	
	@Then("^Verify that the above listed Editable fields are not editable if the measure is in a read-only state$")
	public void verifyreadonlystate() throws Throwable {
		Thread.sleep(2000);
		FieldDisabled(CreateMeasurePage.disabledmeasurename, "Measure Name");
		FieldDisabled(CreateMeasurePage.disabledabbrivatedtitle, "eCQM Abbreviated Title");
		FieldDisabled(CreateMeasurePage.disabledmeasurescoring, "Measure scoring");
		FieldDisabled(CreateMeasurePage.disabledpatientbacedmeasure, "Patient Based scoring");
	}
	
	@Then("^Verify that the save button is disabled$")
	public void VerifyDisabledSaveButton() throws Throwable {
		FieldDisabled(CreateMeasurePage.disabledsavebutton, "Save Button");
	}
	
	@Then("^Verify finalized data, GUID, and eCQM Version number field is disabled$")
	public void VerifyDisabledfifnalize_guid_version() throws Throwable {
		FieldDisabled(CreateMeasurePage.disabledfinalizeddata, "Finalized Data");
		FieldDisabled(CreateMeasurePage.disabledguid, "GUID");
		FieldDisabled(CreateMeasurePage.disabledecqmVersion, "eCQM Version Number");
	}
	
	@Then("^Verify that on page load these fields fill in with the information that is stored regarding this measure$")
	public void page_reload_verification() throws Throwable {
		driver.navigate().refresh();
		Thread.sleep(4000);
		click(CreateMeasurePage.searchmeasurecheckbox, "Search Measure check box");
		Thread.sleep(2000);
		clear(MeasureLibrary.txtSearchMeasure, "measure to search");
		type(MeasureLibrary.txtSearchMeasure, "Cohort1", "Enter the measure to search");
	    click(MeasureLibrary.btnSearchMeasure, "Search for the measure");
		Thread.sleep(2000);
		click(CreateMeasurePage.clicksearchedmeasure, "Searched Item");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'Measure Details')])[1]")).click();
		Thread.sleep(2000);
		String act="Cohort1 v1.0";
		String expect= driver.findElement(By.xpath("//h1[contains(text(),'Cohort1 v1.0')]")).getText();
		if(act.equals(expect))
		{
			Reporter.addStepLog("Successfully storing data");
		}
		else
		{
			Reporter.addStepLog("Failed");
		}
	}
	
	@Then("^Verify that the General Measure Information section is highlighted in the left-hand navigation$")
	public void VerifingNavigationwindow_generalInformation() throws Throwable {
		try
		{
			if(driver.findElement(CreateMeasurePage.navigationwindow).isEnabled())
			{
				Reporter.addStepLog("Verification Successsful");
			}
			else
			{
				Reporter.addStepLog("Failed:- Verification Failed");
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or element state not ready to perform action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	
	@When("^I Clicked component measure Save and Continue$")
	public void click_saveAndContinue_ComponentMeasure() throws Throwable {	
		click(CreateMeasurePage.btn_final_measure_save, "Save");
		Thread.sleep(2000);	
   }
	
	@Then("^I Verify composite measure read as \"([^\"]*)\"$")
	public void VerifyCompositemeasureRead(String composite) throws Throwable {	
		verifyText(CreateMeasurePage.new_measure_composer, composite, "New Composite Measure");
   }
	
	@Then("^Verify that the icon on the button is the sitemap icon with the words New Composite Measure$")
	public void VerifyCompositemeasuresitemapIcon() throws Throwable {	
		IsElementExists(CreateMeasurePage.new_measure_composersitemapicon, "Sitemap icon");
   }
	@Then("^Verify that the composite measure can be selected with keyboard controls$")
	public void Click_Composite_measure_UsingkeyboardControl() throws Throwable {	
		clickKeyboardControl(CreateMeasurePage.new_measure_composer, "New Composite Measure");
		Thread.sleep(2000);
   }
	@Then("^Verify the breadcrumb heading at the top reads \"([^\"]*)\"$")
	public void Verifing_compositemeasureHeading(String compositemeasurehead) throws Throwable {	
		verifyText(CreateMeasurePage.compositemeasureHeader, compositemeasurehead, "My Measures > Create New Composite Measure");
   }
	
	@Then("^Verify that just below the text that states All fields are required$")
	public void VerifyAllthe_fieldsAre_required() throws Throwable {	
		
		String compositemeasurehead="Caution: The Composite Scoring Method field controls the options available in the Measure Scoring field. The Measure Scoring field controls the options available in the Patient-based Measure field. Changing the selection in the Composite Scoring Method will reset the Measure Scoring and Patient-based Measure fields. Changing the Measure Scoring field will reset the Patient-based Measure field.";
		verifyText(CreateMeasurePage.compositeAllFieldsrequired, compositemeasurehead, "All Fields Are Required");
   }
	
	@Then("^Verify that all fields have been filled on the New Composite Measure screen$")
	public void Verifing_compositemeasurefields() throws Throwable {	
		IsElementExists(CreateMeasurePage.composite_messure_name, "Measure Name");
		IsElementExists(CreateMeasurePage.composite_messure_abbreviated, "eCQM Abbreviated Title");
		IsElementExists(CreateMeasurePage.composit_scoring_method, "Composite Scoring Method");
		IsElementExists(CreateMeasurePage.composite_measure_scorint, "Measure Scoring");
		IsElementExists(CreateMeasurePage.patientbasedscore, "Patient Based Scoring");
		IsElementExists(CreateMeasurePage.composite_save_continue, "Continue Button");
		IsElementExists(CreateMeasurePage.composite_cancel, "Cancel Button");
   }
	
	@Then("^Verify that the Composite Scoring Method dropdown is a required field$")
	public void Verifing_compositeScoringMethodIsRequired() throws Throwable {
		Thread.sleep(2000);
		click(CreateMeasurePage.composite_save_continue, "Save and Continue button");
		Thread.sleep(2000);
		String expected = "Composite Scoring Method is required.";
		String actualMsg=driver.findElement(CreateMeasurePage.composite_scoring_method_errormsg).getText();
		if(actualMsg.equals(expected))
	       {
	    	   System.out.println("I successfully verify Composite Scorint Method is required field");
	       }
	       else
	       {
	    	   System.out.println("Failed:- Verification Failed");
	       }
		click(CreateMeasurePage.composite_save_continue, "Continue Button");
   }
	
	@Then("^Verify that the Composite Scoring Method field contains \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void Verifing_compositeScoringMethoditems(String allornothinf, String opportunity, String patientlevel) throws Throwable {
		try
		{
			int count = 0;
			String[] exp = {allornothinf,opportunity,patientlevel};
			WebElement selectElement = driver.findElement(CreateMeasurePage.composit_scoring_method);
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
			        Reporter.addStepLog("All Composite scoring method are exist");
			    } else {
			        Reporter.addStepLog("Does not exist, we have a problem.");
			    }
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
   }
	
	@Then("^I See Its corresponding patient based measure \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Verifing_patient_based_scoringyesorno(String yes, String no) throws Throwable {
		try
		{
			int count = 0;
			String[] exp = {yes,no};
			WebElement selectElement = driver.findElement(CreateMeasurePage.patientbasedscore);
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
			        Reporter.addStepLog("Successful:-Patient-based indicator field is still filtering correctly based on the selection in the Measure Scoring Field");
			    } else {
			        Reporter.addStepLog("Does not exist, we have a problem.");
			    }
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
   }
	
	@Then("^I See Its corresponding patient based measure \"([^\"]*)\"$")
	public void Verifing_patient_based_scoring(String no) throws Throwable {
		try
		{
			int count = 0;
			String[] exp = {no};
			WebElement selectElement = driver.findElement(CreateMeasurePage.patientbasedscore);
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
			        Reporter.addStepLog("Successful:-Patient-based indicator field is still filtering correctly based on the selection in the Measure Scoring Field");
			    } else {
			        Reporter.addStepLog("Does not exist, we have a problem.");
			    }
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
   }
	
	@Then("^Verify that there are two buttons A Continue button and a Cancel button$")
	public void Verifing_continue_and_cancel_button() throws Throwable {	
		IsElementExists(CreateMeasurePage.composite_save_continue, "Continue Button");
		IsElementExists(CreateMeasurePage.composite_cancel, "Cancel Button");
   }
	
	@And("^These should be the same styling as the buttons on the New Measure Screen$")
	public void Verifing_continue_and_cancel_buttonstyle() throws Throwable {	
		String save=driver.findElement(CreateMeasurePage.composite_save_continue).getAttribute("type");
		String cancel=driver.findElement(CreateMeasurePage.composite_cancel).getAttribute("type");
		if(save.equals(cancel))
		{
			Reporter.addStepLog("Two Button style are same");
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification Failed");
		}
   }

	@Then("^Verify that the options within the fields can be read, accessed, and selected by keyboard controls$")
	public void selecting_all_fields_using_keyboard_control() throws Throwable {	
		clear(CreateMeasurePage.composite_messure_name, "Measure Name");
		clear(CreateMeasurePage.composite_messure_abbreviated, "eCQM Abbreviated Title");
		WebElement measurename = driver.findElement(CreateMeasurePage.composite_messure_name);
		WebElement title = driver.findElement(CreateMeasurePage.composite_messure_abbreviated);
		Actions builder = new Actions(driver);
		Action seriesOfAction = (Action) builder
				.moveToElement(measurename).click()
				.sendKeys(measurename,"Composite")
				.moveToElement(title).click()
				.sendKeys(title,"Composte title").build();
		seriesOfAction.perform();
		selectByVisibleText(CreateMeasurePage.composit_scoring_method, "Opportunity", "Composite scoring Method");
		selectByVisibleText(CreateMeasurePage.composite_measure_scorint, "Proportion", "Create  measure dropdown");
		selectByVisibleText(CreateMeasurePage.patientbasedscore, "Yes", "Create  measure dropdown");
   }
	
	@Then("^Verify that clicking on the Cancel button takes the user back to the Measure Library screen$")
	public void Click_cancelButton_redirectTo_MeasureLibrary() throws Throwable {	
		click(CreateMeasurePage.tabMeasureLibrary, "Cancel Button");
		Thread.sleep(2000);
		String expect = driver.findElement(MeasureLibrary.MeasureLibrarytab).getText();
    	String actual = "Measure Library";
    	if(expect.equals(actual))
    	{
    		Reporter.addStepLog("Successfully redirect to Measure Library Page");
    	}
    	else
    	{
    		Reporter.addStepLog("Failed:- Verification Failed");
    	}
    	Thread.sleep(2000);
	}
	
	@Then("^I click save composite measure$")
	public void Click_save_complosite_measure() throws Throwable {
		
		click(CreateMeasurePage.composite_save_continue, "Save and Continue button");
		Thread.sleep(2000);
	}
	
	@Then("^I verify user should see an error message for the first field that is left blank$")
	public void verify_error_measure_name() throws Throwable {
		String expected = " A measure name is required.";
		String actualMsg=driver.findElement(CreateMeasurePage.composite_name_error_mesg).getText();
		if(actualMsg.equals(expected))
	       {
			Reporter.addStepLog("Successfully see the field required error message");
	       }
		else
	       {
			Reporter.addStepLog("Failed:- Verification Failed");
	       }
	}
	
	@Then("^I verify the error message ecQMT title$")
	public void verify_ecQMT_error_message() throws Throwable {
		String expected = "An eCQM abbreviated title is required.";
		String actualMsg=driver.findElement(CreateMeasurePage.composite_abbreviated_error_msg).getText();
		if(actualMsg.equals(expected))
	       {
			Reporter.addStepLog("I successfully verify that ecQMT error message title");
	       }
	       else
	       {
	    	   Reporter.addStepLog("I cannot verify eCQMT error message title");
	       }
}
	
	@Then("^I verify the error message composite scoring method$")
	public void verify_composite_scoring() throws Throwable {
		String expected = "Composite Scoring Method is required.";
		String actualMsg=driver.findElement(CreateMeasurePage.composite_scoring_method_errormsg).getText();
		
		if(actualMsg.equals(expected))
	       {
			Reporter.addStepLog("I successfully verify that composite scoring error message title");
	       }
	       else
	       {
	    	   Reporter.addStepLog("I cannot verify composite scoring error message title");
	       }
	}
	
	@Then("^I verify the error message CQL library name composite method$")
	public void verify_composite_CQL() throws Throwable {
		String expected = "A CQL Library name is required.";
		String actualMsg=driver.findElement(CreateMeasurePage.composite_CQL_error_mesg).getText();
		
		if(actualMsg.equals(expected))
	       {
			Reporter.addStepLog("I successfully verify that composite CQL library name error message");
	       }
	       else
	       {
	    	   Reporter.addStepLog("I cannot verify composite CQL library error message");
	       }
	}
	
	@Then("^I verify the error message measure scoring$")
	public void verify_measure_scoring() throws Throwable {
		String expected = "Measure Scoring is required.";
		String actualMsg=driver.findElement(CreateMeasurePage.measure_scoring_errorMsg).getText();
		
		if(actualMsg.equals(expected))
	       {
			Reporter.addStepLog("I successfully verify that Measure scoring error message title");
	       }
	       else
	       {
	    	   Reporter.addStepLog("I cannot verify Measure scoring error message title");
	       }
	}
	
	@Then("^I Breadcrumb heading should read \"([^\"]*)\"$")
	public void verify_breadcrumb_heading(String measure) throws Throwable {
		verifyText(CreateMeasurePage.componentheader, measure, measure);
	}
	
	@Then("^I Verify that the screen has a search box with a search button at the top$")
	public void verify_searchField_and_search_button() throws Throwable {
		IsElementExists(CreateMeasurePage.search_measure, "Search Field");
		IsElementExists(CreateMeasurePage.search_measure_btn, "Search Button");
		}
	
	@Then("^Verify that the column title \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void verify_componentmeasureTable_column(String measurename,String version,String measurescoring,String patientbased,String owner,String select) throws Throwable {
		verifyText(CreateMeasurePage.componetmeasurename, measurename, "Measure Name");
		verifyText(CreateMeasurePage.componentversion, version, "Version");
		verifyText(CreateMeasurePage.componentmeasurescoring, measurescoring, "Measure Scoring");
		verifyText(CreateMeasurePage.componentpatient, patientbased, "Patient-based Indicator");
		verifyText(CreateMeasurePage.componentowner, owner, "Owner");
		verifyText(CreateMeasurePage.componentselect, select, "Select");
		}
	@Then("^I See the Selected measure and its details$")
	public void verify_searchedmeasuredetails() throws Throwable {
		IsElementExists(CreateMeasurePage.appliedcomponetmeasurename, "Measure Name");
		IsElementExists(CreateMeasurePage.appliedcomponentversion, "Version");
		IsElementExists(CreateMeasurePage.appliedcomponentmeasurescoring, "Measure Scoring");
		IsElementExists(CreateMeasurePage.appliedcomponentAlias, "Assign Alias");
		IsElementExists(CreateMeasurePage.appliedcomponentreplace, "Replace");
		IsElementExists(CreateMeasurePage.appliedcomponentmeasuredelete, "Delete");
		}
	@Then("^Verify the Go Back button blue with white text$")
	public void verify_gobackButton() throws Throwable {
		String element = driver.findElement(CreateMeasurePage.gobackbutton).getCssValue("background-color");
		String font = driver.findElement(CreateMeasurePage.gobackbutton).getCssValue("color");
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
				Reporter.addStepLog("The Go Back Button blue colour with white text");
			}
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
		Thread.sleep(1000);
		}

@Then("^Verify the Save and Continue button blue with white text$")
public void verify_savecontinueButton() throws Throwable {
	String element = driver.findElement(CreateMeasurePage.savebuttoncomposite).getCssValue("background-color");
	String font = driver.findElement(CreateMeasurePage.savebuttoncomposite).getCssValue("color");
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
			Reporter.addStepLog("The Save And Continue Button blue colour with white text");
		}
	}
	else
	{
		Reporter.addStepLog("Failed:- Verification failed");
	}
	Thread.sleep(1000);
}

@Then("^Verify the Cancel button and be red with white text$")
public void verify_cancelButton() throws Throwable {
	String element = driver.findElement(CreateMeasurePage.cancelbutton).getCssValue("background-color");
	String font = driver.findElement(CreateMeasurePage.cancelbutton).getCssValue("color");
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
	String actual="#d9534f";
	String fontact = "#ffffff";
	if(actualColor.equals(actual))
	{
		if(actualfont.equals(fontact))
		{
			Reporter.addStepLog("The Save Button red with white text");
		}
	}
	else
	{
		Reporter.addStepLog("Failed:- Verification failed");
	}
	Thread.sleep(1000);
	}


@Then("^Verify that there is a label for each section and button and a tooltip shows for each label$")
public void verify_all_label_and_button_toolTip() throws Throwable {
	Thread.sleep(2000);
	try {
	tooltip(CreateMeasurePage.search_measure, "Search Field", "title");
	tooltip(CreateMeasurePage.search_measure_btn, "Search Button", "title");
	tooltip(CreateMeasurePage.componetmeasurename, "Measure Name", "title");
	tooltip(CreateMeasurePage.componentversion, "Version label", "title");
	tooltip(CreateMeasurePage.componentmeasurescoring, "Measure Scoring label", "title");
	tooltip(CreateMeasurePage.componentpatient, "Patient-based Indicator label", "title");
	tooltip(CreateMeasurePage.componentowner, "Owner label", "title");
	tooltip(CreateMeasurePage.componentselect, "Select label", "title");
	tooltip(CreateMeasurePage.appliedcomponetmeasurename, "Applied Component Measure Name", "title");
	tooltip(CreateMeasurePage.appliedcomponentversion, "Applied Component Measure Version label", "title");
	tooltip(CreateMeasurePage.appliedcomponentmeasurescoring, "Applied Component Measure Scoring label", "title");
	tooltip(CreateMeasurePage.appliedcomponentAlias, "Assign Alias label", "title");
	tooltip(CreateMeasurePage.appliedcomponentreplace, "Replace label", "title");
	tooltip(CreateMeasurePage.appliedcomponentmeasuredelete, "Delete label", "title");
	tooltip(CreateMeasurePage.gobackbutton, "Go Back Button", "title");
	tooltip(CreateMeasurePage.savebuttoncomposite, "Save and Continue Button", "title");
	tooltip(CreateMeasurePage.cancelbutton, "Cancel Button", "title");
	}catch(Exception e)
	{
		Reporter.addStepLog("Element Not found  "+e);
	}
}


@Then("^Verify the Alias field included in the Applied component measure$")
public void verify_alias_field() throws Throwable {
	IsElementExists(CreateMeasurePage.compositesearched1Aliasname, "Alias Field");
}

@Then("^Verify already selected measure returned applied component measure$")
public void verify_alreadyselected_measure_returned() throws Throwable {
	IsElementExists(CreateMeasurePage.selectedmeasureinapplied1, "Selected Measure name");
	IsElementExists(CreateMeasurePage.selectedmeasureinapplied2, "Selected Measure name");
}

@Then("^Unchecking measure will remove that measure from the Applied component measure$")
public void verify_uncheckingMeasure_willremove_applied_component() throws Throwable {
	click(CreateMeasurePage.searcheditem, "Uncheck the searched Measure");
	Thread.sleep(2000);	
	IsElementExists(CreateMeasurePage.selectedmeasureinapplied1, "Selected Measure name");
	IsElementExists(CreateMeasurePage.selectedmeasureinapplied2, "Selected Measure name");
	Thread.sleep(2000);	
}

@Then("^select and deseclect the measure using keyboard control$")
public void verify_select_and_deselect_Using_keyboardControl() throws Throwable {
	click(CreateMeasurePage.searcheditem, "Deselct the Measure");
	Thread.sleep(2000);
	click(CreateMeasurePage.searcheditem, "Select the Measure");
	Thread.sleep(2000);
	
}

@Then("^Verify that using only keyboard controls you can get to and type into the field to assign an alias$")
public void verify_enterAliasnameusingkeyboardControl() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(CreateMeasurePage.compositesearched1Aliasname).clear();
	driver.findElement(CreateMeasurePage.compositesearched2aliasname).clear();
	Thread.sleep(2000);
	WebElement first =driver.findElement(CreateMeasurePage.compositesearched1Aliasname);
	WebElement second =driver.findElement(CreateMeasurePage.compositesearched2aliasname);
	Actions builder = new Actions(driver);
	Action seriesOfAction = (Action) builder
			.moveToElement(first).click()
			.sendKeys(first,"First Alias Name")
			.moveToElement(second).click()
			.sendKeys(second,"Second Alias Name").build();
	seriesOfAction.perform();
	Thread.sleep(2000);
}


@Then("^I clicked measure library$")
public void clicked_measurelibrary() throws Throwable {
	click(CreateMeasurePage.tabMeasureLibrary, "Measure libarary");
	Thread.sleep(4000);
}
@Then("^User click on searched measure edit pencil icon$")
public void click_measure_edit() throws Throwable {
	click(CreateMeasurePage.measureediticon, "Measure Edit Icon");
	Thread.sleep(2000);
}

@Then("^Verify the Name, eCQM Abbreviated Title, Composite Scoring Method, Measure Scoring, and Patient-based Measure fields are populated with the current information$")
public void Verifythe_editMeasuredetails() throws Throwable {
	String measurename = driver.findElement(CreateMeasurePage.measurenamefield).getAttribute("value");
	if(measurename.equals(Composite))
	{
		Reporter.addStepLog("The Current measure name and actual name to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	String title1 = driver.findElement(CreateMeasurePage.abrivatedtitlefield).getAttribute("value");
	if(title1.equals(title))
	{
		Reporter.addStepLog("The Current eCQM Abbrevaited Title  and actual title to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	/*Select select = new Select(driver.findElement(CreateMeasurePage.measuredetailcompositescoring));
	WebElement option = select.getFirstSelectedOption();
	String defaultItem = option.getText();
	if(defaultItem.equals(method))
	{
		Reporter.addStepLog("The Currently composite scoring method and actual scoring method to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}*/
	Thread.sleep(2000);
	Select select1 = new Select(driver.findElement(CreateMeasurePage.measurescoring));
	WebElement option1 = select1.getFirstSelectedOption();
	String measurescoring = option1.getText();
	if(measurescoring.equals(scoring))
	{
		Reporter.addStepLog("The Currently Measure scoring and actual measurescoring to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	Select select2 = new Select(driver.findElement(CreateMeasurePage.patientbasedscore));
	WebElement option2= select2.getFirstSelectedOption();
	String patientscoring = option2.getText();
	if(patientscoring.equals(patient))
	{
		Reporter.addStepLog("The Currently Patient-based scoring and actual patientbased to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
}

@Then("^Verify that Composite scoring method Warning message$")
public void compositescoringmethod_warningmessage() throws Throwable {
	IsElementExists(CreateMeasurePage.componenmeasuresavingerrormsg, "Composite Scoring Method Warning Message");
	Thread.sleep(2000);
}

@Then("^Verify that Composite Scoring Method field that states Warning message in edit measure scoring$")
public void compositescoringmethod_changestatewarningmessage() throws Throwable {
	IsElementExists(CreateMeasurePage.compositescoringmethodwarningmsg, "WARNING: Changing the 'Measure Scoring' will have the following impacts:");
	Thread.sleep(2000);
}




@Then("^Verify that the Applied Component Measure Replace,Delete icon$")
public void verify_applied_componentMeasure_relpaceandDelete_icon() throws Throwable {
	IsElementExists(CreateMeasurePage.replaceicon, "Replace Icon");
	IsElementExists(CreateMeasurePage.deleteicon, "Delete Icon");
	}

@Then("^I click save and continue Component Measure$")
public void click_componentMeasure_save_and_continue() throws Throwable {
	click(CreateMeasurePage.savebuttoncomposite, "Save and Continue Button");
	Thread.sleep(2000);
	}

@Then("^Click the created measure$")
public void click_CreatedcomponentMeasure_() throws Throwable {
	click(CreateMeasurePage.clickcreatedcompositemeasure, "Created Composite Measure");
	Thread.sleep(2000);
	}

@Then("^User select the created measure$")
public void user_selectCreatedMeasure_() throws Throwable {
	click(CreateMeasurePage.clickcreatedmeasure, "Created Measure");
	Thread.sleep(2000);
	}

@Then("^Delete The Composite Measure$")
public void click_delete_compositeMeasure() throws Throwable {
	click(CreateMeasurePage.deletebtn_compositemeasure, "Delete Button");
	Thread.sleep(2000);
	String pass=config.getProperty("MatPassword");
	type(CreateMeasurePage.deletepassfeld, pass, "Password Field");
	Thread.sleep(2000);
	click(CreateMeasurePage.confirmbtn, "Confirm Button");
	Thread.sleep(2000);
	}

@Then("^Verify the Created Measure details same as the Measure details page information$")
public void Verifythe_measuredetailsPage_information() throws Throwable {
	String measurename = driver.findElement(CreateMeasurePage.measurenamefield).getAttribute("value");
	if(measurename.equals(Composite))
	{
		Reporter.addStepLog("The Current measure name and actual name to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	String title1 = driver.findElement(CreateMeasurePage.abrivatedtitlefield).getAttribute("value");
	if(title1.equals(title))
	{
		Reporter.addStepLog("The Current eCQM Abbrevaited Title  and actual title to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	Select select = new Select(driver.findElement(CreateMeasurePage.measuredetailcompositescoring));
	WebElement option = select.getFirstSelectedOption();
	String defaultItem = option.getText();
	if(defaultItem.equals(method))
	{
		Reporter.addStepLog("The Currently composite scoring method and actual scoring method to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	Select select1 = new Select(driver.findElement(CreateMeasurePage.measurescoring));
	WebElement option1 = select1.getFirstSelectedOption();
	String measurescoring = option1.getText();
	if(measurescoring.equals(scoring))
	{
		Reporter.addStepLog("The Currently Measure scoring and actual measurescoring to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
	Select select2 = new Select(driver.findElement(CreateMeasurePage.patientbasedscore));
	WebElement option2= select2.getFirstSelectedOption();
	String patientscoring = option2.getText();
	if(patientscoring.equals(patient))
	{
		Reporter.addStepLog("The Currently Patient-based scoring and actual patientbased to be same");
	}
	else
	{
		Reporter.addStepLog("Failed:-Verification Failed");
	}
	Thread.sleep(2000);
}

@Then("^Enter special characters in alias field Verify the Error Message$")
public void Verify_alias_name_error_message() throws Throwable {
	type(CreateMeasurePage.compositesearched1Aliasname, "test!!", "Alias name");
	Thread.sleep(1000);
	type(CreateMeasurePage.compositesearched2aliasname, "test@@", "Alias name");
	Thread.sleep(1000);
	click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.aliasErrormessage, "Cannot Using Special characters as Alias name");
	Thread.sleep(2000);
}

@Then("^Verify the Clone icon is Disabled$")
public void Verify_disabled_clone() throws Throwable {	
	IsElementExists(CreateMeasurePage.notClonableicon, "Not clonable Icon");
	Thread.sleep(2000);
}

@Then("^The disabled clone icon tool tip read as \"([^\"]*)\"$")
public void Verify_disabled_cloneIconTooltip(String title) throws Throwable {	
	
	tooltip(CreateMeasurePage.notClonableicon, title, "title");
	Thread.sleep(2000);
}

@Then("^Verify A component measure must all have the same patient-based indicator setting$")
public void verify_same_patient_based_indocator_error_message() throws Throwable {	
	click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
	Thread.sleep(2000);
	String act="All component measures must have the same patient-based indicator setting.";
	verifyText(CreateMeasurePage.diffpatientbasedindicatorerrormsg, act, "All component measures must have the same patient-based indicator setting.");
	Thread.sleep(2000);
}

@Then("^Verify If the composite measure is a Proportion measure, the component measures must be Proportion or Ratio$")
public void verify_componentmeasure_is_propotionit_must_be_proportionAndRatio() throws Throwable {	
	type(CreateMeasurePage.compositesearched1Aliasname, "test1", "Alias name");
	Thread.sleep(1000);
	type(CreateMeasurePage.compositesearched2aliasname, "test2", "Alias name");
	Thread.sleep(1000);
	click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.scoringmeasurevalidationerror, " A proportion composite measure can only contain component measures that have a measure scoring of proportion or ratio");
	Thread.sleep(1000);
}

@Then("^Verify If the composite measure is a Ratio measure, the component measures must be Proportion or Ratio$")
public void verify_componentmeasure_is_ratioit_must_be_proportionAndRatio() throws Throwable {	
	type(CreateMeasurePage.compositesearched1Aliasname, "test1", "Alias name");
	Thread.sleep(1000);
	type(CreateMeasurePage.compositesearched2aliasname, "test2", "Alias name");
	Thread.sleep(1000);
	click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.scoringmeasurevalidationerror, " A ratio composite measure can only contain component measures that have a measure scoring of proportion or ratio");
	Thread.sleep(1000);
}


@Then("^Verify Each component measure must have an alias assigned$")
public void Verify_aliasname_requiredMessage() throws Throwable {	
	click(CreateMeasurePage.composite_final_save_continue, "Save and continue");
	Thread.sleep(2000);
	String act="An alias is required for each component measure.";
	verifyText(CreateMeasurePage.requiredAliasnameerrormsg, act, "An alias is required for each component measure.");
	Thread.sleep(2000);
}

@Then("^I Click Go back Button$")
public void click_go_backButton() throws Throwable {	
	click(CreateMeasurePage.gobackbutton, "Go Back Button");
	Thread.sleep(2000);
}

@Then("^Verify That the Component Measures List shows in the collapsible$")
public void verify_compositeMeasure_is_collapsibie_form() throws Throwable {	
	IsElementExists(CreateMeasurePage.componsnetMeasureColapsible, "Component Measures List shows in the collapsible");
	Thread.sleep(1000);
}

@Then("^Verify that the Component Measures List is read-only and un-editable$")
public void verify_compositeMeasure_readOnly() throws Throwable {	
	IsElementExists(CreateMeasurePage.componsnetMeasureColapsible, "Component Measures read-only and un-editable");
	Thread.sleep(1000);
}

@Then("^I Verify that the Add/Edit Component Measures button no longer exists on the Measure Details Page$")
public void verify_compositeMeasure_noLonger_exit_add_andEdit() throws Throwable {	
	IsElementExists(CreateMeasurePage.measureediticon, "Edit icon");
	Thread.sleep(1000);
}

@Then("^Verify that the Component Measures List does not show on the Measure Details Page$")
public void verify_compositeMeasureList_in_MeasureDetails() throws Throwable {	
	IsElementExists(CreateMeasurePage.componsnetMeasureColapsible, "Component Measure List");
	Thread.sleep(1000);
}

@Then("^Verify that clicking on the replace icon in-line with one of the component measures$")
public void verify_clicking_replace_icon() throws Throwable {	
	if(!driver.findElement(CreateMeasurePage.replacecomponenet).isSelected())
	{
	click(CreateMeasurePage.replacecomponenet, "Select searched item");
	Thread.sleep(2000);
	click(CreateMeasurePage.replaceiconcompo, "Replace Icon");
	Thread.sleep(2000);
	click(CreateMeasurePage.replaceiconcomposelectfirst, "Replace first One");
	Thread.sleep(2000);
	}
	else
	{
		click(CreateMeasurePage.replaceiconcompo, "Replace Icon");
		Thread.sleep(2000);
		click(CreateMeasurePage.replaceiconcomposelectfirst, "Replace first One");
		Thread.sleep(2000);
	}
}
@Then("^Verify that the list of available measure versions shows a checkbox in-line with each available version$")
public void VerifyAvailablemeasure_version_checkbox() throws Throwable {	
	IsElementExists(CreateMeasurePage.replaceiconcomposelectfirst, "Available Measure Verision Checkbox");
	Thread.sleep(1000);
}
@Then("^Verify that only one checkbox can be selected at a time$")
public void VerifyCheckbox() throws Throwable {	
	click(CreateMeasurePage.replaceiconcomposelectfirst, "Replace first One");
	Thread.sleep(2000);
	click(CreateMeasurePage.replaceiconcomposelectfirst, "Replace first One");
	Thread.sleep(2000);
	try
	{
	if(driver.findElement(CreateMeasurePage.replaceiconcomposelectfirst).isSelected())
	{
		driver.findElement(CreateMeasurePage.replaceiconcomposelectsecond).click();
		Reporter.addStepLog("Verification Successful Only One checkbox select at a time");
	}
	else
	{
		if(driver.findElement(CreateMeasurePage.replaceiconcomposelectsecond).isSelected())
		{
			driver.findElement(CreateMeasurePage.replaceiconcomposelectfirst).click();
			Reporter.addStepLog("Verification Successful Only One checkbox select at a time");
		}
	}
	}
	catch(Exception e)
	{
		Reporter.addStepLog("Element Not found or Element state not ready to perform action");
		throw new Exception ("Element Not found or Element state not ready to perform action");
	}
}

@Then("^Verify that there are two buttons at the bottom; Apply Blue with white text and Cancel Red with white text$")
public void Verify_ApplyButton_and_cancel_button() throws Throwable {	
	try {
	String element = driver.findElement(CreateMeasurePage.Applybutton).getCssValue("background-color");
	String font = driver.findElement(CreateMeasurePage.Applybutton).getCssValue("color");
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
			Reporter.addStepLog("The Apply Button blue colour with white text");
		}
	}
	else
	{
		Reporter.addStepLog("Failed:- Verification failed");
	}
	}catch(Exception e)
	{
		
	}
	try {
	Thread.sleep(1000);
	String element = driver.findElement(CreateMeasurePage.cancelreplacebtn).getCssValue("background-color");
	String font = driver.findElement(CreateMeasurePage.cancelreplacebtn).getCssValue("color");
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
	String actual="#d9534f";
	String fontact = "#ffffff";
	if(actualColor.equals(actual))
	{
		if(actualfont.equals(fontact))
		{
			Reporter.addStepLog("The Save Button red with white text");
		}
	}
	else
	{
		Reporter.addStepLog("Failed:- Verification failed");
	}
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		
	}
	
}

@Then("^I Click Cancel Button$")
public void Clicking_cancel_button() throws Throwable {	
	click(CreateMeasurePage.cancelreplacebtn, "Cancel Button");
	Thread.sleep(2000);
}



@Then("^Clicking apply Verify version of the Applied Component Measure with the newly selected version in the Applied Component Measures list$")
public void Verifynewly_replaced_compositeMeasureVersion() throws Throwable {
	try {
	String first=driver.findElement(CreateMeasurePage.replaceversion).getText();
	click(CreateMeasurePage.Applybutton, "Apply Button");
	Thread.sleep(2000);
	String second=driver.findElement(CreateMeasurePage.replaceversion).getText();
	if(first.equals(second))
	{
		Reporter.addStepLog("Newly selected version in the Applied Measure list Version are Same");
	}
	else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	}catch(Exception e)
	{
		
	}
}

@Then("^I click component Cancel Button$")
public void Clicking_cancel_buttoncomponentMeasure() throws Throwable {	
	click(CreateMeasurePage.cancelbutton, "Cancel Button");
	Thread.sleep(2000);
}
@Then("^Verify User In Measure Library Page$")
public void clickingCancelbtnVerify_UserInMeasurelibraryPage() throws Exception
{
	Thread.sleep(3000);
	String expect = driver.findElement(MeasureLibrary.MeasureLibrarytab).getText();
	String actual = "Measure Library";
	if(expect.equals(actual))
	{
		Reporter.addStepLog("Successfully redirect to Measure Library Page");
	}
	else
	{
		Reporter.addStepLog("Failed:- Verification Failed");
	}
}

@Then("^Verify User in Measure details Page$")
public void Verify_user_in_measureDetails_page() throws Throwable {	
	try {
		if(driver.findElement(CreateMeasurePage.measuredetaild).isEnabled())
		{
			Reporter.addStepLog("User In Measure Details Page");
		}
		else
		{
			Reporter.addStepLog("Failed:-Verfication Failed");
		}
	}catch(Exception e)
	{
		Reporter.addStepLog("Element Not found or Element state not ready to perform action");
		throw new Exception ("Element Not found or Element state not ready to perform action");
	}
}

@Then("^I Click component Measure$")
public void click_component_measure() throws Throwable {	
	click(CreateMeasurePage.cqlwrkspaceComponentMeasure, "Component Measure");
	Thread.sleep(2000);
}

	@Then("^I Click component Measures$")
	public void click_component_measures() throws Throwable {
		click(CreateMeasurePage.cqlwrkspaceComponentMeasures, "Component Measure");
		Thread.sleep(2000);
	}

@Then("^Verify the Measure details in CQLWorkspace Component Measure$")
public void VerifyCQLWorkspaceComponentMeasure() throws Throwable {	
	String aliasone = driver.findElement(CreateMeasurePage.cqlwrkspaceComponentMeasurealias1).getText();
	String aliastwo = driver.findElement(CreateMeasurePage.cqlwrkspaceComponentMeasurealias2).getText();
	if(aliasone.equals(alias1))
	{
		Reporter.addStepLog("First composit Measure Alias name successfully displayed");
	}
	if(aliastwo.equals(alias2))
	{
		Reporter.addStepLog("Second composite Measure Alias name successfully displayed");
	}
    Thread.sleep(2000);
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(CreateMeasurePage.cqlwrkspaceComponentMeasurealias1)).doubleClick().build().perform();
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.cqlwrkspaceComponentMeasuremeasurename, "Measure Name");
	IsElementExists(CreateMeasurePage.cqlwrkspaceComponentMeasureownername, "Owner Name");
	IsElementExists(CreateMeasurePage.cqlwrkspaceComponentMeasurelibraryname, "CQL Library Name");
	Thread.sleep(2000);
	action.moveToElement(driver.findElement(CreateMeasurePage.cqlwrkspaceComponentMeasurealias2)).doubleClick().build().perform();
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.cqlwrkspaceComponentMeasuremeasurename, "Measure Name");
	IsElementExists(CreateMeasurePage.cqlwrkspaceComponentMeasureownername, "Owner Name");
	IsElementExists(CreateMeasurePage.cqlwrkspaceComponentMeasurelibraryname, "CQL Library Name");
	Thread.sleep(2000);
}

@Then("^I Select the searched Measure$")
public void select_searched_measure() throws Throwable {	
	click(CreateMeasurePage.searcheditem, "Searched Measure");
	Thread.sleep(2000);
}

@Then("^I Enter alias name for the measure$")
public void searched_measurealiasname() throws Throwable {	
	type(CreateMeasurePage.aliasmeasure3, "Test3", "Alias name");
	Thread.sleep(2000);
}

@Then("^I Delete the Measure error shows \"([^\"]*)\"$")
public void deleteMeasure_error_verification(String message) throws Throwable {	
	click(CreateMeasurePage.deletebtn_compositemeasure, "Delete Button");
	Thread.sleep(2000);
	String pass=config.getProperty("MatPassword");
	type(CreateMeasurePage.deletepassfeld, pass, "Password Field");
	Thread.sleep(2000);
	click(CreateMeasurePage.confirmbtn, "Confirm Button");
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.deletemsgcomponent, "can not be deleted as it has been used as a component measure");
}

@Then("^Verify the Measure cannot be deleted$")
public void Verify_the_MeasureCannot_be_deleted() throws Throwable {	
	IsElementExists(CreateMeasurePage.searchedMeasure, "The Measure Cannot be deleted");
}

@Then("^Delete the composite measure$")
public void Delete_the_composite_measure() throws Throwable {	
	click(CreateMeasurePage.deletebtn_compositemeasure, "Delete Button");
	Thread.sleep(2000);
	String pass=config.getProperty("MatPassword");
	type(CreateMeasurePage.deletepassfeld, pass, "Password Field");
	Thread.sleep(2000);
	click(CreateMeasurePage.confirmbtn, "Confirm Button");
	Thread.sleep(2000);
}

@Then("^Verify that, if the measure is removed as a component from all associated composite measures, the measure is able to be deleted as usual.$")
public void Removethe_component_then_verify_measure_deletion() throws Throwable {	
	click(CreateMeasurePage.deletebtn_compositemeasure, "Delete Button");
	Thread.sleep(2000);
	String pass=config.getProperty("MatPassword");
	type(CreateMeasurePage.deletepassfeld, pass, "Password Field");
	Thread.sleep(2000);
	click(CreateMeasurePage.confirmbtn, "Confirm Button");
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.successmsgDeletemeasure, "Measure successfully Measure");
	Thread.sleep(2000);
}
private String descriptiontext = "Text";
@Then("^Enter description and click save button$")
public void Enter_description_and_click_save_button() throws Throwable {	
	
	type(CreateMeasurePage.descriptionfield, descriptiontext, "Description field");
	Thread.sleep(2000);
	click(CreateMeasurePage.descriptionsavebutton, "Save Button");
	Thread.sleep(2000);
}

@Then("^Verify the entered description is saved$")
public void Verify_the_entered_descriptionIsSaved() throws Throwable {	
	verifyText(CreateMeasurePage.descriptionfield, descriptiontext, "Saved Description Information");
	Thread.sleep(2000);
	
}

@Then("^Verify successfully saved the user is presented with a green checkmark$")
public void Verify_the_entered_descriptionIsSaved_UserPresented_checkmark() throws Throwable {	
	IsElementExists(CreateMeasurePage.descriptionUserCheckmark, "User Presented Checkmark");
	Thread.sleep(2000);
	
}

@Then("^Verify Referance successfully saved the  user is presented with a green checkmark$")
public void Verify_the_entered_ReferanceIngomationIsSaved_UserPresented_checkmark() throws Throwable {	
	IsElementExists(CreateMeasurePage.referancecheckmarkuser, "User Presented Checkmark");
	Thread.sleep(2000);
	
}

@Then("^Click Edit Component Measure$")
public void Click_edit_component_measure() throws Throwable {	
	click(CreateMeasurePage.editcomponentmebtn, "Edit Component Measure");
	Thread.sleep(2000);
	
}


@Then("^I change measure scoring as \"([^\"]*)\"$")
public void then_i_change_composite_measure_scoring(String measure_scoring) throws Throwable {	
	
	selectByVisibleText(CreateMeasurePage.compositedetaileditmeasure, measure_scoring, "measure Scoring");
	Thread.sleep(2000);
}

private String measurescoring;
@Then("^I Change Measure details Measure Scoring \"([^\"]*)\"$")
public void then_i_change_measuredetails_measure_scoring(String measure_scoring) throws Throwable {	
	this.measurescoring = measure_scoring;
	selectByVisibleText(CreateMeasurePage.compositedetaileditmeasure, measurescoring, "measure Scoring");
	Thread.sleep(2000);
}


@Then("^Click No will close the message and leave the user on the General Measure Information tab$")
public void clickNo_button_user_in_generalinfo_page() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.compositedetaileditmeasure).getText();	
	if (actual !=measurescoring){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

@Then("^Click Yes will not save and navigate successfully$")
public void Click_yes_button_navigate_successfuly() throws Throwable {
	click(CreateMeasurePage.unsavedmeasureYesbtn, "Yes Button");
	Thread.sleep(1000);
	try {
	String actual=driver.findElement(By.xpath("//a[contains(text(),'Click to ')]")).getText();	
	String measure = "Click to view General Measure Information";
	if (actual.equals(measure)){
		
		Reporter.addStepLog("User Navigate successfully, and cannot change measure");
	} else {
		Reporter.addStepLog("Failed:- Verification failed");
	}
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		Reporter.addStepLog("Element Not Found");
	}
}

@Then("^Click Yes will not save the changes made to the text field.$")
public void Click_yes_button_User_willNotchangeThe_text_field() throws Throwable {
	click(CreateMeasurePage.unsavedmeasureYesbtn, "Yes Button");
	Thread.sleep(1000);
	try {
	String actual=driver.findElement(CreateMeasurePage.referanceinfofield).getText();	
	if (actual != ""){
		
		Reporter.addStepLog("Success: Will not save the change made to the text field");
	} else {
		Reporter.addStepLog("Failed:- Verification failed");
	}
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		Reporter.addStepLog("Element Not Found");
	}
}

private String steward;
@Then("^select Measure Steward List \"([^\"]*)\"$")
public void then_i_select_measure_steward(String measuresteward) throws Throwable {	
	this.steward = measuresteward;
	selectByVisibleText(CreateMeasurePage.selectstewardlist, steward, "measure steward");
	Thread.sleep(2000);
}


@Then("^Click No will close the message and leave the user on the Measure Steward / Developer$")
public void clickNo_button_user_in_stewardpage() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.selectstewardlist).getText();	
	if (!actual.equals(steward)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String desfield;
@Then("^Enter Description information \"([^\"]*)\"$")
public void I_Enter_description_information(String textfield) throws Throwable {
	this.desfield = textfield;
	type(CreateMeasurePage.descriptionfield, desfield, "Description Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Description page$")
public void clickNo_button_user_in_DescriptionField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.descriptionfield).getText();	
	if (actual.equals(desfield)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}


@Then("^I select Measure Type Efficiency$")
public void I_select_measure_type_efficiency() throws Throwable {
	click(CreateMeasurePage.measuretypeefficiency, "Efficiency");
	Thread.sleep(1000);
}

@Then("^Click No will close the message and leave the user on the Measure Type page$")
public void clickNo_button_user_in_Measure_Type() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	WebElement element = driver.findElement(CreateMeasurePage.measuretypeefficiency);
	if (element.isSelected()){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String stratif;
@Then("^Enter Stratification information \"([^\"]*)\"$")
public void I_Enter_Stratification_information(String stratif) throws Throwable {
	this.stratif = stratif;
	type(CreateMeasurePage.Stratification, stratif, "Stratification Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Stratification page$")
public void clickNo_button_user_in_Stratificationfield() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.Stratification).getText();	
	if (actual.equals(stratif)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String adjestment;
@Then("^Enter Risk Adjustment information \"([^\"]*)\"$")
public void I_Enter_riskadjestment_information(String adjestment) throws Throwable {
	this.adjestment = adjestment;
	type(CreateMeasurePage.RiskAdjustmenttextfield, adjestment, "Risk Adjustment Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Risk Adjustment page$")
public void clickNo_button_user_in_riskAdjustmentfield() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.RiskAdjustmenttextfield).getText();	
	if (actual.equals(adjestment)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String aggregation;
@Then("^Enter Rate Aggregation information \"([^\"]*)\"$")
public void I_Enter_rateaggregation_information(String aggregation) throws Throwable {
	this.aggregation = aggregation;
	type(CreateMeasurePage.rateaggregationtextfield, aggregation, "Rate Aggregation Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Rate Aggregation page$")
public void clickNo_button_user_in_rateAggregationField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.rateaggregationtextfield).getText();	
	if (actual.equals(aggregation)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String rational;
@Then("^Enter Rationale information \"([^\"]*)\"$")
public void I_Enter_rational_information(String rational) throws Throwable {
	this.rational = rational;
	type(CreateMeasurePage.Rationaletextfield, rational, "Rationalen Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Rationale page$")
public void clickNo_button_user_in_RationaleField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.Rationaletextfield).getText();	
	if (actual.equals(rational)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String clinicalinfo;
@Then("^Enter Clinical Recommendation information \"([^\"]*)\"$")
public void I_Enter_clinical_information(String clinicalinfo) throws Throwable {
	this.clinicalinfo = clinicalinfo;
	type(CreateMeasurePage.clinicalrecotextfield, clinicalinfo, "Clinical Recommendation Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Clinical Recommendation page$")
public void clickNo_button_user_in_clinicalField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.clinicalrecotextfield).getText();	
	if (actual.equals(clinicalinfo)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String impnotation;
@Then("^Enter Improvement Notation \"([^\"]*)\"$")
public void I_Enter_impnotation_information(String impnotation) throws Throwable {
	this.impnotation = impnotation;
	type(CreateMeasurePage.improvementnotationtextfield, impnotation, "Improvement Notation Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Improvement Notation page$")
public void clickNo_button_user_in_impnotationField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.improvementnotationtextfield).getText();	
	if (actual.equals(impnotation)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String definition;
@Then("^Enter Definition \"([^\"]*)\"$")
public void I_Enter_definition_information(String definition) throws Throwable {
	this.definition = definition;
	type(CreateMeasurePage.definitiontextfield, definition, "Definition Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Definition page$")
public void clickNo_button_user_in_definitionField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.definitiontextfield).getText();	
	if (actual.equals(definition)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String reference;
@Then("^Enter References information \"([^\"]*)\"$")
public void I_Enter_reference_information(String reference) throws Throwable {
	this.reference = reference;
	type(CreateMeasurePage.referanceinfofield, reference, "References Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the References page$")
public void clickNo_button_user_in_referenceField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.referanceinfofield).getText();	
	if (actual.equals(reference)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String gudiance;
@Then("^Enter Guidance \"([^\"]*)\"$")
public void I_Enter_gudiance_information(String gudiance) throws Throwable {
	this.gudiance = gudiance;
	type(CreateMeasurePage.guidancetextfield, gudiance, "Guidance Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Guidance page$")
public void clickNo_button_user_in_gudianceField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.guidancetextfield).getText();	
	if (actual.equals(gudiance)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String transmission;
@Then("^Enter Transmission Format \"([^\"]*)\"$")
public void I_Enter_transmission_information(String transmission) throws Throwable {
	this.transmission = transmission;
	type(CreateMeasurePage.transmissiontextfield, transmission, "Transmission Format Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Transmission Format page$")
public void clickNo_button_user_in_transmissionFormatField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.transmissiontextfield).getText();	
	if (actual.equals(transmission)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String supplement;
@Then("^Enter Supplemental Data Elements \"([^\"]*)\"$")
public void I_Enter_supplementn_information(String supplement) throws Throwable {
	this.supplement = supplement;
	type(CreateMeasurePage.supplementtextfield, supplement, "Supplemental Data Elements Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Supplemental Data Elements page$")
public void clickNo_button_user_in_supplementField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.supplementtextfield).getText();	
	if (actual.equals(supplement)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String initialpopulation;
@Then("^Enter Initial Population \"([^\"]*)\"$")
public void I_Enter_initialpopulation_information(String initialpopulation) throws Throwable {
	this.initialpopulation = initialpopulation;
	type(CreateMeasurePage.InitialPopulationtextfield, initialpopulation, "Initial Population Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Initial Population page$")
public void clickNo_button_user_in_initialpopulationField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.InitialPopulationtextfield).getText();	
	if (actual.equals(initialpopulation)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String denominator;
@Then("^Enter Denominator \"([^\"]*)\"$")
public void I_Enter_denominator_information(String denominator) throws Throwable {
	this.denominator = denominator;
	type(CreateMeasurePage.denominatortextfield, denominator, "Denominator Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Denominator page$")
public void clickNo_button_user_in_denominatorField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.denominatortextfield).getText();	
	if (actual.equals(denominator)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String denominatorexclu;
@Then("^Enter Denominator Exclusions \"([^\"]*)\"$")
public void I_Enter_denominatorexclu_information(String denominatorexclu) throws Throwable {
	this.denominatorexclu = denominatorexclu;
	type(CreateMeasurePage.denominatortextfieldexclusion, denominatorexclu, "Denominator Exclusions Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Denominator Exclusions page$")
public void clickNo_button_user_in_denominatorexcluField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.denominatortextfieldexclusion).getText();	
	if (actual.equals(denominatorexclu)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String numerator;
@Then("^Enter Numerator \"([^\"]*)\"$")
public void I_Enter_numerator_information(String numerator) throws Throwable {
	this.numerator = numerator;
	type(CreateMeasurePage.numeratortextfield, numerator, "Numerator Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Numerator page$")
public void clickNo_button_user_in_numeratorField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.numeratortextfield).getText();	
	if (actual.equals(numerator)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String denominatorexcep;
@Then("^Enter Denominator Exceptions \"([^\"]*)\"$")
public void I_Enter_denominatorexcep_information(String denominatorexcep) throws Throwable {
	this.denominatorexcep = denominatorexcep;
	type(CreateMeasurePage.denominatorexceptiontextfield, denominatorexcep, "Denominator Exceptions Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Denominator Exceptions page$")
public void clickNo_button_user_in_denominatorexcepfield() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.denominatorexceptiontextfield).getText();	
	if (actual.equals(denominatorexcep)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}


private String measurepopul;
@Then("^Enter Measure Population \"([^\"]*)\"$")
public void I_Enter_measurepopul_information(String measurepopul) throws Throwable {
	this.measurepopul = measurepopul;
	type(CreateMeasurePage.measurepopulationtextfield, measurepopul, "Measure Population Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Measure Population page$")
public void clickNo_button_user_in_measurepopulfield() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.measurepopulationtextfield).getText();	
	if (actual.equals(measurepopul)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String measurepopulexclu;
@Then("^Enter Measure Population Exclusions \"([^\"]*)\"$")
public void I_Enter_measurepopulexclu_information(String measurepopulexclu) throws Throwable {
	this.measurepopulexclu = measurepopulexclu;
	type(CreateMeasurePage.measurepopulationexclusiontextfield, measurepopulexclu, "Measure Population Exclusions Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Measure Population Exclusions page$")
public void clickNo_button_user_in_measurepopulexclufield() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.measurepopulationexclusiontextfield).getText();	
	if (actual.equals(measurepopulexclu)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

private String measureobservation;
@Then("^Enter Measure Observations \"([^\"]*)\"$")
public void I_Enter_measureobservation_information(String measureobservation) throws Throwable {
	this.measureobservation = measureobservation;
	type(CreateMeasurePage.measureobservationtextfield, measureobservation, "Measure Observations Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Measure Observations page$")
public void clickNo_button_user_in_measureobservationfield() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.measureobservationtextfield).getText();	
	if (actual.equals(measureobservation)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

@Then("^I Click Save button Verify the Success Message \"([^\"]*)\"$")
public void Verify_measuredetails_changeMessage(String errormessahe) throws Throwable {
	try {
	click(CreateMeasurePage.savebutton, "Save Button");
	Thread.sleep(3000);
	verifyText(CreateMeasurePage.changesuccessmessage, errormessahe, errormessahe);
	
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
		Reporter.addStepLog("Element Not Found");
	}
	
}

@Then("^Enter References information \"([^\"]*)\" and click save button$")
public void I_Enter_referance_information(String referance) throws Throwable {
	clear(CreateMeasurePage.referanceinfofield, "References Field");
	Thread.sleep(1000);
	type(CreateMeasurePage.referanceinfofield, referance, "References Field");
	Thread.sleep(2000);
	click(CreateMeasurePage.savebutton, "Save Button");
	Thread.sleep(2000);	
}

@Then("^Verify that the table column Description Edit and Delete$")
public void Verify_referance_column_details() throws Throwable {	
	IsElementExists(CreateMeasurePage.refe_col_desc, "Column Description label");
	IsElementExists(CreateMeasurePage.refe_col_edit, "Column edit label");
	IsElementExists(CreateMeasurePage.refe_col_desc, "Column delete label");
}

@Then("^Verify that edit and delete icon and User information text field$")
public void Verify_fields_in_referance() throws Throwable {	
	IsElementExists(CreateMeasurePage.refe_icon_edit, "Edit Button");
	IsElementExists(CreateMeasurePage.refe_icon_delete, "Delete Button");
	IsElementExists(CreateMeasurePage.referanceinfofield, "References Information Field");
}

@Then("^Verify the Item added in the table$")
public void Verify_successfully_added_in_table() throws Throwable {	
	IsElementExists(CreateMeasurePage.refer_item_table, "Referance Table Item Table");
	Thread.sleep(1000);
}

@Then("^Verify The information text area is clear and ready for the next entry$")
public void Verify_the_information_field_is_cleard_ready_for_the_next_entry() throws Throwable {	
	String textarea = driver.findElement(CreateMeasurePage.referanceinfofield).getText();
	if(textarea.equals(""))
	{
		Reporter.addStepLog("The text field is cleared and ready for the next entry");
		Thread.sleep(1000);
	}
}

@Then("^Verify Click edit icon then text of that reference back into the text area$")
public void Click_edit_icon_then_test_back_to_text_area() throws Throwable {	
	click(CreateMeasurePage.refe_edit_icon_1, "Edit icon");
	Thread.sleep(2000);
	String textarea = driver.findElement(CreateMeasurePage.referanceinfofield).getText();
	if(!textarea.equals(""))
	{
		Reporter.addStepLog("The text of that reference back into the text area ");
		Thread.sleep(1000);
	}
}

@Then("^Click delete button$")
public void Click_reference_delete_icon() throws Throwable {	
	click(CreateMeasurePage.refe_delete_icon_1, "Delete icon");
	Thread.sleep(2000);
}

@Then("^I see the buttom Yes and No$")
public void Verify_button_yes_or_no() throws Throwable {	
	IsElementExists(CreateMeasurePage.refe_delete_iconYesBtn, "Yes Button");
	IsElementExists(CreateMeasurePage.refe_delete_iconNobtn, "No button");
	
}

@Then("^Click No Button verify leave the message$")
public void Click_reference_Delete_No_button() throws Throwable {	
	click(CreateMeasurePage.refe_delete_iconNobtn, "Delete No button");
	Thread.sleep(2000);
	
}

@Then("^Click Yes button delete the referance$")
public void Click_reference_Delete_Yes_button() throws Throwable {	
	click(CreateMeasurePage.refe_delete_iconYesBtn, "Delete Yes button");
	Thread.sleep(2000);
	
}

private String numeratorexcl;
@Then("^Enter Numerator Exclusions \"([^\"]*)\"$")
public void I_Enter_numeratorexcl_information(String numeratorexcl) throws Throwable {
	this.numeratorexcl = numeratorexcl;
	type(CreateMeasurePage.numeratorexclosiontextfield, numeratorexcl, "Numerator Exclusions Field");
	Thread.sleep(2000);
}

@Then("^Click No will close the message and leave the user on the Numerator Exclusions page$")
public void clickNo_button_user_in_numeratorexclField() throws Throwable {
	
	click(CreateMeasurePage.unsavedmeasureNobtn, "No button");
	Thread.sleep(2000);
	String actual=driver.findElement(CreateMeasurePage.numeratorexclosiontextfield).getText();	
	if (actual.equals(numeratorexcl)){
		
		Reporter.addStepLog("User in current page and successfully saved");
	} else {
		Reporter.addStepLog("Failed:- Verification Failed");
	}
	Thread.sleep(1000);
}

@Then("^I Click Measure details save button$")
public void Click_save_button_in_composite_measure() throws Throwable {	
	click(CreateMeasurePage.savebutton, "Save Button");
	Thread.sleep(2000);
}

@Then("^Verify user is presented Warning message$")
public void Verify_user_is_presented_warning_message() throws Throwable {	
	String expect = "Changing the 'Composite Scoring Method' and/or the 'Measure Scoring' will have the following impacts:";
	String expect1 = "Populations in the Population Workspace that do not apply to the new settings will be deleted.";
	String expect2 = "Existing Groupings in the Measure Packager will be deleted..";
	String expect3 = "The Patient-based Measure field will be reset to its default status for the scoring selected.";
	String expect4 = "Do you want to continue?";
	String text = driver.findElement(CreateMeasurePage.compositedetaileditmeasuresavewarn).getText();
	Reporter.addStepLog("AA="+text);
	verifyText(CreateMeasurePage.compositedetaileditmeasuresavewarn, expect, "Changing the 'Composite Scoring Method' and/or the 'Measure Scoring' will have the following impacts:");
	Thread.sleep(2000);
	verifyText(CreateMeasurePage.compositedetaileditmeasuresavewarn1, expect1, "Populations in the Population Workspace that do not apply to the new settings will be deleted.");
	Thread.sleep(2000);
	verifyText(CreateMeasurePage.compositedetaileditmeasuresavewarn2, expect2, "Existing Groupings in the Measure Packager will be deleted..");
	Thread.sleep(2000);
	verifyText(CreateMeasurePage.compositedetaileditmeasuresavewarn3, expect3, "The Patient-based Measure field will be reset to its default status for the scoring selected.");
	Thread.sleep(2000);
	verifyText(CreateMeasurePage.compositedetaileditmeasuresavewarn4, expect4, "Do you want to continue?");
	Thread.sleep(2000);
}

@Then("^Verify the button Yes and No$")
public void Verify_yes_and_no_button() throws Throwable {	
	IsElementExists(CreateMeasurePage.compositedetaileditmeasuresaveyes, "Yes Button");
	Thread.sleep(2000);
	IsElementExists(CreateMeasurePage.compositedetaileditmeasuresaveno, "No Button");
	Thread.sleep(2000);
}

@Then("^Click No button$")
public void Clicking_no_button() throws Throwable {	
	click(CreateMeasurePage.compositedetaileditmeasuresaveno, "No Button");
	Thread.sleep(2000);
}

@Then("^Verify that the Heading Measure Name, Alias name and Version$")
public void Verify_that_measure_detailsComponentMeasure() throws Throwable {	
	IsElementExists(CreateMeasurePage.measurenamehead_compo_detail, "Measure Name");
	Thread.sleep(1000);
	IsElementExists(CreateMeasurePage.alias_compo_detail, "Alias");
	Thread.sleep(1000);
	IsElementExists(CreateMeasurePage.version_compo_detail, "Version");
	Thread.sleep(1000);
}

@Then("^Verify the Edit Button titled \"([^\"]*)\"$")
public void Verify_component_measure_edit_button_title(String title) throws Throwable {	
	verifyText(CreateMeasurePage.editcomponentmebtn, title, title);
	Thread.sleep(2000);
}

@Then("^I Search Component Measure$")
public void search_componentMeasure_in_editComponent() throws Throwable {	
	click(CreateMeasurePage.editcomponentmeshSearchbtn, "Search Button");
	Thread.sleep(2000);
}

@Then("^Verify that the list of returned results displays \"([^\"]*)\" and then paginates the remaining.$")
public void Verify_fifteen_items_are_displayed(int number) throws Throwable {

		List<WebElement> element = driver.findElements(CQLWorkspacepage.appliedvaluesettabledata);
		String strArray[] = new String[element.size()];
		int i;
		int a=0;
		for (i=0; i<element.size();i++)
		{
			Reporter.addStepLog("Retriver the table data:- "+element.get(i).getText());
			strArray[i] = element.get(i).getText();
			
		}
		number=number+1;
		a = a+i;
	
}


}

