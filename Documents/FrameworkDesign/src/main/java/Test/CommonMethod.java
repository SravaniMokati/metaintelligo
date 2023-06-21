package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CommonMethod {
	
public WebDriver driver;

public ArrayList<String> exel(String sheetname,String TCname) throws IOException  {
	    	FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\Automation Testing\\24-05-2023testdatafiletsrtc.xlsx");	
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    
	  
		    ArrayList <String> testcasedata = new ArrayList<>();
		    
		    XSSFSheet sheet1 = workbook.getSheet(sheetname);//Registraiton form
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
