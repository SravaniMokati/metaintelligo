package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginNameRepo {
	
	 WebDriver driver;
	 
	 @FindBy(id="userName") //findElement(By.id("userName"))
	 WebElement txtusename;
	 @FindBy(id="password")
	 WebElement txtpassword;
	 @FindBy(id="submitBtn")
	 WebElement BtnLogin;
	 @FindBy(linkText="SignUp")
	 WebElement linkSignUp;
	 @FindBy(linkText="Forgot Password")
	 WebElement linkForgotPassword;
	 
public LoginNameRepo(WebDriver driver) {
	this.driver = driver;
	PageFactory .initElements(driver, this);//------- driver . 
}

///////////////
public void Login(String usrname, String password) {
	txtusename.sendKeys(usrname);
	txtpassword.sendKeys(password);
	BtnLogin.click();
}

//////////////
public WebElement usename() {
		 return txtusename; //
}
public WebElement password() {
		return txtpassword; 
}

public WebElement login() {
	 return BtnLogin;
}
public WebElement singup() {
	 return linkSignUp;
}
public WebElement forgetpassword() {
	 return linkForgotPassword;
}

}
