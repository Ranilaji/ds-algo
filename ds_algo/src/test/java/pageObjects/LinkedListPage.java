package pageObjects;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverManager.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.Loggerload;

public class LinkedListPage {

	public static WebDriver driver= DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();	
	
	ElementsUtils utils = new ElementsUtils();

	public LinkedListPage() {

		PageFactory.initElements(driver, this);		
	}	
	
	@FindBy(xpath = "//a[@href=\"linked-list\"]")
	@CacheLookup
	WebElement LLGetStartedBtn;
		
	@FindBy(xpath = "//a[@href=\"introduction\"]" )
	@CacheLookup
	WebElement LLIntroLink;
	
	@FindBy(linkText = "Try here>>>")
	@CacheLookup
	WebElement TryHereBtn;
	
	@FindBy(xpath= "//button[@type=\"button\"]")
	@CacheLookup
	WebElement RunBtn;
	
	@FindBy(linkText = "singly linked list" )
	@CacheLookup
	WebElement SinglyLinkedListLink;
	
	@FindBy(linkText ="linked list" )
	@CacheLookup
	WebElement LinkedListLink;
	
	@FindBy(linkText = "doubly linked list")
	@CacheLookup
	WebElement DoublyLinkListLink;
	
	@FindBy(xpath = "//a[@href=\"https://www.javatpoint.com/ds-types-of-linked-list\"]")
	@CacheLookup
	WebElement TypesOfTheLinkListLink;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement InputTextArea;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement OutputTextArea;
	
	@FindBy(xpath="//a[@href=\"/linked-list/creating-linked-list/\"]")
	@CacheLookup
	WebElement CreatingLinkedListLink;
	
	@FindBy(xpath="//a[@href=\"/linked-list/types-of-linked-list/\"]")
	@CacheLookup
	WebElement typesOfLinkedListLink;
	
	@FindBy(xpath="//a[@href=\"/linked-list/implement-linked-list-in-python/\"]")
	@CacheLookup
	WebElement implementLinkedListInPython;
	
	@FindBy(xpath="//a[@href=\"/linked-list/traversal/\"]")
	@CacheLookup
	WebElement TraversalLink;
	
	@FindBy(xpath="//a[@href=\"/linked-list/insertion-in-linked-list/\"]")
	@CacheLookup
	WebElement InsertionLink;
	
	@FindBy(xpath="//a[@href=\"/linked-list/deletion-in-linked-list/\"]")
	@CacheLookup
	WebElement DeletionLink;
	
	@FindBy(xpath="//a[@href=\"/linked-list/practice\"]")
	@CacheLookup
	WebElement PracticeQuestionsLink;
	
	public void clkGetStartedBtn() {		
		LLGetStartedBtn.click();
	}	
	public String getLinkedListPageTitle() {
		String linkedlistPageTitle = driver.getTitle();
		return linkedlistPageTitle;
	}	
	public void clkIntroLink() {
		Loggerload.info("click " + LLIntroLink.getText());
		LLIntroLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String getLLIntroPageTitle() {
		String introPageTitle = driver.getTitle();
		return introPageTitle;
	}
	public void clkIntroTryHereBTn() {
		TryHereBtn.click();
		Loggerload.info("User clicked on Try here link");
	}
	public String getTryEditorTitle() {
		String TryEditorPageTitle = driver.getTitle();
		return TryEditorPageTitle;
	}
	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = utils.getCodefromExcel(sheetname, rownumber);
		utils.enterCode(code, InputTextArea);				
	}
	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = utils.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}
	public void clkRunBtn() {
		RunBtn.click();
	}
	public String getActualResult() {
		return OutputTextArea.getText();
	}
	public void acceptAlertMsg() {
		driver.switchTo().alert().accept();
	}
	public void pageReload() {
		driver.navigate().back();
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", TryHereBtn);
		TryHereBtn.click();
		}
		catch(StaleElementReferenceException e) {
		}
	}
	public void clkCreatingLinkedListLink() {
		Loggerload.info("click " + CreatingLinkedListLink.getText() + " On linked list page");
		CreatingLinkedListLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Creating_LL_PageTitle() {
		String creatingLinkedListPageTitle = driver.getTitle();
		return creatingLinkedListPageTitle;
	}
	public void clk_Types_Of_LinkedList_Link() {
		Loggerload.info("click " + typesOfLinkedListLink.getText() + " On linked list page");
		typesOfLinkedListLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Types_Of_LinkedList_PageTitle() {
		String typesofLinkedListPageTitle = driver.getTitle();
		return typesofLinkedListPageTitle;
	}	
	public void clk_Implement_LL_In_Python() {
		Loggerload.info("click " + implementLinkedListInPython.getText() + " On linked list page");
		implementLinkedListInPython.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Implement_LL_In_Python_PageTitle() {
		String implementLinkedListInPythonPageTitle = driver.getTitle();
		return implementLinkedListInPythonPageTitle;
	}
	public void clk_Traversal_Link() {
		Loggerload.info("click " + TraversalLink.getText() + " On linked list page");
		TraversalLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Traversal_PageTitle() {
		String traversalPageTitle = driver.getTitle();
		return traversalPageTitle;
	}
	public void clk_Insertion_Link() {
		Loggerload.info("click " + InsertionLink.getText() + " On linked list page");
		InsertionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Insertion_PageTitle() {
		String insertionPageTitle = driver.getTitle();
		return insertionPageTitle;
	}
	public void clk_Deletion_Link() {
		Loggerload.info("click " + DeletionLink.getText() + " On linked list page");
		DeletionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Deletion_PageTitle() {
		String deletionPageTitle = driver.getTitle();
		return deletionPageTitle;
	}
	public void clk_PracticeQuestions_Link() {
		Loggerload.info("click " + PracticeQuestionsLink.getText() + " On linked list page");
		PracticeQuestionsLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_PracticeQuestions_PageTitle() {
		String practicequestionsPageTitle = driver.getTitle();
		return practicequestionsPageTitle;
	}
	
}
