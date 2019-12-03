package tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.File;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import engine.ActionEngine;


@CucumberOptions (
		monochrome = true,
//		features = {
//
//			"src/test/java/features/01smoke.feature",
//	        "src/test/java/features/02smoke_MeasureLibrary_Different_attribute.feature",
//		    "src/test/java/features/03smoke.feature",
//			"src/test/java/features/04smoke.feature",
//			"src/test/java/features/05smoke_BonnieSignIn.feature",
//			"src/test/java/features/06smoke_sprint 147.feature",
//			"src/test/java/features/07smoke_Sprint150,151,152.feature",
//			"src/test/java/features/08smoke_CompositeMeasure.feature",
//		   "src/test/java/features/09smoke_Sprint 155.feature",
//			"src/test/java/features/10smoke_Sprint 148_149.feature",
//	 		"src/test/java/features/11smoke_Sprint 156,157.feature",
//			"src/test/java/features/12smoke_Sprint 158.feature",
//			"src/test/java/features/13smoke_Sprint 159.feature",
//			"src/test/java/features/14smoke_Sprint 125.feature",
//
//
//					},

		
		
		
		
			features = {

					"src/test/java/features/01smoke.feature",
					},
		
		
			
		glue = "stepdefinitions",
		format = {"pretty", "html:target/cucumber-html-report"},
		
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:Report/cucumber-reports.html"},
		tags = "@mat",
			strict=true	
		)

public class CukesRunnerTest extends ActionEngine {
	
	@Test
	public void runCukes() {
		System.out.println("new change");
		new TestNGCucumberRunner(getClass()).runCukes();
	}
	
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setProjectName("MAT");
        Reporter.setSystemInfo("User", "Tester");
        Reporter.setSystemInfo("Project Name", "MAT");
    }
	
}
