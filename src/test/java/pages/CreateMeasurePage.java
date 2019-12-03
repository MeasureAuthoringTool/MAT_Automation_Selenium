package pages;

import org.openqa.selenium.By;

public class CreateMeasurePage {
	
	
	//public static By createNewMeasure_name=By.xpath("//*[@id='newMeasure_button']");
	public static By createNewMeasure_name=By.xpath("//textarea[@id='MeasureNameTextArea']");
	
	public static By ecqmTitle=By.xpath("//*[@id='ShortNameTextBox']");
	public static By cql_title=By.xpath("//textarea[@id='CqlLibraryNameTextArea']");
	public static By dropdownMeasureScoring = By.id("measScoringInput_ListBoxMVP"); 
	public static By measyresavecont = By.xpath("//button[@id='SaveAndContinueButton_measureDetail']");
	public static By popup=By.xpath("//button[@id='yes_Button']");
	public static By endorsed_by_nqf = By.xpath("//select[@id='endorsedByNQFListBox']");
	public static By nqf_number = By.xpath("//input[@id='NQFIDInput_TextBox']");
	public static By btn_generate_identifire = By.xpath("//button[@id='generateeMeasureIDButton_Button']");
	public static By btn_final_measure_save = By.xpath("//button[@title='Save']");
	public static By saved_success_message = By.xpath("//b[contains(text(),'Changes for the General Measure Information section have been successfully saved.')]");
	public static By createNewMeasure_PatnBasedInd=By.xpath("//*[@id='patientBasedMeasure_listbox']");
	public static By createNewMeasure_save=By.xpath("//*[@id='SaveAndContinueButton_measureDetail']");
	public static By createNewMeasure_popupContinue=By.xpath("//*[@id='yes_Button']");
	public static By createNewMeasure_cancel=By.xpath("//*[@id='CancelButton_componentMeasures']");
	public static By componenetMeasure_save=By.xpath("//*[@id='SaveAndContinueButton_componentMeasures']");
	public static By select_populationWorkspace=By.xpath("//*[@id='Population Workspace']/div");
	public static By initial_population=By.xpath("//*[@id='Initial Populations_Anchor']");
	public static By initial_population_save=By.xpath("//*[@id='saveButton_Initial Population']");
	public static By select_measure_package=By.xpath("//div[@id='Measure Packager']");
	public static By select_initail_population=By.xpath("//div[@title='Initial Population 1']");
	public static By button_arrow=By.xpath("//button[@id='AddClauseToRight']");
	public static By save_grouping=By.xpath("//button[@id='Save_Grouping_button']");
	public static By SavedMessage=By.xpath("//b[contains(text(),'Grouping has been saved')]");
	public static By save_measure_packegeButton=By.xpath("//button[@id='Create_Measure_Package_button']");
	public static By measure_packegeButton_export=By.xpath("//button[@id='Create_Package_and_Export_button']");
	public static By txtName = By.xpath("//textarea[@id='NameTextArea']");
	public static By txtAbbreviatedName = By.xpath("//input[@id='ShortNameTextBox']");
	public static By search_measure = By.xpath("//input[@title='Search by Measure Name, Owner, Abbreviated title, or eCQM Identifier']");
	public static By searchByLibrary = By.xpath("//input[contains(@title,'Search by Library')]");
	public static By search_measure_btn = By.xpath("//button[@title='Search']");
	public static By searchLibraryBtn = By.xpath("(//button[@title='Search'])[2]");
	
