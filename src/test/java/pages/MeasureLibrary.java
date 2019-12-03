package pages;

import org.openqa.selenium.By;


public class MeasureLibrary {
	
	
	public static By lnkNewMeasureLib=By.xpath("//button[@id='newMeasure_button']");
	public static By tabMeasureLibrary = By.xpath("//div[contains(text(), 'Measure Library')]");
	public static By headerRecentActivity = By.xpath(".//*[@id='searchHeader_Label']");
	public static By headerMyMeasure= By.xpath(".//*[@id='measureSearchHeader_Label']");
	public static By searchButton = By.id("SearchWidgetButton_forMeasure");
	public static By topMeasureShareIcon=By.xpath("//*[@title='Shareable' and @style='color: darkseagreen;']");
	public static By topShareMeasureWith=By.xpath("//table[@id='measureShareCellTable']/tbody[1]/tr[1]/td[3]/div/input");
	public static By btnSaveAndConShare=By.xpath("//*[@id=\"SaveAndContinueButton_measureVersion\"]");
	public static By measureType=By.xpath("//li[@title='Measure Type']");
	public static By chkboxMeasureType1=By.xpath("(//input[@type='checkbox'])[7]");
	public static By chkboxMeasureType2=By.xpath("(//input[@type='checkbox'])[4]");
	public static By chkboxMeasureType3=By.xpath("(//input[@type='checkbox'])[1]");
	public static By btnSaveGeneralInfo=By.xpath("//button[@title='Save']");
	public static By btnApply=By.xpath("//div[@id='searchPanel_VerticalPanel']//button[@title='Apply']");
	public static By txtSearchMeasure=By.xpath("//table[@id='SearchFilterWidget_SearchInputHPanel_forMeasure']//input[@class='form-control']");
	public static By btnSearchMeasure=By.xpath("//*[@id='SearchWidgetButton_forMeasure']");
	public static By iconTopVersion=By.xpath("//table[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[3]/div/button");
	public static By radioMajor=By.xpath("(//input[@id='gwt-uid-7'])");
	public static By radioMajor2=By.xpath("(//input[@id='gwt-uid-16'])");
	public static By btnSaveVersion=By.id("SaveAndContinueButton_measuVersion");
	public static By btnSavecontinueVersion=By.xpath("//*[@id='Yes_ConfirmDialogBox']");
	public static By MeasureLibrarytab = By.xpath("//h1[contains(text(),'Measure Library')]");
	public static By Measuretab = By.xpath("//*[@id='Measure Library']");
	
	
	//*[@id="Measure Library"]
	
	public static By searchMeasureTxtBox = By.xpath("//input[@class='form-control']");
	
	public static By selectMeasure = By.xpath("//tr[@class='GBRY34TII cellTableOddRow'][1]//td[1]");
	
	public static By btnFilteMeasureButton = By.id("filterButton_forMeasure");
	
	public static By checkAllMeasure = By.xpath("//*[@title='All Measures']");
	
	
	
	public static By lnkParaLeftNav=By.id("paramLabel_Label");
	
	
	
	
	
	public static By iconInsertDefi=By.id("insertButton_definition");
	
	public static By iconInsertFunc=By.id("insertButton_function");
	
	
	
	
	
	
	
	public static By labeltxtPara=By.id("ParameterName_Label"); // updated by Raghu 07/14/2017
	
	
	
	//public static By lnkCQLLibrary=By.id("CQL Library");
	public static By lnkCQLLibrary=By.xpath("//table[@id='panel_HorizontalPanel']/tbody/tr/td[4]/div/div");
	
	public static By lnkValueSets=By.xpath("//span[@id='valueSetLabel_Label']");
	
	public static By labelSuppElements=By.xpath("//div[@id='QDMElementFlowPanel']//b");
	
	 // Updated by Bhuvan 04/24/2016
	//public static By txtCodeId=By.xpath("//*[@id='searchPanel_VerticalPanel1']/div[2]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/input//div");
	
	
//	public static By txtCodeDesc=By.xpath("//div[@id='searchPanel_VerticalPanel']//input[@title='Code Descriptor']");
	
	
	public static By txtCode=By.xpath("//div[@id='searchPanel_VerticalPanel']//input[@title='Code']");
	
	
	
	
	public static By insertbtn=By.xpath("//button[@class='btn btn-primary btn-sm']");
	public static By build_cql_expression=By.xpath("(//div[@class='ace_content'])[1]");
	public static By attributemode=By.xpath("//select[@id='Mode_listBox']");
	public static By attributemodedetail=By.xpath("//select[@id='ModeDetails_listBox']");
	public static By errormsg=By.xpath("(//span[@class='help-block'])[2]");
	
	public static By txtCodeSys=By.xpath("//div[@id='searchPanel_VerticalPanel']//input[@title='Code System']");
	
	
	public static By txtCodeSysVer=By.xpath("//div[@id='searchPanel_VerticalPanel']//input[@title='Code System Version']");
	
	
	
	
	
