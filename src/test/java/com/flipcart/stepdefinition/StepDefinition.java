package com.flipcart.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.filpcart.configuration.File_Reader_Manager;
import com.filpcart.configuration.Page_Object_Manager;
import com.filpcart.page_object.Flipcart_Login;
import com.filpcart.runner.Runner;

import io.cucumber.java.en.*;

public class StepDefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("user want launch the filpcart application")
	public void user_want_launch_the_filpcart_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	   getUrl(url);
	}
	
	//***Flipcart Login***//
	@When("user want to click the login")
	public void user_want_to_click_the_login() {
	   click(pom.getInstanceLogin().getLoginBtn());
	}
	
	@When("user enter the valid username")
	public void user_enter_the_valid_username() throws Throwable {
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
      sendKeys(pom.getInstanceLogin().getUsername(),username);

	}
	@When("user enter the valid password")
	public void user_enter_the_valid_password() throws Throwable {
		String pass = File_Reader_Manager.getInstance().getInstanceCR().getPass();
	   sendKeys(pom.getInstanceLogin().getPassword(), pass);
	}
	@Then("user verify the valid username and password")
	public void user_verify_the_valid_username_and_password() {
	    click(pom.getInstanceLogin().getSubmit());
	}




}
