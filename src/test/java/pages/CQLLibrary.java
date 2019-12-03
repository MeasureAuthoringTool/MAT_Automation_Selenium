package pages;

import org.openqa.selenium.By;

public class CQLLibrary {

	public static By tabCQLLibrary = By.xpath("//div[@id='CQL Library']/div"); 
	public static By lnkNewCQLLib=By.id("newLibrary_button");
	public static By txtCQLLibName=By.id("CQLLibraryName_Input");
	public static By cqlnamesave=By.id("SaveAndContinueButton_cqlDetail");
	public static By btnYesPopup=By.xpath("//button[@id='yes_Button']");
	public static By txtSearchLib=By.xpath("//input[@title='Search by Library Name or Owner']");
	public static By btnSearchLib=By.id("SearchWidgetButton_forCqlLibrary");
	public static By iconCQLVer=By.xpath("//table[@id='CQLLibrarySearchCellTable']/tbody[1]/tr/td[3]/div/button");
	public static By btnSavecqllibVersion=By.id("SaveAndContinueButton_cqlVersion");
	public static By cqllibcontinurebtn = By.xpath("//button[@id='Yes_ConfirmDialogBox']");
	public static By txtAliasLib=By.id("aliasNameField_IncludeSection");
	public static By txtSearchIncludes=By.xpath("//table[@id='vPanel_VerticalPanelIncludeSection']//input[@title='Enter Search Text here']");
	public static By btnSearchIncludes=By.xpath("//table[@id='vPanel_VerticalPanelIncludeSection']//button[@title='Search']");
	public static By chkboxTopSearchLibIncludes=By.xpath("//table[@id='IncludeLibraryTable']/tbody[1]/tr[1]/td[4]/div/table/tbody/tr/td/input");
	public static By btnSaveIncludes=By.id("saveButton_includes");
	public static By lnkIncludes = By.id("includesLabel_Label");
	public static By iconEditAlias=By.id("editButton_includesAliasModify");
	public static By chkboxTopReplaceLib=By.xpath("//table[@id='IncludeLibraryTable']/tbody[1]/tr[1]/td[4]/div/table/tbody/tr/td/input");
	public static By btnApplyEditLib=By.xpath("//div[@id='EditIncludedLibraryDialogBox']//button[@title='Apply']");
	public static By btncancelEditLib=By.id("CancelButton_EditInclude");
	public static By msgCodesCQLLib=By.xpath("//table[@id='CQLStandaloneWorkSpaceView.containerPanel']//div[@id='WarningMessage']/div/b");
	
	
	
	
	
	public static By btnCreateLibrary = By.id("newLibrary_button");//Create item folder Updated Raghu 07/15/2017
	public static By dropdownCreateLibrary = By.id("CreateItemWidget_forCqlLibrary"); // Option: "New Library" "Library Version of Draft","Draft of Existing Library"
	public static By btnCreate = By.id("createItem_Button_forCqlLibrary"); //Create button
	public static By txtLibraryName = By.id("CQLLibraryName_Input"); //CQL Library name.
	public static By btnContinueBu = By.id("yes_Button"); //CQL Library name.
	public static By btnSaveandContinueLi = By.id("ButtonPanel_SaveAndContinueButton_cqlDetail"); //Save and continue button Updated Raghu
	public static By btnConfirmationContinue = By.id("yes_Button");///updated as new objectcreated for continue button  04/25/2018
  	public static By lblCQLLibraryWorkspace = By.xpath("//*[@id='CQL Library Workspace']/div");
	//public static By lblCQLLibraryWorkspace = By.xpath("//b[@title='CQL Library Workspace']"); //CQL Library Workspace Label
	public static By lblGeneralInformation = By.xpath("//a[contains(.,'General Information')]");
	public static By btnSaveGeneralInfo = By.id("saveButton_GeneralInfo"); //Save button general info
	public static By btnCancelButton = By.id("closeButton_GeneralInfo"); //Save button general info
	public static By txtGenLibraryName = By.id("libraryNameValue_TextBox"); //CQL Library name general information.
	public static By txtVersion = By.id("libraryVersionValue_TextBox"); //CQL Library name general information.
	public static By lnkGeneralInformation = By.xpath("//a[contains(.,'General Information')]");
	
	public static By lnkValueSetsCodes = By.xpath("//a[contains(.,'Value Sets/Codes')]");
	public static By lnkParameter = By.id("paramLabel_Label");
	public static By lnkDefinition = By.id("defineLabel_Label");
	public static By lnkFunction = By.id("functionLibLabel_label");	
	
	public static By topMeasureIMesureNameTable=By.xpath("//*[@id='SearchFilterWidget_SearchInputHPanel_forMeasure']/tbody/tr/td/input");  // do not merge 

	
	public static By savecontbtn = By.xpath("//button[@id='SaveAndContinueButton_cqlDetail']");
	public static By valuesetname = By.xpath("//input[@id='nameInput_TextBox']");
	public static By cqlSearchbox = By.xpath("//*[@id=\"SearchFilterWidget_SearchInputHPanel_forCqlLibrary\"]/tbody/tr/td/input");
	public static By cqlSearchbtn = By.xpath("//button[@id='SearchWidgetButton_forCqlLibrary']");
	public static By cqledit = By.xpath("//*[@id=\"MostRecentActivityCellTable\"]/tbody[1]/tr[1]/td[3]/div/button/i");
	public static By cqleditnamebox = By.xpath("//input[@id='libraryNameValue_TextBox']");
	
	public static By SaveNewcqlname = By.xpath("//button[@id='saveButton_GeneralInfo']");
	public static By selectCqlTab = By.xpath("//*[@id='CQL Library']//b");
	public static By createNewCql = By.xpath("//button[contains(@class,'createNewButton') and (@title='Click to create new library')]");
	
	public static By ContinueCql = By.xpath("//button[contains(@class,'btn') and (@title='Continue')]");
	public static By addCommentCql = By.xpath("//*[@id='commentsContent']");
	public static By saveCommentCql = By.xpath("//button[@id='saveButton_GeneralInfo']");
	public static By selectParameter = By.xpath("//span[@id='paramLabel_Label']");
	public static By addParameter = By.xpath("//input[@id='parameterNameField']");
	public static By saveParameter = By.xpath("//button[@id='saveButton_parameter']");
	public static By selectDefinition = By.xpath("//span[@id='defineLabel_Label']");
	
}