	public static By tabMeasureLibrary = By.xpath("//div[contains(text(),'Measure Library')]");
	public static By btnGenerateIdentifier = By.id("generateeMeasureIDButton_Button");
	public static By btnCreateMeasure = By.id("createElement_measureLib");
	public static By lblCreateNewMeasure = By.xpath("//*[contains(text(),'Create New Measure')]");
	public static By btnCreate = By.xpath("//button[@id='newMeasure_button']");
	public static By btnWarningMsgContinue = By.xpath(".//*[@id='main']/div[4]/div[2]/div/div[3]/div/button[1]");
	public static By new_measure_composer = By.xpath("//button[@class='createNewCompositeButton']");
	public static By new_measure_composersitemapicon = By.xpath("//i[@class='fa fa-sitemap fa-lg']");
	public static By compositemeasureHeader = By.xpath("//h1[contains(text(),'My Measures > Create New Composite Measure')]");
	public static By compositeAllFieldsrequired = By.xpath("//*[contains(text(),'Caution')]");
	public static By composite_messure_name = By.xpath("//textarea[@title='Enter Measure Name Required.']");
	public static By composite_messure_abbreviated = By.xpath("//input[@title='Enter eCQM Abbreviated Title Required']");
	public static By composit_scoring_method = By.id("compositeScoringInput_ListBoxMVP");
	public static By composite_measure_scorint = By.id("measScoringInput_ListBoxMVP");
	public static By composite_save_continue = By.id("SaveAndContinueButton_compositeMeasureDetail");
	public static By composite_cancel = By.id("CancelButton_compositeMeasureDetail");
	public static By composite_final_save_continue = By.id("SaveAndContinueButton_componentMeasures");
	public static By compositesavebtn = By.xpath("(//button[@title='Save and Continue'])[2]");
	public static By composite_name_error_mesg = By.xpath("//div[@class='alert alert-danger']/div[@class='gwt-HTML']/b[contains(text(), 'A measure')]");
	public static By composite_CQL_error_mesg = By.xpath("//div[@class='alert alert-danger']/div[@class='gwt-HTML']/b[contains(text(), 'A CQL Library')]");
	public static By composite_abbreviated_error_msg = By.xpath("//b[contains(text(),'An eCQM abbreviated title is required.')]");
	public static By composite_scoring_method_errormsg = By.xpath("//b[contains(text(),'Composite Scoring Method is required.')]");
	public static By measure_scoring_errorMsg = By.xpath("//b[contains(text(),'Measure Scoring is required.')]");
	public static By measurescoring = By.xpath("//select[@id='measScoringInput_ListBoxMVP']");
	public static By measurescoring2 = By.xpath("(//select[@id='measScoringInput_ListBoxMVP'])[2]");
	public static By patientbasedscore = By.xpath("//select[@id='patientBasedMeasure_listbox']");
	public static By patientbasedscore2 = By.xpath("(//select[@id='patientBasedMeasure_listbox'])[2]");
	public static By editcomponentmeshSearchbtn = By.xpath("(//button[@title='Search'])[2]");
	
	public static By measuresettextarea = By.xpath("//textarea[@title='Measure Set Editor']");
	public static By suplementsatasettextarea = By.xpath("//textarea[@title='Supplemental Data Elements Editor']");
	public static By trasmissionformattextfield = By.xpath("//textarea[@title='Transmission Format Editor']");
	public static By InitialPopulationtextfield = By.xpath("//textarea[@title='Initial Population Editor']");
	public static By denominatortextfield = By.xpath("//textarea[@title='Denominator Editor']");
	public static By denominatortextfieldexclusion = By.xpath("//textarea[@title='Denomiator Exclusions Editor']");
	public static By numeratortextfield = By.xpath("//textarea[@title='Numerator Editor']");
	public static By numeratorexclosiontextfield = By.xpath("//textarea[@title='Numerator Exclusions Editor']");
	public static By denominatorexceptiontextfield = By.xpath("//textarea[@title='Denominator Exceptions Editor']");
	public static By measurepopulationtextfield = By.xpath("//textarea[@title='Measure Population Editor']");
	public static By measurepopulationexclusiontextfield = By.xpath("//textarea[@title='Measure Population Exclusions Editor']");
	public static By measureobservationtextfield = By.xpath("//textarea[@title='Measure Observations Editor']");
	public static By Disclaimer = By.xpath("//textarea[@title='Disclaimer Editor']");
	public static By Copyright = By.xpath("//textarea[@title='Copyright Editor']");
	public static By Stratification = By.xpath("//textarea[@title='Stratification Editor']");
	public static By RiskAdjustmenttextfield = By.xpath("//textarea[@title='Risk Adjustment Editor']");
	public static By rateaggregationtextfield = By.xpath("//textarea[@title='Rate Aggregation Editor']");
	public static By Rationaletextfield = By.xpath("//textarea[@title='Rationale Editor']");
	public static By clinicalrecotextfield = By.xpath("//textarea[@title='Clinical Recommendation Editor']");
	public static By improvementnotationtextfield = By.xpath("//textarea[@title='Improvement Notation Editor']");
	public static By definitiontextfield = By.xpath("//textarea[@title='Definition Editor']");
	public static By guidancetextfield = By.xpath("//textarea[@title='Guidance Editor']");
	public static By transmissiontextfield = By.xpath("//textarea[@title='Transmission Format Editor']");
	public static By supplementtextfield = By.xpath("//textarea[@title='Supplemental Data Elements Editor']");
	public static By changesuccessmessage = By.xpath("//*[contains(text(),'Changes for the')]");
	public static By referanceinfofield = By.xpath("//textarea[@title='References']");
	public static By refe_col_desc = By.xpath("//span[contains(text(),'Description')]");
	public static By refe_col_edit = By.xpath("(//span[@title='Index'])[1]");
	public static By refe_col_delete = By.xpath("(//span[@title='Index'])[2]");
	public static By refe_icon_edit = By.xpath("//button[@title='Edit']");
	public static By refe_icon_delete = By.xpath("//button[@title='Delete']");
	public static By refer_item_table = By.xpath("//tr[@class='GB-MJYKBPC GB-MJYKBGD']");
	public static By refe_edit_icon_1 = By.xpath("(//button[@title='Edit'])[1]");
	public static By refe_delete_icon_1 = By.xpath("(//button[@title='Delete'])[1]");
	public static By refe_delete_iconYesBtn = By.xpath("//button[@id='Yes_DeleteConfirmationBox']");
	public static By refe_delete_iconNobtn = By.xpath("//button[@id='No_DeleteConfirmationBox']");
	
