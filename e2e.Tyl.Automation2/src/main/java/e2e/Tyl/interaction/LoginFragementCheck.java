package e2e.Tyl.interaction;
import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import e2e.Tyl.user_interface.ui_model.TargetObjects;


public class LoginFragementCheck extends TargetObjects{
	WebDriver driver;

	public LoginFragementCheck(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void CheckLoginFragement(){
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement LoginActualResponse;
		LoginActualResponse = wait.until(ExpectedConditions.visibilityOf(LoginFragment));
		boolean Actual = LoginActualResponse.isDisplayed();

	

	}
}
