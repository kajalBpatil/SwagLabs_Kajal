package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.utility;

public class LoginPage extends utility {
	
	@FindBy(name="user-name")
	WebElement Username;  
	
	@FindBy(name="password")
	WebElement Password; 
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}		
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
	} 	
	public void loginUserName(String un) {
		Username.sendKeys(un);
	}		

	public void loginPassword(String pw) {
		Password.sendKeys(pw);
	}
	public HomePage loginButton() throws IOException {
		login.click();
		return new HomePage();
	}
}