	public static By measurenamehead_compo_detail = By.xpath("//span[@title='Measure Name Column']");
	public static By alias_compo_detail = By.xpath("//span[@title='Alias Column']");
	public static By version_compo_detail = By.xpath("//span[@title='Version Column']");
	
	
	
	
	
	
	
	
	
	public static By compositesearched1 = By.xpath("(//input[@type='checkbox'])[11]");
	public static By compositesearched2 = By.xpath("(//input[@type='checkbox'])[17]");
	public static By nopachagedcompositesearched1 = By.xpath("(//input[@type='checkbox'])[2]");
	public static By nopachagedcompositesearched2 = By.xpath("(//input[@type='checkbox'])[3]");
	public static By diffpatientbasedindi1 = By.xpath("(//input[@type='checkbox'])[12]");
	public static By diffpatientbasedindi2 = By.xpath("(//input[@type='checkbox'])[15]");
	public static By diffpatientbasedindicatorerrormsg = By.xpath("//b[contains(text(),'All component')]");
	public static By proportionmaesure1 = By.xpath("(//input[@type='checkbox'])[14]");
	public static By proportionmaesure2 = By.xpath("(//input[@type='checkbox'])[20]");
	public static By scoringmeasurevalidationerror = By.xpath("//b[contains(text(),'component measure')]");
	public static By requiredAliasnameerrormsg = By.xpath("//b[contains(text(),'An alias')]");
	public static By componsnetMeasureColapsible = By.xpath("(//table[@class='GB-MJYKBBK'])[1]");
	public static By nppackagederrormsg = By.xpath("//b[contains(text(),'does not')]");
	public static By measureediticon = By.xpath(".//div[contains(text(),'My Measure')]//following::i[contains(@class,' fa fa-pencil fa-lg')][1]");
	public static By editcompositemeasureheader = By.xpath("//h1[contains(text(),'My Measure')]");
	public static By compositesearched1Aliasname = By.xpath("(//input[@title='Assign Alias Required'])[1]");
	public static By compositesearched2aliasname = By.xpath("(//input[@title='Assign Alias Required'])[1]");
	public static By compositesearched3aliasname = By.xpath("(//input[@title='Assign Alias Required'])[2]");
	public static By editalias = By.xpath("(//input[@title='Assign Alias Required'])[3]");
	public static By aliasmeasure3 = By.xpath("(//input[@title='Assign Alias Required'])[3]");
	public static By measuredetaild = By.xpath("//div[@id='Measure Details']");
	public static By compositedetaileditmeasure = By.xpath("//select[@title='Measure Scoring Required.']");
	
	public static By compositedetaileditmeasuresavewarn = By.xpath("//b[contains(text(),'Changing')]");
	public static By compositedetaileditmeasuresavewarn1 = By.xpath("//li[contains(text(),'Populations')]");
	public static By compositedetaileditmeasuresavewarn2 = By.xpath("//li[contains(text(),'Existing')]");
	public static By compositedetaileditmeasuresavewarn3 = By.xpath("//li[contains(text(),'The Patient')]");
	public static By compositedetaileditmeasuresavewarn4 = By.xpath("//b[contains(text(),'Do you want to continue?')]");
	public static By compositedetaileditmeasuresaveyes = By.xpath("//button[@id='Yes_ConfirmDialogBox']");
	public static By compositedetaileditmeasuresaveno = By.xpath("//button[@id='No_ConfirmDialogBox']");
	
