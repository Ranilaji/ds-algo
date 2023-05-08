package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructuresPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;
import utilities.Loggerload;

public class DataStructures_SD {
	
	WebDriver driver = null;
	HomePage homepage = new HomePage();
	SignInPage signinpage = new SignInPage();
	DataStructuresPage dsintropage = new DataStructuresPage();
	
	//Scenario1: The user is logged in to DS Algo portal
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() throws InterruptedException {
		homepage.getStartedPage();
		homepage.clkGetStartedBtn();
		homepage.clkSigninLink();
		Loggerload.info("The user is in SignIn page");
	}
	
	@When("The user enter valid username {string} and password {string}")
	public void the_user_enter_valid_username_and_password(String username, String password) {
	    signinpage.doLogin(username, password);		
	   }

	@Then("The user clicks on login button")
	public void the_user_clicks_on_login_button() {
		Loggerload.info("User clicks on login button");
		signinpage.clkLoginBtn();		
	}
	
	//Scenario2: Navigating to Data Structures Introduction  page

	@When("User clicks on Get Started button inside Data Structure frame")
	public void user_clicks_on_get_started_button_inside_data_structure_frame() throws InterruptedException {
	    dsintropage.clkDSGetStartedBtn();
	    Thread.sleep(1000);
	}

	@Then("User should be navigated to Data Structures Introduction page")
	public void user_should_be_navigated_to_data_structures_introduction_page() {
		String expectedTitle = "Data Structures-Introduction";
		String actualTitle = dsintropage.getDSIntroPageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	//Scenario3: Validating Time complexity page

	@And("User clicks on the Time Complexity link in DS home page")
	public void user_clicks_on_the_time_complexity_link_in_ds_home_page() throws InterruptedException {
		dsintropage.clkTimeCompLink();
		Thread.sleep(1000);
	}

	@Then("User should be navigated to Time Complexity page")
	public void user_should_be_navigated_to_time_complexity_page() {
		String expectedTitle = "Time Complexity";
		String actualTitle = dsintropage.getTimeCompPageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	//Scenario4: Navigating to Try Editor

	@Given("User launches Time Complexity page")
	public void user_launches_time_complexity_page() {
		dsintropage.openTimeComplexityPage();
	}

	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() throws InterruptedException {
	    dsintropage.clkTryHereBtn();
	    Thread.sleep(1000);
	}
	
	@Then("User should be successfully navigated to Try Editor page")
	public void user_should_be_successfully_navigated_to_try_editor_page() {
		String expectedTitle = "Assessment";
		String actualTitle = dsintropage.getTryEditorTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
	
	//Scenario5: User runs valid python code in Try Editor

	@And("User enters valid python code")
	public void user_enters_valid_python_code(io.cucumber.datatable.DataTable code) throws InterruptedException {
		
		dsintropage.enterCode(code);
		dsintropage.clkTCRunBtn();
		Thread.sleep(1000);
		
	}

	@Then("User should see the valid {string}")
	public void user_should_see_the_valid_output(String string) {
		String expectedOutput = "Data Structures Introduction";
		string = dsintropage.getResult();
		Loggerload.info("Title of current page is : " + string);
		Assert.assertEquals(string, expectedOutput, "output did not match" );
	    
	}
	
	//Scenario6: Validate Try editor with invalid python code

	@Given("User launches time complexity page and clicks on Try here button")
	public void user_launches_time_complexity_page_and_clicks_on_try_here_button() {
	    dsintropage.openTimeComplexityPage();
	    dsintropage.clkTryHereBtn();
	}

	@When("User enters invalid python code")
	public void user_enters_invalid_python_code(io.cucumber.datatable.DataTable invalidcode) throws InterruptedException  {
		//dsintropage.openTimeComplexityPage();
		//Thread.sleep(1000);
		//dsintropage.clkTryHereBtn();
		
		dsintropage.pageReload();
		Thread.sleep(2000);
		dsintropage.enterInvalidCode(invalidcode);
		dsintropage.clkTCRunBtn1();
		Thread.sleep(1000);		
	}

	@Then("User should get the error pop up alert")
	public void user_should_get_the_error_pop_up_alert() {
		dsintropage.acceptAlertMsg();
		DriverFactory.navBack();
	}
	
	
}
