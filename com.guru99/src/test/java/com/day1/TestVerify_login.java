package com.day1;

//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVerify_login {
	WebDriver driver;
	@Test
	public void Test1(){
	System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Open\\Downloads\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr356751");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udyvuju");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	Assert.assertEquals(" Guru99 Bank Manager HomePage ", driver.getTitle());

}
}