	public static By btnCancel=By.xpath("//div[@id='searchPanel_VerticalPanel']//button[@title='Cancel']");
	
	
	public static By lnkDefinition=By.id("defineLabel_Label");
	
	
	public static By editValueSet=By.xpath("//table[@id='AppliedQDMTable']/tbody[1]/tr[1]/td[5]/div/table/tbody/tr/td[1]/button");
	
	public static By delValueSet=By.xpath("//table[@id='AppliedQDMTable']/tbody[1]/tr[1]/td[5]/div/table/tbody/tr/td[2]/button");
	
	
	public static By chkboxFirstInMeasureTypeList = By.xpath("//*[@id='MeasureTypeListCellTable']/tbody[1]/tr[1]/td[1]//input");
	public static By chkboxFilterMyMeas=By.xpath("//input[@title='Filter by My Measures']");
	public static By chkboxFilterMyLib=By.xpath("//input[@title='My Libraries']");
	
	public static By signoutMat=By.id("Anchor_signOut");
//	public static By radioPatientNo=By.id("gwt-uid-323");
	
	public static By lnkAdvanceSerchInMeasureLib=By.xpath("//*[@id='panel_measureFilterVP']/tbody/tr[2]/td/table/tbody/tr/td/a");
	
	
	public static By dropdownScoring=By.id("measScoringInput_ListBoxMVP");
//	public static By radioYes=By.xpath("//span[@id='RadioBtn_Yes']/input");
//	public static By radioNo=By.xpath("//span[@id='RadioBtn_No']/input");
	
//	public static By dropdownPatientBased=By.id("patientBasedMeasure_listbox");
	public static By dropdownPatientBased=By.xpath("//*[@id='patientBasedMeasure_listbox']");
	
//	public static By iconInfo=By.xpath("//button[@title='Information']");
	
	public static By lnkClickToViewCQL=By.xpath("//div[@id='panelGroup']/div/div[1]/a");
	public static By lnkFunction=By.xpath("//span[@id='functionLibLabel_label']");
	
	public static By iconInsert=By.xpath("//button[@title='Insert']");
	
	public static By btnDel=By.xpath("//table[@id='CQLLibrarySearchCellTable']/tbody[1]/tr[1]/td[6]/div/button");
	
	public static By txtPwd=By.xpath("//input[@id='password_PasswordTextBox']");
	
	public static By btnConfirm=By.xpath("//div[@class='modal-dialog']//div[3]/button");
	
	public static By topLibraryInSearchTable=By.xpath("//table[@id='CQLLibrarySearchCellTable']/tbody[1]/tr/td[1]");
	
	public static By topMeasureInSearchTable=By.xpath("//table[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[1]");
	
	
	public static By txtCodeIdentifier=By.xpath("//table[@class='secondLabel']//input[@title='Enter Code Identifier']");
	
	public static By topMeasureEditInSearchTable=By.xpath("//table[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[5]/div/button");
	public static By topMeasureExportInSearchTable=By.xpath("//*[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[8]/div/table/tbody/tr/td[1]/button");
	
	public static By txtRetType=By.xpath("//input[@id='returnTypeTextArea_Id']");
	
	public static By btnDelTopValueSet=By.xpath("//table[@id='AppliedQDMTable']/tbody[1]/tr/td[5]/div/table/tbody/tr/td[2]/button");
	public static By btnDelThirdTopCode=By.xpath("//table[@id='AppliedCodeTable']/tbody[1]/tr[3]/td[5]/div/table/tbody/tr/td/button");
	
	
	
	
	
	
	
	
	public static By dropdownIOAttribute=By.xpath("//select[@id='Atrr_listBox']");
	
	
	
	
	
	
	
	public static By btnSaveGeneralInfoTop=By.xpath("//button[@id='saveButton_Button1']");
	

	
	public static By btnYesWarningDeletion=By.id("yes_Button");
	public static By txtSaveMsg=By.xpath("//div[@id='WarningMessage']/div/b");
	
	public static By lnkNewLibrary=By.xpath("//button[@id='newLibrary_button']");
	public static By txtLibName=By.id("txtLibName");
	public static By btnSaveLibName=By.xpath("//button[@id='ButtonPanel_SaveAndContinueButton_cqlDetail']");
	
	public static By btnYesDirtyChk=By.xpath("//button[@id='Clear_Yes_Button']");
	
	
	
	
	
	
	
	public static By radioMinor=By.xpath("//div[@class='contentPanel leftAligned']//table[2]/tbody/tr[4]/td/span/input");
	public static By btnpackagesaveversion = By.xpath("//button[@id='SaveAndContinueButton_measuVersion']");
	
	
	

	
	
	
	
	
	
	
	
