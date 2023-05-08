package pageObjects;


import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;

public class SignInPage {
	
	public static WebDriver driver = DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();
	String signinpageurl = ConfigReader.getSignInPage();
	boolean isRequired;	
	
	public SignInPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id = \"id_username\"]")
	@CacheLookup
	WebElement UsernameTxtbox;
	
	@FindBy(xpath = "//input[@id=\"id_password\"]")
	@CacheLookup
	WebElement PasswordTxtbox;
	
	@FindBy(xpath = "//input[@value=\"Login\"]")
	@CacheLookup
	WebElement LoginBtn;	
	
	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	@CacheLookup
	WebElement LoginMsg;

	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	@CacheLookup
	WebElement LogoutMsg;	

	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	@CacheLookup
	WebElement InvalidCredentialMsg;
	
	@FindBy(linkText = "Sign out")
	@CacheLookup
	WebElement SignoutLink;
	
	@FindBy (xpath="//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement alert;
	
	public Boolean doLogin(String username, String password) {

		UsernameTxtbox.clear();
		UsernameTxtbox.sendKeys(username);
		PasswordTxtbox.clear();
		PasswordTxtbox.sendKeys(password);

		// To check empty fields , we need to check "required" field is on an attribute
		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", UsernameTxtbox);
			return isRequired;
		} else if (password.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", PasswordTxtbox);
			return isRequired;

		}
		return isRequired;
	}
	
	public String getEmptyUsernameErrMsg() {
		return UsernameTxtbox.getAttribute("validationMessage");
	}
	
	public String getEmptyPwdErrMsg() {
		return PasswordTxtbox.getAttribute("validationMessage");
	}	
	
	public void enterSigninCredentials(DataTable credentialTable ) {
		
		for(Map<String,String>usercredential : credentialTable.asMaps(String.class,String.class)) {
			
			UsernameTxtbox.sendKeys(usercredential.get("username"));
			PasswordTxtbox.sendKeys(usercredential.get("password"));
			//LoginBtn.click();
			
		}
		//List with Map values with single entry for multiple entry for loop is used
		//List<Map<String,String>> credential = credentialTable.asMaps(String.class,String.class);
	}
	
	public void clkSignoutlink() {
		SignoutLink.click();
	}
	
	public String verifyLogoutMsg() {
		String logouttMsg = LogoutMsg.getText();
		return logouttMsg;
		
	}
	public void clkLoginBtn() {
		LoginBtn.click();
	}
	
	public void openLoginpage() {
		driver.get(signinpageurl);
	}
	
	public String clickLogin() {
		
		try {
			LoginBtn.click();
		}
		catch (StaleElementReferenceException e){
		
		}
		//LoginBtn.click();
		String msg = InvalidCredentialMsg.getText();
		return msg;
	}
	
	
}
