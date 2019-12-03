package stepdefinitions;

import java.io.IOException;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfterHooks extends AbstractTestBase {
	
	@After
	public void afterScenario(Scenario scenario) throws IOException {
		System.out.println("In @After..." + this.getClass().getSimpleName() + " class " + scenario.getName() + " scenario " );
		forAfterScen(scenario);
		
	}

	@Before()
	public void beforeScenario(Scenario scenario)	{
		System.out.println("In @Before..." + this.getClass().getSimpleName() + " class " + scenario.getName() + " scenario " );
		forBeforeScen(scenario);
		Reporter.assignAuthor("MAT");
	}
}
