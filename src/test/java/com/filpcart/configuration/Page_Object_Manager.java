package com.filpcart.configuration;

import org.openqa.selenium.WebDriver;

import com.filpcart.page_object.Flipcart_Login;

public class Page_Object_Manager {
	  public static WebDriver driver;
	  private Flipcart_Login login;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver =driver2;
	}

	public Flipcart_Login getInstanceLogin() {
		 login = new Flipcart_Login(driver);
       return login;
	}

}
