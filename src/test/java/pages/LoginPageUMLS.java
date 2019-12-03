package pages;

import org.openqa.selenium.By;

public class LoginPageUMLS {
	
	public static By txtUserName = By.xpath("//*[@id='inputUserId']");
	public static By txtPassword = By.xpath("//*[@id='inputPwd']");
	public static By txtAuthCode = By.xpath("//*[@id='inputAuthCode']");	
	public static By btnLogin = By.xpath("//button[contains(text(), 'Sign In')]");
	public static By linkSigninUMLS = By.xpath("//button[@title='Sign in to UMLS']");
	public static By linkUMLSDeactive = By.xpath("(//i[@class='fa fa-circle' and @style='color: DarkRed;'])[1]");
	public static By txtULMSUserName = By.xpath("//*[@id='inputUserId']");
	public static By txtULMSPassword = By.xpath("//*[@id='inputPwd']");
	public static By btnSignIn = By.xpath("//button[@class='btn btn-success']");
	public static By btnumlscontinu = By.xpath("//button[contains(text(), 'Continue')]");
	public static By profile = By.xpath("//a[@title='Profile']");
	public static By linkSignOut = By.xpath("//a[@title='Sign Out']");
	public static By bonnieactive = By.xpath("(//i[@class='fa fa-circle' and @style='color: DarkGreen;'])[2]");
	public static By bonniedeactive = By.xpath("(//i[@class='fa fa-circle' and @style='color: DarkRed;'])[2]");
	public static By bonnieYesbtn = By.xpath("//button[@id='Yes_BonnieModal']");
	public static By bonnieNobtn = By.xpath("//button[@title='No']");
	public static By btn_Authorize = By.xpath("//input[@value='Authorize']");
	public static By emailbonnie = By.xpath("//input[@type='email']");
	public static By passbonnie = By.xpath("//input[@type='password']");
	public static By loginbtnbonnie = By.xpath("//input[@type='submit']");
	public static By export = By.xpath("(//td[@class='emptySpaces'][./button[@title='Click to Export MAT v5.8']])[1]");
	public static By uploadTobonnie = By.xpath("//li[@title='Upload to Bonnie']");
	public static By disconnectbonnie = By.xpath("(//button[@title='Disconnect from Bonnie'])[2]");
	public static By bonnie = By.xpath("//span[contains(text(),'  Sign in to Bonnie')]");
	public static By BonnieUsermessage = By.xpath("//*[contains(text(),'You are leaving the')]");
	public static By tabactiveExport = By.xpath("//li[@class='active' and @title='Select Exports']");
	public static By tabdeactiveUplodbonnie = By.xpath("//li[@title='Upload to Bonnie']");
	public static By tabdeactiveExport = By.xpath("//li[@title='Select Exports']");
	public static By tabactiveUplodbonnie = By.xpath("//li[@class='active' and @title='Upload to Bonnie']");
	public static By exportheader = By.xpath("//*[contains(text(),'My Measures > Export')]");
	public static By sameStylebonnieTab = By.xpath("(//td[@align='left' and @style='vertical-align: top;'])[13]");
	public static By measurenameFormat = By.xpath("(//label[@title='Measure: '])[1]");
	public static By measuresameformat = By.xpath("(//td[@align='left'][./div[@class='form-group']])[1]");
	public static By measurename = By.xpath("(//button[ @type='button' and @id='measureNameLabel'])[2]");
	public static By bonnieidFormat = By.xpath("//*[contains(text(),'Bonnie ID')]");
	public static By measuredetailsPage = By.xpath("//*[contains(text(),'Measure Details')]");
	public static By BonnieCalcenbtn = By.xpath("//button[@id='CancelButton_bonnie_upload']");
	public static By Bonnieexportopenbtn = By.xpath("//button[@title='Open']");
	public static By Bonnieexportsavebtn = By.xpath("//button[@title='Save']");
	public static By Bonnieexportcancelbtn = By.xpath("//button[@title='Cancel']");
	public static By Bonnieuploadbtn = By.xpath("//button[@title='Upload to Bonnie']");
	public static By uploadicon = By.xpath("//i[@class='fa fa-upload']");
	public static By disabledUploadbtn = By.xpath("//button[@type='button' and @disabled='']");
	public static By disconnectMessage = By.xpath("//*[contains(text(),'You have been dis')]");
	public static By signintoBonnie = By.xpath("//*[contains(text(),'  Sign in to Bonnie')]");
	public static By pleasesignBonnietext = By.xpath("(//*[contains(text(),'Please sign into Bonnie.')])[2]");
	public static By btnauthorize = By.xpath("//input[@value='Authorize']");
	public static By UploadLoadingbar = By.xpath("//table[@id='loadingContainer' and @role='alert']");
	public static By UmlsloginBonnieerrormessage = By.xpath("//b[contains(text(),'Please sign into UMLS')]");
	public static By successmsgUploadBonnie = By.xpath("//b[contains(text(),'Smoke')]");
	public static By successmsgUploadBonnie1 = By.xpath("//b[contains(text(),'The ')]");
	public static By pleasesignBonniemsg = By.xpath("//b[contains(text(),'Please sign into Bonnie.')]");
	public static By disconnectfrombonnie = By.xpath("//*[contains(text(),'Disconnect from Bonnie')]");
	public static By measurepackageTab = By.xpath("//*[contains(text(),'Measure Packager')]");
	public static By packagedisconnBtn = By.xpath("//button[@title='Click to Package and Upload to Bonnie']");
	public static By measureAuthHeader = By.xpath("//*[contains(text(),'Measure Authoring Tool ')]");
	public static By profiledropdown = By.xpath("//ul[@role='menu']");
	public static By MATAccountlink = By.xpath("//a[@title='MAT Account']");
	public static By signedInas_profile = By.xpath("//li[@title='Signed in as']");
	public static By username_profile = By.xpath("//li[@title='Performance user']");
	public static By personalInformationTab = By.xpath("//div[contains(text(),'Personal Information')]");
	
	
	
	
	
	
	
	
	public static By winUmlssucess = By.xpath(".//*[@id='main']/div[4]/div[2]/div/div[1]");
	

	public static By tabMatAccount = By.xpath("//div[contains(text(), 'MAT Account')]");
	
	
    public static By headerULMSActive = By.xpath(".//*[@id='showUMLSStateContainer']/div/h9");
	
	 
	
	public static By tabCqLLibrary = By.xpath("//div[contains(text(), 'CQL Library')]"); // sprint 142 added by Bhuvan Laxman on 04/27/2018
	public static By linkULMSLogout = By.xpath("//*[@id='Anchor_signOut']");
	
	public static By lblUMLSActive = By.xpath("//*[contains(text(),'UMLS Active')]");
	
	
	public static By uploadtobonnieTitle=By.xpath("//h1[contains(text(),'My Measure')]");
	public static By Style=By.cssSelector("td");
	public static By btn_upload=By.xpath("//button[@title='Upload to Bonnie']");
	public static By bootstrap_upload=By.xpath("//i[@class='fa fa-upload']");
	
	
	
	
	

	
	
}
