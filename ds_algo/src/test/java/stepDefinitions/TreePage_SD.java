package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.TreePage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class TreePage_SD {
	
	WebDriver driver = null;
	HomePage homepage = new HomePage();
	TreePage treepage = new TreePage();
	static String expectedMsg;
	String Excelpath = ConfigReader.getExcelFilePath();
	
	@When("User clicks on the Get Started button inside Tree frame")
	public void user_clicks_on_the_get_started_button_inside_tree_frame() {
	    homepage.openHomePage();
		treepage.clk_TreeGetStartedBtn();
		Loggerload.info("User is in Tree page");
	}

	@Then("User should be navigated to Tree home page")
	public void user_should_be_navigated_to_tree_home_page() {
		String expectedTitle = "Tree";
		String actualTitle = treepage.get_Tree_GetStarted_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Overview of Trees link")
	public void user_clicks_on_the_overview_of_trees_link() {
		treepage.clk_OverviewOfTrees();
		Loggerload.info("User is in Overview of Trees page");
	}

	@Then("user should be navigated to Overview of Trees page")
	public void user_should_be_navigated_to_overview_of_trees_page() {
		String expectedTitle = "Overview of Trees";
		String actualTitle = treepage.get_OverviewOfTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Terminologies link")
	public void user_clicks_on_the_terminologies_link() {
		treepage.clk_Terminologies();
		Loggerload.info("User is in Terminologies page");
	}

	@Then("user should be navigated to Terminologies page")
	public void user_should_be_navigated_to_terminologies_page() {
		String expectedTitle = "Terminologies";
		String actualTitle = treepage.get_Terminologies_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Types of Trees link")
	public void user_clicks_on_the_types_of_trees_link() {
	    treepage.clk_TypesOfTrees();
	    Loggerload.info("User is in Types of Trees page");
	}

	@Then("user should be navigated to Types of Trees page")
	public void user_should_be_navigated_to_types_of_trees_page() {
		String expectedTitle = "Types of Trees";
		String actualTitle = treepage.get_TypesOfTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Tree Traversals link")
	public void user_clicks_on_the_tree_traversals_link() {
	    treepage.clk_TreeTraversals();
	    Loggerload.info("User is in Tree Traversals page");
	}

	@Then("user should be navigated to Tree Traversals page")
	public void user_should_be_navigated_to_tree_traversals_page() {
		String expectedTitle = "Tree Traversals";
		String actualTitle = treepage.get_TreeTraversals_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Traversals-Illustration link")
	public void user_clicks_on_the_traversals_illustration_link() {
	    treepage.clk_TraversalsIllustration();
	    Loggerload.info("User is in Traversals-Illustration page");
	}

	@Then("user should be navigated to Traversals-Illustration page")
	public void user_should_be_navigated_to_traversals_illustration_page() {
		String expectedTitle = "Traversals-Illustration";
		String actualTitle = treepage.get_TraversalsIll_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Binary Trees link")
	public void user_clicks_on_the_binary_trees_link() {
	    treepage.clk_BinaryTrees();
	    Loggerload.info("User is in Binary Trees page");
	}

	@Then("user should be navigated to Binary Trees page")
	public void user_should_be_navigated_to_binary_trees_page() {
		String expectedTitle = "Binary Trees";
		String actualTitle = treepage.get_BinaryTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Types of Binary Trees link")
	public void user_clicks_on_the_types_of_binary_trees_link() {
	    treepage.clk_TypesOfBinaryTrees();
	    Loggerload.info("User is in Types of Binary Trees page");
	}

	@Then("user should be navigated to Types of Binary Trees page")
	public void user_should_be_navigated_to_types_of_binary_trees_page() {
		String expectedTitle = "Types of Binary Trees";
		String actualTitle = treepage.get_TypesOfBinaryTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Implementation in Python link")
	public void user_clicks_on_the_implementation_in_python_link() {
	    treepage.clk_ImpInPython();
	    Loggerload.info("User is in Implementation in Python page");
	}

	@Then("user should be navigated to Implementation in Python page")
	public void user_should_be_navigated_to_implementation_in_python_page() {
		String expectedTitle = "Implementation in Python";
		String actualTitle = treepage.get_ImpInPython_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Binary Tree Traversals link")
	public void user_clicks_on_the_binary_tree_traversals_link() {
	    treepage.clk_BinaryTreeTraversals();
	    Loggerload.info("User is in Binary Tree Traversals page");
	}

	@Then("user should be navigated to Binary Tree Traversals page")
	public void user_should_be_navigated_to_binary_tree_traversals_page() {
		String expectedTitle = "Binary Tree Traversals";
		String actualTitle = treepage.get_BinaryTreeTraversals_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Implementation of Binary Trees link")
	public void user_clicks_on_the_implementation_of_binary_trees_link() {
	    treepage.clk_ImpOfBinaryTrees();
	    Loggerload.info("User is in Implementation of Binary Trees page");
	}

	@Then("user should be navigated to Implementation of Binary Trees page")
	public void user_should_be_navigated_to_implementation_of_binary_trees_page() {
		String expectedTitle = "Implementation of Binary Trees";
		String actualTitle = treepage.get_ImpOfBinaryTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Applications of Binary trees link")
	public void user_clicks_on_the_applications_of_binary_trees_link() {
	    treepage.clk_AppOfBinaryTrees();
	    Loggerload.info("User is in Applications of Binary trees page");
	}

	@Then("user should be navigated to Applications of Binary trees page")
	public void user_should_be_navigated_to_applications_of_binary_trees_page() {
		String expectedTitle = "Applications of Binary trees";
		String actualTitle = treepage.get_AppOfBinaryTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Binary Search Trees link")
	public void user_clicks_on_the_binary_search_trees_link() {
	    treepage.clk_BinarySearchTrees();
	    Loggerload.info("User is in Binary Search Trees page");
	}

	@Then("user should be navigated to Binary Search Trees page")
	public void user_should_be_navigated_to_binary_search_trees_page() {
		String expectedTitle = "Binary Search Trees";
		String actualTitle = treepage.get_BinarySearchTrees_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}

	@When("User clicks on the Implementation Of BST link")
	public void user_clicks_on_the_implementation_of_bst_link() {
	    treepage.clk_ImpOfBST();
	    Loggerload.info("User is in Implementation Of BST page");
	}

	@Then("user should be navigated to Implementation Of BST page")
	public void user_should_be_navigated_to_implementation_of_bst_page() {
		String expectedTitle = "Implementation Of BST";
		String actualTitle = treepage.get_ImpOfBST_PageTitle();
		Loggerload.info("Title of current page is : " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");
	}
}
