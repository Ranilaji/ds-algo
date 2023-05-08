package stepDefinitions;

import org.testng.Assert;

import driverManager.DriverFactory;
import io.cucumber.java.en.*;
import pageObjects.StackPage;
import utilities.Loggerload;


public class StackPage_SD {

	StackPage stack = new StackPage(DriverFactory.getDriver());
	
	//@stack01
	@When("User clicks on Get Started button on Stack panel")
	public void user_clicks_on_get_started_button_on_stack_panel() {
       stack.clickGetStarted();
	}
	@Then("User is navigated to the Stack page")
	public void user_is_navigated_to_the_stack_page() {
		String actual=stack.getPageTitle();
		Assert.assertEquals(actual,"Stack");
		Loggerload.info("Title of the current page :"+actual);
	}

	//@stack02
	@Given("User is in Stack page")
	public void user_is_in_stack_page() throws Exception {
	    stack.getStackUrl();
	}
	@When("User clicks on Operations in Stack link")
	public void user_clicks_on_operations_in_stack_link() {
	    stack.clickOperationsInStack();
	    Loggerload.info("Navigating to Operations in Stack page");
	}
	@Then("User is navigated to the Operations in Stack page")
	public void user_is_navigated_to_the_operations_in_stack_page() {
		 String actual=stack.getPageTitle();
		    Assert.assertEquals(actual, "Operations in Stack");
	}

	//@stack03
	@When("User clicks on Implementation link")
	public void user_clicks_on_implementation_link() {
		stack.clickImplementation();
	    Loggerload.info("Clicking on the Implementation link");
	}
	@Then("User is navigated to the Implementation page")
	public void user_is_navigated_to_the_implementation_page() {
		String actual=stack.getPageTitle();
	    Assert.assertEquals(actual, "Implementation");
	}
	
	//@stack04
	@When("User clicks on Applications link")
	public void user_clicks_on_applications_link() {
	    stack.clickAppStack();
	    Loggerload.info("Clicking on the Applications in Stack link");
	}
	@Then("User is navigated to the Applications page")
	public void user_is_navigated_to_the_applications_page() {
		String actual=stack.getPageTitle();
	    Assert.assertEquals(actual, "Applications");
	}
    
	//@stack05 @ stack06
	@Given("User is in Operations in Stack Page")
	public void user_is_in_operations_in_stack_page() {
	   stack.clickInOperationsInStack();
	}
	
	//@stack07 @stack08
	@Given("User is in Implementation Page")
	public void user_is_in_implementation_page() {
	   stack.clickInImplementation();
	}
	
	//@stack09 @stack10
	@Given("User is in Applications Page")
	public void user_is_in_applications_page() {
	   stack.clickInAppStack();
	}

}