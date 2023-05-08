package stepDefinitions;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class LinkedList_SD {
	
	WebDriver driver = null;
	HomePage homepage = new HomePage();
	LinkedListPage linkedlistpage = new LinkedListPage();
	static String expectedMsg;
	String Excelpath = ConfigReader.getExcelFilePath();
	
	@When("User clicks on the Get Started button inside LinkedList frame")
	public void user_clicks_on_the_get_started_button_inside_linked_list_frame() {
		homepage.openHomePage();
	    linkedlistpage.clkGetStartedBtn();
	    Loggerload.info("User is in Linked List page ");
	}
	
	@Then("User should be navigated to Linked List home page")
	public void user_should_be_navigated_to_linked_list_home_page() {
		String expectedTitle = "Linked List";
		String actualTitle = linkedlistpage.getLinkedListPageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	@When("User clicks on the Introduction link")
	public void user_clicks_on_the_introduction_link() {
	    linkedlistpage.clkIntroLink();
	    Loggerload.info("User is in LL-Introduction page ");  	    
	}
	@Then("user should be navigated to Linked lists introduction page")
	public void user_should_be_navigated_to_linked_lists_introduction_page() {
		String expectedTitle = "Introduction";
		String actualTitle = linkedlistpage.getLLIntroPageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	@When("User clicks on the Try Here button")
	public void user_clicks_on_the_try_here_button() {
	    linkedlistpage.clkIntroTryHereBTn();
	    Loggerload.info("User is in Text Editor page ");
	}
	@Then("User should be navigated to Try Editor page")
	public void user_should_be_navigated_to_try_editor_page() {
		String expectedTitle = "Assessment";
		String actualTitle = linkedlistpage.getTryEditorTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");		
	}

	@When("User enters a valid python code from sheet {string} and {int}")
	public void user_enters_a_valid_python_code_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	    linkedlistpage.enterPythonCode(sheetName, rowNumber);
	    expectedMsg = linkedlistpage.getExpectedResult(sheetName, rowNumber);
	    linkedlistpage.clkRunBtn();
	}
	@Then("User should get an valid output")
	public void user_should_get_an_valid_output() {
	    String actualMsg = linkedlistpage.getActualResult();
	    Assert.assertEquals(actualMsg, expectedMsg, "Result do not match");
	}
	@When("User enter an invalid python code from sheet {string} and {int}")
	public void user_enter_an_invalid_python_code_from_sheet_and(String sheetNumber, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		linkedlistpage.pageReload();
		Thread.sleep(2000);
		linkedlistpage.enterPythonCode(sheetNumber, rowNumber);
		Thread.sleep(1000);
		linkedlistpage.clkRunBtn();
	}
	@Then("User should get an popup alert")
	public void user_should_get_an_popup_alert() {
		linkedlistpage.acceptAlertMsg();
		DriverFactory.navBack();
	}
	
	// Step Def for Creating LinkedList
		
	@When("User clicks on the Creating Linked List link")
	public void user_clicks_on_the_creating_linked_list_link() {
		//DriverFactory.navBack();
		linkedlistpage.clkCreatingLinkedListLink();
		Loggerload.info("User is in Creating Linked List page ");
	}
	@Then("user should be navigated to Creating Linked List page")
	public void user_should_be_navigated_to_creating_linked_list_page() {
		String expectedTitle = "Creating Linked LIst";
		String actualTitle = linkedlistpage.get_Creating_LL_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	// Step Def for Types of Linked List
	
	@When("User clicks on the Types of Linked List link")
	public void user_clicks_on_the_types_of_linked_list_link() {
	    //DriverFactory.navBack();
	    linkedlistpage.clk_Types_Of_LinkedList_Link();
	    Loggerload.info("User is in Types Of Linked List page ");
	}
	@Then("User should be navigated to Types of Linked List")
	public void user_should_be_navigated_to_types_of_linked_list() {
		String expectedTitle = "Types of Linked List";
		String actualTitle = linkedlistpage.get_Types_Of_LinkedList_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	/*@When("User clicks on singly linked list link or linked list link")
	public void user_clicks_on_singly_linked_list_link_or_linked_list_link() throws InterruptedException {
	    linkedlistpage.clk_Singly_LinkedList_Link();
	    //Thread.sleep(4000);
	    //linkedlistpage.get_Singly_LinkedList_PageTitle();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	@Then("User should be navigated to Singly Listed List page in javatpoint website")
	public void user_should_be_navigated_to_singly_listed_list_page_in_javatpoint_website() {
		String expectedTitle = "Linked List (Data Structures) - javatpoint";
		String actualTitle = linkedlistpage.get_Singly_LinkedList_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		//linkedlistpage.get_Singly_LinkedList_PageTitle();
		//Assert.assertEquals("Linked List (Data Structures) - javatpoint", driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Linked List (Data Structures) - javatpoint"));
		//linkedlistpage.get_Singly_LinkedList_PageTitle();
		DriverFactory.navBack();
	}
	
	@When("User clicks on the Doubly Linked List link")
	public void user_clicks_on_the_doubly_linked_list_link() throws InterruptedException {
	    DriverFactory.navBack();
	    linkedlistpage.clk_Doubly_LinkedList_Link();
	    Thread.sleep(5000);
	}
	@Then("User should be navigated to Doubly Listed List page in javatpoint website")
	public void user_should_be_navigated_to_doubly_listed_list_page_in_javatpoint_website() {
		String expectedTitle = "Doubly Linked List - javatpoint";
		String actualTitle = linkedlistpage.get_Doubly_LinkedList_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	@When("User clicks on the type of the linked list link")
	public void user_clicks_on_the_type_of_the_linked_list_link() throws InterruptedException {
		DriverFactory.navBack();
		linkedlistpage.clk_Types_Of_The_LinkedList_Link();
		Thread.sleep(5000);
	}
	@Then("User should be navigated to Types of Linked List page in javatpoint website")
	public void user_should_be_navigated_to_types_of_linked_list_page_in_javatpoint_website() {
		String expectedTitle = "Types of Linked List (Data Structures) - javatpoint";
		String actualTitle = linkedlistpage.get_Types_Of_The_LinkedList_PageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		DriverFactory.navBack();
	}*/
	
	//step def for Implement Linked List in Python page
	@When("User clicks on Implement Linked List in Python link")
	public void user_clicks_on_implement_linked_list_in_python_link() {
	    DriverFactory.navBack();
	    linkedlistpage.clk_Implement_LL_In_Python();
	    Loggerload.info("User is in Implement Linked List in Python page ");
	}
	@Then("User should be navigated to Implement Linked List in Python page")
	public void user_should_be_navigated_to_implement_linked_list_in_python_page() {
		String expectedTitle = "Implement Linked List in Python";
		String actualTitle = linkedlistpage.get_Implement_LL_In_Python_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");		
	}
	
	@When("User clicks on the Traversal link")
	public void user_clicks_on_the_traversal_link() {
	    DriverFactory.navBack();
	    linkedlistpage.clk_Traversal_Link();
	    Loggerload.info("User is in Traversal page ");
	}
	@Then("User should be navigated to Traversal page")
	public void user_should_be_navigated_to_traversal_page() {
		String expectedTitle = "Traversal";
		String actualTitle = linkedlistpage.get_Traversal_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	@When("User clicks on the Insertion link")
	public void user_clicks_on_the_insertion_link() {
	    DriverFactory.navBack();
	    linkedlistpage.clk_Insertion_Link();
	    Loggerload.info("User is in Insertion page ");
	}
	@Then("User should be navigated to Insertion page")
	public void user_should_be_navigated_to_insertion_page() {
		String expectedTitle = "Insertion";
		String actualTitle = linkedlistpage.get_Insertion_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	@When("User clicks on the Deletion link")
	public void user_clicks_on_the_deletion_link() {
	    DriverFactory.navBack();
	    linkedlistpage.clk_Deletion_Link();
	    Loggerload.info("User is in Deletion page ");
	}
	@Then("User should be navigated to Deletion page")
	public void user_should_be_navigated_to_deletion_page() {
		String expectedTitle = "Deletion";
		String actualTitle = linkedlistpage.get_Deletion_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	/*
	@When("User clicks on the Practice Questions link")
	public void user_clicks_on_the_practice_questions_link() throws InterruptedException {
	    DriverFactory.navBack();
	    linkedlistpage.clk_PracticeQuestions_Link();
	    Thread.sleep(1000);
	    Loggerload.info("User is in Practice Questions page ");
	}
	@Then("User should be navigated to Practice Questions page")
	public void user_should_be_navigated_to_practice_questions_page() {
		String expectedTitle = "Practice Questions";
		String actualTitle = linkedlistpage.get_PracticeQuestions_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
		DriverFactory.navBack();
	}
	*/

}
