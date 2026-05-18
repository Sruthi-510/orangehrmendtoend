package com.qa.orangeendtoend.utilities;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverActions extends BaseUtilities {
	public WebDriverActions(WebDriver driver){
		super(driver);
	}

public void openUrl(String url) {
	driver.get(url);
}
public String printTitle() {
	return driver.getTitle();
}
public String printurl() {
	return driver.getCurrentUrl();
}
public String printSourceCode() {
	return driver.getPageSource();
}
public void closeCurrentTab() {
	driver.close();
}
public void closeAllTabs() {
	driver.quit();
}
public void maximizeBrowser() {
	driver.manage().window().maximize();
}
public void minimizeBrowser() {
	driver.manage().window().minimize();
}
public void fullScreenBrowser() {
	driver.manage().window().fullscreen();
}
public void navigateTour(String urll) {
	driver.navigate().to(urll);
}
public void goBackWard() {
	driver.navigate().forward();
}
public void goForward() {
	driver.navigate().forward();
}
public void doRefresh() {
	driver.navigate().refresh();
}
public String CurrentWinId() {
	return driver.getWindowHandle();
}
public Set<String> AllWinId(){
	return driver.getWindowHandles();
}
public Alert SwitchToAlert() {
	return driver.switchTo().alert();
}
public void switchToWindow(String address) {
	driver.switchTo().window(address);
}
public void switchToFrame(int index) {
	driver.switchTo().frame(index);
}
public void switchToFrame(String nameorid) {
	driver.switchTo().frame(nameorid);
}
public void switchToFrame(WebElement ref) {
	driver.switchTo().frame(ref);
}
	
	

}
