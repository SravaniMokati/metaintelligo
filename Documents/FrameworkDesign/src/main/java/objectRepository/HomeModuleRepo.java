package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModuleRepo {
	
	
   WebDriver driver;
   By linkEticketLogin = By.linkText("eTicket Login");
   
   public HomeModuleRepo(WebDriver driver) {
	 this.driver = driver;
   }
   
	public WebElement eticketLogin() {
		 return driver.findElement(linkEticketLogin);
	}
	
	
}
