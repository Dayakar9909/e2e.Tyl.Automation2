package e2e.Tyl.feature.steps;

import java.util.Locale;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import e2e.Tyl.interaction.CheckoutCompletPageTitleAssertion;
import e2e.Tyl.interaction.ClickOnCheckOutButton;
import e2e.Tyl.interaction.ClickOnContinueButton;
import e2e.Tyl.interaction.CloseBrowser;

import e2e.Tyl.interaction.HomePageTitleAssertion;
import e2e.Tyl.interaction.LoginFragementCheck;

import e2e.Tyl.interaction.ProductSortSelection;

import e2e.Tyl.interaction.UserClickOnShoppingCart;


import e2e.Tyl.interaction.UserInformation;
import e2e.Tyl.interaction.UserLogin;

import e2e.Tyl.interaction.UserMakesSelection;


import e2e.Tyl.interaction.UserSubmitsLogin;




public class StepDefinations{   
	public WebDriver driver;
	HomePageTitleAssertion homePageTitleAssertion;
	CloseBrowser closeBrowser;
	OpenBrowserURL openBrowserURL;
	UserLogin userLogin;
	UserSubmitsLogin userSubmitsLogin;

	



	ProductSortSelection productSortSelection;

	LoginFragementCheck loginFragementCheck;
	


	UserClickOnShoppingCart userClickOnShoppingCart;
	ClickOnCheckOutButton clickOnCheckOutButton;
	UserInformation userInformation;
	ClickOnContinueButton clickOnContinueButton;
	CheckoutCompletPageTitleAssertion checkoutCompletPageTitleAssertion;
	UserMakesSelection userMakesSelection;
	
	
	
	
	
	@Before
	public void OSType()
	{       
		String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
		String BrowserName = System.getenv("BrowserName");
		/* System.out.println(OS); */
		if(BrowserName.equals("Firefox"))
		{
			if(OS.equals("linux")){
				driver = new FirefoxDriver();
			}
			else if(OS.equals("windows 10")){
				//	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}else if(BrowserName.equals("Chrome")) {
			if(OS.equals("linux")){
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver(options);
//				System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/node/tools/chrome-driver-78.0.3904.11/chromedriver");
//				driver = new ChromeDriver();
			}
			else if(OS.equals("windows 10")){

				/*
				 ChromeOptions chromeOptions = new ChromeOptions();
				 chromeOptions.addArguments("--headless");
				 */
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				/*
				driver = new ChromeDriver(chromeOptions);
				 */
			}
		}

	}
	/*
    public String getReportConfigPath(){
        String reportConfigPath = "extent-config.xml";
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");      
    }*/
	@Given("^open the saucedemo url in web browser$")
	public void open_the_saucedemo_url_in_web_browser() throws Throwable {
		openBrowserURL = new OpenBrowserURL(driver);
		openBrowserURL.OpenSasBetURL();
	}
	@When("^user should be able to see the page$")
	public void user_should_be_able_to_see_the_page() throws Throwable {
		homePageTitleAssertion  = new HomePageTitleAssertion(driver);
		homePageTitleAssertion.CheckTitleAssertion();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		closeBrowser = new CloseBrowser(driver);
		closeBrowser.CloseCurrentBrowser();
	}
	@Then("^user should be able to enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_and(String username, String password) throws Throwable {
		userLogin = new UserLogin(driver);
		userLogin.UserSendsData(username,password);
	}

	@Then("^user submits the form$")
	public void user_submits_the_form() throws Throwable {
		userSubmitsLogin = new UserSubmitsLogin(driver);
		userSubmitsLogin.UserSubmitsLoginCheckAssertion();
	}

	@Then("^user should able to select the selection$")
	public void user_should_able_to_select_the_selection() throws Throwable {
		userMakesSelection = new UserMakesSelection(driver);
		userMakesSelection.SelectionWithProduct();
	}
	
	@Then("^user should able click on shopping cart button$")
	public void user_should_able_click_on_shopping_cart_button() throws Throwable {
		userClickOnShoppingCart = new UserClickOnShoppingCart(driver);
		userClickOnShoppingCart.ShoppingCartButton();
	}
	
		@Then("^user clicks on go to checkout button$")
	public void user_clicks_on_go_to_checkout_button() throws Throwable {
		clickOnCheckOutButton = new ClickOnCheckOutButton(driver);
		clickOnCheckOutButton.CheckOutButton();
	}

	
	@Then("^user should be able to enter checkout info \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_checkout_info_and_and(String firstname, String lastname, String postalcode) throws Throwable {
		userInformation = new UserInformation(driver);
		userInformation.UserSendsInfoData(firstname, lastname, postalcode);
	  
	}
	
	@Then("^user finish the purchase$")
	public void user_finish_the_purchase() throws Throwable {
		clickOnContinueButton = new ClickOnContinueButton(driver);
		clickOnContinueButton.ContinueButton();
		
		
	}
	
		
	@Then("^user should be able to see the checkout complete page$")
	public void user_should_be_able_to_see_the_checkout_complete_page() throws Throwable {
		checkoutCompletPageTitleAssertion  = new CheckoutCompletPageTitleAssertion(driver);
	checkoutCompletPageTitleAssertion.CheckTitleAssertion();
	}
	

	@Then("^user should able to select the selection for the \"([^\"]*)\"$")
	public void user_should_able_to_select_the_selection_for_the(String productfilter) throws Throwable {
		productSortSelection = new ProductSortSelection(driver);
		productSortSelection.UserMakesSelection(productfilter);
		
	}
}