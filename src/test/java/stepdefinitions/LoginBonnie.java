package stepdefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import engine.ActionEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import pages.LoginPageUMLS;
import pages.MeasureLibrary;

import java.io.File;


public class LoginBonnie extends ActionEngine {
	
	@Then("^I verify Bonnie login deactive then sign into bonnie")
	public void signInBonnie() throws Throwable {
		if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
		{
			Reporter.addStepLog("Bonnie is inactive");
			click(LoginPageUMLS.bonniedeactive, "Sign into Bonnie");
			Thread.sleep(2000);
			click(LoginPageUMLS.bonnieYesbtn, "Yes Button");
			Thread.sleep(1000);
			if(!driver.findElements(LoginPageUMLS.btn_Authorize).isEmpty())
			{
				click(LoginPageUMLS.btn_Authorize, "Authorize");
				Thread.sleep(4000);
			}
			else
			{
				String user = config.getProperty("Bonnieusername");
				type(LoginPageUMLS.emailbonnie, user, "Email");
				Thread.sleep(1000);
				String pass = config.getProperty("Bonniepassword");
				type(LoginPageUMLS.passbonnie, pass, "Password");
				Thread.sleep(1000);
				click(LoginPageUMLS.loginbtnbonnie, "Login Button");
				Thread.sleep(1000);
				click(LoginPageUMLS.btn_Authorize, "Authorize");
				Thread.sleep(4000);
			}
		}
		else
		{
			System.out.println("Bonnie is active");
			Reporter.addStepLog("Bonnie is active");
		}	  
		Thread.sleep(3000);
   }
	
	@Then("^Verify Bonnie active$")
	public void verify_bonnieActive() throws Throwable {
	   if(driver.findElement(LoginPageUMLS.bonnieactive).isEnabled())
	   {
		   System.out.println("Bonnie is active");
		   Reporter.addStepLog("Bonnie is active");
	   }
	   else
	   {
		   System.out.println("Bonnie is Inactive");
		   Reporter.addStepLog("Bonnie is Inactive");
	   }
	}
	
	@Then("^Verify that the Bonnie login link changes to \"([^\"]*)\"$")
	public void Verify_the_link_disconnect_from_bonnie(String disconnectBonnie) throws Throwable {
	    verifyText(LoginPageUMLS.disconnectfrombonnie, disconnectBonnie, disconnectBonnie);
	    Thread.sleep(2000);
	}
	
	@Then("^I click Disconnect from Bonnie Verify User Successfully disconnect the session$")
	public void Click_disconnect_from_bonnie() throws Throwable {
	    click(LoginPageUMLS.disconnectfrombonnie, "Disconnect from Bonnie");
	    Thread.sleep(3000);
	}
	@Then("^Click Measure Package$")
	public void Click_measure_package() throws Throwable {
	    click(LoginPageUMLS.measurepackageTab, "Measure Package");
	    Thread.sleep(3000);
	}
	@Then("^Verify Package and Upload to Bonnie Button is Disable$")
	public void Verify_Upload_To_Bonnie_btn_is_disabled() throws Throwable {
		buttonDisabled(LoginPageUMLS.packagedisconnBtn);
	    Thread.sleep(3000);
	}
	
	@Then("^I click export$")
	public void searchmeasure() throws Throwable {
	    click(LoginPageUMLS.export, "Export");
	    Thread.sleep(3000);
	}
	
	@Then("^I click Upload to bonnie and Disconnect from bonnie$")
	public void disconnectBonnie() throws Throwable {
	    click(LoginPageUMLS.uploadTobonnie, "Upload to bonnie");
	    Thread.sleep(2000);
	    if(!driver.findElements(LoginPageUMLS.pleasesignBonniemsg).isEmpty())
		{
	    	
		}
	    else
	    {
	    	click(LoginPageUMLS.disconnectbonnie, "Disconnect from bonnie");
		    Thread.sleep(3000);
	    }
	}
	
