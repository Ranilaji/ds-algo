package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Loggerload;

public class DriverFactory {

	
	public static WebDriver driver;
	
	
	public WebDriver initializeDrivers(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			Loggerload.info("Testing in Firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			Loggerload.info("Testing in Chrome");
			WebDriverManager.chromedriver().setup();
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();			

		} else if (browser.equalsIgnoreCase("safari")) {
			Loggerload.info("Testing in Edge");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		// Set Page load timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		return driver;
	}
		
	
	public static WebDriver getDriver()
	{
		return driver;
	}
		
	public static void navBack()
	{
		driver.navigate().back();
	}	
	public static void teardown() 
	{
		if (driver!=null) {
			driver.close();
			driver.quit();
		}
		
	}

		
}
