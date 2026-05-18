package com.qa.orangeendtoend.Validationhelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.orangeendtoend.FrameWorkExceptions.ElementException;

public class Validation {
public static void validateLocator(By locator,String methodName) {
	if(locator == null) {
		throw new ElementException("[validateLocator] the specified locator cannot be null\n"+locator+"used in method"+methodName);
	}
	if(methodName == null) {
		throw new ElementException("[validateLocator] the specified methodName  cannot be null\n"+methodName+"used in method"+methodName);
	}
}
public static void validateElement(WebElement element,String methodName) {
	if(element==null) {
		throw new ElementException("[validateElement] the specified element cannot be null\n"+element+"used in method"+methodName);
	}
	if(methodName==null) {
		throw new ElementException("[validateLocator] the specified methodName cannot be null\n"+methodName+"used in method"+methodName);
		
	}
}
public static void validateString(String value,String methodName) {
	if(value==null) {
		throw new ElementException("[validateString] the specified value cannot be null\n"+value+"used in method"+methodName);
		
	}
	if(methodName==null) {
		throw new ElementException("[validateLocator] the specified methodName cannot be null\n"+methodName+"used in method"+methodName);
	}
}

}
