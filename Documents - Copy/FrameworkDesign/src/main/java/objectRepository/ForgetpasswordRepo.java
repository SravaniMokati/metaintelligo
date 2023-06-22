package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetpasswordRepo {
	
public WebDriver driver;

@FindBy(id="userName")
WebElement txtEmail_LoginId;

@FindBy(id="submitBtn")
WebElement submitBtn;

@FindBy(id="errorMsg")
WebElement errorMsg;

//Login Name not found in the system.
public ForgetpasswordRepo(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

public void ForgetpassWord(String Email_LoginName	) {
	txtEmail_LoginId.sendKeys(Email_LoginName);
	submitBtn.click();
	
}
public WebElement Errormsg() {
	return errorMsg;
}
}
