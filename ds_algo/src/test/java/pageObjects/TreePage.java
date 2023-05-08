package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.Loggerload;

public class TreePage {
	
	public static WebDriver driver= DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeurl = ConfigReader.getHomePage();		
	ElementsUtils utils = new ElementsUtils();
	
	public TreePage() {

		PageFactory.initElements(driver, this);		
	}	
	
	@FindBy(xpath ="//a[@href=\"tree\"]")
	@CacheLookup
	WebElement TreeGetStartedBtn;
	
	@FindBy(xpath ="//a[@href=\"overview-of-trees\"]")
	@CacheLookup
	WebElement OverviewOfTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/terminologies/\"]")
	@CacheLookup
	WebElement TerminologiesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/types-of-trees/\"]")
	@CacheLookup
	WebElement TypesOfTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/tree-traversals/\"]")
	@CacheLookup
	WebElement TreeTraversalsLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/traversals-illustration/\"]")
	@CacheLookup
	WebElement TraversalsIllustrationLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/binary-trees/\"]")
	@CacheLookup
	WebElement BinaryTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/types-of-binary-trees/\"]")
	@CacheLookup
	WebElement TypesOfBinaryTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/implementation-in-python/\"]")
	@CacheLookup
	WebElement ImpInPythonLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/binary-tree-traversals/\"]")
	@CacheLookup
	WebElement BinaryTreeTraversalsLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/implementation-of-binary-trees/\"]")
	@CacheLookup
	WebElement ImpOfBinaryTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/applications-of-binary-trees/\"]")
	@CacheLookup
	WebElement AppOfBinaryTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/binary-search-trees/\"]")
	@CacheLookup
	WebElement BinarySearchTreesLink;
	
	@FindBy(xpath ="//a[@href=\"/tree/implementation-of-bst/\"]")
	@CacheLookup
	WebElement ImpOfBSTLink;
	
	
	public void clk_TreeGetStartedBtn() {
		TreeGetStartedBtn.click();
	}
	public String get_Tree_GetStarted_PageTitle() {
		String treeGetStartedPageTitle = driver.getTitle();
		return treeGetStartedPageTitle;
	}
	public void clk_OverviewOfTrees() {
		Loggerload.info("click " + OverviewOfTreesLink.getText() + " On Trees page");
		OverviewOfTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_OverviewOfTrees_PageTitle() {
		String overviewOfTreesPageTitle = driver.getTitle();
		return overviewOfTreesPageTitle;
	}
	public void clk_Terminologies() {
		Loggerload.info("click " + TerminologiesLink.getText() + " On tree page");
		TerminologiesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_Terminologies_PageTitle() {
		String terminologiesPageTitle = driver.getTitle();
		return terminologiesPageTitle;
	}
	public void clk_TypesOfTrees() {
		Loggerload.info("click " + TypesOfTreesLink.getText() + " On tree page");
		TypesOfTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_TypesOfTrees_PageTitle() {
		String typesOfTreesPageTitle = driver.getTitle();
		return typesOfTreesPageTitle;
	}
	public void clk_TreeTraversals() {
		Loggerload.info("click " + TreeTraversalsLink.getText() + " On tree page");
		TreeTraversalsLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_TreeTraversals_PageTitle() {
		String treeTraversalsPageTitle = driver.getTitle();
		return treeTraversalsPageTitle;
	}
	public void clk_TraversalsIllustration() {
		Loggerload.info("click " + TraversalsIllustrationLink.getText() + " On tree page");
		TraversalsIllustrationLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_TraversalsIll_PageTitle() {
		String TraversalsIllLinkPageTitle = driver.getTitle();
		return TraversalsIllLinkPageTitle;
	}
	public void clk_BinaryTrees() {
		Loggerload.info("click " + BinaryTreesLink.getText() + " On tree page");
		BinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_BinaryTrees_PageTitle() {
		String binaryTreesPageTitle = driver.getTitle();
		return binaryTreesPageTitle;
	}
	public void clk_TypesOfBinaryTrees() {
		Loggerload.info("click " + TypesOfBinaryTreesLink.getText() + " On tree page");
		TypesOfBinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_TypesOfBinaryTrees_PageTitle() {
		String typesOfBinaryTreesPageTitle = driver.getTitle();
		return typesOfBinaryTreesPageTitle;
	}
	public void clk_ImpInPython() {
		Loggerload.info("click " + ImpInPythonLink.getText() + " On tree page");
		ImpInPythonLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_ImpInPython_PageTitle() {
		String impInPythonPageTitle = driver.getTitle();
		return impInPythonPageTitle;
	}
	public void clk_BinaryTreeTraversals() {
		Loggerload.info("click " + BinaryTreeTraversalsLink.getText() + " On tree page");
		BinaryTreeTraversalsLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_BinaryTreeTraversals_PageTitle() {
		String binaryTreeTraversalsPageTitle = driver.getTitle();
		return binaryTreeTraversalsPageTitle;
	}
	public void clk_ImpOfBinaryTrees() {
		Loggerload.info("click " + ImpOfBinaryTreesLink.getText() + " On tree page");
		ImpOfBinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_ImpOfBinaryTrees_PageTitle() {
		String impOfBinaryTreesPageTitle = driver.getTitle();
		return impOfBinaryTreesPageTitle;
	}
	public void clk_AppOfBinaryTrees() {
		Loggerload.info("click " + AppOfBinaryTreesLink.getText() + " On tree page");
		AppOfBinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_AppOfBinaryTrees_PageTitle() {
		String appOfBinaryTreesPageTitle = driver.getTitle();
		return appOfBinaryTreesPageTitle;
	}
	public void clk_BinarySearchTrees() {
		Loggerload.info("click " + BinarySearchTreesLink.getText() + " On tree page");
		BinarySearchTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_BinarySearchTrees_PageTitle() {
		String binarySearchTreesPageTitle = driver.getTitle();
		return binarySearchTreesPageTitle;
	}
	public void clk_ImpOfBST() {
		Loggerload.info("click " + ImpOfBSTLink.getText() + " On tree page");
		ImpOfBSTLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}
	public String get_ImpOfBST_PageTitle() {
		String impOfBSTPageTitle = driver.getTitle();
		return impOfBSTPageTitle;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
