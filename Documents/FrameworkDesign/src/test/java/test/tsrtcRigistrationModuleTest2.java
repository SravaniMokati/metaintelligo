package test;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Test.CommonMethod;
import base.init;
import objectRepository.HomeModuleRepo;
import objectRepository.LoginNameRepo;
import objectRepository.TsrtcRegistrationRepo;
public class tsrtcRigistrationModuleTest2 extends init{
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
  public void ApplicationNavigation() throws IOException {
	
	driver=BrowserIntialization();                                            //init obj = new init();
                                                                              //WebDriver driver = obj.BrowserIntialization();
	  driver.get(prop.getProperty("TsrtcUrl"));
  }
    @Test
	public void LoginNameValidation() throws InterruptedException, IOException {

        HomeModuleRepo hm = new HomeModuleRepo(driver);
        hm.eticketLogin().click();
        LoginNameRepo ln = new LoginNameRepo(driver);
        ln.singup().click();
        
        TsrtcRegistrationRepo rp = new TsrtcRegistrationRepo(driver);
        CommonMethod cm = new CommonMethod();
        ArrayList<String> Tcname = cm.exel("Registraiton form","LoginnameValidSpecial");
     
        rp.LoginName().sendKeys(Tcname.get(1));
        rp.fullName().sendKeys( Tcname.get(2));
        rp.email().sendKeys(Tcname.get(3));
        rp.gender(Tcname.get(4));
        rp.Date(Tcname.get(5));           //Tcname.get(5)
        rp.Mobileno().sendKeys(Tcname.get(6));
        rp.nationality(Tcname.get(7));
        rp.address().sendKeys(Tcname.get(8));
        rp.city().sendKeys(Tcname.get(9));
        rp.country(Tcname.get(10));        //Tcname.get(10) "India"
        rp.StateName(Tcname.get(11));
        rp.postalCode().sendKeys(Tcname.get(12));
        rp.IdCardType(Tcname.get(13));
        rp.IdCardNumber().sendKeys(Tcname.get(14));
        rp.IssueAuthority().sendKeys(Tcname.get(15));
        rp.SaveBtn().click();
       
	}
   
   	public void validfullName() throws InterruptedException, IOException {

        HomeModuleRepo hm = new HomeModuleRepo(driver);
        hm.eticketLogin().click();
        LoginNameRepo ln = new LoginNameRepo(driver);
        ln.singup().click();
        
        TsrtcRegistrationRepo rp = new TsrtcRegistrationRepo(driver);
        CommonMethod cm = new CommonMethod();
        ArrayList<String> Tcname = cm.exel("Registraiton form","FullnameValidNum");
     
        rp.LoginName().sendKeys(Tcname.get(1));
        rp.fullName().sendKeys( Tcname.get(2));
        rp.email().sendKeys(Tcname.get(3));
        rp.gender(Tcname.get(4));
        rp.Date("12-Mar-2000");//Tcname.get(5)
        rp.Mobileno().sendKeys(Tcname.get(6));
        rp.nationality(Tcname.get(7));
        rp.address().sendKeys(Tcname.get(8));
        rp.city().sendKeys(Tcname.get(9));
        rp.country("India");//Tcname.get(10)
        rp.StateName(Tcname.get(11));
        rp.postalCode().sendKeys(Tcname.get(12));
        rp.IdCardType(Tcname.get(13));
        rp.IdCardNumber().sendKeys(Tcname.get(14));
        rp.IssueAuthority().sendKeys(Tcname.get(15));
        rp.SaveBtn().click();
        Assert.fail();
   	}

   	public void emailvalid() throws InterruptedException, IOException {

        HomeModuleRepo hm = new HomeModuleRepo(driver);
        hm.eticketLogin().click();
        LoginNameRepo ln = new LoginNameRepo(driver);
        ln.singup().click();
        
        TsrtcRegistrationRepo rp = new TsrtcRegistrationRepo(driver);
        CommonMethod cm = new CommonMethod();
        ArrayList<String> Tcname = cm.exel("Registraiton form","E-mailValid");
        rp.LoginName().sendKeys(Tcname.get(1));
        rp.fullName().sendKeys( Tcname.get(2));
        rp.email().sendKeys(Tcname.get(3));
        rp.gender(Tcname.get(4));
        rp.Date("12-Mar-2000");//Tcname.get(5)       12-Mar-2000
        rp.Mobileno().sendKeys(Tcname.get(6));
        rp.nationality(Tcname.get(7));
        rp.address().sendKeys(Tcname.get(8));
        rp.city().sendKeys(Tcname.get(9));
        rp.country("India");//Tcname.get(10)          India
        rp.StateName(Tcname.get(11));
        rp.postalCode().sendKeys(Tcname.get(12));
        rp.IdCardType(Tcname.get(13));
        rp.IdCardNumber().sendKeys(Tcname.get(14));
        rp.IssueAuthority().sendKeys(Tcname.get(15));
        rp.SaveBtn().click();
   	}
   	
}

