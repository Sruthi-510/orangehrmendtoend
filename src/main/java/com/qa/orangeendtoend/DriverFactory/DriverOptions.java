package com.qa.orangeendtoend.DriverFactory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

public class DriverOptions {
	public static ChromeOptions getchromeOptions(Boolean headless,Boolean incognito) {
		ChromeOptions opt = new ChromeOptions();
		if(headless) {
		
			opt.addArguments("--headless");
			Reporter.log("Running chrome inheadless mode",true);
		}
		if(incognito) {
			opt.addArguments("--incognito");
			Reporter.log("Running chrome incognitomode",true);
		}
		return opt;
	}
		public static FirefoxOptions getFirefoxOptions(Boolean headless,Boolean incognito) {
			FirefoxOptions opt1 = new FirefoxOptions();
			if(headless) {
				opt1.addArguments("--headless");
				Reporter.log("Running chrome inheadless mode",true);
			}
			if(incognito) {
				opt1.addArguments("private");
				Reporter.log("Running Firefox incognitomode",true);
			}
			return opt1;
		}
			public static EdgeOptions getedgeOptions(Boolean headless,Boolean incognito) {		
				EdgeOptions opt2= new EdgeOptions();
				if(headless) {
					opt2.addArguments("--headless");
					Reporter.log("Running edge in headlessmode",true);
				}
				if(incognito) {
					opt2.addArguments("private");
					Reporter.log("Running Firefox incognitomode",true);
				}
				return opt2;
					
				}
			
	}


