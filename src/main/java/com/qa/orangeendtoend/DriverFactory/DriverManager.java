package com.qa.orangeendtoend.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

import com.qa.orangeendtoend.Error.FrameWorkError;
import com.qa.orangeendtoend.FrameWorkExceptions.FrameWorkExceptions;

import net.bytebuddy.asm.Advice.Return;

public class DriverManager {
	static ThreadLocal<WebDriver>threadDriver = new ThreadLocal<WebDriver>();
	public WebDriver launchBrowser(String browser,boolean headless,boolean incognito) {
	switch(browser) {
	case "chrome":
		ChromeOptions copt = DriverOptions.getchromeOptions(headless, incognito);
		threadDriver.set(new ChromeDriver(copt));
		break;
	case "firefox":
		FirefoxOptions fopt = DriverOptions.getFirefoxOptions(headless, incognito);
		threadDriver.set(new FirefoxDriver(fopt));
		break;
	case "edge":
		EdgeOptions eopt = DriverOptions.getedgeOptions(headless, incognito);
		threadDriver.set(new EdgeDriver(eopt));
		break;
		default:Reporter.log(browser + FrameWorkError.browserInvalidMsg);
		throw new FrameWorkExceptions("Please pass chrome/firefox/edge");
	}
	return getDriver();
	}
	public  static WebDriver getDriver() {
		return threadDriver.get();
		
	}

}
