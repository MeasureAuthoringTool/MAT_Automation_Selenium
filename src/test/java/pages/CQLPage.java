package pages;

import org.openqa.selenium.By;

public class CQLPage {
	
	public static By lblCQLWorkspace = By.cssSelector("b[title*='CQL Workspace']");
	
	public static By lnkDefinition = By.xpath("//a[contains(.,'Definition')]");
	
	public static By txtDefinitionName = By.id("defineNameField");
	
	public static By txtFunctionName = By.id("FunctionNameField"); // Sprint 142 updated by bhuvan laxman on 04/26/2018
	
	public static By txtParameterName = By.id("parameterNameField"); // Sprint 142 updated by bhuvan laxman on 04/26/2018
	
	public static By btnInsert = By.id("insertButton_definition"); // Plus button
	public static By btnClose = By.id("closeButton_Cancel"); //Cancel button  appears on popup
	
	public static By btnSave = By.id("saveButton_definition"); // Floppy button
	
	public static By dropdownItemType = By.id("availableItemToInsert_ListBox"); // Option=Parameters
	
	public static By dropdownItemName = By.id("listAllItemNames_ListBox"); // Option=Measurement Period
	
	public static By btnInsert_InInsertItemIntoCQLEditor = By.id("addButton_Insert");
	
	public static By btnInsert_InInsertTimingExpressionIntoCQLEditor = By.id("InsertButton_Id");
	
	
	
	//public static By optionInDefinition = By.cssSelector("#defineListBox>option[title='Test Definition Name']");
		
	public static By lblCQLTimingExpression = By.id("cqlTimingExpresionLabel");
	
	public static By btnBuildCQLTimingExpresionToggle = By.id("anchorButton_id");
	
	public static By menuitemPrimaryTimings = By.id("PrimaryTimingSubMenu_achor");
	
	//public static By menuitemDuring_InPrimaryTimings = By.xpath("//*[@id='PrimaryTimingsSubMenu_DropDownMenu']//li//a[contains(text(),'during')]");
	
	public static By menuitemTimeQualifiers = By.cssSelector("#timingQualifierItem_Id>a");
	
	public static By lblAvailableTimingQualifiers = By.cssSelector("label[title='Available Timing Qualifiers']");
	
	public static By dropdownAvailableTimingQualifiers = By.id("TimingQualifier_listBox"); // ends during
	
	public static By btnReplace = By.id("addButton_Button");
	
	public static By menuitemTimePrecision = By.id("timePrecisionAnchor_Id");
	
	
	
	public static By EraserIcon = By.xpath("//button[@title='Erase']");
	
/*	public static By ParameterEraserIcon = By.id("eraseButton_parameter");
	
	public static By DefinitionEraserIcon = By.id("eraseButton_definition");
	
	public static By FunctionEraserIcon = By.id("eraseButton_function");  */
	
	/*End of Modification
	 * 
	 */
	
	
	
	//public static By menuitemHour_InTimePrecision = By.id("//*[@id='TimePrecisionSubMenu_Anchor']//li//a[contains(text(),'hour')]");
	
	
}