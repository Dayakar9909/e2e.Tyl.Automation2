package e2e.Tyl.interaction;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import e2e.Tyl.user_interface.ui_model.TargetObjects;


public class UserMakesSelection extends TargetObjects{
	WebDriver driver;

	public UserMakesSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void SelectionWithProduct(){
		List <WebElement> listings =  SelectASelection;
		if(!listings.isEmpty())
		{
			
			listings.get(0).click();
			
		}
		SelectDSecondSelection.click();
	}
}

