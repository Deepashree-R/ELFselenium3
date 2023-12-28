package extent_report_tool;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class zomato {
public static void main(String[] args) throws IOException {
	
	ExtentSparkReporter reporter=new ExtentSparkReporter("./extentreport/extent_report.html");
	ExtentReports reports= new ExtentReports();
	reports.attachReporter(reporter);
	
	ExtentTest test=reports.createTest("test 1").assignAuthor("qspiders");
	
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.zomato.com");
	String title = driver.getTitle();
	
	test.log(Status.INFO, "test case is pass");
	
	if(title.equals("Zomato"))
	{
		System.out.println("test case is pass");
	}
	else
	{
		test.log(Status.FAIL, "trst case is fail");
		test.addScreenCaptureFromPath(get_photo(driver));
	}
	reports.flush();
}
	
public static String get_photo(WebDriver driver) throws IOException
{
	String path="C:\\selenium_extentreport_screenshot\\defect.jpg";
	TakesScreenshot tss=(TakesScreenshot) driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dst=new File(path);
	FileHandler.copy(src, dst);
	return path;
}
}
