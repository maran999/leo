package com.filpcart.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.filpcart.configuration.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\flipcart\\feature",glue = "com\\flipcart\\stepdefinition")
public class Runner {
    public static WebDriver driver; 
	
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver =Base_Class.browserLaunch(browser);

	}
	
}
