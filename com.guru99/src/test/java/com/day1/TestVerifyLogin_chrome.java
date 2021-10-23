package com.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVerifyLogin_chrome {

	@Test
	public void Test1(){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Open\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr356751");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udyvuju");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	Assert.assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());

}
	
	@Test
	public void Test2(){
		WebDriver driver;	
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Open\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr35675");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udyvuju");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	String msg = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	Assert.assertEquals("User or Password is not valid", msg);

}	
	
	
	@Test
	public void Test3(){
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Open\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr356751");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udyvju");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	String msg = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	Assert.assertEquals("User or Password is not valid", msg);


}
	
	@Test
	public void Test(){
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Open\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr35675");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udyvju");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	String msg = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	Assert.assertEquals("User or Password is not valid", msg);


}
	
	
}
	

