package com.qa.orangeendtoend.utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.qa.orangeendtoend.constants.Waitconstants;

public class WaitStrategy {
	protected WebDriver driver;
	FluentWait<WebDriver> fw;
	public WaitStrategy(WebDriver driver) {
		this.driver=driver;
		fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Waitconstants.waittime))
				.pollingEvery(Duration.ofSeconds(Waitconstants.pollingtime)).ignoring(NoSuchFieldException.class)
				.ignoring(StaleElementReferenceException.class);
	}
	public WebElement checkforElementPresencElement(By locator) {
		return fw.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public WebElement waitforVisibility(By locator) {
		return fw.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public WebElement waitForClickable(By locator) {
		return fw.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public Boolean waitForurl(String url) {
		return fw.until(ExpectedConditions.urlContains(url));
	}
	public Boolean waitForTitle(String title) {
		return fw.until(ExpectedConditions.titleContains(title));
	}
	public Alert waitForAlert() {
		return fw.until(ExpectedConditions.alertIsPresent());
	}
	public WebDriver waitForFrame(int index) {
		return fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	public WebDriver waitForframe(String nameorid) {
		return fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameorid));
	}

}
