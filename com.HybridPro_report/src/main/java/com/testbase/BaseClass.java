package com.testbase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utility.PropertiesUtility;
import com.utility.WaitUtility;

//import freemarker.log.Logger;

public class BaseClass {
	public static WebDriver driver = null;
	public static PropertiesUtility prop = null;
	public static WaitUtility wait = null;
	
	public static Logger log = Logger.getLogger(BaseClass.class);
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeSuite
	public void setup() {
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
	
	
	
	public void reportInit() {
	spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");
	report = new ExtentReports();
	report.setSystemInfo("Host Name", "Rohan-RKS");
	report.setSystemInfo("Platform", "Windows");
	report.setSystemInfo("Environment", "Test Automation");
	report.attachReporter(spark);
	}
	public String takeScreenShot(String name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Screenshot/" + name + ".jpg";
		try {
			FileUtils.copyFile(src, new File (path));
		} catch (Exception e) {
			}
		return path;
		
		
		
	}
	
	
	
}
