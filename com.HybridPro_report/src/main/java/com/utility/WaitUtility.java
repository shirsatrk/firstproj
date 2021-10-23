package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	//why---> to apply wait
	//input---> time in sec, webelement
	//output---> nothing
	

	public void waitForElement(WebElement element, WebDriver driver, long timeInSec) {
		WebDriverWait wait=new WebDriverWait(driver, timeInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}

}
