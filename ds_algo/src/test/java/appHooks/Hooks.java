
package appHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.Loggerload;


public class Hooks {

	private static DriverFactory driverfactory;
	public static WebDriver driver;
	
	@BeforeAll
	public static void before() throws Throwable {
		
		Loggerload.info("Loading Config file");		
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();	
		
		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDrivers(browser);
		Loggerload.info("Initializing driver for : " +browser);
		
		//DriverFactory.getDriver();
	
	}
	
	@Before
	public static void setup() {
		
		DriverFactory.getDriver();
		
	}
	
	@Before
	public void scenario(Scenario scenario) {
		Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());				
	}
	
	@AfterStep
	public static void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			Loggerload.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}		
	}
	
	@AfterAll
	public static void after() {
		Loggerload.info("Closing the driver");
		DriverFactory.teardown();
	}
}

		