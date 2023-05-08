package testRunner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features",
				  glue = {"stepDefinitions", "appHooks"},
				  monochrome = true,				  
				  plugin= {"pretty",
						  "html:target/cucumber.html",
						  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						  },
				  tags= ("@Home"),
				  dryRun = false
				)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

	
}