	public static By definitionwarningmsg = By.xpath("//b[contains(text(),'Definition ')]");
	
	
	public static By searchedMeasure = By.xpath("//button[@id='div1']");
	public static By cqlwrkspaceComponentMeasure = By.xpath("//li[@title='Component']");
	public static By cqlwrkspaceComponentMeasures = By.xpath("//li[@title='Component Measures']");
	public static By cqlwrkspaceComponentMeasurealias1 = By.xpath("//option[@title='Test1']");
	public static By cqlwrkspaceComponentMeasurealias2 = By.xpath("//option[@title='Test2']");
	public static By cqlwrkspaceComponentMeasuremeasurename = By.xpath("//input[@id='measureTextBox']");
	public static By cqlwrkspaceComponentMeasureownername = By.xpath("//input[@id='ownerTextBox']");
	public static By cqlwrkspaceComponentMeasurelibraryname = By.xpath("//input[@id='libraryTextBox']");
	
	public static By replacecomponenet = By.xpath("(//input[@type='checkbox'])[25]");
	public static By replaceiconcompo = By.xpath("//button[@title='Click to Replace Depression Utilization of the PHQ-9 Tool']");
	public static By replaceiconcomposelectfirst = By.xpath("(//input[@title='Click checkbox to select'])[23]");
	public static By replaceiconcomposelectsecond= By.xpath("(//input[@title='Click checkbox to select'])[24]");
	public static By Applybutton = By.xpath("//button[@title='Apply']");
	public static By cancelreplacebtn = By.xpath("//button[@id='CancelButton_EditInclude']");
	public static By replaceversion = By.xpath("(//span[@title=' v7.3'])[2]");
	
	//Composite Measure details page tabs
	public static By generalinformation = By.xpath("//li[@title='General Measure Information']");
	public static By generalinformationheader = By.xpath("//b[contains(text(),'General Measure Information')]");
	public static By componentmeasure = By.xpath("//li[@title='Component Measures']");
	public static By componentmeasureheader = By.xpath("//b[contains(text(),'Component Measures')]");
	public static By measuredeveloper = By.xpath("//li[@title='Measure Steward / Developer']");
	public static By measuredeveloperheader = By.xpath("//b[contains(text(),'Measure Steward and Measure Developer')]");
	public static By description = By.xpath("//li[@title='Description']");
	public static By descriptionheader = By.xpath("//b[contains(text(),'Description')]");
	public static By descriptionfield = By.xpath("//textarea[@title='Description Editor']");
	public static By descriptionsavebutton = By.xpath("//button[@title='Save']");
	public static By descriptionUserCheckmark = By.xpath("//i[@class='fa fa-check-circle']");
	public static By referancecheckmarkuser = By.xpath("//i[@class='fa fa-lg fa-check-circle']");
	public static By copyright = By.xpath("//li[@title='Copyright']");
	public static By copyrightheader = By.xpath("//b[contains(text(),'Copyright')]");
	public static By disclaymer = By.xpath("//li[@title='Disclaimer']");
	public static By disclaymerheader = By.xpath("//b[contains(text(),'Disclaimer')]");
	public static By measuretype = By.xpath("//li[@title='Measure Type']");
	public static By measuretypeheader = By.xpath("//b[contains(text(),'Measure Type')]");
	public static By measuretypeefficiency = By.xpath("(//input[@type='checkbox'])[5]");
	public static By stratification = By.xpath("//li[@title='Stratification']");
	public static By stratificationheader = By.xpath("//b[contains(text(),'Stratification')]");
	public static By riskadjestment = By.xpath("//li[@title='Risk Adjustment']");
	public static By riskadjestmentheader = By.xpath("//b[contains(text(),'Risk Adjustment')]");
	public static By rateAgregation = By.xpath("//li[@title='Rate Aggregation']");
	public static By rateAgregationheader = By.xpath("//b[contains(text(),'Rate Aggregation')]");
	public static By rationale = By.xpath("//li[@title='Rationale']");
	public static By rationaleheader = By.xpath("//b[contains(text(),'Rationale')]");
	public static By clinicalrecomentaion = By.xpath("//li[@title='Clinical Recommendation']");
	public static By clinicalrecomentaionheader = By.xpath("//b[contains(text(),'Clinical Recommendation')]");
	public static By improvementnotation = By.xpath("//li[@title='Improvement Notation']");
	public static By improvementnotationheader = By.xpath("//b[contains(text(),'Improvement Notation')]");
	public static By reference = By.xpath("//li[@title='References']");
	public static By referenceheader = By.xpath("//b[contains(text(),'References')]");
	public static By definition = By.xpath("//li[@title='Definition']");
	public static By definitionheader = By.xpath("//b[contains(text(),'Definition')]");
	public static By guidence = By.xpath("//li[@title='Guidance']");
	public static By guidenceheader = By.xpath("//b[contains(text(),'Guidance')]");
	public static By transmitionformat = By.xpath("//li[@title='Transmission Format']");
	public static By transmitionformatheader = By.xpath("//b[contains(text(),'Transmission Format')]");
	public static By populations = By.xpath("//li[@title='Populations']");
	public static By populationsheader = By.xpath("//b[contains(text(),'Populations')]");
	public static By suppliment = By.xpath("//li[@title='Supplemental Data Elements']");
	public static By supplimentheader = By.xpath("//b[contains(text(),'Supplemental Data Elements')]");
	public static By measureset = By.xpath("//li[@title='Measure Set']");
	public static By measuresetheader = By.xpath("//b[contains(text(),'Measure Set')]");
	public static By measurenamelabel = By.xpath("//label[@title='Measure Name']");
	public static By abrivatedtitlelabel = By.xpath("//label[@title='eCQM Abbreviated Title']");
	public static By measurenamefield = By.xpath("//input[@id='measureNameInput']");
	public static By abrivatedtitlefield = By.xpath("//input[@id='abbrInput']");
	public static By savebutton = By.xpath("//button[@title='Save']");
	public static By useractiveMark = By.xpath("//li[@title='General Measure Information' and @class='active']");
	public static By generateidentifier = By.xpath("//button[@id='generateeMeasureIDButton_Button']");
	public static By eCQMID = By.xpath("//input[@id='eMeasureIdentifierInput_TextBox']");
	public static By eCQMIversiom= By.xpath("//input[@id='versionInput']");
	public static By nqferrormesg = By.xpath("//b[contains(text(),'NQF Number')]");
	public static By clonemeasure = By.xpath("//button[@title='Cloneable']");
	public static By closeicon = By.xpath("//button[@class='close']");
	
