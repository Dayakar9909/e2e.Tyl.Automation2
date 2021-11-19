package e2e.Tyl.interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import e2e.Tyl.user_interface.ui_model.TargetObjects;


public class UserInformation extends TargetObjects {
	WebDriver driver;

	public UserInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void UserSendsInfoData(String firstname, String lastname, String postalcode)
	{
		FirstName.sendKeys(firstname);	
		LastName.sendKeys(lastname);
		PostalCode.sendKeys(postalcode);
	}
	public void UserSendsDataForMobileSite(String username, String password)
	{
		WebDriverWait wait = new WebDriverWait(driver,65);
		WebElement UserNamePopUP;
		UserNamePopUP = wait.until(ExpectedConditions.visibilityOf(UserName));
		UserNamePopUP.sendKeys(username);	
		Password.sendKeys(password);
	}
}
