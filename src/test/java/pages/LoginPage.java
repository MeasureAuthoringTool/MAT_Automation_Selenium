package pages;

import org.openqa.selenium.By;

public class LoginPage implements PageLocators{

		

		public By get_Loging_UserName()
		{
			return By.xpath(".//*[@id='Email']");
		}

		public By get_Loging_Password()
		{
			return By.xpath(".//*[@id='Passwd']");
		}

		public By get_Loging_Submit()
		{
			return By.xpath(".//*[@id='next']");
		}

		public By get_Back() {
			// TODO Auto-generated method stub
			return By.xpath(".//*[@id='signIn']");
		}

		public By account_icon() {
			// TODO Auto-generated method stub
			return By.xpath("//a[@class='gb_b gb_db gb_R']/span");
		}

		public By Logout() {
			// TODO Auto-generated method stub
			return By.xpath("//a[contains(text(), 'Sign out')]");
		}

		public By account_chooser() {
			// TODO Auto-generated method stub
			return By.xpath(".//*[@id='account-chooser-link']");
		}
		
		public By remove() {
			// TODO Auto-generated method stub
			return By.xpath(".//*[@id='edit-account-list']");
		}
		
		public By close() {
			// TODO Auto-generated method stub
			return By.xpath(".//*[@id='choose-account-0']/span[2]");
		}
		
		
		public By MAT_Home() {
			
			return By.xpath(".//*[@id='navigation']/div/ul/li//a[@title='MAT Home']");
		}
		
		public By News_Alerts() {
			
			return By.xpath(".//*[@id='navigation']//a[@title='News & Alerts']");
		}
		
		public By Training_Resources() {
			
			return By.xpath(".//*[@id='navigation']//a[@title='Training & Resources']");
		}
		
		public By Open_Source_Community() {
			
			return By.xpath(".//*[@id='navigation']//a[@title='Open Source Community']");
		}
		
		public By Contact_Us() {
			
			return By.xpath(".//*[@id='navigation']//a[@title ='Contact Us']");
		}
		
		
		public By Accessibility_Policy() {
			
			return By.xpath(".//*[@id='custom_footer']//a[@title = 'Accessibility Policy']");
		}
		
		public By privacy_Policy() {
			
			return By.xpath(".//*[@id='custom_footer']//a[@title = 'Privacy Policy']");
		
		}
		
		
		public By Terms_Of_Use() {
			
			return By.xpath(".//*[@id='custom_footer']//a[@title = 'Terms Of Use']");
		
		}
		
		public By Freedom_of_Information_Act() {
			
			return By.xpath(".//*[@id='custom_footer']//a[@title = 'Freedom of Information Act']");
		
		}
		
		public By User_Guide() {
			
			return By.xpath(".//*[@id='custom_footer']//a[@title ='User Guide']");
		
		}
		
		public By Login_To_MAT_Button() {
			// TODO Auto-generated method stub
			return By.xpath("//a[contains(text(), 'Log in to the MAT')]");
		
		}
		
		
		
		public By txt_NewsAlerts(){
			
			return By.xpath("//h4[contains(text(),'News & Alerts')]");
			
		}
		
			
		public By txt_TrainingResources(){
			
			return By.xpath("//h3[contains(text(),' Training & Resources')]");
			
		}
		
		public By txt_ContactUs(){
			
			return By.xpath("//h3[contains(text(),' Contact Us')]");
			
		}
		
		public By txt_OpenSourceCommunity(){
			
			return By.xpath("//h3[contains(text(),' Open Source Community')]");
			
		}
		
		public By txt_AccessibilityStatement(){
			
			return By.xpath("//h3[contains(text(),'Accessibility Statement')]");
			
		}
		
		public By txt_PrivacyPolicy(){
			
			return By.xpath("//h1[contains(text(),'Privacy Policy')]");
			
		}
		
		public By txt_TermsOfUse(){
			
			return By.xpath("//h3[contains(text(),'Terms of Use')]");
			
		}
		
		
		public By txt_FreedomOfInformationAct(){
			
			return By.xpath("//h1[contains(text(),'Freedom of Information Act')]");
			
		}
		
			public By txt_UserGuide(){
			
			return By.xpath(".//*[@id='pageContainer1']");
			
		}
			
			public By txt_UserName(){
				
				return By.xpath(".//*[@id='UserID']");
				
			}
			
			/*.//*[@id='custom_footer']//a[@title = 'Privacy Policy']
		
		
		.//*[@id='custom_footer']//a[@title = 'Terms Of Use']
		
		.//*[@id='custom_footer']//a[@title = 'Freedom of Information Act']
		
		.//*[@id='custom_footer']//a[@title ='User Guide']
		
		
		//a[contains(text(), 'Log in to the MAT')] 
		
		
		//h4[contains(text(),'News & Alerts')]
		
		//h3[contains(text(),' Training & Resources')]
		
		//h3[contains(text(),' Open Source Community')]
		
		//h3[contains(text(),' Contact Us')]
		
		//h3[contains(text(),'Accessibility Statement')]
		
		//h1[contains(text(),'Privacy Policy')]
		
		//h3[contains(text(),'Terms of Use')]
		
		//h1[contains(text(),'Freedom of Information Act')]
		
		//div[contains(text(),'Welcome to the Measure Authoring Tool')]
		
		*/

		
		
	}
