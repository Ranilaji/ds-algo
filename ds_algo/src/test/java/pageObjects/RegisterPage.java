package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;
import utilities.Loggerload;

public class RegisterPage {
	
	public static WebDriver driver = DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();
	String registerurl = ConfigReader.getRegisterPage();	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id = 'id_username']")
	@CacheLookup
	WebElement UsernameTxtbox;
	
	@FindBy(xpath = "//input[@id = 'id_password1']")
	@CacheLookup
	WebElement PasswordTxtbox;
	
	@FindBy(xpath = "//input[@id = 'id_password2']")
	@CacheLookup
	WebElement PasswordConfirmTxtbox;
	
	@FindBy (xpath="//input[@value = 'Register']")
	@CacheLookup
	WebElement RegisterBtn;
	
	@FindBy(xpath = "//input[@name = 'csrfmiddlewaretoken']")
	@CacheLookup
	WebElement UsernameErrMsg;
	
	@FindBy(linkText = "Sign in")
	@CacheLookup
	WebElement SignInLink;
	
	@FindBy(linkText = "Login")
	@CacheLookup
	WebElement LoginLink;
	
	@FindBy(xpath="//a[@href=\"/register\"]")
	@CacheLookup
	WebElement RegisterLink;
	
	@FindBy(xpath = "//*[@role='alert']")
	@CacheLookup
	WebElement PasswordMismatchErrMsg;
	
	@FindBy(xpath = "//div[@class = 'alert alert-primary']")
	@CacheLookup
	WebElement AccountConfirmationMsg;
	
	@FindBy(xpath = "//a[contains(text(), 'Utest_sdet')]")
	@CacheLookup
	WebElement UsernameLink;
	
	public void getStartedPage() {
		
		driver.get(url);
	}

	public void openHomePage() 
	{
		driver.get(homeurl);
	}
	
	public void openRegisterPage() 
	{
		driver.get(registerurl);
	}
	
	public void clkRegisterLink()	{
		RegisterLink.click();
	}

	public void clkRegisterBtn() {
		Loggerload.info("The user clicks on the Register button");
		RegisterBtn.click();		
	}
	
	public void clkSigninLink() {
		SignInLink.click();
	}
	
	public void clkLoginLink() {
		LoginLink.click();
	}
	
	public String getRegisterPageTitle() {
		String registerPageTitle = driver.getTitle();
		return registerPageTitle;
	}
	
	public String getSigninPageTitle() {
		String signinPageTitle = driver.getTitle();
		return signinPageTitle;
	}
	
	public void enterUsernamePassword() {
		UsernameTxtbox.sendKeys("utest_sdet00");
		PasswordTxtbox.sendKeys("temp12!@");
	}
	
	public Boolean validateUsernameTxtbox() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		
		if (UsernameTxtbox.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", UsernameTxtbox);
		}
		return isRequired;	
		
	}
	
	public Boolean validatePwdTxtbox() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		
		if (PasswordTxtbox.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", PasswordTxtbox);
			
		}
		return isRequired;	
		
	}
	
	public Boolean validateConfirmPwdTxtbox() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		
		if (PasswordConfirmTxtbox.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", PasswordConfirmTxtbox);
		}
		return isRequired;	
		
	}
	
	/*public Boolean validatePasswordTxtbox() {
		//WebElement inputElement = driver.findElement(By.name("uname"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;",PasswordTxtbox);
		if(isRequired)
		{
		   //element is required and validation error will popup if the field is empty.
		}
	}*/
	
	public String getEmptyUsernameErrMsg() {
		return UsernameTxtbox.getAttribute("validationMessage");
	}
	
	public String getEmptyPwdErrMsg() {
		return PasswordTxtbox.getAttribute("validationMessage");
	}
	
	public String getEmptyConfirmPwdErrMsg() {
		return PasswordConfirmTxtbox.getAttribute("validationMessage");
	}
	
	public void sendUsername(String username)
	{
		Loggerload.info("The user enter username as : " + username);
		UsernameTxtbox.sendKeys(username);
	}
	
	public void sendPassword(String password)
	{
		Loggerload.info("The user enter password as : " + password);
		PasswordTxtbox.sendKeys(password);
	}
	
	public void sendConfirmPwd(String confirmpwd)
	{
		Loggerload.info("The user enter confirm password as : " + confirmpwd);
		PasswordConfirmTxtbox.sendKeys(confirmpwd);	
	}
	
	public String pwdMismatchErrMsg()
	{
		String pwdMismatchErrMsg = PasswordMismatchErrMsg.getText();
		return pwdMismatchErrMsg;
	}
	
	public void enterValidCredetials(DataTable dataTable) {
		
		List<List<String>> validCredentials = dataTable.asLists();
		UsernameTxtbox.sendKeys(validCredentials.get(0).get(0));
		PasswordTxtbox.sendKeys(validCredentials.get(0).get(1));
		PasswordConfirmTxtbox.sendKeys(validCredentials.get(0).get(2));
		
	}
	
	public String successMsgValidation() {
		String successMsg = AccountConfirmationMsg.getText();
		return successMsg;
		
	}
	public void enterPwdandConfirmPwd(DataTable pwdTable) {
		List<Map<String,String>> pwdCredentials = pwdTable.asMaps(String.class, String.class);
		PasswordTxtbox.sendKeys(pwdCredentials.get(0).get("password"));
		PasswordConfirmTxtbox.sendKeys(pwdCredentials.get(0).get("password confirmation"));
	}
}
