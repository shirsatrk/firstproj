package com.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.ListenerEx;
import com.testbase.BaseClass;
@Listeners(ListenerEx.class)
public class LoginTest extends BaseClass {
	public static Logger log = Logger.getLogger(LoginTest.class);
	@Test
	public void test1() {
		log.info("Test1 started.");
	prop.readProperties("browser");
	Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "Sign in to start your session");
		
	
}
	
	
}
