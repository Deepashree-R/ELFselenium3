package extent_report_tool;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class sample {
public static void main(String[] args) {
	ExtentSparkReporter repots=new ExtentSparkReporter("./extentreport/extent_report.html");
	ExtentReports reporter=new ExtentReports();
	reporter.attachReporter(repots);
	ExtentTest test = reporter.createTest("test1").assignAuthor("selenium");
	test.log(Status.FAIL, "hello");
	reporter.flush();
}
}
