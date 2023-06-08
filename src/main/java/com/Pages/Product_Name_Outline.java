package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.utility;

public class Product_Name_Outline extends utility {

	@FindBy(name="user-name")
	WebElement Username;  
	
	@FindBy(name="password")
	WebElement Password; 
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	
	public Product_Name_Outline() throws IOException
	{
		PageFactory.initElements(driver, this);
	}		
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
		
	} 	
	//valid Credentials
	public void loginUserName(String un) {
		Username.sendKeys(un);
	}		

	public void loginPassword(String pw) {
		Password.sendKeys(pw);
	}
	
	public LoginPage loginButton() throws IOException {
		login.click();
		return new LoginPage();
	}
//	//Invalid Credentials
//	public void loginInvalidUserName(String Invalidun) {
//		Username.sendKeys(Invalidun);
//	}	
//	public void loginInvalidPassword(String Invalidpw) {
//		Password.sendKeys(Invalidpw);
//	}
	
	@FindBy(xpath="//div[@class='inventory_details_name large_size']")
	WebElement Product_Name;
	
	public boolean Products() {
		 return Product_Name.isDisplayed();
		
		
	}
	
}