	public static By measuredetailcompositescoring = By.xpath("(//select[@class='form-control'])[1]");
	public static By searchmeasurecheckbox = By.xpath("//input[@title='Filter by My Measures']");
	public static By clicksearchedmeasure = By.xpath("(//span[contains(@title,'Click to ')])[1]");
	public static By disabledmeasurename = By.xpath("//input[@disabled='' and @id='measureNameInput']");
	public static By disabledabbrivatedtitle = By.xpath("//input[@disabled='' and @id='abbrInput']");
	public static By disabledmeasurescoring = By.xpath("//select[@disabled='' and @id='measScoringInput_ListBoxMVP']");
	public static By disabledpatientbacedmeasure = By.xpath("//select[@disabled='' and @id='patientBasedMeasure_listbox']");
	public static By disabledsavebutton = By.xpath("//button[@disabled='' and @title='Save']");
	public static By disabledfinalizeddata = By.xpath("//input[@disabled='' and @id='finalizedDate']");
	public static By disabledguid = By.xpath("//input[@disabled='' and @id='guidLabel']");
	public static By disabledecqmVersion = By.xpath("//input[@disabled='' and @id='versionInput']");
	public static By navigationwindow = By.xpath("//table[@id='measureDetailsView_ComponentPanel']");
	
	public static By componentheader = By.xpath("//h1[contains(text(),'My Measures')]");
	public static By componetmeasurename = By.xpath("(//span[@title='Measure Name'])[1]");
	public static By componentversion = By.xpath("(//span[@title='Version'])[1]");
	public static By componentpatient = By.xpath("//span[@title='Patient-based Indicator']");
	public static By componentmeasurescoring = By.xpath("(//span[@title='Measure Scoring'])[1]");
	public static By componentowner = By.xpath("//span[@title='Owner']");
	public static By componentselect = By.xpath("//span[@title='Select']");
	public static By replaceicon = By.xpath("//button[@title='Click to Replace ChildrenDentalDecay1']");
	public static By deleteicon = By.xpath("//button[@title='Click to Delete ChildrenDentalDecay1']");
	public static By appliedcomponetmeasurename = By.xpath("(//span[@title='Measure Name'])[2]");
	public static By appliedcomponentversion = By.xpath("(//span[@title='Version'])[2]");
	public static By appliedcomponentmeasurescoring = By.xpath("(//span[@title='Measure Scoring'])[2]");
	public static By appliedcomponentAlias = By.xpath("//span[@title='Assign Alias']");
	public static By appliedcomponentreplace = By.xpath("//span[@title='Replace']");
	public static By appliedcomponentmeasuredelete = By.xpath("//span[@title='Delete']");
	public static By gobackbutton = By.xpath("//button[@id='BackButton_componentMeasures']");
	public static By savebuttoncomposite = By.xpath("//button[@id='SaveAndContinueButton_componentMeasures']");
	public static By cancelbutton = By.xpath("//button[@id='CancelButton_componentMeasures']");
	public static By selectedmeasureinapplied1 = By.xpath("(//span[@title=' Component for Composite 6'])[2]");
	public static By selectedmeasureinapplied2 = By.xpath("//span[@title=' ChildrenDentalDecay1']");
	public static By componenmeasuresavingerrormsg = By.xpath("//b[contains(text(),'A composite')]");
	public static By searchcombostitemeasure = By.xpath("//input[contains(@title,'search string')]");
	public static By compositescoringmethodwarningmsg = By.xpath("(//*[contains(text(),'WARNING: Changing')])[1]");
	public static By clickcreatedcompositemeasure = By.xpath("//button[@id='newCompositeMeasure_button']");//button[@id='div1']
	public static By clickcreatedmeasure = By.xpath(".//div[contains(text(),'Measures')]//following::span[contains(@title,' Click to open')][1]");
	
