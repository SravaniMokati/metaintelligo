package test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.init;
import objectRepository.HomeModuleRepo;
import objectRepository.LoginNameRepo;
import objectRepository.TsrtcRegistrationRepo;
public class TsrtcRegistrationModuleTest extends init{
	
	
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
  public void ApplicationNavigation() throws IOException {
	
	driver=BrowserIntialization();                                            //init obj = new init();
                                                                              //	WebDriver driver = obj.BrowserIntialization();
	  driver.get(prop.getProperty("TsrtcUrl"));
  }
	
	
	@Test(groups= {"smoke"})
	public void LoginNameValidation() throws InterruptedException {

        HomeModuleRepo hm = new HomeModuleRepo(driver);
        hm.eticketLogin().click();
        LoginNameRepo ln = new LoginNameRepo(driver);
        ln.singup().click();
        TsrtcRegistrationRepo rp = new TsrtcRegistrationRepo(driver);
        rp.LoginName().sendKeys("Sravani1232@146535%");
        rp.fullName().sendKeys("sravani mokati");
        rp.email().sendKeys("sravani123@gmail.com");
        rp.gender("FEMALE");
        rp.Date("12-Mar-2000");
        rp.Mobileno().sendKeys("7896543219");
        rp.nationality("NRI");
        rp.address().sendKeys("pileru,kothapeta,chittoor");
        rp.city().sendKeys("pileru");
        rp.country("India");
        rp.StateName("ANDHRA PRADESH");
        rp.postalCode().sendKeys("517214");
        rp.IdCardType("PAN CARD");
        rp.IdCardNumber().sendKeys("BS4575322");
        rp.IssueAuthority().sendKeys("nothing");
        rp.SaveBtn().click();
        
	}
@Test
   	public void validfullName() {

       	
           HomeModuleRepo hm = new HomeModuleRepo(driver);
           hm.eticketLogin().click();
           LoginNameRepo ln = new LoginNameRepo(driver);
           ln.singup().click();
           TsrtcRegistrationRepo rp = new TsrtcRegistrationRepo(driver);
           rp.LoginName().sendKeys("Sravani1232@146535%");
           rp.fullName().sendKeys("sravani mokati");
           rp.email().sendKeys("sravani123@gmail.com");
           rp.gender("FEMALE");
           rp.Date("12-Mar-2000");
           rp.Mobileno().sendKeys("7896543219");
           rp.SaveBtn().click();
           
   	}
}

