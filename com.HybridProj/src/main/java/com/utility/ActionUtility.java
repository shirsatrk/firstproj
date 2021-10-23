package com.utility;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.testbase.BaseClass;

public class ActionUtility extends BaseClass {
	WebDriver driver = null;
	public void typeIn(WebElement element , String text) {
		element.sendKeys(text);
		}
	public void click(WebElement element) {
		
		element.click();
		}
	
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);
		
	}
	
	public void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element);
	}
	
	public void moveAndClick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	public WebElement getElement(String locType, String locValue) {
		if (locType.equals("xpath")) {
			driver.findElement(By.xpath(locValue));
		}
		else if (locType.equals("id")) {
			driver.findElement(By.id(locValue));
		}
		else if (locType.equals("css")) {
			driver.findElement(By.cssSelector(locValue));
		}
		return null;
		
	}


}