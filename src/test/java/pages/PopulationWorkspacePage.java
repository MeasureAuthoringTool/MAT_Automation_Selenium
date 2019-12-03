package pages;

import org.openqa.selenium.By;

public class PopulationWorkspacePage {
	
	public static By tabPopulationWorkspace = By.xpath("//div[(text()='Population Workspace')]");
	public static By initial_populationWorkspace = By.xpath("//li[@id='Initial Populations_Anchor']");
	public static By initial_dropdown = By.xpath("//select[@id='definitionList_Initial Population 1']");
	public static By initial_save_button = By.xpath("//button[@id='saveButton_Initial Population']");
	public static By denominator_populationWorkspace = By.xpath("//li[@id='Denominators_Anchor']");
	public static By denominatorexclusive_populationWorkspace = By.xpath("//li[@id='Denominator Exclusions_Anchor']");
	public static By denominator_dropdown = By.xpath("//select[@id='definitionList_Denominator 1']");
	public static By denominator_save_button = By.xpath("//button[@id='saveButton_Denominator']");
	public static By numerator_populationWorkspace = By.xpath("//li[@id='Numerators_Anchor']");
	public static By numeratorexclusion_populationWorkspace = By.xpath("//li[@id='Numerator Exclusions_Anchor']");
	public static By numerator_dropdown = By.xpath("//select[@id='definitionList_Numerator 1']");
	public static By numerator_save_button = By.xpath("//button[@id='saveButton_Numerator']");
	public static By groupingbtn = By.xpath("//button[@id='AddAllClauseToRight']");
	public static By tabMeasurePackager = By.xpath("//div[text()='Measure Packager']");
	public static By denominatorexception_populationWorkspace = By.xpath("//li[@id='Denominator Exceptions_Anchor']");
	public static By stratification_populationWorkspace = By.xpath("//li[@id='Stratification_Anchor']");
	
	//Denominator////
    public static By lnkDenominator = By.xpath(".//*[@id='Denominators_Anchor']/a");
	public static By btnDeAdd = By.id("addNewButton_denominators");
	public static By btnDeSave = By.id("saveButton_denominators");
	public static By seleDeDef1 = By.id("definitionList_Denominator 1");
	public static By btnDeDel1 = By.id("deleteButton_Denominator 1");
	public static By btnViewDeHR1 = By.id("viewHRButton_Denominator 1");
	
	//Denominator exclusion
	public static By lnkDenominatoExclu = By.xpath(".//*[@id='Denominator Exclusions_Anchor']/a");
	public static By btnDeExcluAdd = By.id("addNewButton_denominatorExclusions");
	public static By btnDeExcluSave = By.id("saveButton_denominatorExclusions");
	public static By seleDeExcluDef1 = By.id("definitionList_Denominator Exclusions 1");
	public static By btnDeExcluDel1 = By.id("deleteButton_Denominator Exclusions 1");
	public static By btnViewDeExcluHR1 = By.id("viewHRButton_Denominator Exclusions 1");
	
	public static By lnkIntialPopulation = By.xpath(".//*[@id='Initial Populations_Anchor']/a");
	public static By lnkStratification = By.xpath(".//*[@id='Stratification_Anchor']/a");
	public static By lnkViewPopulations = By.xpath(".//*[@id='View Populations_Anchor']/a");
	public static By lnkNumerators = By.xpath(".//*[@id='Numerators_Anchor']/a");
	public static By lnkNumeratorExclusion = By.xpath(".//*[@id='Numerator Exclusions_Anchor']/a");
	public static By lnkDenominatoException = By.xpath(".//*[@id='Denominator Exceptions_Anchor']/a");
	
	
	///Measure population//
	public static By lnkMeasurePopulations = By.xpath(".//*[@id='Measure Populations_Anchor']/a");
	public static By btnMeasurePopulationsAdd = By.id("addNewButton_measurePopulationExclusions");
	public static By btnMeasurePopulationsSave = By.id("saveButton_measurePopulationExclusions");
	public static By selMeasurePopulationsDef1 = By.id("definitionList_Measure Population Exclusions 1");
	public static By btnMeasurePopulationsDel1 = By.id("deleteButton_Measure Population Exclusions 1");
	public static By btnViewMeasurePopulationsHR1 = By.id("viewHRButton_Measure Population Exclusions 1");
	
	public static By lnkMeasurePopulationsExclu = By.xpath(".//*[@id='Measure Population Exclusions_Anchor']/a");
	public static By lnkMeasureObservations = By.xpath(".//*[@id='Measure Observations_Anchor']/a");
	
	public static By btnIPAdd = By.xpath("//button[@class='btn btn-link pull-left']");
	public static By btnIPSave = By.id("saveButton_initial Population");
	public static By seleInDef1 = By.id("definitionList_Initial Population 1");
	public static By btnInDel1 = By.id("deleteButton_Initial Population 1");
	public static By btnViewIPHR1 = By.id("viewHRButton_Initial Population 1");
	
	public static By btnNuAdd = By.id("addNewButton_numerators");
	public static By btnNuSave = By.id("saveButton_numerators");
	public static By seleNuDef1 = By.id("definitionList_Numerators 1");
	public static By btnNuDel1 = By.id("deleteButton_Numerators 1");
	public static By btnViewNuHR1 = By.id("viewHRButton_Numerator 1");
	
	//NumeratorExclusion
	
		public static By btnNuExcluAdd = By.id("addNewButton_numeratorExclusions");
		public static By btnNuExcluSave = By.id("saveButton_numeratorExclusions");
		public static By seleNuExcluDef1 = By.id("definitionList_Numerator Exclusions 1");
		public static By btnNuExcluDel1 = By.id("deleteButton_Numerator Exclusions 1");
		public static By btnViewNuExcluHR1 = By.id("viewHRButton_Numerator Exclusions 1");
	
	

}
