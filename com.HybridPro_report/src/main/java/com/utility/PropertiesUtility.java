package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	FileInputStream fis = null;
	
	public String readProperties(String key) {
	Properties prop = new Properties();
	try {
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	if (prop.getProperty(key)!=null) {
		return prop.getProperty(key);		
	}else {
		return "Property value not found for "+key;
	}
	
	
		
		
		
	}
	
	
}
