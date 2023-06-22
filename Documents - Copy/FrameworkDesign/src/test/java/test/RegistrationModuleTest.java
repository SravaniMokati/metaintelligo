package test;
import objectRepository.HomeModuleRepo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.init;
import objectRepository.LoginNameRepo;

public class RegistrationModuleTest extends init {
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
  public void ApplicationNavigation() throws IOException {
	// init obj = new init();
//	WebDriver driver = obj.BrowserIntialization();
	driver=BrowserIntialization();
	  driver.get("https://www.apsrtconline.in/");
  }
	
	@Test(groups= {"smoke"})
	public void fullnamevalid() {
		
		 
		 HomeModuleRepo home = new HomeModuleRepo(driver);
		 home.eticketLogin().click();// driver.findElement(By.linkText("eTicket Login")).click();
		 LoginNameRepo lg = new LoginNameRepo(driver);
		 lg.singup().click();
		
		 driver.findElement(By.name("loginName")).sendKeys("sravani67");
			driver.findElement(By.name("fullName")).sendKeys("sravani@#$%@");
			driver.findElement(By.id("email")).sendKeys("sravs15@gmail.com");
			driver.findElement(By.name("mobileNo")).sendKeys("7672220033");
			driver.findElement(By.name("SaveBtn")).click();
			
	}
  @Test
	public void Loginnamevalid() {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.apsrtconline.in/");
		 driver.findElement(By.linkText("eTicket Login")).click();
		 driver.findElement(By.linkText("SignUp")).click();
		 driver.findElement(By.name("loginName")).sendKeys("sravani67@#$$");
			driver.findElement(By.name("fullName")).sendKeys("sravani");
			driver.findElement(By.id("email")).sendKeys("sravs15@gmail.com");
			driver.findElement(By.name("mobileNo")).sendKeys("7672220033");
			driver.findElement(By.name("SaveBtn")).click();
			
	}
  @Test
	public void Emailvalid() {
//		 WebDriver driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.get("https://www.apsrtconline.in/");
		 driver.findElement(By.linkText("eTicket Login")).click();
		 driver.findElement(By.linkText("SignUp")).click();
		 driver.findElement(By.name("loginName")).sendKeys("sravani67@#$$");
			driver.findElement(By.name("fullName")).sendKeys("sravani");
			driver.findElement(By.id("email")).sendKeys("sravs15@.com");
			driver.findElement(By.name("mobileNo")).sendKeys("7672220033");
			driver.findElement(By.name("SaveBtn")).click();
			
	}
  @Test
	public void mobilenovalid() {
//		 WebDriver driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.get("https://www.apsrtconline.in/");
		 driver.findElement(By.linkText("eTicket Login")).click();
		 driver.findElement(By.linkText("SignUp")).click();
		 driver.findElement(By.name("loginName")).sendKeys("sravani67@#$$");
			driver.findElement(By.name("fullName")).sendKeys("sravani");
			driver.findElement(By.id("email")).sendKeys("sravs15@gmail.com");
			driver.findElement(By.name("mobileNo")).sendKeys("2672220033");
			driver.findElement(By.name("SaveBtn")).click();
			
	}
}
