package e2e.Tyl.interaction;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CloseBrowser {
	WebDriver driver;

	public CloseBrowser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void CloseCurrentBrowser(){
		try {
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> iter = windows.iterator();
			String[] winNames=new String[windows.size()];
			int i=0;
			while (iter.hasNext()) {
				winNames[i]=iter.next();
				i++;
			}

			if(winNames.length > 1) {
				for(i = winNames.length; i > 1; i--) {
					driver.switchTo().window(winNames[i - 1]);
					driver.close();
				}
			}
			driver.switchTo().window(winNames[0]);
			driver.close();
		}
		catch(Exception e){         
			e.printStackTrace();
		}
	}
}
