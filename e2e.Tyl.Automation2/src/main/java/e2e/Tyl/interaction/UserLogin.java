package e2e.Tyl.interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import e2e.Tyl.user_interface.ui_model.TargetObjects;

public class UserLogin extends TargetObjects {
	WebDriver driver;

	public UserLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void UserSendsData(String username, String password)
	{
		UserName.sendKeys(username);	
		Password.sendKeys(password);
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
