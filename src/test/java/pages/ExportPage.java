package pages;

import org.openqa.selenium.By;

public class ExportPage {

	public static By radioSimpleXML = By.xpath("//div[@id='gwt-uid-5']"); 
	public static By lblSimpleXML = By.xpath("//*[contains(text(),'SimpleXML')]"); 
	public static By radioHumanReadable = By.xpath("//*[@id='gwt-uid-7']"); 
	public static By lblHumanReadable = By.xpath("//*[contains(text(),'Human Readable')]"); 
	public static By radioHQMF = By.xpath("//*[@id='gwt-uid-6']"); 
	public static By lblHQMF = By.xpath("//*[contains(text(),'HQMF')]"); 
	public static By radioCqlLibrary = By.xpath("//*[@id='gwt-uid-11']"); 
	public static By lblCqlLibrary = By.xpath("//*[contains(text(),'CQL Library')]"); 
	public static By radioELM = By.xpath("//*[@id='gwt-uid-11']"); 
	public static By lblELM = By.xpath("//*[contains(text(),'ELM')]");
	public static By radioJson = By.xpath("//*[@id='gwt-uid-10']"); 
	public static By lblJson = By.xpath("//*[contains(text(),'JSON')]");
	public static By radioeCQMPackage = By.xpath("//*[@id='gwt-uid-8']"); 
	public static By lbleCQMPackage = By.xpath("//*[contains(text(),'eCQM Package')]");
	public static By btnSave = By.xpath("//*[@id='MeasureSearchCellTable']/tbody[1]/tr[1]/td[8]/div/table/tbody/tr/td[1]/button");
	public static By btnOpen = By.xpath("//*[@id='content_SimplePanel']/div/div[6]/button[2]");
	public static By btnCancel = By.xpath("//*[@id='content_SimplePanel']/div/div[6]/button[3]");
}
