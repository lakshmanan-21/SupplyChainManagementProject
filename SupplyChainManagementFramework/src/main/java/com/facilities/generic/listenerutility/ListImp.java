package com.facilities.generic.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.facilities.generic.webdriverutility.UtilityClassObject;

import om.facilities.basetest.BaseClass;

public class ListImp implements ITestListener,ISuiteListener
{

	public ExtentReports report;
		public ExtentTest test;
		
		@Override
		public void onStart(ISuite suite) 
		{
			System.out.println("Report configuration");
			String time=new Date().toString().replace("","_").replace(":","_");
			ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report1_"+time+".html");
			spark.config().setDocumentTitle("Supply chain management results");
			spark.config().setReportName("Facilities Management report");
			spark.config().setTheme(Theme.DARK);
			report=new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("OS", "Windows-10");
			report.setSystemInfo("BROWSER", "CHROME-100");
			
		}
	
		@Override
		public void onFinish(ISuite suite) 
		{
			System.out.println("Report backup");
			report.flush();
		}
	
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("==="+result.getMethod().getMethodName()+"start");
			test=report.createTest(result.getMethod().getMethodName());
	        UtilityClassObject.setTest(test);
			test.log(Status.INFO,result.getMethod().getMethodName()+"==> STARTED<===");
		}
	
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("==="+result.getMethod().getMethodName()+"end");
			test.log(Status.PASS,result.getMethod().getMethodName()+"==>COMPLETED<===");
		}
	
		@Override
		public void onTestFailure(ITestResult result) 
		{
			String testname=result.getMethod().getMethodName();
			TakesScreenshot s=(TakesScreenshot)BaseClass.sdriver;
		 String filepath = s.getScreenshotAs(OutputType.BASE64);
		 String time=new Date().toString().replace(" ","_").replace(":","_");
			test.addScreenCaptureFromBase64String(filepath,testname+"_"+time);
			test.log(Status.FAIL,result.getMethod().getMethodName()+"==> FAILED<===");
		}
	

}
