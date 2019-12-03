package pages;

import org.openqa.selenium.By;

public class PplWrkSpace {
	
	public static By tabPopulationNew = By.xpath(".//*[@id='Population Workspace (new)']/div"); 
	
	
	
	
	public static By seleInDef2 = By.id("definitionList_Initial Population 2");
	public static By btnInDel2 = By.id("deleteButton_Initial Population 2");
	public static By btnViewIPHR2 = By.id("viewHRButton_Initial Population 2");
	
	
	
	
	
	//2nd
	public static By seleNuDef2 = By.id("definitionList_Numerators 2");
	public static By btnNuDel2 = By.id("deleteButton_Numerators 2");
	public static By btnViewNuHR2 = By.id("viewHRButton_Numerator 2");
	
	//2nd
	public static By seleNuExcluDef2 = By.id("definitionList_Numerator Exclusions 2");
	public static By btnNuExcluDel2 = By.id("deleteButton_Numerator Exclusions 2");
	public static By btnViewNuExcluHR2 = By.id("viewHRButton_Numerator Exclusions 2");
	

	//2nd
	public static By seleDeDef2 = By.id("definitionList_Denominator 2");
	public static By btnDeDel2 = By.id("deleteButton_Denominator 2");
	public static By btnViewDeHR2 = By.id("viewHRButton_Denominator 2");
	
	//2nd 
	public static By seleDeExcluDef2 = By.id("definitionList_Denominator Exclusions 2");
	public static By btnDeExcluDel2 = By.id("deleteButton_Denominator Exclusions 2");
	public static By btnViewDeExcluHR2 = By.id("viewHRButton_Denominator Exclusions 2");
	
	//2nd
	public static By selMeasurePopulationsDef2 = By.id("definitionList_Measure Population Exclusions 2");
	public static By btnMeasurePopulationsDel2 = By.id("deleteButton_Measure Population Exclusions 2");
	public static By btnViewMeasurePopulationsHR2 = By.id("viewHRButton_Measure Population Exclusions 2");
	///Measure Population exclusion
	
	public static By btnMeasureExcluAdd = By.id("addNewButton_measurePopulationExclusions");
	public static By btnMeasureExcluSave = By.id("saveButton_measurePopulationExclusions");
	public static By seleMeasureExcluDef1 = By.id("definitionList_Measure Population Exclusions 1");
	public static By btnMeasureExcluDel1 = By.id("deleteButton_Measure Population Exclusions 1");
	public static By btnViewMeasureExcluHR1 = By.id("viewHRButton_Measure Population Exclusions 1");
	//2nd 
	public static By seleMeasureExcluDef2 = By.id("definitionList_Measure Population Exclusions 2");
	public static By btnMeasureExcluDel2 = By.id("deleteButton_Measure Population Exclusions 2");
	public static By btnViewMeasureExcluHR2 = By.id("viewHRButton_Measure Population Exclusions 2");
	/////Meaure Observation////////
	
	public static By btnMeasureObservAdd = By.id("addNewButton_Measure Observations");
	public static By btnMeasureObservSave = By.id("saveButton_Measure Observations");
	public static By seleMeasurObservationAggFu1 = By.xpath(".//*[@id='definitionList_Measure Observation 1' and @title='Select Aggregate Function']");
	public static By seleMeasurObservationFU1 = By.xpath(".//*[@id='definitionList_Measure Observation 1' and @title='Select Function List']");
	public static By btnMeasurObservationDel1 = By.id("definitionList_Measure Observation 1");
	public static By btnViewMeasurObservationHR1 = By.id("viewHRButton_Measure Observation 1");
	//2nd
	public static By seleMeasurObservationAggFu2 = By.xpath(".//*[@id='definitionList_Measure Observation 2' and @title='Select Aggregate Function']");
	public static By seleMeasurObservationFU2 = By.xpath(".//*[@id='definitionList_Measure Observation 2' and @title='Select Function List']");
	public static By btnMeasurObservationDel2 = By.id("definitionList_Measure Observation 2");
	public static By btnViewMeasurObservationHR2 = By.id("viewHRButton_Measure Observation 2");

	
	
	
	
	///Denominator exception////
	
	public static By btnDenomiExceAdd = By.id("addNewButton_denominatorExceptions");
	public static By btnDenomiExceSave = By.id("saveButton_denominatorExceptions");
	public static By seleDenomiExceDef1 = By.id("definitionList_Denominator Exceptions 1");
	public static By btnDenomiExceDel1 = By.id("deleteButton_Denominator Exceptions 1");
	public static By btnViewDenomiExceHR1 = By.id("viewHRButton_Denominator Exceptions 1");
	//2nd
	public static By seleDenomiExceDef2 = By.id("definitionList_Denominator Exceptions 2");
	public static By btnDenomiExceDel2 = By.id("deleteButton_Denominator Exceptions 2");
	public static By btnViewDenomiExceHR2 = By.id("viewHRButton_Denominator Exceptions 2");
	
	
	
	////Stratification/////
	
	public static By btnAddNewStratification = By.id("addNewButton_Stratifications");
	public static By btnAStratificationsSave = By.id("saveButton_Stratifications");
	public static By btnAddStratum = By.id("addNewStratumButton_Stratification 1");
	public static By btnDeleteStratification = By.id("deleteButton_Stratification 1");
	public static By SeleStratum1Def1 = By.id("definitionList_Stratum 1");
	public static By btnDeleteStratum1 = By.id("deleteButton_Stratum 1");
	public static By btnViewStratum1 = By.id("viewHRButton_Stratum 1");
	//2nd Stratum
	public static By btnDeleteStratification2 = By.id("deleteButton_Stratification 2");
	public static By SeleStratum1Def2 = By.id("definitionList_Stratum 2");
	public static By btnDeleteStratum2 = By.id("deleteButton_Stratum 2");
	public static By btnViewStratum2 = By.id("viewHRButton_Stratum 2");

	//ViewPopulation

	
	public static By txtPopulations=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Populations']");
	public static By txtInitialPopulation=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Initial Populations']");
	public static By txtMeasurePop=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Measure Populations']");
	public static By txtMeasurePopExc=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Measure Population Exclusions']");
	public static By txtMeasureObserv=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Measure Observations']");
	public static By txtStratification=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Stratification']");
	public static By txtNumerator=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Numerators']");
	public static By txtNumeratorExc=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Numerator Exclusions']");
	public static By txtDenominator=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Denominators']");
	public static By txtDenominatorExc=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Denominator Exclusions']");
	public static By txtDenominatorExcep=By.xpath("//table[@id='CQLPopulationWorkspaceView.containerPanel']//div[@title='Denominator Exceptions']");
	
	
	public static By btnExpand=By.id("buttonExpand_Button");
	public static By btnCollapse=By.id("buttonCollapse_Button");
	public static By txtHeading=By.xpath("//table[@id='headingPanel']/tbody/tr/td/div/h4/b");
	public static By txtTreeName=By.xpath("//table[@id='treePanel_VerticalPanelCW']//div[@aria-level='1']/div[1]/div/div[2]/div");
	
	
	

	
	

}