	@Then("^Verify Bonnie inactive$")
	public void verify_bonnieinActive() throws Throwable {
	   if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
	   {
		   System.out.println("Bonnie is Inactive");
		   Reporter.addStepLog("Bonnie is Inactive");
	   }
	   else
	   {
		   System.out.println("Bonnie is active");
		   Reporter.addStepLog("Bonnie is active");
	   }
	}
	
	@Then("^I verify bonnies sign in link is added to the top banner just below the Login to UMLS link$")
	public void bonnieSignIn_link() throws Throwable {
		IsElementExists(LoginPageUMLS.bonniedeactive, "Sign into Bonnie");
		Thread.sleep(1000);
	}
	
	@Then("^This link should read as \"([^\"]*)\"$")
	public void verify_signInto_BonnieText(String signIntoBonnie) throws Throwable {
		verifyText(LoginPageUMLS.bonnie, signIntoBonnie, "Sign in to Bonnie");
		Thread.sleep(1000);
		
	}
	
	@And("^It have and indicator light the same as the UMLS Login$")
	public void verify_indicatorlight() throws Throwable {
		int a,b;
		if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
		{
			 a=1;
		}
		else
		{
			 a=2;
		}
		if(driver.findElement(LoginPageUMLS.linkUMLSDeactive).isEnabled())
		{
			 b=1;
		}
		else
		{
			 b=2;
		}
		int c=a+b;
		if(c==2)
		{
			Reporter.addStepLog("Both indicator lights are same");
		}
		else
		{
			Reporter.addStepLog("Failed:- Both indicator lights are not same");
		}
	}
	
