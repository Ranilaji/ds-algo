package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.Loggerload;

public class QueuePage {

	public static WebDriver driver= DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();	
	
	ElementsUtils utils = new ElementsUtils();


	public QueuePage() {

		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath ="//a[@href=\"queue\"]")
	@CacheLookup
	WebElement QueueGetStartedBtn;
	
	@FindBy(xpath = "//a[@href=\"implementation-lists\"]")
	@CacheLookup
	WebElement ImpofQueueinPythonLink;
	
	@FindBy(xpath = "//a[@href=\"/queue/implementation-collections/\"]")
	@CacheLookup
	WebElement ImpUsingCollections;
	
	@FindBy(xpath = "//a[@href=\"/queue/Implementation-array/\"]")
	@CacheLookup
	WebElement ImpUsingArray;
	
	@FindBy(xpath = "//a[@href=\"/queue/QueueOp/\"]")
	@CacheLookup
	WebElement QueueOperations;
	/*
	@FindBy("")
	@CacheLookup
	WebElement 
	
	@FindBy("")
	@CacheLookup
	WebElement 
	*/
	
	public void clk_QueueGetStarted() {
		QueueGetStartedBtn.click();
		Loggerload.info("User is in queue page");
	}
	public String get_QueueGetStarted_PageTitle() {
		String queueGetStartedPageTitle = driver.getTitle();
		return queueGetStartedPageTitle;
	}
	public void clk_Imp_of_Queue_in_Python() {
		ImpofQueueinPythonLink.click();
		Loggerload.info("User is in Implementation of Queue in Python Page ");
	}
	public String get_Imp_of_Queue_in_Python_PageTitle() {
		String impofQueueinPythonPageTitle = driver.getTitle();
		return impofQueueinPythonPageTitle;
	}
	public void clk_Imp_Using_Collections_in_Python() {
		ImpUsingCollections.click();
		Loggerload.info("User is in Implementation using collections deque page");
	}
	public String get_Imp_Using_Collections_in_Python_PageTitle() {
		String impUsingCollectionsPageTitle = driver.getTitle();
		return impUsingCollectionsPageTitle;
	}
	public void clk_Imp_Using_Array() {
		ImpUsingArray.click();
		Loggerload.info("User is in Implementation using Array page");
	}
	public String get_Imp_Using_Array_PageTitle() {
		String impUsingArrayPageTitle = driver.getTitle();
		return impUsingArrayPageTitle;
	}
	public void clk_Queue_Operations() {
		QueueOperations.click();
		Loggerload.info("User is in Queue Operations page");
	}
	public String get_Queue_Operations_PageTitle() {
		String queueOperationsPageTitle = driver.getTitle();
		return queueOperationsPageTitle;
	}	
	
}
