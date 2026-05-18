package com.qa.orangeendtoend.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	public static File getScreenShotInFileFormat(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		return temp;
		
	}
	public static String getScreenShotInBase64Format(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		String temp = ts.getScreenshotAs(OutputType.BASE64);
		return temp;
	}
	public static byte[] getScreenShotInByteFormat(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] temp= ts.getScreenshotAs(OutputType.BYTES);
		return temp;
	}
}