	public static By txtSearchLeftNavAlias=By.xpath("//select[@id='includesNameListBox_ListBox']/option");
	
	public static By labelReplaceLib=By.id("//label[@id='cqlRepLibrary_Label']");
	public static By txtOID=By.xpath("//input[@title='Enter OID Required']");
	
	public static By msgAliasUpdate=By.xpath("//table[@id='CQLWorkspaceView.containerPanel']//*[@id='WarningMessage']/div/b");
	
	
	public static By tabMeasureLib=By.xpath("//div[@id='Measure Library']/div");
	//public static By tabCQLLib=By.xpath("//div[@id='CQL Library']/div/b");
	public static By tabCQLLib=By.xpath("//*[@id='CQL Library']/div");
	public static By lnkNewLib=By.id("newLibrary_button");
	public static By txtSearchCQLLib=By.xpath("//table[@id='SearchFilterWidget_SearchInputHPanel_forCqlLibrary']//input");
	
	public static By btnSaveCQLLib=By.id("ButtonPanel_SaveAndContinueButton_cqlVersion");
	
	public static By btnSaveCQLLibCreate=By.id("ButtonPanel_SaveAndContinueButton_cqlDetail");
	
	
	
	


	
	
	
	
	
	
	
	
	//public static By topMeasureShareIcon=By.xpath("//table[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[6]/div/button");
	
	
	public static By topMeasurecloneIcon=By.xpath(".//*[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[7]/div/button");  // Sprint 143 updated by Bhuvan Laxman on 05/16/2018
	
	
	public static By txtVersionBirthdate=By.xpath("//table[@id='AppliedCodeTable']/tbody[1]/tr[1]/td[4]/div/span");
	public static By txtVersionDead=By.xpath("//table[@id='AppliedCodeTable']/tbody[1]/tr[2]/td[4]/div/span");
	public static By txtAppliedCodesTable=By.xpath("//*[@id='hPanel_HorizontalPanel']/tbody/tr[2]/td/div/div[2]/div/p[contains(text(),'No Codes.')]"); //  - B'date and dead code table updated by Bhuvan on 04/23/2018
	
	
	
	public static By lnkClearCode=By.id("clearButton_codes");
	public static By dropdownEndorsedByNQF=By.id("endorsedByNQFListBox");
	public static By txtNQFNumber=By.xpath(".//*[@id='NQFIDInput_TextBox']");
	public static By tabMeasureDetails=By.id("Measure Details");
	public static By lnkClicktoview=By.xpath(".//*[@id='panelGroup']/div/div[1]/a");
//	public static By btnContinue=By.xpath("//button[@id='Clear_Yes_Button']");
	public static By btnContinue=By.xpath("//button[@id='Clear_Yes_Button']");
	public static By btnContinue1=By.xpath(".//*[@id='main']/div[4]/div[2]/div/div[3]/div/button[1]");
	public static By LblMeasureObs=By.xpath("//*[@id='measureObInputLabel']");
	
	public static By txtSerchText=By.xpath("//*[@id='searchTextId']"); 
	public static By dropdownSerchBy=By.xpath("//*[@id='searchTextInput']"); 
	public static By dropdownShowOnly=By.xpath("//*[@id='stateGroup']"); 
	public static By chkboxCohort=By.xpath("//*[@id='main']/div[4]/div[2]/div/div[2]/div[4]/table[3]/tbody/tr/td[1]/div/label/input");
	public static By chkboxContinuous=By.xpath("//*[@id='main']/div[4]/div[2]/div/div[2]/div[4]/table[3]/tbody/tr/td[2]/div/label/input");	
	public static By chkboxProportion=By.xpath("//*[@id='main']/div[4]/div[2]/div/div[2]/div[4]/table[3]/tbody/tr/td[3]/div/label/input");	
	public static By chkboxRatio=By.xpath("//*[@id='main']/div[4]/div[2]/div/div[2]/div[4]/table[3]/tbody/tr/td[4]/div/label/input");	
	public static By dropdownPtientBase=By.xpath("//*[@id='patientBase']");
	public static By dropdownModifiedDate=By.xpath("//*[@id='modifiedDate']");
	public static By txtModifiedById=By.xpath("//*[@id='modifiedById']");
	public static By txtOwnedById=By.xpath("//*[@id='ownedById']");
	public static By btnSerchInAdvance=By.xpath("//*[@id='main']/div[4]/div[2]/div/div[2]/div[9]/button[1]");
	public static By btnCancelInAdvance=By.xpath("//*[@id='main']/div[4]/div[2]/div/div[2]/div[9]/button[2]");
	
	public static By btnsavecontinue=By.id("Yes_ConfirmDialogBox");
	public static By versionsuccmsg = By.xpath("//div[@class='alert alert-success']/div[@class='gwt-HTML']/b[contains(text(), 'test')]");
	
	
	
}                                               
