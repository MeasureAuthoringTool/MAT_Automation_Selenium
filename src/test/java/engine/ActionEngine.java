package engine;


import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.cucumber.listener.Reporter;
import pages.CQLWorkspacepage;
import pages.LoginPageUMLS;


public class ActionEngine extends TestEngine {	
	
	private int count = 0;

	public boolean IsElementexistwait(By by, String elementName) throws Exception {
		boolean retValue = false;
		try {
			count++;
			Thread.sleep(1000);
			if (((WebElement) by).getSize() != null) {
				retValue = true;
				System.out.println("The element: '" + elementName + "' is displayed successfully.");
			}
		} catch (Exception e) {
			if (count >= 5) {
				throw new Exception("Element Not found or Element state not ready to perform action");
			} else {
				IsElementExists(by, elementName);
			}

		}
		return retValue;
	}
	
	public void search(By by, String nameToSearch, String elementName) throws Exception{
		try {
			List<WebElement> searchList=driver.findElements(by);
			Actions act=new Actions(driver);
			for (WebElement searchDefi:searchList){
				if (searchDefi.getText().equals(nameToSearch)){
					act.moveToElement(searchDefi).doubleClick().perform();
					
				}		
			}
			Reporter.addStepLog("Value selected: "+ elementName);
		} catch (Exception e) {
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	
	public void waitForElemenent( By element, String elementName) throws Exception{
		int waitTime = Integer.parseInt( config.getProperty("ElementSyncTimeOut"));
		try{
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
			Reporter.addStepLog("Waited For element for "+waitTime+" Sec");
		}
		catch(Exception e){
			Reporter.addStepLog("Wait element Exception");
			throw new Exception ("Wait element Exception");
		}
	}		

	public void waitForElementToBClickable( By element, String elementName) throws Exception{
		int waitTime = Integer.parseInt( config.getProperty("ElementSyncTimeOut"));
		try{
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
			Reporter.addStepLog("Waited For element for "+waitTime+" Sec");
		}
		catch(Exception e){
			Reporter.addStepLog("Wait element Exception");
			throw new Exception ("Wait element Exception");
		}
	}
	
	public void FieldDisabled(By by,String elementName)throws Exception{
		try
		{
			if (driver.findElement(by).isDisplayed())
			{
				Reporter.addStepLog("The '"+elementName+"' is disabled");
			}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("The '"+elementName+"' is enabled");
		}	
	}
	
	public void tooltip(By by,String elementName,String getattribute)throws Exception{
		try
		{
			WebElement element = driver.findElement(by);
			String tooltip = element.getAttribute(getattribute);
			Reporter.addStepLog("The '"+elementName+"' Tool tip read as "+tooltip);
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}	
	}
	
	public void buttonDisabled(By by)throws Exception{
		try {
			
			if (!driver.findElement(by).isEnabled()) {
				Reporter.addStepLog("Button is disabled");
			}
		}catch(Exception e){
			Reporter.addStepLog("Button is enabled");
		throw new Exception ("Element Not found or Element state not ready to perform action");
		}
			
	}
	
	public  void verifyText(By by, String expected, String elementName) throws Exception{
		try {
			String actual=driver.findElement(by).getText();	
			if (actual.equals(expected)){
				
				Reporter.addStepLog("Successfully displayed: "+elementName);
			} else {
				Reporter.addStepLog("Expected Text not displayed: "+elementName);
			}
			
		} catch (Exception e) {
			Reporter.addStepLog("Display was unsuccessful: "+elementName);
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}

	}
	
	public void clickKeyboardControl(By by, String elementName) throws Exception{
		try {						
			WebElement element = driver.findElement(by);
			element.sendKeys(Keys.ENTER);
			Reporter.addStepLog("Clicked on the element: "+elementName+ " Using keyboard control successfully");
			Thread.sleep(2000);
		} catch (Exception e) {
			Reporter.addStepLog("Element Not found or Element state not ready to perform action");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	
	

	public void saveDefiOrParaOrFunc(By by, String elementName) throws Exception{
		try {
			click(by, "Click save icon");						

		} catch (Exception e) {

			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	public void verifyAttributeValue(By by, String attribute, String attributeValue, String elementName) throws Exception{
		try {
			driver.findElement(by).getAttribute(attribute).equalsIgnoreCase(attributeValue);	
//			extentReportsLog(true, String.format("Verified: '%s'", elementName));
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Fail: '%s'", elementName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	public void gotoInsertOptionAttributes() throws Throwable {
	
		
		selectByVisibleText(CQLWorkspacepage.dropdownItemType, "Attributes", "Item Type Dropdown");

		Thread.sleep(2000);
		
		
	}
	
	public void selectInsert(By by, String value, String elementName) throws Exception{
		try {
			List <WebElement> dropdown=driver.findElements(by);
			int sz=dropdown.size()-1;
			Select val=new Select(dropdown.get(sz));
			
			val.selectByValue(value);
//			extentReportsLog(true, String.format("Value selected: '%s'", elementName));
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Value not selected: '%s'", elementName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	public void verifyDisabled(By by, String elementName) throws Exception{
		try {
			List <WebElement> dropdown=driver.findElements(by);
			int sz=dropdown.size()-1;
			boolean status=dropdown.get(sz).isEnabled();
			if (status==false)
			{
//				extentReportsLog(true, String.format("dropdown: '%s' is disabled", elementName));
			}
		} catch (Exception e) {
//			extentReportsLog(false, String.format("dropdown: '%s' is enabled", elementName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	public void closeAttribute(By by, String elementName) throws Exception{
		try {
			click(by, "Close the Attribute");
//			extentReportsLog(true, String.format("Value selected: '%s'", elementName));
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Value not selected: '%s'", elementName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}

	public void click(By by, String elementName) throws Exception{
		try {
			driver.findElement(by).click();
			Reporter.addStepLog("Clicked on the element: "+elementName+ " successfully");
		} catch (Exception e) {
			Reporter.addStepLog("Failed to click on the element: "+elementName+ " successfully");
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	
	/**
	 * Method Name: Jclick
	 * Purpose: click on element
	 * @throws Exception 
	 *
	 */
	public void jclick(By by, String elementName) throws Exception{
		try {
//			waitForElementToBClickable(by, elementName);

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement element=driver.findElement(by);
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	/**
	 * Javascript click.
	 *
	 * @param element the element
	 * @throws Exception 
	 */
	public void jsClick(By by, String elementName) throws Exception{
		try{
			waitForElementToBClickable(by, elementName);
			WebElement element = driver.findElement(by);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}catch(Exception e){
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}

	/**
	 * 	Method Name: clear
	 * Purpose: clear method remove existing text in text area fields
	 * @param by
	 * @param text
	 * @param elementName
	 * @throws Exception 
	 */
	public void clear(By by, String elementName) throws Exception{
		try {
			driver.findElement(by).clear();
			Reporter.addStepLog("Clear text from field "+elementName);
		} catch (Exception e) {
			Reporter.addStepLog("Either the element is not found or element state is not ready perforam action");
			throw new Exception ("Element Not found or element state not ready to perform action");
		}
	}

	/**
	 * Method Name: type
	 * Purpose: sends the given text
	 * @throws Exception 
	 *
	 */
	public void type(By by, String text, String elementName) throws Exception{
		try {
			driver.findElement(by).sendKeys(text);
			Reporter.addStepLog("Entered the text: '"+text +"' in the element: '"+elementName+"' successfully.");
		} catch (Exception e) {
			Reporter.addStepLog("Failed to enter the text: '"+text +"' in the element: '"+elementName+"'.");
			throw new Exception ("Element Not found or Element state not not ready to perform action");
		}
	}

	/**
	 * Method Name: waitForVisibility
	 * Purpose: waits for the visibility of given element for the specified time
	 * @throws InterruptedException 
	 * @throws IOException 
	 *
	 */
	public void waitForVisibility(By by, 
			String elementName,
			int timeOut) throws IOException{
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//			extentReportsLog(true, "Waited for visibility of the element: '"+elementName+"' and is found successfully.");
		} catch (Exception e) {
//			extentReportsLog(false, "Failed to find the element: '"+elementName+"'. " + e.getMessage());
		}
	}

	public boolean selectByVisibleText(By locator, String value, String locatorName)
			throws Throwable {

		boolean flag = false;
		try {
			WebElement dropDownListBox = driver.findElement(locator);
			Select clickThis = new Select(dropDownListBox);
			clickThis.selectByVisibleText(value);
			flag = true;
//			extentReportsLog(true, "Selected the value: '"+value+"' for the element: '"+locatorName+"' successfully.");
			return true;
		} catch (Exception e) {
//			extentReportsLog(false, "Failed to select the value: '"+value+"' for the element: '"+locatorName+"' "+ e.getMessage());
			return false;
		} finally {
			if (flag == false) {
				/*this.reporter.failureReport("Select", "'"+value+"'"
						+ "is Not Select from the DropDown " + locatorName);*/
				// throw new ElementNotFoundException("", "", "");

			} else if (flag == true) {
				/*this.reporter.SuccessReport("Select", "'"+value+"'"
						+ " is Selected from the DropDown " + locatorName);*/
			}
		}
	}

	public boolean selectByIndex(By locator, int value, String locatorName)
			throws Throwable {

		boolean flag = false;
		try {
			WebElement dropDownListBox = driver.findElement(locator);
			Select clickThis = new Select(dropDownListBox);
			clickThis.selectByIndex(value);
			flag = true;
//			extentReportsLog(true, "Selected the value: '"+value+"' for the element: '"+locatorName+"' successfully.");
			return true;
		} catch (Exception e) {
//			extentReportsLog(false, "Failed to select the value: '"+value+"' for the element: '"+locatorName+"' "+ e.getMessage());
			return false;
		} finally {
			if (flag == false) {
				/*this.reporter.failureReport("Select", "'"+value+"'"
						+ "is Not Select from the DropDown " + locatorName);*/
				// throw new ElementNotFoundException("", "", "");

			} else if (flag == true) {
				/*this.reporter.SuccessReport("Select", "'"+value+"'"
						+ " is Selected from the DropDown " + locatorName);*/
			}
		}
	}

	/**
	 * Method Name: assertElementExists
	 * Purpose: Assert for element 
	 * @param by
	 * @param elementName
	 * @throws IOException 
	 */
	public void  assertElementExists(By by,  String elementName) throws IOException{
		try {
			driver.findElement(by).isDisplayed();
//			extentReportsLog(true, "Expected element is visibile:  Element:"+elementName);
		} catch (Exception e) {
//			extentReportsLog(false, "Expected element is NOT visibile  Element:"+elementName);
		}
	}


	/**
	 * Method Name: IsElementExists 
	 * Purpose: Method verify is element IsDisplyed and return true /false
	 * @param by
	 * @param elementName
	 * @return
	 * @throws IOException 
	 */
	public boolean IsElementExists(By by,  String elementName) throws IOException{
		try {
			waitForElementToBClickable(by, elementName);
			if(driver.findElement(by).isDisplayed());
			Reporter.addStepLog("The element: '"+elementName + "' is displayed successfully.");
			return true;
		} catch (Exception e) {
			Reporter.addStepLog("Failed to find the element: '" +elementName+"'.");
			return false;
		}
	}

	/**
	 * Method Name: IsElementExists 
	 * Purpose: Method verify is element IsDisplyed and return true /false
	 * @param by
	 * @param elementName
	 * @return
	 * @throws Exception 
	 */
	public  void waitForElementPresent(By by,
			String elementName) throws Exception{

		for (int i = 0; i < 60; i++) {
			if(driver.findElements(by).size()>0){
				break;
			}
			else{
				Thread.sleep(1000);
				System.out.println("No element is found trying again..." + elementName);
			}

			if(i==59){
//				extentReportsLog(false, "Expected element(s) NOT found");
				throw new Exception("Expected element(s) NOT found");
			}
		} 
	}

	/**
	 * Method Name: getElementAttributeValue 
	 * Purpose: Method return element's specified attribute value;
	 * @param by
	 * @param elementName
	 * @param attribute
	 * @return String element attribute value 
	 * @throws Exception
	 */
	/*public String  getElementAttributeValue(By by,  
			String elementName,
			String attribute) throws Exception{
		try {
			String attvalue=  driver.findElement(by).getAttribute(attribute);
			extentReportsLog(true,"Get Attribute value form Element");
			return attvalue;
		} catch (Exception e) {
			extentReportsLog(false, "Either element or Specified attribute NOT exists");
			throw new  Exception ("Either element or Specified attribute NOT exists");
		}
	}*/
	public String  getElementAttributeValue(By by,
			String attribute) throws Exception{
		try {
			String attvalue=  driver.findElement(by).getAttribute(attribute);
//			extentReportsLog(true,"Get Attribute value form Element");
			return attvalue;
		} catch (Exception e) {
//			extentReportsLog(false, "Either element or Specified attribute NOT exists");
			throw new  Exception ("Either element or Specified attribute NOT exists");
		}
	}

	
	
	
	public void switchToSpecificWindowAndVerifyElement(  
			String windowTitle,By elementToVerify, String elementName) throws Exception{
		try {
			Set<String>allWindows=  driver.getWindowHandles();
			for(String child_wndow : allWindows){
				
				 driver.switchTo().window(child_wndow);
//				 extentReportsLog(true,"Navigated to the window: '"+windowTitle+"' successfully.");
				 if(driver.getTitle().contains(windowTitle)){
					 waitForElemenent(elementToVerify, elementName);
				 
				IsElementExists(elementToVerify, elementName);
				 
			 }
				 
			}
			driver.close();
			
			
		} catch (Exception e) {
//			extentReportsLog(false, "Failed to navigate to window and verify the element: '"+ elementName+"'.");
			throw new  Exception ("Either element or Specified attribute NOT exists");
		}
	}
	
	

	
//	public void extentReportsLog(boolean status, 
//			String messageString) throws IOException{
//		if (status)
//		{
//			if (alwasyTakeScreenShot)
//			{
//				logger.log(LogStatus.PASS, 
//						messageString +
//						logger.addScreenCapture(screenShotForPass(driver)));
//			}else{
//				logger.log(LogStatus.PASS, messageString);
//			}
//		}
//
//		else{
//			logger.log(LogStatus.FAIL, 
//					messageString /*+
//					logger.addScreenCapture(screenShotForPass(driver))*/);  //TODO:
//		}
//	}


	public void hoverOn(By by, String elementName) throws Exception{
		try {
			waitForElementToBClickable(by, elementName);
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(by)).build().perform();
//			extentReportsLog(true, "Hovered on the element: '"+elementName+"' successfully.");
		} catch (Exception e) {
//			extentReportsLog(false, "Failed to hover on the element: '"+elementName+"'.");
			throw new Exception ("Element Not found or Element state not not ready to perform action");
		}
	}
	
	/**
	 * Method Name: searchMeasure
	 * Purpose: Search a Measure
	 * Created by: Gayathri Sathyanarayana
	 * @throws Exception 
	 *
	 */
	public void searchMeasure(By by, String measureName, String elementName) throws Exception{
		try {
			waitForElementToBClickable(by, elementName);
			type(by, measureName, elementName);
//			click(by, elementName);			
//			extentReportsLog(true, String.format("Entered Measure name and displays the Measure: '%s' successfully.", measureName));			
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Failed to search the measure: '%s'.", measureName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	/**
	 * Method Name: clickMeasure
	 * Purpose: Open a Measure
	 * Created by: Gayathri Sathyanarayana
	 * @throws Exception 
	 *
	 */
	public void clickMeasure(By by, By searchBy, String measureName, String elementName) throws Exception{
		try {
			searchMeasure(by, measureName, elementName);
			click(searchBy, elementName);			
//			extentReportsLog(true, String.format("Measure is opened : '%s' successfully.", measureName));
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Failed to open the measure: '%s'.", measureName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	/**
	 * Method Name: checkEraserIcon
	 * Purpose: Check for the presence of the eraser icon
	 * Created by: Gayathri Sathyanarayana
	 * @throws Exception 
	 *
	 */
	public void checkEraserIcon(By by, String elementName) throws Exception{
		try {
			Boolean status =driver.findElement(by).isEnabled();			
			if (!status) {}			
//			extentReportsLog(true, String.format("Eraser Icon is disabled in: '%s'", elementName));
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Eraser Icon is enabled in: '%s'", elementName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
	
	/**
	 * Method Name: checkEraserIcon
	 * Purpose: Check for the presence of the eraser icon
	 * Created by: Gayathri Sathyanarayana
	 * @throws Exception 
	 *
	 */
	public void assertText(By by, String expected, String elementName) throws Exception{
		try {
			Assert.assertEquals(driver.findElement(by).getText(), expected);	
//			extentReportsLog(true, String.format("Verified: '%s'", elementName));
		} catch (Exception e) {
//			extentReportsLog(false, String.format("Fail: '%s'", elementName));
			throw new Exception ("Element Not found or Element state not ready to perform action");
		}
	}
		
	
	
	
}

