package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.utility;

public class HomePage extends utility{
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 

	public  String validateHomePageTitle()
	{
		return driver.getTitle(); 
	}

	//Image Path
	@FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
	private WebElement inventory_item_img;
	
	public HomePage inventory_item_img() throws IOException
	{
		inventory_item_img.click();
		return new HomePage();
	}
}
