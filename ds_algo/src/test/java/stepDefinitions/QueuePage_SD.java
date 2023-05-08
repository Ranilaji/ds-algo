package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.QueuePage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class QueuePage_SD {
	
	WebDriver driver = null;
	HomePage homepage = new HomePage();
	QueuePage queuepage = new QueuePage();
	static String expectedMsg;
	String Excelpath = ConfigReader.getExcelFilePath();
	
	@When("User clicks on the Get Started button inside Queue frame")
	public void user_clicks_on_the_get_started_button_inside_queue_frame() {
		homepage.openHomePage();
		queuepage.clk_QueueGetStarted();
		Loggerload.info("User is in Queue page");
	}
	@Then("User should be navigated to Queue home page")
	public void user_should_be_navigated_to_queue_home_page() {
		String expectedTitle = "Queue";
		String actualTitle = queuepage.get_QueueGetStarted_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	@When("User clicks on the Implementation of Queue in Python link")
	public void user_clicks_on_the_implementation_of_queue_in_python_link() {
		queuepage.clk_Imp_of_Queue_in_Python();
		Loggerload.info("User is in Implementation of Queue in Python page");
	}
	@Then("user should be navigated to Implementation of Queue in Python page")
	public void user_should_be_navigated_to_implementation_of_queue_in_python_page() {
		String expectedTitle = "Implementation of Queue in Python";
		String actualTitle = queuepage.get_Imp_of_Queue_in_Python_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	@When("User clicks on the Implementation using collections.deque link")
	public void user_clicks_on_the_implementation_using_collections_deque_link() {
	    queuepage.clk_Imp_Using_Collections_in_Python();
	    Loggerload.info("User is in Implementation using collections.deque page");
	}
	@Then("user should be navigated to Implementation using collections.deque page")
	public void user_should_be_navigated_to_implementation_using_collections_deque_page() {
		String expectedTitle = "Implementation using collections.deque";
		String actualTitle = queuepage.get_Imp_Using_Collections_in_Python_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	@When("User clicks on the Implementation using array link")
	public void user_clicks_on_the_implementation_using_array_link() {
	    queuepage.clk_Imp_Using_Array();
	    Loggerload.info("User is in Implementation using array page");
	}
	@Then("user should be navigated to Implementation using array page")
	public void user_should_be_navigated_to_implementation_using_array_page() {
		String expectedTitle = "Implementation using array";
		String actualTitle = queuepage.get_Imp_Using_Array_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	@When("User clicks on the Queue Operations link")
	public void user_clicks_on_the_queue_operations_link() {
	    queuepage.clk_Queue_Operations();
	    Loggerload.info("User is in Queue Operations page");
	}
	@Then("user should be navigated to Queue Operations page")
	public void user_should_be_navigated_to_queue_operations_page() {
		String expectedTitle = "Queue Operations";
		String actualTitle = queuepage.get_Queue_Operations_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}


}
