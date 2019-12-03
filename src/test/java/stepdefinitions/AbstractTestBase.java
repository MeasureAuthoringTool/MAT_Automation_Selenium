package stepdefinitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import tests.CukesRunnerTest;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;

public abstract class AbstractTestBase extends CukesRunnerTest{
	
	
	public void forBeforeScen(Scenario scenario)
	{
//		logger=report.startTest(scenario.getName());
	}

	
	public void forAfterScen(Scenario scenario) throws IOException
	{			
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);
			
				File destinationPath = new File(System.getProperty("user.dir") + "\\Report\\" + screenshotName+ timeStamp() + ".png");
				
				Files.copy(sourcePath, destinationPath);   
 
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
				Reporter.addScenarioLog(screenshotName);
			} catch (IOException e) {
			} 
		}
	}
}

