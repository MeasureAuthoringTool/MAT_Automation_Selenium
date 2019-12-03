package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateMeasurePage;
import pages.MeasureLibrary;

public class CreateContinuousMeasure extends AbstractTestBase {
	
	
	@When("^I click on create button$")
	public void i_click_on_create_button() throws Throwable {
		Thread.sleep(3000);
		jclick(CreateMeasurePage.btnCreate, "Create button");
		Thread.sleep(3000);
	}
	
	@Then("^I see create new measure screen$")
	public void i_see_create_new_measure_screen() throws Throwable {
		IsElementExists(CreateMeasurePage.lblCreateNewMeasure, "Create New Measure label");
	}

	
	@Then("^I add three new measure types$")
	public void i_add_three_new_measure_types() throws Throwable {
		Thread.sleep(3000);
		click(MeasureLibrary.measureType, "Measure Type table");
		Thread.sleep(3000);
	   click(MeasureLibrary.chkboxMeasureType1, "Patient reported outcome performance");
	   click(MeasureLibrary.chkboxMeasureType2, "Intermediate clinical outcome");
	   click(MeasureLibrary.chkboxMeasureType3, "Appropriate use process");
	   Thread.sleep(1000);
	   click(MeasureLibrary.btnSaveGeneralInfo, "Save the Measure Details section");
	}
	
	
	

}
