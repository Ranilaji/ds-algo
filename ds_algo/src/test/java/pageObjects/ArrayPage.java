package pageObjects;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;

public class ArrayPage {

	public static WebDriver driver= DriverFactory.getDriver();

	String arrayInPythonUrl=ConfigReader.arraysInPythonUrl();
	String arrayUsingList=ConfigReader.arraysUsingListUrl();
	String basicOperationsInLists=ConfigReader.basicOperationsUrl();
	String appOfarrayString=ConfigReader.appOfArrayUrl();
	String arrayUrl=ConfigReader.arrayUrl();
	String tryEditorUrl=ConfigReader.tryEditorUrl();
	String pracQuestions=ConfigReader.arrayPracQuestions();

	ElementsUtils utils = new ElementsUtils();	

	public ArrayPage() {
		PageFactory.initElements(driver, this);  //initializing WebElements	
	}

	@FindBy(xpath="//a[@href='array']") WebElement getStartedBtn;

	@FindBy(xpath="//a[@href='arrays-in-python']") WebElement arPython;

	@FindBy(xpath="//a[@href='arrays-using-list']") WebElement arList;

	@FindBy(xpath="//a[@href='basic-operations-in-lists']") WebElement arBasicOperationList;

	@FindBy(xpath="//a[@href='applications-of-array']") WebElement arApplication;

	@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryEditor;

	@FindBy (xpath ="//textarea[@tabindex='0']")WebElement textEditor; 

	@FindBy(xpath="//button[@type='button']") WebElement runBtn;

	@FindBy(id="output") WebElement output;

	@FindBy(xpath="//a[@href='/array/practice']") WebElement practiceQuestions;

	@FindBy(xpath="//a[@href='/question/1']") WebElement searchArray;

	@FindBy(xpath="//a[@href='/question/2']") WebElement maxConsecutive;

	@FindBy(xpath="//a[@href='/question/3']") WebElement evenNoOfDigits;

	@FindBy(xpath="//a[@href='/question/4']") WebElement squaresOfArray;

	@FindBy (xpath="//*[@id='answer_form']")WebElement answerform;

	@FindBy (xpath="//textarea[@tabindex='0']")WebElement quesTextInput;

	public String getPageTitle() {
		return driver.getTitle().trim();
	}


	public void clickGetStarted() {
		getStartedBtn.click();
	}

	public void clickArraysInPython() {
		arPython.click();
	}
	public void clickArraysList() {
		arList.click();
	}

	public void clickBasicOpList() {
		arBasicOperationList.click();
	}

	public void clickAppOfArray() {
		arApplication.click();
	}
	public void getArrayUrl() throws Exception {
		driver.get(arrayUrl);
		Thread.sleep(500);
	}

	public void getArraysInPythonUrl() {
		driver.get(arrayInPythonUrl);
	}

	public void getArraysUsingList() {
		driver.get(arrayUsingList);
	}

	public void getBasicOpArrayUrl() {
		driver.get(basicOperationsInLists);
	}


	public void getApplicationsOfArrayUrl() {
		driver.get(appOfarrayString);
	}

	public void getTryEditorUrl() {
		driver.get(tryEditorUrl);
	}
	public void clickTryEditor() {
		tryEditor.click();
	}
	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = utils.getCodefromExcel(sheetname, rownumber);
		utils.enterCode(code, textEditor);

	}

	public void enterPythonCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		utils.waitForElement(answerform);
		String code = utils.getCodefromExcel(sheetname, rownumber);
		utils.enterCodePractice(code, quesTextInput);

	}
	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = utils.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getActualResult() {
		utils.waitForElement(output);
		return output.getText();

	}

	public void clickRunBtn() throws Exception {
		Thread.sleep(1000);
		runBtn.click();
	}

	public void navigateBack() {
		driver.navigate().back();
	}
	public String getErrorText() throws InterruptedException {
		String errorMsg = driver.switchTo().alert().getText();
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		return errorMsg;

	}

	public void clickPracticeQuestion() {
		practiceQuestions.click();
	}
	public void launchPracQuestions() {
		driver.get(pracQuestions);
	}

	public void searchArray() {
		searchArray.click();
	}
	public void maxConsecutive() {
		maxConsecutive.click();
	}
	public void evenNoOfDigits() {
		evenNoOfDigits.click();
	}

	public void squaresOfSortedArray() {
		squaresOfArray.click();
	}

}