	@Then("^The default light should be red$")
	public void defaultlight() throws Throwable {
		try
		{
			if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
			{
				Reporter.addStepLog("The default light display in red");
			}
			else
			{
				Reporter.addStepLog("Failed:- The default light does not match");
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	@When("^I clicked Sign Into Bonnie$")
	public void click_signinto_bonnie() throws Throwable {
		click(LoginPageUMLS.bonnie, "Sign into Bonnie");
		Thread.sleep(2000);
	}
	
	@Then("^Verify that this link will present a user with message that \"([^\"]*)\"$")
	public void verifyBonnieusermessage(String message) throws Throwable {
		verifyText(LoginPageUMLS.BonnieUsermessage, message, "User Message");
		Thread.sleep(2000);
	}
	
	@Then("^I clicked No on the message should close the message,User in currect page$")
	public void clickmessageNo() throws Throwable {
		try {
		click(LoginPageUMLS.bonnieNobtn, "No Button");
		Thread.sleep(2000);
		Reporter.addStepLog("The message popup window successfully closing");
		Reporter.addStepLog("User in current page");
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Failed:- Message popup window closing failed");
		}
		
	}
	
	@Then("^I clicked Yes on the message will redirect the user bonnie login area$")
	public void clickmessageYes() throws Throwable {
		click(LoginPageUMLS.bonnieYesbtn, "Yes Button");
		Thread.sleep(4000);
		try
		{
			if(!driver.findElements(LoginPageUMLS.btn_Authorize).isEmpty())
			{
				click(LoginPageUMLS.btn_Authorize, "Authorize");
				Thread.sleep(2000);
			}
			else
			{
				String user = config.getProperty("Bonnieusername");
				type(LoginPageUMLS.emailbonnie, user, "Email");
				Thread.sleep(1000);
				String pass = config.getProperty("Bonniepassword");
				type(LoginPageUMLS.passbonnie, pass, "Password");
				Thread.sleep(1000);
				click(LoginPageUMLS.loginbtnbonnie, "Login Button");
				Thread.sleep(1000);
				click(LoginPageUMLS.btn_Authorize, "Authorize");
				Thread.sleep(4000);
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or element state not ready to perform action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}
	
	@Then("^Verify two sub-tabs have been added, the current header \"([^\"]*)\"$")
	public void verifyTotabs(String header) throws Throwable {
		if(driver.findElement(LoginPageUMLS.tabactiveExport).isEnabled())
		{
			if(driver.findElement(LoginPageUMLS.tabdeactiveUplodbonnie).isEnabled())
			{
				Reporter.addStepLog("Two sub tabs have been addedd successfully");
			}
			else
			{
				Reporter.addStepLog("Failed:- To add two sub tabs");
			}
		}
		else
		{
			Reporter.addStepLog("Failed:- To add two sub tabs");
		}
		verifyText(LoginPageUMLS.exportheader, header, "My Measures > Export");
		Thread.sleep(1000);
	}
	
	@Then("^I Verify that the first tab is titled \"([^\"]*)\"$")
	public void verifyexporttab(String export) throws Throwable {
		verifyText(LoginPageUMLS.tabactiveExport, export, "Export Tab");
		Thread.sleep(1000);
	}
	
	@And("^The tool tip for the tab should read as \"([^\"]*)\"$")
	public void verifyexporttooltip(String exporttooltip) throws Throwable {
		WebElement element = driver.findElement(LoginPageUMLS.tabactiveExport);
		String tooltip = element.getAttribute("title");
		if(tooltip.equals(exporttooltip))
		{
			Reporter.addStepLog("The Export tab Tool tip read as "+exporttooltip);
		}
		else
		{
			Reporter.addStepLog("Failed to verify the Export tab tool tip verification");
		}
		Thread.sleep(1000);
	}
	
	@Then("^I Verify that the second tab is titled \"([^\"]*)\"$")
	public void verifyuploadtobonnietab(String uploadtobonnie) throws Throwable {
		verifyText(LoginPageUMLS.tabdeactiveUplodbonnie, uploadtobonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
	}
	
	@And("^The tool tip for the second tab should read as \"([^\"]*)\"$")
	public void verifyUpload_ToBonnietooltip(String uploadtobonnietooltip) throws Throwable {
		WebElement element = driver.findElement(LoginPageUMLS.tabdeactiveUplodbonnie);
		String tooltip = element.getAttribute("title");
		if(tooltip.equals(uploadtobonnietooltip))
		{
			Reporter.addStepLog("The Upload to Bonnie tab Tool tip read as "+uploadtobonnietooltip);
		}
		else
		{
			Reporter.addStepLog("Failed to verify the Upload to Bonnie tab tool tip verification");
		}
		Thread.sleep(1000);
	}
	
	@Then("^Verify that the active tab displays in blue with white text$")
	public void verifyactive_Tab_color() throws Throwable {
		String element = driver.findElement(LoginPageUMLS.tabactiveExport).getCssValue("background-color");
		String font = driver.findElement(LoginPageUMLS.tabactiveExport).getCssValue("color");
		String hex = Color.fromString(element).asHex();
		String hex1 = Color.fromString(element).asHex();
//		System.out.println("Aaa="+hex);
//		System.out.println("Bbb="+hex1);
		String actual="#337ab7";
		String fontact = "#fff";
		if(element.equals(actual))
		{
			if(font.equals(fontact))
			{
				Reporter.addStepLog("The Active tab displays blue colour with white text");
			}
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
		Thread.sleep(1000);
	}
	
	@And("^The inactive tab displays with blue text on a white background$")
	public void verifyinactive_Tab_color() throws Throwable {
		String element = driver.findElement(LoginPageUMLS.tabdeactiveUplodbonnie).getCssValue("background-color");
		String font = driver.findElement(LoginPageUMLS.tabdeactiveUplodbonnie).getCssValue("color");
		String actual="#fff";
		String fontact = "#337ab7";
		if(element.equals(actual))
		{
			if(font.equals(fontact))
			{
				Reporter.addStepLog("The Active tab displays blue colour with white text");
			}
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification failed");
		}
		Thread.sleep(1000);
	}

	@Then("^Verify that users are able to toggle between the two tabs and that the tab design changes as each tab is chosen and made active/inactive.$")
	public void verifyuser_able_to_toggle() throws Throwable {
		click(LoginPageUMLS.tabdeactiveUplodbonnie, "Deactive Sign into Bonnie Tab");
		Thread.sleep(1000);
		if(driver.findElement(LoginPageUMLS.tabactiveUplodbonnie).isEnabled())
		{
			Reporter.addStepLog("The Sign into Bonnie tab is active");
		}
		Thread.sleep(1000);
		click(LoginPageUMLS.tabdeactiveExport, "Deactive Export Tab");
		Thread.sleep(1000);
		if(driver.findElement(LoginPageUMLS.tabactiveExport).isEnabled())
		{
			Reporter.addStepLog("The Export tab is active");
		}
		Thread.sleep(1000);
	}
	
	
	private String measure;
	@Then("^I search measure \"([^\"]*)\"$")
	public void searchmeasure(String measure) throws Throwable {
		this.measure=measure;
	    Thread.sleep(3000);
	    clear(MeasureLibrary.txtSearchMeasure, "measure to search");
		 type(MeasureLibrary.txtSearchMeasure, measure, "Enter the measure to search");
		   click(MeasureLibrary.btnSearchMeasure, "Search for the measure");
		   Thread.sleep(2000);
	}


 
    @Then("^Verify the Upload to Bonnie page heading reads as \"([^\"]*)\"$")
    public void verify_UploadtoBonniepageHeading(String Expectedheading) throws Exception
    {
         click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
       verifyText(LoginPageUMLS.uploadtobonnieTitle,Expectedheading, "My Measures > Upload to Bonnie");
		Thread.sleep(1000);
    }  
        
    @And("^It displays with the same text styling as the Export tab$")
    public void verifysameStyle() throws Exception
    {
    	String upload = driver.findElement(LoginPageUMLS.sameStylebonnieTab).getAttribute("style");
    	Thread.sleep(1000);
    	click(LoginPageUMLS.tabdeactiveExport, "Deactive Export Tab");
		Thread.sleep(1000);
		String export = driver.findElement(LoginPageUMLS.sameStylebonnieTab).getAttribute("style");
		Thread.sleep(1000);
		if(upload.equals(export))
		{
			Reporter.addStepLog("Export and Upload to Bonnie header text style is same");
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification Failed");
		}
    }
    
    @Then("^Verify the Measure name displays at the top of the panel in the same format as the Export tab$")
    public void measureName_SameoderVerification() throws Exception
    {
    	String actual= driver.findElement(LoginPageUMLS.measurenameFormat).getText();
    	String expect = actual+" " +measure;
    	String actful = driver.findElement(LoginPageUMLS.measuresameformat).getText();
    	if(expect.equals(actful))
    	{
    		Reporter.addStepLog("Measure name displays in the same format");
    	}
    	else
    	{
    		Reporter.addStepLog("Failed:- Verification Failed");
    	}
    } 
   
    @Then("^The measure name should display in blue font and underlined$")
    public void measureName_font_UnderlineVerification() throws Exception
    {
    	String font1 = driver.findElement(LoginPageUMLS.measurename).getCssValue("color");
    	String underline = driver.findElement(LoginPageUMLS.measurename).getCssValue("text-decoration");
    	String font = "rgba(51, 122, 183, 1)";
    	String line = "none solid rgb(51, 122, 183)";
    	try {
    	if(font1.equals(font))
    	{
    		if(underline.equals(line))
    		{
    			Reporter.addStepLog("The measure name successfully displays blue color and underlined");
    		}
    	}
    	else
    	{
    		Reporter.addStepLog("Failed:- Verification Failed");
    	}
    	Thread.sleep(1000);
    	}
    	catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
    }  
       
    @Then("^Verify the measure name displays as a link and redirects users to the Measure Details$")
    public void measureName_clickredirecttoMeasure_detailspage() throws Exception
    {
    	click(LoginPageUMLS.measurename, "Measure Name link");
    	Thread.sleep(1000);
    	String expect = driver.findElement(LoginPageUMLS.measuredetailsPage).getText();
    	String actual = "Measure Details ";
    	if(expect.equals(actual))
    	{
    		Reporter.addStepLog("Successfully redirect to Measure details Page");
    	}
    	else
    	{
    		Reporter.addStepLog("Failed:- Verification Failed");
    	}
    	click(MeasureLibrary.tabMeasureLibrary, "Measure library");
    	Thread.sleep(1000);
    } 
        
    @Then("^Verify Bonnie ID field format$")
    public void bonnieId_fieldFormat() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		String actual= driver.findElement(LoginPageUMLS.bonnieidFormat).getText();
		String bonnie = "Bonnie ID:";
		String user = config.getProperty("Bonnieusername");
		try {
		if(actual.equals(bonnie))
		{
			if(driver.findElement(By.xpath("//*[contains(text(),'"+user+"')]")).isEnabled())
			{
				Reporter.addStepLog("Bonnie Id displays in the Correct format");
			}
		}
		else
		{
			Reporter.addStepLog("Failed:- Verification Failed");
		}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
		click(LoginPageUMLS.tabdeactiveUplodbonnie, "Measure library");
		Thread.sleep(1000);
    }  
    
    @And("^The field should remain blank when the user is not signed into Bonnie$")
    public void bonnieId_fieldBlankVerification() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		click(LoginPageUMLS.disconnectbonnie, "Disconnect from bonnie");
	    Thread.sleep(1000);
    } 
    
    @Then("^I Verify below the Bonnie ID field, there is a \"([^\"]*)\" link when the user is actively signed in$")
    public void VerifyUseractivelySignin(String disconnect) throws Exception
    {
    	verifyText(LoginPageUMLS.disconnectbonnie, disconnect, "Disconnect from Bonnie");
    	Thread.sleep(1000);
    } 
    
    @Then("^Verify upload button is added in the Upload to bonnie$")
    public void Verifyuploadbutton() throws Exception
    {
    	IsElementExists(LoginPageUMLS.Bonnieuploadbtn, "Upload Button");
    	Thread.sleep(1000);
    } 
    
    @And("^The tool tip for the button should read as \"([^\"]*)\"$")
	public void uplodbutton_toolTip(String uploadtooltip) throws Throwable {
		WebElement element = driver.findElement(LoginPageUMLS.Bonnieuploadbtn);
		String tooltip = element.getAttribute("title");
		if(tooltip.equals(uploadtooltip))
		{
			Reporter.addStepLog("The Upload Button Tool tip read as "+uploadtooltip);
		}
		else
		{
			Reporter.addStepLog("Failed to verify the Upload Button tool tip verification");
		}
		Thread.sleep(1000);
	}
    
    @Then("^Verify cancel button is added in the Upload to bonnie$")
    public void Verifycancelbutton() throws Exception
    {
    	IsElementExists(LoginPageUMLS.BonnieCalcenbtn, "Cancel Button");
    	Thread.sleep(1000);
    } 
    
    @And("^The tool tip for the cancel button should read as \"([^\"]*)\"$")
	public void cancelbutton_toolTip(String cancelbutton) throws Throwable {
		WebElement element = driver.findElement(LoginPageUMLS.BonnieCalcenbtn);
		String tooltip = element.getAttribute("title");
		if(tooltip.equals(cancelbutton))
		{
			Reporter.addStepLog("The Calcel button Tool tip read as "+cancelbutton);
		}
		else
		{
			Reporter.addStepLog("Failed to verify the Calcel Button tool tip verification");
		}
		Thread.sleep(1000);
	}
    
    @Then("^Verify the Upload button is a bootstrap icon and displays in blue with white text$")
    public void Verifyuploadbuttonicon() throws Exception
    {
    	try
    	{
    		if(driver.findElement(LoginPageUMLS.uploadicon).isEnabled())
    		{
    			Reporter.addStepLog("Successfully verified Upload button is using bootstrap icon");
    		}
    		String color = driver.findElement(LoginPageUMLS.Bonnieuploadbtn).getCssValue("color");
        	String background = driver.findElement(LoginPageUMLS.Bonnieuploadbtn).getCssValue("background-color");
        	String font = "rgba(255, 255, 255, 1)";
        	String line = "rgba(51, 122, 183, 1)";
        	if(color.equals(font))
        	{
        		if(background.equals(line))
        		{
        			Reporter.addStepLog("The upload button is blue with white text");
        		}
        	}
        	else
        	{
        		Reporter.addStepLog("Failed:- Verification failed");
        	}
    	}
    	catch(Exception e)
    	{
    		Reporter.addStepLog("Element Not found or Element state not not ready to perform action");
			throw new Exception ("Element Not found or Element state not not ready to perform action");
    	}
    } 
    
    @Then("^Verify the Cancel button is a bootstrap icon and displays in red with white text$")
    public void Verifycancelbuttonstyle() throws Exception
    {
    	try
    	{
    		String color = driver.findElement(LoginPageUMLS.BonnieCalcenbtn).getCssValue("color");
        	String background = driver.findElement(LoginPageUMLS.BonnieCalcenbtn).getCssValue("background-color");
        	String font = "rgba(255, 255, 255, 1)";
        	String line = "rgba(217, 83, 79, 1)";
        	if(color.equals(font))
        	{
        		if(background.equals(line))
        		{
        			Reporter.addStepLog("The cancel button is red with white text");
        		}
        	}
        	else
        	{
        		Reporter.addStepLog("Failed:- Verification failed");
        	}
    	}
    	catch(Exception e)
    	{
    		Reporter.addStepLog("Element Not found or Element state not not ready to perform action");
			throw new Exception ("Element Not found or Element state not not ready to perform action");
    	}
    } 
    
    @Then("^Verify the Disconnect from Bonnie link can be selected using keyboard controls$")
    public void disconnectin_keyboardControl() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		clickKeyboardControl(LoginPageUMLS.disconnectbonnie, "Disconnect bonnie link");
		Thread.sleep(1000);
    }
    
    @Then("^Verify that disconnect from link is hidden when a user is not actively signed into Bonnie$")
    public void disconnectin_bonnieLogin_SignoutLink_is_hidden() throws Exception
    {
    	try
    	{
    		if(driver.findElement(LoginPageUMLS.disconnectbonnie).isDisplayed())
    		{
    			Reporter.addStepLog("Disconnect from Bonnie link is hidden");
    		}
    	}
    	catch(Exception e)
    	{
    		Reporter.addStepLog("Disconnect from Bonnie is Displayed");	
    	}
    }
    
    @Then("^Verify that Upload button is disabled when a user is not actively signed into Bonnie$")
    public void VerifyUploadbuttonIs_disabled() throws Exception
    {
    	try
    	{
    		if(driver.findElement(LoginPageUMLS.disabledUploadbtn).isDisplayed())
    		{
    			Reporter.addStepLog("The Upload Button is disabled");
    		}
    	}
    	catch(Exception e)
    	{
    		Reporter.addStepLog("The Upload Button is Enabled");	
    	}
    	Thread.sleep(3000);
    }
    
    @Then("^Verify that selecting the Cancel button using Keyboard controls returns the user to the Measure Library page$")
    public void clickingCancelbtnUsingKeyboard_control() throws Exception
    {
    	Thread.sleep(3000);
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(2000);
    	clickKeyboardControl(LoginPageUMLS.BonnieCalcenbtn, "Cancel Bitton");
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
    
    @And("^The user field should remain blank when the user is not signed into Bonnie$")
    public void VerifyUserField() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
		   {
			   Reporter.addStepLog("Bonnie is Inactive");
		   }
		   else
		   {
			   Reporter.addStepLog("Bonnie is active");
		   }
    }
    
    @Then("^Verify that selecting the Disconnect from Bonnie link ends the MAT connection to Bonnie for that user$")
    public void Verify_disconnectBonnie_MATStatus() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		clickKeyboardControl(LoginPageUMLS.disconnectbonnie, "Disconnect bonnie link");
		if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
		   {
			   Reporter.addStepLog("Successfully disconnect the MAT connection to Bonnie for that user");
		   }
		   else
		   {
			   Reporter.addStepLog("Failed:- Verification Failed");
		   }
    }
    
    @Then("^Sign in Bonnie$")
    public void Signinbonnie() throws Exception
    {
    	click(LoginPageUMLS.bonniedeactive, "Sign into Bonnie");
		Thread.sleep(2000);
		click(LoginPageUMLS.bonnieYesbtn, "Yes Button");
		Thread.sleep(1000);
		click(LoginPageUMLS.btnauthorize, "Authorize");
		Thread.sleep(1000);
    } 
    
    @Then("^Verify that a message will display saying \"([^\"]*)\"$")
    public void Verify_disconnectBonnie_message(String message) throws Exception
    {
    	verifyText(LoginPageUMLS.disconnectMessage, message, "Disconnect Bonnie successfully message");
    	Thread.sleep(2000);
    }
    
    @Then("^Verify the focus is directed to this message$")
    public void Verify_the_focusOftheMessage() throws Exception
    {
    	IsElementExists(LoginPageUMLS.disconnectMessage, "Disconnect Bonnie successfully message");
    	Thread.sleep(2000);
    }
    
    @Then("^Verify that the indicator light next to the Sign Into Bonnie link in the header is now red and reads as \"([^\"]*)\"$")
    public void Verify_the_indicaterLight(String signin) throws Exception
    {
    	if(driver.findElement(LoginPageUMLS.bonniedeactive).isEnabled())
    	{
    	   verifyText(LoginPageUMLS.signintoBonnie, signin, "Sign Into Bonnie");
   		   Reporter.addStepLog("The indicator light of Sign Into Bonnie link is red");
   	   }
   	   else
   	   {
   		   Reporter.addStepLog("Bonnie is active");
   	   }
    }
    
    @Then("^Verify that if you navigate away from the Bonnie Upload screen and then come back, and are still not logged into Bonnie, you see the text that reads \"([^\"]*)\"$")
    public void Verify_PleaseSignIn(String message) throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		verifyText(LoginPageUMLS.pleasesignBonnietext, message, "Please Sign into Bonnie");
		Thread.sleep(1000);
    }
    
    @Then("^Verify that an enabled Upload button can be selected using keyboard controls$")
    public void Verify_clickIn_enebledUploadbutton() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveUplodbonnie, "Upload to Bonnie Tab");
		Thread.sleep(1000);
		clickKeyboardControl(LoginPageUMLS.Bonnieuploadbtn, "Upload Button");
		Thread.sleep(1000);
    }
    
    @Then("^Verify that clicking on an enabled Upload button will show a loading bar$")
    public void Verify_clickIn_enebledUploadbuttonloadingBar() throws Exception
    {
		clickKeyboardControl(LoginPageUMLS.Bonnieuploadbtn, "Upload Button");
		IsElementExists(LoginPageUMLS.UploadLoadingbar, "Loading bar");
    }
    @Then("^Verify that if there is not an active UMLS connection, the user is presented with an error message that states \"([^\"]*)\"$")
    public void VerifyPlease_loginUMLS_login_error_message(String message) throws Exception
    {
		verifyText(LoginPageUMLS.UmlsloginBonnieerrormessage, message, "Please sign into UMLS");
    }  
    
    @Then("^Verify that If the measure upload is successfully$")
    public void VerifysuccessfullyUpload_bonnie_message() throws Exception
    {
		String expect = "Smoke title has been successfully updated in Bonnie. Please select open or save to view the results.";
		String expect1 = "The Measure Authoring Tool was unable to process the request. Please try again. If the problem persists please contact the Help Desk.";
		try
		{
			 if(!driver.findElements(LoginPageUMLS.successmsgUploadBonnie).isEmpty())
				{
				    verifyText(LoginPageUMLS.successmsgUploadBonnie, expect, "Successfully Upload Bonnie Message");
					Thread.sleep(1000);
				}
			    else
			    {
			    	verifyText(LoginPageUMLS.successmsgUploadBonnie1, expect1, "Successfully Upload Bonnie Message");
					Thread.sleep(1000);	
			    }
		
		}
		catch(Exception e)
		{
			
		}
    }
    
    
    @Then("^Verify that the focus is directed to the success message$")
    public void Verifythat_focus_in_success_message() throws Exception
    {
		IsElementExists(LoginPageUMLS.successmsgUploadBonnie, "Successfully Upload Bonnie Message");
    }
    
    @Then("^Verify that there is a browser popup that has Save, Open, or Cancel options available$")
    public void VerifythatSave_open_cancel_Button() throws Exception
    {
    	click(LoginPageUMLS.tabdeactiveExport, "Export Tab");
		Thread.sleep(1000);
		IsElementExists(LoginPageUMLS.Bonnieexportsavebtn, "Save Button");
		IsElementExists(LoginPageUMLS.Bonnieexportopenbtn, "Open Button");
		IsElementExists(LoginPageUMLS.Bonnieexportcancelbtn, "Cancel Button");
		tooltip(LoginPageUMLS.Bonnieexportsavebtn, "Save Button", "title");
		tooltip(LoginPageUMLS.Bonnieexportopenbtn, "Open Button", "title");
		tooltip(LoginPageUMLS.Bonnieexportcancelbtn, "Cancel Button", "title");
    }
    
    private static String downloadPath = "C:\\Users\\rreddy\\Downloads\\CMSv0.xlsx";
    private static String fileName = "CMSv0";
    @Then("^Verify Successfully download a spreadsheet$")
    public void Verifythat_successfully_downloded_spreadsheet() throws Exception
    {
    	
    	File file = new File(downloadPath);
    	if(file.exists() && !file.isDirectory()) { 
 	        	Reporter.addStepLog("Successfully download a streadsheet");
 	        }
 	        else
 	        {
 	        	Reporter.addStepLog("Failed:- Verification Failed");
 	        }
    	 }
    
    @Then("^Verify that to the right of the Bonnie login link is a user icon$")
    public void Verify_that_the_User_icon() throws Exception
    {
		IsElementExists(LoginPageUMLS.profile, "User Icon");
		Thread.sleep(1000);
    }
    
    @Then("^The icon should be the same blue as the Measure Authoring Tool Heading$")
    public void Verify_that_the_User_iconColor() throws Exception
    {
    	String element = driver.findElement(LoginPageUMLS.measureAuthHeader).getCssValue("color");
		String font = driver.findElement(LoginPageUMLS.profile).getCssValue("color");
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
		
		if(actualColor.equals(actualfont))
		{
			Reporter.addStepLog("Measure Authoring Tool Heading color same as Icon color");
		}
		else
		{
			Reporter.addStepLog("Heading and profile icon color are doesnot match");
		}
		Thread.sleep(2000);
		}
    
    @Then("^Verify that clicking on that icon presents the user with a dropdown$")
    public void Verify_that_Click_the_icon_dropdown() throws Exception
    {
		click(LoginPageUMLS.profile, "User Icon");
		Thread.sleep(1000);
		IsElementExists(LoginPageUMLS.profiledropdown, "User Profile Dropdown");
		Thread.sleep(1000);
    }
    
    @And("^It contains static text and then  two options$")
    public void Verify_profile_icon_dropdownList() throws Exception
    {
		IsElementExists(LoginPageUMLS.signedInas_profile, "Signed in as");
		Thread.sleep(1000);
		IsElementExists(LoginPageUMLS.username_profile, "User Name");
		Thread.sleep(1000);
		IsElementExists(LoginPageUMLS.MATAccountlink, "MAT Account Link");
		Thread.sleep(1000);
		IsElementExists(LoginPageUMLS.linkSignOut, "Sign Out");
		Thread.sleep(1000);
    }
    
    @Then("^Verify Click MAT Account User in Personal Information Tab$")
    public void Verify_that_Click_MAT_accountlink_personalInformation() throws Exception
    {
		click(LoginPageUMLS.MATAccountlink, "MAT Account Link");
		Thread.sleep(2000);
		IsElementExists(LoginPageUMLS.personalInformationTab, "Personal Information Tab");
		Thread.sleep(1000);
    }
    
    
		
    }
    

    
    
  
    
    
    
    
    