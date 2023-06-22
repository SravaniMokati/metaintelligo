package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportingclass {
	public static ExtentReports extent;
public static ExtentReports GenerateReport() {
	
	String filepath = System.getProperty("user.dir")+"//reports//testreport.html";
	
	ExtentSparkReporter spark = new ExtentSparkReporter(filepath);
	spark.config().setDocumentTitle("QAreports");
	spark.config().setReportName("smoke test");
	spark.config().setTheme(Theme.DARK);
	spark.config().setCss(".badge-success {"
			+ "    background-color: #b232aa;"
			+ "}");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(spark);
//    ExtentTest test	=extent.createTest("TestCaseOne");
//    test.info("this is home ");
//    test.pass("this testcase got pass");
//    test	=extent.createTest("TestCaseTwo");
//    test.info("this is home ");
//    test.pass("this testcase got pass");
//    test	=extent.createTest("TestCaseThree");
//    test.info("this is home ");
//    test.fail("this testcase is fail :");
 //     extent.flush();
	return extent;
}
}
