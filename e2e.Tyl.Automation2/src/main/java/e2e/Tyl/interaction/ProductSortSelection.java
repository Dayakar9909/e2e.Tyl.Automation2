package e2e.Tyl.interaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import e2e.Tyl.user_interface.ui_model.TargetObjects;


public class ProductSortSelection extends TargetObjects {
	WebDriver driver;
	
	public ProductSortSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;   
	}
	public void UserMakesSelection(String a) {
		//Use Select class for selecting value from dropdown  menu
	      
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));  
		dropdown.selectByVisibleText(a);  
		
	
}
	}


