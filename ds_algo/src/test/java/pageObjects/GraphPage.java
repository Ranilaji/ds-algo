package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;

public class GraphPage {
	
	public static WebDriver driver= DriverFactory.getDriver();
	String GraphUrl=ConfigReader.graphUrl();
	ElementsUtils util=new ElementsUtils();
	
	//Constructor
		public GraphPage() {
			PageFactory.initElements(driver, this);  //initializing WebElements	
		}

        @FindBy(xpath="//a[@href='graph']") WebElement getStartedBtn;
		
		@FindBy(xpath="//a[@href='graph']") WebElement graphLink;
		
		@FindBy(xpath="//a[@href='graph-representations']") WebElement graphRepLink;

		@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryEditor;
		
		@FindBy (xpath ="//textarea[@tabindex='0']")WebElement textEditor; 
		
		@FindBy(xpath="//button[@type='button']") WebElement runBtn;
		
		@FindBy(xpath="//pre[@id='output']") WebElement output;
		
		@FindBy(xpath="//a[@href='/graph/graph/']") WebElement grGraphLink;
		
		@FindBy(xpath="//a[@href='/graph/graph-representations/']") WebElement grGraphRepLink;
		
		@FindBy(xpath="//a[@href='/graph/practice']") WebElement practiceQuestion;
		
		
		public String getPageTitle() {
			return driver.getTitle().trim();
		}
		
		
		public void clickGetStarted() {
			getStartedBtn.click();
		}
		
		public void getGraphUrl() throws Exception {
			driver.get(GraphUrl);
			Thread.sleep(500);
		}
		
		public void clickGraphLink() {
			graphLink.click();
		}
		
		public void clickGraphRepLink() {
			graphRepLink.click();
		}
		
		public void clickSideGraphLink() {
			grGraphLink.click();
		}
		public void clickSideGraphRepLink() {
			grGraphRepLink.click();
		}
		
		public void clickPracticeQuesions() {
			practiceQuestion.click();
		}
		
		public void navigateBack() {
			driver.navigate().back();
		}
}
