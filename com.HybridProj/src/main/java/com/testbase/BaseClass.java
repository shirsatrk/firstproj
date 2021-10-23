package com.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import com.utility.PropertiesUtility;
import com.utility.WaitUtility;

public class BaseClass {

	public PropertiesUtility prop = null;
	public WaitUtility wait = null;
	
	@BeforeSuite
	public void setup() {
		WebDriver driver = null;
		prop = new PropertiesUtility();
		wait =new WaitUtility();
		
		if (prop.readProperties("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.readProperties("chromedriverpath"));
			driver = new ChromeDriver();
		}
		if (prop.readProperties("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.readProperties("firefoxdriverpath"));
			driver = new FirefoxDriver();
		}
		if (prop.readProperties("browser").equals("internetexplorer")) {
			System.setProperty("webdriver.internetexplorer.driver", prop.readProperties("internetexplorer"));
			driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.readProperties("url"));
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.readProperties("pageLoadTime")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.readProperties("pageLoadTime")), TimeUnit.SECONDS);
		
		
	}
	
	
}
