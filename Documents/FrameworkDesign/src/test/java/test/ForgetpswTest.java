package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.ForgetpasswordRepo;
import objectRepository.HomeModuleRepo;
import objectRepository.LoginNameRepo;

public class ForgetpswTest {
	@Test(groups= {"smoke"})
public void LoginfeildValidation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/");
		HomeModuleRepo hp = new HomeModuleRepo(driver);
		hp.eticketLogin().click();
		LoginNameRepo ln = new LoginNameRepo(driver);
		ln.forgetpassword().click();
		ForgetpasswordRepo fp = new ForgetpasswordRepo(driver);
		
		fp.ForgetpassWord("8767476324#@@");
		//validation
		String ExpectedErrormsg = "Login Name not found in the system.";
		String ActuvalErrorMsg = fp.Errormsg().getText();
		if(ActuvalErrorMsg.equalsIgnoreCase(ExpectedErrormsg)) {
			System.out.println("pass the testcase");
		}else {
			Assert.fail("testcase is fail");
		}
}
	@Test
public void EmailCheck() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tsrtconline.in/");
	HomeModuleRepo hp = new HomeModuleRepo(driver);
	hp.eticketLogin().click();
	LoginNameRepo ln = new LoginNameRepo(driver);
	ln.forgetpassword().click();
	ForgetpasswordRepo fp = new ForgetpasswordRepo(driver);
	fp.ForgetpassWord("sravs123@gmail.com");
	//validation
	String ExpectedErrormsg = "Login Name not found in the system.";
	String ActuvalErrorMsg = fp.Errormsg().getText();
	if(ActuvalErrorMsg.equalsIgnoreCase(ExpectedErrormsg)) {
		System.out.println("pass the testcase");
	}else {
		Assert.fail("testcase is fail");
	}
}
}

