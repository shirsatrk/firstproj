package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testbase.BaseClass;

public class DriverUtility extends BaseClass {
WebDriver driver = null; 
	public void switchToFrameIndex(int index) {
		driver.switchTo().frame(index);
		
	}
	public void switchToFrameName(String id) {
		driver.switchTo().frame(id);
		
	}
	public void switchToFrameElement(WebElement element) {
		driver.switchTo().frame(element);
		
	}
	public void switchToFrameElement() {
		driver.switchTo().parentFrame();
		
	}
	public void switchToWindow(String id) {
		driver.switchTo().window(id);
		
		
	}
}
