package e2e.Tyl.interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import e2e.Tyl.user_interface.ui_model.TargetObjects;

	public class UserClickOnShoppingCart extends TargetObjects{
		WebDriver driver;

public UserClickOnShoppingCart(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;  
		}
		
		public void ShoppingCartButton(){
			ShoppingCartButton.click();
		}

	}

