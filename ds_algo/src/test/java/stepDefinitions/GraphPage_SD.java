package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.GraphPage;
import pageObjects.HomePage;
import utilities.Loggerload;


public class GraphPage_SD {
	
	WebDriver driver = null;
	GraphPage graph=new GraphPage();
	HomePage homepage = new HomePage();
	
	
	//@graph01
	@When("User clicks on Get Started button on Graph panel")
	public void user_clicks_on_get_started_button_on_graph_panel() {
		graph.clickGetStarted();
	}
	@Then("User is navigated to the Graph  page")
	public void user_is_navigated_to_the_graph_page() {
		String actual=graph.getPageTitle();
		Assert.assertEquals(actual,"Graph");
		Loggerload.info("Title of the current page :"+actual);
	}
     
	//@graph02
	
	@When("User clicks on Graph link")
	public void user_clicks_on_graph_link() {
	    graph.clickGraphLink();
	}
	@Then("User is navigated to the Graph practice page")
	public void user_is_navigated_to_the_graph_practice_page() {
		 String actual=graph.getPageTitle();
		    Assert.assertEquals(actual, "Graph");
		    Loggerload.info("Title of the current page:"+actual);
	}

	//@graph03
	@When("User clicks Graph Representations link")
	public void user_clicks_graph_representations_link() {
	   graph.clickGraphRepLink();
	}
	@Then("User is navigated to the Graph Representations page")
	public void user_is_navigated_to_the_graph_representations_page() {
		String actual=graph.getPageTitle();
	    Assert.assertEquals(actual, "Graph Representations");
	    Loggerload.info("Title of the current page:"+actual);
	}
    
	//@graph04
	@Given("User clicks on the Graph link")
	public void user_clicks_on_the_graph_link() {
	    graph.clickSideGraphLink();
	}

	//@graph06
	@Given("User clicks on Graph Representations link")
	public void user_clicks_on_graph_representations_link() {
	   graph.clickSideGraphRepLink();
	}

	//@graph08
	@When("User clicks on the Practice Question link")
	public void user_clicks_on_the_practice_question_link() {
	    graph.clickPracticeQuesions();
	}
	@Then("User is navigated to the Practice Question page")
	public void user_is_navigated_to_the_practice_question_page() {
		String actual=graph.getPageTitle();
	    Assert.assertEquals(actual, "Practice Questions");
	    Loggerload.info("Title of the current page:"+actual);
	}


}
