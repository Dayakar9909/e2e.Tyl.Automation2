package e2e.Tyl.user_interface.ui_model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class TargetObjects {
	WebDriver driver;	
	

	@FindBy(className="login-box")
	public WebElement LoginFragment;
	
	@FindBy(name="user-name")
	public WebElement UserName;

	@FindBy(name="password")
	public WebElement Password;
	
	
	@FindBy(name="firstName")
	public WebElement FirstName;
	
	@FindBy(name="lastName")
	public WebElement LastName;
	
	
	@FindBy(name="postalCode")
	public WebElement PostalCode;
	
	@FindBy(name="continue")
	public WebElement ContinueButton;
	
	@FindBy(name="finish")
	public WebElement FinishButton;
	
	@FindBy(className="checkout_complete_container")
	public WebElement CheckoutComplateFragment;

	
	@FindBy(className="product_sort_container")
	//By using Select class for selecting value from dropdown  
	public WebElement MyAccount;
	
	@FindBy(className="title")
	public WebElement Welcome;
	
	@FindBy(name="login-button")
	public WebElement LoginButton;
	

	@FindBy(css=("*[data-test=\'add-to-cart-sauce-labs-fleece-jacket\']"))
	public List<WebElement> SelectASelection;
	
	
	@FindBy(css=("*[data-test=\'add-to-cart-sauce-labs-onesie\']"))
	public WebElement SelectDSecondSelection;
	
	
	@FindBy(className="shopping_cart_link")
	public WebElement ShoppingCartButton;
	
	@FindBy(name="checkout")
	public WebElement CheckOutButton;

	@FindBy(className ="log-in")
	public WebElement Login_Button;

}