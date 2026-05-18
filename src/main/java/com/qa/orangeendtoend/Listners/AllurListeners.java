package com.qa.orangeendtoend.Listners;





import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.orangeendtoend.DriverFactory.DriverManager;

import io.qameta.allure.Attachment;

public class AllurListeners implements ITestListener {
	public String getTestMethodName(ITestResult result) {
		return result.getMethod().getConstructorOrMethod().getName();
	}
	@Attachment(value = "pageScreenShot",type="image/png")
	public byte[] getScreenShotinByte(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] temp = ts.getScreenshotAs(OutputType.BYTES);
		return temp;
		
		
	}
	@Attachment(value ="{0}",type = "plain/text")
	public String getTextLog(String msg) {
		return msg;
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("i have started the suite execution"+context.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("i have finished the suite execution"+context.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("i have started with testcase execution"+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase execution is failed"+result.getName());
		if(com.qa.orangeendtoend.DriverFactory.DriverManager.getDriver() instanceof WebDriver)
		{
			getScreenShotinByte(DriverManager.getDriver());
			System.out.println("test method is failed and screenshot is captured for "+result.getName());
		}
		getTextLog(getTestMethodName(result)+"method failed and screenshot iscaptured for"+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase execution has skipped"+result.getName());
	}

}
