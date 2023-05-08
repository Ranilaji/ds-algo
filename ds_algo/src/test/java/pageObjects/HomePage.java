package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;


public class HomePage {

	public static WebDriver driver = DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();


	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//a[@href=\"/home\"]")
	@CacheLookup
	WebElement btnGetStarted;

	@FindBy(xpath="//a[@href=\"/register\"]")
	@CacheLookup
	WebElement RegisterLink;

	@FindBy(xpath="//a[@href=\"/login\"]")
	@CacheLookup
	WebElement SignInLink;

	@FindBy(xpath="//*[@class='nav-link dropdown-toggle']")
	@CacheLookup
	WebElement DataStructureDrpdown;

	@FindBy(xpath="//*[@href=\"data-structures-introduction\"]")
	@CacheLookup
	WebElement DSGetStartedBtn;

	@FindBy(xpath="//*[@href=\"array\"]")
	@CacheLookup
	WebElement ArrayGetStartedBtn;

	@FindBy(xpath="//*[@href=\"linked-list\"]")
	@CacheLookup
	WebElement LinkGetStartedBtn;

	@FindBy(xpath="//*[@href=\"stack\"]")
	@CacheLookup
	WebElement StackGetStartedBtn;

	@FindBy(xpath = "//*[@href=\"queue\"]")
	@CacheLookup
	WebElement QueueGetStartedBtn;

	@FindBy(xpath = "//*[@href=\"tree\"]")
	@CacheLookup
	WebElement TreeGetStartedBtn;

	@FindBy(xpath="//*[@href=\"graph\"]")
	@CacheLookup
	WebElement GraphGetStartedBtn;	

	@FindBy(xpath="//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement LoginAlert;

	@FindBy(xpath="//div[@class='nav-item dropdown']")
	@CacheLookup
	WebElement DSDropdown;

	@FindBy(linkText="Arrays")
	@CacheLookup
	WebElement DropdownArrays;

	@FindBy(linkText="Linked List")
	@CacheLookup
	WebElement DropdownLinkedList;

	@FindBy(linkText="Stack")
	@CacheLookup
	WebElement DropdownStack;

	@FindBy(linkText="Queue")
	@CacheLookup
	WebElement DropdownQueue;

	@FindBy(linkText="Tree")
	@CacheLookup
	WebElement DropdownTree;

	@FindBy(linkText="Graph")
	@CacheLookup
	WebElement DropdownGraph;

	public void clkGetStartedBtn()	{
		btnGetStarted.click();
	}
	public void clkRegisterLink()	{
		RegisterLink.click();
	}
	public void clkSigninLink() {
		SignInLink.click();
	}
	public String getHomePageTitle() {
		String homePageTitle = driver.getTitle();
		return homePageTitle;
	}
	public String getSigninPageTitle() {
		String signinPageTitle = driver.getTitle();
		return signinPageTitle;
	}
	public String getRegisterPageTitle() {
		String registerPageTitle = driver.getTitle();
		return registerPageTitle;
	}
	public void getStartedInHomePage(String DSList) {
		switch (DSList) {

		case "Datastructures":
			Loggerload.info("click " + DSGetStartedBtn.getText() + "link on  DataStructures ");
			DSGetStartedBtn.click();
			break;
		case "Arrays":
			Loggerload.info("click " + ArrayGetStartedBtn.getText() + "link on Array ");
			ArrayGetStartedBtn.click();
			break;
		case "Linkedlist":
			Loggerload.info("click " + LinkGetStartedBtn.getText() + "link on LinkedList");
			LinkGetStartedBtn.click();
			break;
		case "Stack":
			Loggerload.info("click " + StackGetStartedBtn.getText() + "link on stack");
			StackGetStartedBtn.click();
			break;
		case "Queue":
			Loggerload.info("click " + QueueGetStartedBtn.getText() + "link on queue ");
			QueueGetStartedBtn.click();
			break;
		case "Tree":
			Loggerload.info("click " + TreeGetStartedBtn.getText() + "link on Tree ");
			TreeGetStartedBtn.click();
			break;
		case "Graph":
			Loggerload.info("click " + GraphGetStartedBtn.getText() + "link on Graph ");
			GraphGetStartedBtn.click();
			break;
		}
	}

	public String loginAlert() {
		String alertMsg = LoginAlert.getText();
		return alertMsg;
	}

	public void openHomePage() {
		driver.get(homeurl);
	}

	public void getStartedPage() {
		driver.get(url);
	}

	public void clkDSDropdown() {

		List <WebElement> options = driver.findElements(By.xpath("//div//div[@class='dropdown-menu show']//a"));
		System.out.println(options);

		for (int i =0; i < options.size();i++) {

			WebElement element = options.get(i);
			String innerhtml= element.getAttribute("innerHTML");
			System.out.println(innerhtml);

			if (innerhtml.contentEquals("Arrays")) {

				//element.click();
				element.sendKeys(Keys.ENTER);
				break;
			}
			else if (innerhtml.contentEquals("Linked List")){
				element.click();  
				break;
			}
			else if (innerhtml.contentEquals("Stack")){
				element.click(); 
				break;
			}
			else if (innerhtml.contentEquals("Queue")){       	 
				element.click();
				break;
			}
			else if (innerhtml.contentEquals("Tree")){
				element.click();
				break;
			}
			else if (innerhtml.contentEquals("Graph")){      	 
				element.click();
				break;
			}
		}
	}	

	public void clkDropDown() {
		DSDropdown.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}

