package com.qa.orangeendtoend.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.orangeendtoend.DriverFactory.DriverManager;
import com.qa.orangeendtoend.configreader.configReader;
import com.qa.orangeendtoend.utilities.WebDriverActions;
import com.qa.orangeendtoendpages.Dashboard;
import com.qa.orangeendtoendpages.Loginpage;
import com.qa.orangeendtoendpages.PIMPage;
import com.qa.orangeendtoendpages.RecruitmentPage;

public class BaseTest {
	protected WebDriver driver;
	protected DriverManager dm;
	protected WebDriverActions wda;
	protected Loginpage lp;
	protected Dashboard dpg;
	protected RecruitmentPage rp;
	protected configReader rcd;
	protected PIMPage pim;
	protected String Usern;
	protected String passw;
	@Parameters({"browserNamexml","headlessModexml","privateModexml"})
	@BeforeMethod
	public void launchingBrowser(@Optional("chrome")String browserNamexml,@Optional("true")String headlessModexml,@Optional("true")String privateModexml) throws Exception {
		rcd = new configReader();
		dm = new DriverManager();
		dm=new DriverManager();
		String browser = System.getProperty("browser",browserNamexml);
		String Url = configReader.getProperty("url");
		String headless = System.getProperty("headless",headlessModexml);
		String incognito = System.getProperty("incognito",privateModexml);
		if(browserNamexml !=null) {
			configReader.prop.setProperty("browserName",browser);
		}
		if(headlessModexml !=null) {
			configReader.prop.setProperty(headless, headless);
		}
		if(privateModexml !=null) {
			configReader.prop.setProperty("incognito", incognito);
		}
		boolean headlessValue = Boolean.parseBoolean(configReader.getProperty("headless"));
		boolean incognitoValue = Boolean.parseBoolean(configReader.getProperty("incognito"));
		Usern=configReader.getProperty("username");
		passw=configReader.getProperty("password");
		
		driver=dm.launchBrowser(configReader.getProperty("browserName"),headlessValue,incognitoValue);
		wda=new WebDriverActions(driver);
		wda.maximizeBrowser();
		wda.openUrl(Url);
		lp=new Loginpage(driver);
		
	}
	@AfterMethod
	
	public void terminateBrowser() {
		wda.closeAllTabs();
	}
}
	
	
	


