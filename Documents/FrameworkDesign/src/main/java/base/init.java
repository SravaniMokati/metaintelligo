package base;
import java.time.Duration;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class init {
	
	public WebDriver driver;
	public Properties prop;
public WebDriver BrowserIntialization() throws IOException {
	
	prop = new Properties ();
	String filepath = System.getProperty("user.dir");
	FileInputStream fs = new FileInputStream(filepath+"\\Resourses\\Config2.properties");
	prop.load(fs);
	String Browser;
	Browser = prop.getProperty("browser");
	if(Browser ==null) {
		Browser = prop.getProperty("Browser");
	}
	if(Browser.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}else if(Browser.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	else {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	return driver;
}
public String getscreenshot(String testcasename , WebDriver driver ) throws IOException {
	  File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String screanshotpath = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
      FileHandler.copy(src, new File ( screanshotpath));
      
      return screanshotpath;
}
}
