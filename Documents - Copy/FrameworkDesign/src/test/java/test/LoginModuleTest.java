package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomeModuleRepo;
import objectRepository.LoginNameRepo;

public class LoginModuleTest {
	@Test
public void InvalidLoginname() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.tsrtconline.in/oprs-web/user/add.do");	
    
    HomeModuleRepo hm = new HomeModuleRepo(driver);
    hm.eticketLogin().click();
    LoginNameRepo lp = new LoginNameRepo(driver);
    lp.Login("InvalidUsername", "validpassword");
}
}
