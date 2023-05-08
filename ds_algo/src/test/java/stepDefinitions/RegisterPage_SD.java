package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import utilities.Loggerload;

public class RegisterPage_SD {

	RegisterPage registerpage = new RegisterPage();
	HomePage homepage = new HomePage();

	@Given("User launches ds-algo portal link")
	public void user_launches_ds_algo_portal_link() {
		//homepage.getStartedPage();
		registerpage.getStartedPage();
	}

	@When("User clicks on get started button")
	public void user_clicks_on_get_started_button() {
		homepage.clkGetStartedBtn();
	}

	@And("Clicks on Register link")
	public void clicks_on_register_link() {
		Loggerload.info("The user opens Register Page");
		homepage.clkRegisterLink();
	}

	@Then("User should be successfully navigated to Register page")
	public void user_should_be_successfully_navigated_to_register_page() {
		String expectedTitle = "Registration";
		String actualTitle = registerpage.getRegisterPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@Given("User launches Register page")
	public void user_launches_register_page() {

		registerpage.openRegisterPage();

	}

	@When("User clicks on Login link")
	public void user_clicks_on_login_link() {

		registerpage.clkLoginLink();
	}

	@Then("User should be successfully navigated to Login page")
	public void user_should_be_successfully_navigated_to_login_page() {		
		String expectedTitle = "Login";
		String actualTitle = registerpage.getSigninPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	/* Registration with valid user name, password and confirmation password

	@When("User enter  valid username, password and password confirmation")
	public void user_enter_valid_username_password_and_password_confirmation(io.cucumber.datatable.DataTable dataTable) {
		registerpage.enterValidCredetials(dataTable);	

	}

	@And("Clicks on the Register button")
	public void clicks_on_the_register_button() throws InterruptedException {
		registerpage.clkRegisterBtn();
		Thread.sleep(1000);
		Loggerload.info("User redirected to Homepage ");
	}

	@Then("User should be able successfully registered with the success message {string}")
	public void user_should_be_able_successfully_registered_with_the_success_message(String string) {
		String successMsg = registerpage.successMsgValidation();
		Loggerload.info("Title of current page is : " + successMsg);
		Assert.assertTrue(successMsg.contains("New Account Created."));
		//Assert.assertEquals(successMsg,string,"Success message do not match");
	}*/

	//Scenario: Validating registration with empty fields

	@When("User clicks on Register button without entering Username, password and confirm password fields")
	public void user_clicks_on_register_button_without_entering_username_password_and_confirm_password_fields() {
		Loggerload.info("The user do not enter any values");
		registerpage.clkRegisterBtn();
	}

	@Then("User should see a pop-up text below Username field {string}")
	public void user_should_see_a_pop_up_text_below_username_field(String errMsg) {
		Loggerload.info("Error message is displayed " + registerpage.getEmptyUsernameErrMsg()
		+ " an error below Username textbox");
		assertTrue(registerpage.validateUsernameTxtbox(), "Username Field is Empty - required attribute is validated");
		assertEquals(registerpage.getEmptyUsernameErrMsg(), errMsg);
	}

	//Scenario Outline: Validating registration with valid user name and empty password field

	@When("User clicks on Register button entering valid {string} and empty password field")
	public void user_clicks_on_register_button_entering_valid_and_empty_password_field(String username) throws InterruptedException {
		Loggerload.info("The user enter valid username with other fields empty");
		registerpage.sendUsername(username);
		registerpage.clkRegisterBtn();
		Thread.sleep(1000);
	}

	@Then("User should see a pop-up text under password field {string}")
	public void user_should_see_a_pop_up_text_under_password_field(String errMsg) {
		Loggerload.info("Error message is displayed " + registerpage.getEmptyPwdErrMsg()
		+ " an error below Password textbox");
		assertTrue(registerpage.validatePwdTxtbox(), "Password Field is Empty - required attribute is validated");
		assertEquals(registerpage.getEmptyPwdErrMsg(), errMsg);
	}

	//Scenario Outline: Validating registration with valid user name, Password and empty password confirmation field 

	@When("User clicks  on Register button entering valid {string}, {string} and empty  password confirmation field")
	public void user_clicks_on_register_button_entering_valid_and_empty_password_confirmation_field(String username, String password) throws InterruptedException {
		registerpage.sendUsername(username);
		registerpage.sendPassword(password);
		registerpage.clkRegisterBtn();
		Thread.sleep(1000);
	}

	@Then("User should  see a pop-up text under password confirmation field {string}")
	public void user_should_see_a_pop_up_text_under_password_confirmation_field(String errMsg) {
		Loggerload.info("Error message is displayed " + registerpage.getEmptyConfirmPwdErrMsg()
		+ " an error below Username textbox");
		assertTrue(registerpage.validateConfirmPwdTxtbox(), "Confirmation Password Field is Empty - required attribute is validated");
		assertEquals(registerpage.getEmptyConfirmPwdErrMsg(), errMsg);
	}

	//Scenario Outline: Validate password mismatch

	@When("User clicks on Register button entering valid {string},{string} and mismatch password in {string} fields")
	public void user_clicks_on_register_button_entering_valid_and_mismatch_password_in_fields(String username, String password, String confirmpwd) throws InterruptedException {
		registerpage.sendUsername(username);
		registerpage.sendPassword(password);
		registerpage.sendConfirmPwd(confirmpwd);
		registerpage.clkRegisterBtn();
		Thread.sleep(1000);

	}

	@Then("User should see the error message {string}")
	public void user_should_see_the_error_message(String string) {
		String pwdMismatchErrMsg = registerpage.pwdMismatchErrMsg();
		Assert.assertEquals(pwdMismatchErrMsg,string,"Alert do not match");
	}

	//Scenario Outline: Validating registration with valid Password, Password  confirmation field and empty Username field
	
	@When("User clicks on Register button entering valid password, password confirmation field and empty Username field")
	public void user_clicks_on_register_button_entering_valid_password_password_confirmation_field_and_empty_username_field(io.cucumber.datatable.DataTable pwdTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		registerpage.enterPwdandConfirmPwd(pwdTable);
		registerpage.clkRegisterBtn();
	}

	@Then("User should see a pop-up text under username field {string}")
	public void user_should_see_a_pop_up_text_under_username_field(String errMsg) {
		assertTrue(registerpage.validateUsernameTxtbox(), "Username Field is Empty - required attribute is validated");
		assertEquals(registerpage.getEmptyUsernameErrMsg(), errMsg);
	}

}
