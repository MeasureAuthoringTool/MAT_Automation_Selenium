package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.description.annotation.AnnotationValue.Loaded;
import pages.CreateMeasurePage;
import pages.LoginPageUMLS;

public class LoginULMS extends AbstractTestBase{
	
	@Given("^I launch MAT QA Website$")
	public void i_launch_MAT_QA_Website_https_mat_test_mat_us_MeasureAuthoringTool_Login_html() throws Throwable {
        driver.manage().deleteAllCookies();
		driver.get("https://matdev.semanticbits.com/MeasureAuthoringTool/Login.html");
		//waitForElementToBClickable(CreateMeasurePage.search_measure_btn, "Website Launch");
		Thread.sleep(4000);
	}

	@Given("^I should login page$")
	public void i_should_login_page() throws Throwable {

		IsElementExists(By.xpath("//*[contains(text(),'Please Sign In')]"), "Please sign in section");

	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_Username_password_Security_code(String username, String password, String securityCode) throws Throwable {
		String  username1= config.getProperty("MatUsername");
		String  Pwd1= config.getProperty("MatPassword");
		type(LoginPageUMLS.txtUserName, username1, "User ID");
		type(LoginPageUMLS.txtPassword, Pwd1, "Password");
		type(LoginPageUMLS.txtAuthCode, securityCode, "Security Code");
		click(LoginPageUMLS.btnLogin, "Login button");
		Thread.sleep(5000);
	}

	@Given("^I clicked Sign into UMLS$")
	public void i_see_CQL_Workspace() throws Throwable {
		click(LoginPageUMLS.linkSigninUMLS, "Click Sign intp UMLS");
	    Thread.sleep(5000);	

	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_Umls_Username_Umls_Pwd(String username, String password) throws Throwable {
		Thread.sleep(4000);
		String  username1= config.getProperty("UMLSUsername");
		String  Pwd1= config.getProperty("UMLSPassword");
		type(LoginPageUMLS.txtULMSUserName, username1, "ULMS Username" );
		type(LoginPageUMLS.txtULMSPassword, Pwd1, "ULMS Password" );
		click(LoginPageUMLS.btnSignIn, "Sign in button");
		Thread.sleep(3000);
		
		click(LoginPageUMLS.btnumlscontinu, "Continue button");
		Thread.sleep(3000);

	}
	
	@When("^I clik on signout link$")
	public void i_clik_on_signout_link() throws Throwable {

		Thread.sleep(4000);
		click(LoginPageUMLS.profile, "Profile");
	Thread.sleep(4000);
	click(LoginPageUMLS.linkSignOut, "Sign out");
	Thread.sleep(3000);
	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
