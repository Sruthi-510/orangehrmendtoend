package com.qa.orangeendtoend.Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetry implements IRetryAnalyzer {
	private static int count=0;
	private static int maxtry=3;
	@Override
	public boolean retry(ITestResult result ) {
		if(!result.isSuccess()) {
			if(count<maxtry) {
				count++;
				result.setStatus(result.FAILURE);
				return true;
			}else {
				result.setStatus(result.FAILURE);
			}
		}else {
			result.setStatus(result.SUCCESS);
		}
		return false;
	}

}
