package com.filpcart.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcart_Login {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;

	public Flipcart_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
