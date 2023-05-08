package stepDefinitions;

import utilities.ConfigReader;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import utilities.Loggerload;


public class ArrayPage_SD {
	
	WebDriver driver = null;
	ArrayPage ar = new ArrayPage();
	HomePage homepage = new HomePage();
		
	String Excelpath=ConfigReader.getExcelFilePath();
	static String expectedMsg;

	//@array01
	@Given("User is logged in to HomePage")
	public void user_is_logged_in_to_home_page() throws InterruptedException {
		homepage.openHomePage();
	}

	@When("User clicks on Get Started button on Array panel")
	public void user_clicks_on_get_started_button_on_array_panel() {
		ar.clickGetStarted();
		Loggerload.info("Clicking on Get Started button from logged in HomePage");
	}

	@Then("User is navigated to the Array page")
	public void user_is_navigated_to_the_array_page() {
		String actual=ar.getPageTitle();
		Assert.assertEquals(actual,"Array");
		Loggerload.info("Title of the current page :"+actual);
	}
     
	//@array02
	@Given("User is in Array page")
	public void user_is_in_array_page() throws Exception {
	 ar.getArrayUrl();
	 Loggerload.info("Launching Array page");
	}

	@When("User clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() throws InterruptedException {
	   ar.clickArraysInPython();
	   Thread.sleep(1000);
	}
	
	@Then("User is navigated to the Arrays in Python page")
	public void user_is_navigated_to_the_arrays_in_python_page() {
	    String actual=ar.getPageTitle();
	    Assert.assertEquals(actual, "Arrays in Python");
	}
	
	//@array03
	@When("User clicks on the Array Using List link")
	public void user_clicks_on_the_array_using_list_link() {
	   ar.clickArraysList();
	}
	@Then("User is navigated to the Arrays using list page")
	public void user_is_navigated_to_the_arrays_using_list_page() {
	    String actual=ar.getPageTitle();
	    Assert.assertEquals(actual, "Arrays Using List");
		 Loggerload.info("Title of cu"+actual);
	}

	//@array04
	@When("User clicks on the Basic Operations in List link")
	public void user_clicks_on_the_basic_operations_in_list_link() {
	    ar.clickBasicOpList();
	}
	@Then("User is navigated to the Basic operations in list page")
	public void user_is_navigated_to_the_basic_operations_in_list_page() {
	    String actual=ar.getPageTitle();
	    Assert.assertEquals(actual, "Basic Operations in Lists");
	    Loggerload.info("Title of current page :"+actual);
	}
	
	//@array05
	@When("User clicks on the Applications of array link")
	public void user_clicks_on_the_applications_of_array_link() {
	   ar.clickAppOfArray();
	}
	@Then("User is navigated to the Applications of array page")
	public void user_is_navigated_to_the_applications_of_array_page() {
	    String actual=ar.getPageTitle();
	    Assert.assertEquals(actual, "Applications of Array");
	    Loggerload.info("Title of current page:"+actual);
	}
	
	//@array06
	@Given("User is in  Arrays in Python page")
	public void user_is_in_arrays_in_python_page() {
	    ar.getArraysInPythonUrl();
	}
	@When("User clicks on Try Here button")
	public void user_clicks_on_the_try_here_button() {
	    ar.clickTryEditor();
	}
	@Then("User is navigated to the page with title {string}")
	public void user_is_navigated_to_the_page_with_title(String exp) {
	    String actual=ar.getPageTitle();
	    Assert.assertEquals(actual, exp);
	    Loggerload.info("Title of the page :"+actual);	 
	}
	
	@When("User enters valid Python code in Try Editor from {string} and {int}")
	public void user_enters_valid_python_code_in_try_editor_from_and(String sheetName, Integer rowNumber) 
			throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNumber);
	    ar.enterPythonCode(sheetName, rowNumber);
	    expectedMsg = ar.getExpectedResult(sheetName, rowNumber);
	}

	@When("Clicks on the Run button")
	public void clicks_on_the_run_button() throws Exception {		
	    ar.clickRunBtn();
	}
	
	@Then("Valid output for TryEditor is displayed")
	public void valid_output_for_arrays_in_python_try_editor_is_displayed() {
	    Assert.assertEquals(ar.getActualResult(), expectedMsg);
	    Loggerload.info("The actual output in TextEditor:"+ar.getActualResult());
	}
	
	@Then("User navigates back")
	public void user_navigates_back() {
	   ar.navigateBack();
	   Loggerload.info("Navigating back to the previous page");
	}
	
	//@array07
	@Given("User is on Try Editor Page")
	public void user_is_on_try_editor_page() {
	    ar.getTryEditorUrl();
	    Loggerload.info("Navigating to Try Editor");
	}
	@When("User enters invalid Python code from sheet {string} and {int}")
	public void user_enters_invalid_python_code_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		Loggerload.info("The user enter invalid python code in tryEditor from sheetname :" + Sheetname
				+ " and row number : " + RowNumber);
	    ar.enterPythonCode(Sheetname, RowNumber);
	    expectedMsg = ar.getExpectedResult(Sheetname, RowNumber);
	}
	
	
	@Then("User should be able to see error message")
	public void user_should_be_able_to_see_error_message() throws InterruptedException {
		String actualMsg = ar.getErrorText();
		Loggerload.info("Actual Error message is  : " + actualMsg);
		Assert.assertEquals(actualMsg, "SyntaxError: bad input on line 1");
	}
	
	//@array08  @array09
	@Given("User is in  Arrays using List page")
	public void user_is_in_arrays_in_list_page() {
	 ar.getArraysUsingList();
	}
	
	//@array10 @array11
	@Given("User is in  Basic operations in List page")
	public void user_is_in_basic_operations_in_list_page() {
	   ar.getBasicOpArrayUrl();
	}
     
	//@array12 @array13
	@Given("User is in  Applications of Array page")
	public void user_is_in_applications_of_array_page() {
	   ar.getApplicationsOfArrayUrl();
	}
	
	//@array14
	@When("User clicks on the Practice Questions link")
	public void user_clicks_on_the_practice_questions_link() {
	   ar.clickPracticeQuestion();
	}
	@Then("User is navigated to the Practice Questions page")
	public void user_is_navigated_to_the_practice_questions_page() throws InterruptedException {
		String actualTitle = ar.getPageTitle();
		Loggerload.info("The title of current page  : " + actualTitle);
		Assert.assertEquals(actualTitle, "Practice Questions");
	}
	
	//@array15
	@Given("User is in practice questions page")
	public void user_is_in_practice_questions_page() {
	    ar.launchPracQuestions();
	}
	@When("User clicks on Search the Array link")
	public void user_clicks_on_search_the_array_link() {
	    ar.searchArray();
	}

	@When("User enters valid python practice  code from {string} and {int}")
	public void user_enters_valid_python_practice_code_from_and(String sheetname, Integer rowNum) throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetname
				+ " and row number :" + rowNum);
		ar.enterPythonCodePractice(sheetname, rowNum);
		expectedMsg = ar.getExpectedResult(sheetname, rowNum);
	}
	
	//@array16
	@When("User clicks on Max consecutive ones link")
	public void user_clicks_on_max_consecutive_ones_link() {
	    ar.maxConsecutive();
	}
	
	//@array17
	@When("User clicks on Even no of digits  link")
	public void user_clicks_on_even_no_of_digits_link() {
	    ar.evenNoOfDigits();
	}
	
	//@array18
	@When("User clicks on Squares of a sorted array  link")
	public void user_clicks_on_squares_of_a_sorted_array_link() {
	 ar.squaresOfSortedArray();
	}

}

