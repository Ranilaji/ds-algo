package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import pageObjects.SignInPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Loggerload;

public class SignInPage_SD {
	
	RegisterPage registerpage = new RegisterPage();
	HomePage homepage = new HomePage();
	SignInPage signinpage = new SignInPage();
	Boolean isRequired;
	
	String username;
	String password;
	String message;
	
	String Excelpath = ConfigReader.getExcelFilePath();

	@Given("User launches ds algo portal")
	public void user_launches_ds_algo_portal() {
	    homepage.getStartedPage();
	}

	@When("User clicks on Get Started button and clicks on SignIn link")
	public void user_clicks_on_get_started_button_and_clicks_on_sign_in_link() throws InterruptedException {
		homepage.clkGetStartedBtn();
		homepage.clkSigninLink();
		Thread.sleep(2000);
		Loggerload.info("User is on Sigin Page");
	}

	@Then("User should be navigated to the login page")
	public void user_should_be_navigated_to_the_login_page() {
		String expectedTitle = "Login";
		String actualTitle = registerpage.getSigninPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@Given("User launches login page")
	public void user_launches_login_page() {
	   signinpage.openLoginpage();
	}

	@When("User enters valid and invalid {string} and {int}")
	public void user_enters_valid_and_invalid_and(String sheetname, Integer rownumber) throws IOException, InvalidFormatException {
		ExcelReader excelreader = new ExcelReader();
		
		List<Map<String, String>> usertestdata = excelreader.getData(Excelpath, sheetname);
		//System.out.println(usertestdata);
			username = usertestdata.get(rownumber).get("username");
			password = usertestdata.get(rownumber).get("password");
			message = usertestdata.get(rownumber).get("expected message");
			
			Loggerload.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
			if (username != null || password != null)
				signinpage.doLogin(username, password);			
		
	}
	
	@Then("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Loggerload.info("User clicks on login button");
		Loggerload.info("Expected Message - Excel Sheet :  " + message);
		signinpage.clkLoginBtn();
		Thread.sleep(2000);
		String msg = signinpage.clickLogin();
		Loggerload.info("Actual Message :  " + msg);
		assertEquals(msg,message);
	}
	
	@When("User wihout entering either {string} and {string} field")
	public void user_wihout_entering_either_and_field(String username, String password) {
		Loggerload.info("User Enter username as \" " + username + " \" and Password as \" " + password + "\" ");
		isRequired = signinpage.doLogin(username, password);
		assertTrue(isRequired);
		Loggerload.info("Empty field value is validated");
	}
		
	@Then("Clicks on Login button")
	public void clicks_on_login_button() {
		Loggerload.info("User clicks on login button");
		signinpage.clkLoginBtn();
	}

	@When("User enters valid username and password and clicks on Signout link")
	public void user_enters_valid_username_and_password_and_clicks_on_signout_link() {
	  signinpage.clkSignoutlink();
	}

	@Then("user should be logged out successfully with message {string}")
	public void user_should_be_logged_out_successfully_with_message(String logoutmsg) {
	    String logoutMsg = signinpage.verifyLogoutMsg();
	    Assert.assertEquals(logoutMsg,logoutmsg,"Logout do not match");
	}
	
}
