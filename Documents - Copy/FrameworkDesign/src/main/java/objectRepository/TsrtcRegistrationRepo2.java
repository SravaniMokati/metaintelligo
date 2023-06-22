package objectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TsrtcRegistrationRepo2 {

	public WebDriver driver;
	
	@FindBy(id="loginName")
	WebElement txtLoginName;
	
	@FindBy(id="fullName") 
	WebElement txtfullName;
	
	@FindBy(id="email")
	WebElement txtemail;
	
	@FindBy(id="genderId")
	WebElement selectGender;
	
	@FindBy(id="txtDob")
	WebElement DobDate;
	
	@FindBy(className="ui-datepicker-month")
	WebElement month;

	@FindBy(className="ui-datepicker-year")
	WebElement year;

	@FindBy(xpath="//td[@data-handler='selectDay']/a") //li[@class='ui-menu-item']/a
	List<WebElement> Day;
	
	@FindBy(id="mobileNo")
	WebElement txtmobileNo;
	
	@FindBy(id="nationalityId")
	WebElement Selectnationality;

	@FindBy(id="address1")
	WebElement txtaddress;
	
	@FindBy(id="city")
	WebElement txtcity;
	
	@FindBy(name="countryCode")
	WebElement Selectcountry;
	
	@FindBy(id="stateName")
	WebElement AutoSelectStateName;
	
	@FindBy(xpath="//li[@class='ui-menu-item']/a")
	List<WebElement> state;

	@FindBy(id="zipCode")
	WebElement txtPostalCode;

	@FindBy(id="proofTypeId")
	WebElement SelectIdCardType;
	
	@FindBy(id="idNumber")
	WebElement txtIdNumber;
	
	@FindBy(id="issueAuthority")
	WebElement txtIssueAuthority;
	
	@FindBy(name="SaveBtn")
	WebElement SaveBtn;
	
	public TsrtcRegistrationRepo2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement LoginName() {
		return txtLoginName;
		 
	}
	public WebElement fullName() {
		return txtfullName;
	}
	public WebElement email() {
		return txtemail;
	}
	public void gender(String option) {
		Select gender = new Select(selectGender);
		gender.selectByVisibleText(option);
	}
	public void Date(String Datetoselect) {
		//24-5-2000
		String[] date = Datetoselect.split("-");
		String d = date[0];
		String m = date[1];
		String y = date[2];
		
		DobDate.click();
		
		
		Select Year = new Select(year);
	    Year.selectByValue(y);
		
		Select Month = new Select(month);
		Month.selectByVisibleText(m);

		 
		 System.out.println(Day.size());
			for(WebElement day :Day) {
				if(day.getText().equalsIgnoreCase(d)) {
				day.click();
				break;
				}
			}
	
	}
	public WebElement Mobileno() {
		return txtmobileNo;
	}
	
	public void nationality(String nations) {
		Select nation = new Select(Selectnationality);
		nation.selectByVisibleText(nations);
	}
	
	public WebElement address() {
		return txtaddress;
	}
	
	public WebElement city() {
		return txtcity;
	}

	public void country(String scountry) {
		Select c = new Select(Selectcountry);
		c.selectByVisibleText(scountry);
	}
	public void StateName(String Statename) throws InterruptedException {
	

		AutoSelectStateName.sendKeys(Statename);
		Thread.sleep(500);
		 System.out.println(state.size());
			for(WebElement s :state) {
				if(s.getText().equalsIgnoreCase(Statename)) {
					s.click();
				break;
				}
			}
	}
	public WebElement postalCode() {
		return txtPostalCode;
	}
	public void IdCardType(String Idtype) {
		Select id = new Select(SelectIdCardType);
		id.selectByVisibleText(Idtype);
	}
	public WebElement IdCardNumber() {
		return txtIdNumber;
	}
	public WebElement IssueAuthority() {
		return txtIssueAuthority;
	}
	public WebElement SaveBtn() {
		return SaveBtn;
	}
    public ArrayList<String> exel(String TCname) throws IOException  {
    	FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\Automation Testing\\24-05-2023testdatafiletsrtc.xlsx");	
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    
  
	    ArrayList <String> testcasedata = new ArrayList<>();
	    
	    XSSFSheet sheet1 = workbook.getSheet("Registraiton form");
        Iterator <Row> row= sheet1.iterator();
	   
	    while(row.hasNext()) {
	      Row specificrowflow  = row.next();
	 
	       if(specificrowflow.getCell(0).getStringCellValue().equals(TCname)) {
	          Iterator<Cell> cell  = specificrowflow.iterator();
	         
	            while (cell.hasNext()) {
	    	
	              Cell specificcellflow =cell.next();
	    	
	               String celldata = specificcellflow.getStringCellValue();
	             //  System.out.println("  "+celldata);
	               testcasedata.add(celldata);
	               }
	   
	               System.out.println();
	              }
		      }
     
	return testcasedata;

    }
}
