package com.Tmobile.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyListeners implements ITestListener, IAutoConts{

	public static ExtentReports repo;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName() + "STARTED", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass(MarkupHelper. createLabel(result.getName() + " is passed", ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(MarkupHelper. createLabel(result.getName() + " is failed due to following reason", ExtentColor.RED));
		test.fail(result.getThrowable());
		test.fail("Testcase failure and the screenshot is attached below");

		WebDriverCommonLib wlib = new WebDriverCommonLib();
		try {
			wlib.getFullScreenshot(
					"C:\\Users\\hai\\git\\repository\\TMobile_Github\\src\\test\\resources\\Screenshots\\abc.png");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath("./Screenshots/xyz.png");
	}
	
	@Override
	
	public void onStart(ITestContext context) {
		Reporter.log(context.getName() + "TestRunner STARTED", true);
		FileLib flib = new FileLib();
		repo = new ExtentReports();
		//spark = new ExtentSparkReporter( reportPath + "/reports/extentreport.html");
		spark=new ExtentSparkReporter("E:\\GCSE3\\TmobileCucumber\\Reports\\extentreport.html");
		// spark=new
		// ExtentSparkReporter(BaseTest.reportPath+"/reports/extentreport.html");

		// setting the system information
		repo.setSystemInfo("author", "sravanthi");
		repo.setSystemInfo("OS", "Windows 10");
		try {
			repo.setSystemInfo("browser", flib.readPropData(PROP_PATH, "browser"));

		} catch (Throwable e) {
			e.printStackTrace();
		}
		// customizing the report view
		spark.config().setDocumentTitle("Tmobile");
		spark.config().setReportName(" My Extent Report");
		repo.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName() + "Test Runner completed", true);
		repo.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(MarkupHelper.createLabel(result.getName()+" is skipped",ExtentColor.YELLOW));
		test.skip(result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	// Saving or writing all the logs into the repo
	
}
