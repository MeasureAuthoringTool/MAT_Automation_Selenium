

package engine;

import Utilities.ConfiguratorSupport;
import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestEngine {	

	public  String projectBaseDirectory;	
	public static  ConfiguratorSupport conf;
	public static String Browser = null;
	public static String cloudUserName = null;
	public static String cloudUserTokenKey = null;
	public static ConfiguratorSupport config = new ConfiguratorSupport("config.properties");
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriver driver;
	private static Scenario currentScenario;

	@BeforeSuite
	public void setUp() throws IOException, AWTException
	{
		DesiredCapabilities caps;
		String downloadPath = "C:\\Users\\rreddy\\Downloads\\CMSv0.xlsx";
		try {
    	File del = new File(downloadPath);
    	if(del.delete())
    	{
    		//System.out.println("C:\\Users\\rreddy\\Downloads\\CMSv0.xlsx File deleted");
    		Reporter.addStepLog("C:\\Users\\rreddy\\Downloads\\CMSv0.xlsx File deleted");
    	}
    	else
    	{
    		//System.out.println("C:\\Users\\rreddy\\Downloads\\CMSv0.xlsx doesn't exists");
    		Reporter.addStepLog("C:\\Users\\rreddy\\Downloads\\CMSv0.xlsx doesn't exists");
    	}
		}catch(Exception e) {
		
	}
		
		File file = new File("Report");
		File[] files = file.listFiles();
		for(File f:files)
		{
			if(f.isFile() && f.exists())
			{
				f.delete();
			}
		}
		

		if (config.getProperty("Environment") != null){
			Browser=config.getProperty("Environment");
			System.out.println(Browser);
			switch (Browser) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
				ProfilesIni profile = new ProfilesIni();
				FirefoxProfile seleniumProfile = profile.getProfile("SeleniumAutomation");
				FirefoxOptions firefoxOptions = new FirefoxOptions();
			    firefoxOptions.setProfile(seleniumProfile);


				driver = new FirefoxDriver(firefoxOptions);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();

				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", new File("Driver\\IEDriverServer.exe").getAbsolutePath());

				DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
				capab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				capab.setJavascriptEnabled(true);
				capab.setCapability("ignoreZoomSetting", true);
				capab.setCapability("nativeEvents",false);
				driver = new InternetExplorerDriver(capab);
				driver.manage().window().maximize();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", new File("Driver/chromedriver").getAbsolutePath());




				ChromeOptions options = new ChromeOptions();
				options.addArguments("test-type");
				options.addArguments("--whitelist-ip *");
				options.addArguments("--proxy-server='direct://'");
				options.addArguments("--proxy-bypass-list=*");

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;

			
			default:
				System.out.println("None of the cases are selected");
				break;
			}
			int tet =1;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else
		{
			System.out.println("Browser is not selected");
		}

	}

	@BeforeTest
	public void beforeTest(){
		
	}

	@AfterTest
	public void afterTest() throws Exception{
		Thread.sleep(3000);
		
	}

	@AfterSuite
	public void tearDown() 
	{
//		driver.quit(); 
	}
	public static String timeStamp(){
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date date=new Date();
		return (((dateFormat.format(date)).replace("/", "_")).replace(":", "_")).replace(" ", "_");
	}

	public static String dateStamp(){
			
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
			
			Date date=new Date();
			return (((dateFormat.format(date)).replace("/", "_")).replace(":", "_")).replace(" ", "_");
		}

}

