package com.filpcart.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {
    public Properties prop;
	
	public Configuration_reader() throws Throwable {
		File file= new File(
				"C:\\Users\\Manimaran\\eclipse-workspace\\Filp_Cart\\src\\test\\java\\com\\filpcart\\configuration\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
	}
	
	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;

	}
	
  public String getUrl() {
		String url = prop.getProperty("url");
		return url;

	}
  
  public String getUsername() {
	String user = prop.getProperty("user");
	return user;

}
  
  public String getPass() {
	String pass = prop.getProperty("pass");
	return pass;

}
	
}