	public static By deletebtn_compositemeasure = By.xpath("//button[@id='MeasureDetailsView.deleteMeasureButton']");
	public static By successmsgDeletemeasure = By.xpath("//b[contains(text(),'No measure')]");
	public static By deletepassfeld = By.xpath("//input[@id='password_PasswordTextBox']");
	public static By confirmbtn = By.xpath("//button[contains(text(),'Confirm')]");
	public static By aliasErrormessage = By.xpath("//*[contains(text(),'cannot be saved')]");
	public static By notClonableicon  = By.xpath("//span[contains(text(),'Composite measure not cloneable')]");
	public static By compositesearchField = By.xpath("//input[@title='Search by measure name or owner']");
	public static By searcheditem = By.xpath("//input[@type='checkbox']");
	public static By deletemsgcomponent = By.xpath("//*[contains(text(),'measures')]");
	public static By deletemeasureusrprestmsg = By.xpath("//*[contains(text(),'Deleting')]");
	public static By invalidpasswordmsg = By.xpath("//b[contains(text(),'The entered')]");
	
	public static By packageandUploadtobonniebtn = By.xpath("//button[@id='Package_and_Upload_to_Bonnie_button']");
	public static By samelinebutton = By.xpath("(//div[@class='btn-toolbar'])[2]");
	public static By seccessmsgpackagedbonnie = By.xpath("//*[contains(text(),'has been success')]");
	public static By disabledpackageandUploadtobonniebtn = By.xpath("//button[@disabled='' and @id='Package_and_Upload_to_Bonnie_button']");
	
	
	public static By measuredetailunsavederror = By.xpath("(//b[contains(text(),'You have ')])[1]");
	public static By unsavedmeasureYesbtn = By.xpath("(//button[@id='Clear_Yes_Button'])[1]");
	public static By unsavedmeasureNobtn = By.xpath("(//button[@id='Clear_No_Button'])[1]");
	public static By oldmeasuredetailsTab = By.xpath("//*[contains(text(),'Old Measure Details')]");
	public static By selectstewardlist = By.xpath("//select[@title='Measure Steward List']");
	public static By editcomponentmebtn = By.xpath("//button[contains(text(),'Edit Component Measure')]");
	public static By editcomponentsuccessmsg = By.xpath("//*[contains(text(),'Component Measures have been successfully updated')]");
	
	
	public static By selectMeasure = By.xpath(".//*[@id='CreateMeasureWidget']");
	
	
	
	public static By tableRecentActivity = By.xpath("//*[@id='MostRecentActivityCellTable']");
	
	public static By tableMyMeasures = By.xpath("//*[@id='cellTablePanel_VerticalPanel']");
	
	
	
	public static By dropdownCreateMeasure = By.id("CreateItemWidget_forMeasureLibrary"); // Option: "New Measure" 
		//By.id("CreateMeasureWidget"); // Option: "New Measure"
	
	 
			//By.id("createMeasure_Button"); createItem_Button_measureLib
	
	
	
	
	
	
	
	
	
	
	public static By btnSaveAndContinue = By.xpath("//*[@id='SaveAndContinueButton_measureDetail']");///updated as object got updated 04/18/2017
	public static By btnConfirmationContinue = By.id("yes_Button");///updated as new objectcreated for continue button  04/25/2018
	public static By txtEMeasureIdentifier = By.id("eMeasureIdentifierInput_TextBox");
	
	
	
	public static By txtNQFNumber = By.id("NQFIDInput_TextBox");
	
	public static By radiobtnFirstInMeasureStewardList = By.xpath("//*[@id='StewardListCellTable']//table/tbody[1]/tr[1]/td[1]//input");
	
	public static By txtDescription = By.id("descriptionInput_TextAreaWithMaxLength");
	public static By dropdownStewardList=By.id("stewardListBox"); //Added by Gayathri
	
