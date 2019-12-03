package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import engine.ActionEngine;
import pages.CreateMeasurePage;
import pages.PopulationWorkspacePage;
import pages.PplWrkSpace;

public class PopulationWorkspace extends ActionEngine {
	
	@Then("^I select population workspace$")
	public void select_population_workpspace() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		click(PopulationWorkspacePage.tabPopulationWorkspace, "Select population workspace");
		Thread.sleep(2000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	@Then("^Click on initial population select \"([^\"]*)\" save$")
	public void click_initial_population(String initial) throws Throwable {
		click(PopulationWorkspacePage.initial_populationWorkspace, "Click initial population ");
		Thread.sleep(3000);
		selectByVisibleText(PopulationWorkspacePage.initial_dropdown, initial, "initial population drop down");
		Thread.sleep(2000);
		click(PopulationWorkspacePage.initial_save_button, "Click initial save button");
		Thread.sleep(2000);

	}
	
	@Then("^Click on Denominators select \"([^\"]*)\" save$")
	public void click_denominator_and_select(String demominator) throws Throwable {
		if(!driver.findElements(PopulationWorkspacePage.denominator_populationWorkspace).isEmpty()) {
		click(PopulationWorkspacePage.denominator_populationWorkspace, "Denominator");
		Thread.sleep(3000);
		selectByVisibleText(PopulationWorkspacePage.denominator_dropdown, demominator, "Denominator drop down");
		Thread.sleep(2000);
		click(PopulationWorkspacePage.denominator_save_button, "Click denominator save button");
		Thread.sleep(2000);
		}
	}
	
	@Then("^Click on numerator select \"([^\"]*)\" save$")
	public void click_numerator_and_select(String numerator) throws Throwable {
		if(!driver.findElements(PopulationWorkspacePage.numerator_populationWorkspace).isEmpty()) {
		click(PopulationWorkspacePage.numerator_populationWorkspace, "Numerator");
		Thread.sleep(3000);
		selectByVisibleText(PopulationWorkspacePage.numerator_dropdown, numerator, "numerator drop down");
		Thread.sleep(2000);
		click(PopulationWorkspacePage.numerator_save_button, "Click numerator save button");
		Thread.sleep(2000);
		}
	}
	
	@Then("^Click on measure packager move all three to righ side$")
	public void click_measure_packager() throws Throwable {
		click(PopulationWorkspacePage.tabMeasurePackager, "Click  measure packager");
		Thread.sleep(3000);
	    click(PopulationWorkspacePage.groupingbtn, "Click grouping button");
		Thread.sleep(3000);

	}
	
	@Then("^Click on save grouping$")
	public void click_save_grouping() throws Throwable {
		click(CreateMeasurePage.save_grouping, "save grouping");
		Thread.sleep(2000);
	}
	
	@Then("^verify success message$")
	public void verify_grouping_success_message() throws Throwable {
		String actual=driver.findElement(CreateMeasurePage.SavedMessage).getText();
		String expected="Grouping has been saved.";
		if(actual.contains(expected))
		{
			System.out.println("Successfully saved  grouping"); 
			Reporter.addStepLog("Successfully saved  grouping");
		}
		else
		{
			System.out.println("Failed grouping");
			Reporter.addStepLog("Failed grouping");
		}
		Thread.sleep(2000);
		
	}
	
	@Then("^I click on Denominators link$")
	public void i_click_on_Denominators_link() throws Throwable {
		click(PopulationWorkspacePage.lnkDenominator, "Click on Denominators Tab");
	}
	
	@Then("^I verify Denominators view$")
	public void i_verify_Denominators_view() throws Throwable {
		IsElementExists(PopulationWorkspacePage.btnDeAdd,"Add New Button");
		IsElementExists(PopulationWorkspacePage.btnDeSave,"Save Button");
		IsElementExists(PopulationWorkspacePage.seleDeDef1,"Select definition ");
		IsElementExists(PopulationWorkspacePage.btnDeDel1,"Delete Button ");
		IsElementExists(PopulationWorkspacePage.btnViewDeHR1,"View Human readable button ");
	}
	
	@Then("^I click on Denominator Exclusions link$")
	public void i_click_on_Denominator_Exclusions_link() throws Throwable {
		click(PopulationWorkspacePage.lnkDenominatoExclu, "Click on Denominators Tab");
	}
	
	@Then("^I verify Denominator Exclusions view$")
	public void i_verify_Denominator_Exclusions_view() throws Throwable {
		IsElementExists(PopulationWorkspacePage.btnDeExcluAdd,"Add New Button");
		IsElementExists(PopulationWorkspacePage.btnDeExcluSave,"Save Button");
		IsElementExists(PopulationWorkspacePage.seleDeExcluDef1,"Select definition ");
		IsElementExists(PopulationWorkspacePage.btnDeExcluDel1,"Delete Button ");
		IsElementExists(PopulationWorkspacePage.btnViewDeExcluHR1,"View Human readable button ");
	}
	
	@Then("^I see Cohort Population Workspace$")
	public void i_see_Cohort_Population_Workspace() throws Throwable {
		IsElementExists(PopulationWorkspacePage.lnkIntialPopulation,"Intial populations");
		IsElementExists(PopulationWorkspacePage.lnkStratification,"Stratification");
		IsElementExists(PopulationWorkspacePage.lnkViewPopulations,"View Population");
	}
	
	@Then("^I see Proportion Population Workspace$")
	public void i_see_Proportion_Population_Workspace() throws Throwable {
		IsElementExists(PopulationWorkspacePage.lnkIntialPopulation,"Intial populations");
		IsElementExists(PopulationWorkspacePage.lnkNumerators,"Numerators");
		IsElementExists(PopulationWorkspacePage.lnkNumeratorExclusion,"Numerators Exclusion");
		IsElementExists(PopulationWorkspacePage.lnkDenominator,"Denominators");
		IsElementExists(PopulationWorkspacePage.lnkDenominatoExclu,"Denominators Exclusions");
		IsElementExists(PopulationWorkspacePage.lnkDenominatoException,"Denominators Exception");
		IsElementExists(PopulationWorkspacePage.lnkStratification,"Stratification");
		IsElementExists(PopulationWorkspacePage.lnkViewPopulations,"View Population");
	}
	
	@Then("^I see  CV Population Workspace$")
	public void i_see_CV_Population_Workspace() throws Throwable {
		IsElementExists(PopulationWorkspacePage.lnkIntialPopulation,"Intial populations");
		IsElementExists(PopulationWorkspacePage.lnkMeasurePopulations,"Measure populations");
		IsElementExists(PopulationWorkspacePage.lnkMeasurePopulationsExclu,"Measure populations Exclusion");
		IsElementExists(PopulationWorkspacePage.lnkMeasureObservations,"Measure Observation");
		IsElementExists(PopulationWorkspacePage.lnkStratification,"Stratification");
		IsElementExists(PopulationWorkspacePage.lnkViewPopulations,"View Population");
	}
	
	@Then("^I see  Ratio Population Workspace$")
	public void i_see_Ratio_Population_Workspace() throws Throwable {
		IsElementExists(PopulationWorkspacePage.lnkIntialPopulation,"Intial populations");
		IsElementExists(PopulationWorkspacePage.lnkNumerators,"Numerators");
		IsElementExists(PopulationWorkspacePage.lnkNumeratorExclusion,"Numerators Exclusion");
		IsElementExists(PopulationWorkspacePage.lnkDenominator,"Denominators");
		IsElementExists(PopulationWorkspacePage.lnkDenominatoExclu,"Denominators Exclusions");
		IsElementExists(PopulationWorkspacePage.lnkMeasureObservations,"Measure Observation");
		IsElementExists(PopulationWorkspacePage.lnkStratification,"Stratification");
		IsElementExists(PopulationWorkspacePage.lnkViewPopulations,"View Population");
	}
	
	
	@Then("^I click on IntiaL Population link$")
	public void i_click_on_IntiaL_Population_link() throws Throwable {
		click(PopulationWorkspacePage.lnkIntialPopulation, "Click on Intial Populations");
		Thread.sleep(2000);
	}

	
	@Then("^I verify Intial Population view$")
	public void i_verify_Intial_Population_view() throws Throwable {
	    
		IsElementExists(PopulationWorkspacePage.btnIPAdd,"Add New Button");
		IsElementExists(PopulationWorkspacePage.btnIPSave,"Save Button");
		IsElementExists(PopulationWorkspacePage.seleInDef1,"Select definition ");
		IsElementExists(PopulationWorkspacePage.btnInDel1,"Delete Button ");
		IsElementExists(PopulationWorkspacePage.btnViewIPHR1,"View Human readable button ");
	}
	
	@Then("^I click on Numerator Link$")
	public void i_click_on_Numerator_Link() throws Throwable {
		click(PopulationWorkspacePage.lnkNumerators, "Click on Numerators Tab");
	}
	
	@Then("^I verify Numerator view$")
	public void i_verify_Numerator_view() throws Throwable {
		IsElementExists(PopulationWorkspacePage.btnNuAdd,"Add New Button");
		IsElementExists(PopulationWorkspacePage.btnNuSave,"Save Button");
		IsElementExists(PopulationWorkspacePage.seleNuDef1,"Select definition ");
		IsElementExists(PopulationWorkspacePage.btnNuDel1,"Delete Button ");
		IsElementExists(PopulationWorkspacePage.btnViewNuHR1,"View Human readable button ");
	}
	
	@Then("^I click on Numerator exclusion link$")
	public void i_click_on_Numerator_exclusion_link() throws Throwable {
		click(PopulationWorkspacePage.lnkNumeratorExclusion, "Click on Numerators Tab");
	}
	
	@Then("^I verify Numerator exclusion view$")
	public void i_verify_Numerator_exclusion_view() throws Throwable {
		IsElementExists(PopulationWorkspacePage.btnNuExcluAdd,"Add New Button");
		IsElementExists(PopulationWorkspacePage.btnNuExcluSave,"Save Button");
		IsElementExists(PopulationWorkspacePage.seleNuExcluDef1,"Select definition ");
		IsElementExists(PopulationWorkspacePage.btnNuDel1,"Delete Button ");
		IsElementExists(PopulationWorkspacePage.btnViewNuExcluHR1,"View Human readable button ");
	}
	
	

}
