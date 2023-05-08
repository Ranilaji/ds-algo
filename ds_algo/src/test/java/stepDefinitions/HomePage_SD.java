package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.Loggerload;

public class HomePage_SD {
	WebDriver driver = null;
	
	HomePage homePage = new HomePage();	


	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link(){
		Loggerload.info("User is on DS Algo portal page");
		homePage.getStartedPage();	
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String btnGetStarted) {
		Loggerload.info("User clicks on \"Getstarted link\" on Main Page");
		homePage.clkGetStartedBtn();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		String expectedTitle = "NumpyNinja";
		String actualTitle = homePage.getHomePageTitle();	
		Loggerload.info("Title of current page is ***** " + actualTitle + " ****");
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@Given("The user is in Home page")
	public void the_user_is_in_home_page() {
		Loggerload.info("User is in Home page");
		homePage.openHomePage();
	}

	@When("The user clicks on Get Started button on homepage {string} without login")
	public void the_user_clicks_on_get_started_button_on_homepage_without_login(String DSList) {
		homePage.getStartedInHomePage(DSList);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		String alertMsg = homePage.loginAlert();
		Loggerload.info("Actual Message : " + alertMsg);
		Assert.assertEquals(alertMsg,string,"Alert do not match");
	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		homePage.openHomePage();
	}

	@When("The user clicks on dropdown options without login")
	public void the_user_clicks_on_dropdown_options_without_login() throws InterruptedException {
		Loggerload.info("User clicks on dropdown without login");
		homePage.clkDropDown();	
		Thread.sleep(1000);
		homePage.clkDSDropdown();
		Thread.sleep(1000);
		
	}

	@Then("The user gets warning message {string}")
	public void the_user_gets_warning_message(String string) throws InterruptedException {
		
		String alertMsg = homePage.loginAlert();
		Assert.assertEquals(alertMsg,string,"Alert do not match");

	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {	    
		homePage.openHomePage();		
	}

	@When("The user clicks Sign in link")
	public void the_user_clicks() {
		Loggerload.info("User clicks on Sign in ");
		homePage.clkSigninLink();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		String expectedTitle = "Login";
		String actualTitle = homePage.getSigninPageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@Given("The user gets on Home Page")
	public void the_user_gets_on_home_page() {
		homePage.openHomePage();		
	}

	@When("The user clicks on Register link")
	public void the_user_clicks_on_register_link() {
		Loggerload.info("User clicks on Register ");	
		homePage.clkRegisterLink();
		Loggerload.info("User redirected to Registraion page ");
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		String expectedTitle = "Registration";
		String actualTitle = homePage.getRegisterPageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");	    
	}
	
}