	public static By txtCopyright = By.id("copyrightInput_TextAreaWithMaxLength");
	
	public static By txtDisclaimer = By.id("disclaimerInput_TextAreaWithMaxLength");
	
	public static By chkboxFirstInMeasureTypeList = By.xpath("//*[@id='SearchFilterWidget_HorizontalPanel_forMeasure']/tbody[1]/tr[1]/td[1]//input");
	
	public static By txtStratification = By.id("stratificationInput_TextAreaWithMaxLength");
	
	public static By txtRiskAdjustment = By.id("riskAdjustmentInput_TextAreaWithMaxLength");
	
	public static By txtRateAggregation = By.id("rateAggregationInput_TextAreaWithMaxLength");
	
	public static By txtRationale = By.id("rationaleInput_TextAreaWithMaxLength");
	
	public static By txtClinicalRecommendationStatement = By.id("clinicalStmtInput_TextAreaWithMaxLength");
	
	public static By txtImprovementNotation = By.id("improvementNotationInput_TextAreaWithMaxLength");
	
	public static By txtReferences = By.id("Reference");
	
	public static By txtDefinition = By.id("definitionsInput_TextAreaWithMaxLength");
	
	public static By txtGuidance = By.id("guidanceInput_TextAreaWithMaxLength");
	
	public static By txtTransmissionFormat = By.id("transmissionFormatInput_TextAreaWithMaxLength");
	
	public static By txtInitialPopulation = By.id("initialPopInput_TextAreaWithMaxLength");
	
	public static By txtSupplementalDataElements = By.id("supplementalDataInput_TextAreaWithMaxLength");
	
	public static By txtMeasureSet = By.id("setNameInput_TextAreaWithMaxLength");
	
	public static By btnSave = By.cssSelector("button[title='Save']");
	public static By btnYes = By.id("Clear_Yes_Button");
//	public static By messageChangesSavedSuccessfully = By.id("SuccessMessage");
	public static By messageChangesSavedSuccessfully=By.xpath("//div[@id='WarningMessage']/div/b");
	
	public static By tabQDMElements = By.xpath("//a[contains(.,'Value Sets/Codes')]");
	
	public static By txtEnterOID = By.xpath("//*[@title='Enter OID']");
	
	public static By btnRetrieveOID = By.xpath("//*[@title='Retrieve OID']");
	
	public static By messageSuccessfullyRetrieved = By.id("SuccessMessage");
	
	public static By dropdownDataType = By.id("DataType_ListBox"); //Option: "Adverse Event"
	
	
	
	public static By messageQDMAdverseEventAdded = By.xpath("//div[contains(text(),'Adverse Event has been added')]");
	
	
	
	
	
	public static By lnkGeneralInformation = By.xpath("//a[contains(.,'General Information')]");
	
