package e2e.Tyl.interaction;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import e2e.Tyl.user_interface.ui_model.TargetObjects;



public class UserSubmitsLogin extends TargetObjects{
	WebDriver driver;

	public UserSubmitsLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void UserSubmitsLoginCheckAssertion(){
		LoginButton.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		//TBTermsAccept.click();
		WebElement ActualResponse;
		ActualResponse = wait.until(ExpectedConditions.visibilityOf(Welcome));
		boolean Actual = ActualResponse.isDisplayed();
		assertThat(Actual, equalTo(true));
	}
}