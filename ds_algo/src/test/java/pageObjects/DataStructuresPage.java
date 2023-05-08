package pageObjects;

import java.util.List;

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
import utilities.ElementsUtils;
import utilities.Loggerload;


public class DataStructuresPage {
	
	public static WebDriver driver= DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();
	String timecomplexityurl = ConfigReader.getTimeComplexityPage();
	ElementsUtils utils = new ElementsUtils();


	public DataStructuresPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Time Complexity")
	@CacheLookup
	WebElement TimeComplexityLink;
	
	@FindBy(xpath="//a[@href=\"data-structures-introduction\"]")
	@CacheLookup
	WebElement DSGetStartedBtn;
	
	@FindBy(xpath = "//a[@class=\"btn btn-info\"]")
	@CacheLookup
	WebElement TryHereBtn;
	
	@FindBy(xpath = "//a[@class=\"btn btn-info\"]")
	@CacheLookup
	WebElement TryHereBtn1;
	
	@FindBy(xpath= "//button[@type=\"button\"]")
	@CacheLookup
	WebElement TCRunBtn;
	
	@FindBy(xpath= "//button[@type=\"button\"]")
	@CacheLookup
	WebElement TCRunBtn1;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement InputTextArea;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement InputTextArea1;
	
	/*@FindBy(xpath="//body/div/div/div/pre[@id="output/"]")
	@CacheLookup
	WebElement OutputTextArea;*/
	
	/*@FindBy(xpath="//body/div/div/div/pre[contains(text(),'output']")
	@CacheLookup
	WebElement OutputTextArea;*/
	
	@FindBy(xpath="//div/pre[@id=\"output\"]")
	@CacheLookup
	WebElement OutputTextArea;
	
	
	public void clkTimeCompLink() {
		
		TimeComplexityLink.click();
	}
	
	public void clkDSGetStartedBtn() {
		Loggerload.info("click " + DSGetStartedBtn.getText() + " link on home page");
		DSGetStartedBtn.click();
	}	
	
	public String getDSIntroPageTitle() {
		String DSIntroPageTitle = driver.getTitle();
		return DSIntroPageTitle;
	}
	
	public String getTimeCompPageTitle() {
		String TimeCompPageTitle = driver.getTitle();
		return TimeCompPageTitle;
	}
	
	public void openTimeComplexityPage() 
	{
		driver.get(timecomplexityurl);
	}
	
	public void clkTryHereBtn() {
		try {
			TryHereBtn.click();
		}
		catch (StaleElementReferenceException e){
			
		}
	}
	
	public String getTryEditorTitle() {
		String TryEditorPageTitle = driver.getTitle();
		return TryEditorPageTitle;
	}
	
	public void clkTCRunBtn() {
			TCRunBtn.click();
		}
	
	public void clkTCRunBtn1() {
		TCRunBtn1.click();
	}
	
	
	public void enterCode(DataTable testCode) {
			List<List<String>> data = testCode.asLists();
			InputTextArea.sendKeys(data.get(0).get(0));		
	}
	
	public void enterInvalidCode(DataTable testCode) {
		
		try {
			List<List<String>> data = testCode.asLists();
			InputTextArea1.sendKeys(data.get(0).get(0));
		}
			catch (StaleElementReferenceException e){
			
		}	
	}
	
	public String getResult() {
		
		String codeoutput = OutputTextArea.getText();
		return codeoutput;
		
	}
	
	/*public void enterText() {
		InputTextArea.click();
		InputTextArea.sendKeys("print(\"Data Structures Introduction\")");
	}
	
	public boolean enterPythonCode(WebElement InputTextArea, String code) {

			try {
				new Actions(driver).sendKeys(InputTextArea, code).perform();
			} catch(Exception e) {
				InputTextArea.sendKeys(code);
			}
			return true;
		}
	
	public void enterCode(String pythonCode) throws InterruptedException {
		
		InputTextArea.clear();
		utils.enterCode(pythonCode, InputTextArea);
		
	} */
	
	public void acceptAlertMsg() {
			driver.switchTo().alert().accept();
	}
	
	
	public void pageReload() {
		driver.navigate().back();
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", TryHereBtn1);
		TryHereBtn1.click();
		}
		catch(StaleElementReferenceException e) {
		}
		
		
	}

}