	public static By lnkParameter = By.xpath("//a[contains(.,'Parameter')]");
	

	
	public static By definitionCommentTxt = By.xpath("//textarea[@id='DefineCommentTextArea_Id']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*[@id="defineListBox"]/option[1]
	
	
	

	
	
	
	
	

	
	
	
	public static By addnewfunction = By.xpath("//button[@id='Add_New_ID']");
	public static By functionerrormsg = By.xpath("//*[contains(text(),'Name already exists.')]");
	
	
	
	
	
	
	
	
	
   
	
	 //public static By selectApplieValueset= By.id("")
	

	public static By lnkIncludes = By.xpath("//a[contains(.,'Includes')]");
	
	/** End of the modification
	 * 
	 */
	
	public static By lnkViewCQL = By.xpath("//a[contains(.,'View CQL')]");
	
	public static By txtareaCQLLibraryname = By.xpath("//span[contains(.,'CQL Library Name')]/../../following-sibling::tr[2]//textarea");
	
	public static By txtareaVersion_Library = By.xpath("(//span[contains(.,'Version')]/../../following-sibling::tr[2]//textarea)[1]");
	
	public static By txtareaUsingModel = By.xpath("//span[contains(.,'Using Model')]/../../following-sibling::tr[2]//textarea");	

	public static By txtareaVersion_Model = By.xpath("(//span[contains(.,'Version')]/../../following-sibling::tr[2]//textarea)[2]");	
	
	public static By listitemMeasurementPeriodOption = By.xpath("//select//option[contains(text(),'Measurement Period')]");

	public static By btnNo_UnsavedChanges = By.id("Clear_No_Button");

	public static By listitemSDEEthnicity = By.xpath("//select//option[contains(text(),'SDE Ethnicity')]");

	public static By listitemSDEPayer = By.xpath("//select//option[contains(text(),'SDE Payer')]");

	public static By listitemSDERace = By.xpath("//select//option[contains(text(),'SDE Race')]");

	public static By listitemSDESex = By.xpath("//select//option[contains(text(),'SDE Sex')]");

	public static By txtareaCQLContent = By.xpath("//div[contains(@class,'ace_content')]");

	

	public static By lnkInitialPopulations = By.xpath("//div[contains(text(),'Initial Populations')]");

	public static By lnkMeasurePopulations = By.xpath("//div[contains(text(),'Measure Populations')]");

	public static By lnkMeasurePopulationExclusions = By.xpath("//div[contains(text(),'Measure Population Exclusions')]");

	public static By tabMeasureObservations = By.xpath("(//div[contains(text(),'Measure Observations')])[1]");

	public static By lnkMeasureObservations = By.xpath("//div[contains(text(),'Measure Observations')]");
	
	public static By lnkNumerators = By.xpath("//div[contains(text(),'Numerators')]");
	
	public static By lnkNumeratorsExclusion = By.xpath("//div[contains(text(),'Numerator Exclusions')]");
	
	public static By lnkDenominators = By.xpath("//div[contains(text(),'Denominators')]");
	
	public static By lnkDenominatorsExclusion = By.xpath("//div[contains(text(),'Denominator Exclusions')]");
	
	public static By lnkDenominatorsExceptions = By.xpath("//div[contains(text(),'Denominator Exceptions')]");

	public static By tabStratification = By.xpath("(//div[contains(text(),'Stratification')])[1]");

	public static By lnkStratification_inPopulationWorkspace = By.xpath("//div[text()='Stratification']");

	public static By lnkStratification1 = By.xpath("(//div[text()='Stratification 1'])[1]");

	

	public static By btnCreateNewGrouping = By.id("CreateNewGroupingButton");

	public static By btnSaveGrouping = By.xpath("//button[text()='Save Grouping']");

	public static By btnSaveSupplementalDataElements = By.xpath("//button[text()='Save Supplemental Data Elements']");

	public static By btnSaveRiskAdjustmentVariables = By.xpath("//button[text()='Save Risk Adjustment Variables']");

	public static By btnCreateMeasurePackage = By.xpath("//button[text()='Create Measure Package']");

	public static By btnCreatePackageAndExport = By.xpath("//button[text()='Create Package and Export']");

	public static By listitemInitialPopulation1 = By.xpath("//div[@title='Initial Population 1']");

	public static By listitemMeasurePopulation1 = By.xpath("//div[@title='Measure Population 1']");

	public static By listitemMeasurePopulationExclusions1 = By.xpath("//div[@title='Measure Population Exclusions 1']");

	public static By listitemMeasureObservation1 = By.xpath("//div[@title='Measure Observation 1']");
	
	public static By listitemDenominator1 = By.xpath("//div[@title='Denominator 1']");
	
	public static By listitemDenominatorExclusions1 = By.xpath("//div[@title='Denominator Exclusions 1']");
	
	public static By listitemDenominatorExceptions1 = By.xpath("//div[@title='Denominator Exceptions 1']");
	
	public static By listitemNumerator1 = By.xpath("//div[@title='Numerator 1']");
	
	public static By listitemNumeratorExclusion1 = By.xpath("//div[@title='Numerator Exclusions 1']");

	public static By listitemStratification1 = By.xpath("//div[contains(@class,'measurePackage')]//div[@title='Stratification 1']");

	public static By listitemSDEEthnicity_inSupplDataElements = By.xpath("//div[@title='SDE Ethnicity']");

	public static By listitemSDEPayer_inSupplDataElements = By.xpath("//div[@title='SDE Payer']");

	public static By listitemSDERace_inSupplDataElements = By.xpath("//div[@title='SDE Race']");

	public static By listitemSDESex_inSupplDataElements = By.xpath("//div[@title='SDE Sex']");
	
	public static By messageVerify_Package = By.xpath("//div[text()='Measure packaged successfully. Please access the Measure Library to export the measure.'");
	
	
	
	
	
	
	public static By measure_version = By.xpath("//td[@class='GB-MJYKBJI GB-MJYKBLI']/div[@style='outline-style:none;']/button[@class='btn btn-link'][1]");
	
	
	

	
	
	public static By createNewMeasure_cohort=By.xpath("//*[@id='measScoringInput_ListBoxMVP']/option[2]");
	
	
	
	
	
	
	
	public static By createNewMeasure_scoring=By.xpath("//*[@id='measScoringInput_ListBoxMVP']");
	
	
	
	
	
	

	public static By initial_population_list=By.xpath("//*[@id='definitionList_Initial Population 1']/option[2]");
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
