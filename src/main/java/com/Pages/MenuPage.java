package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.utility;

public class MenuPage extends utility {
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement Menu_Button;
	
	public MenuPage () throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	public  String validateMenuPageTitle()
	{
		return driver.getTitle(); 
	}
	
	
	public MenuPage MenuButton() throws IOException
	{
		Menu_Button.click();
		return new MenuPage(); 
	}
	
	
	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
	private WebElement All_Items;
	public HomePage All_Items() throws IOException
	{
		All_Items.click();
		return new HomePage();
	}
	

	@FindBy(xpath="//a[@id=\"about_sidebar_link\"]")
	private WebElement About;
	
	
	public MenuPage About() throws IOException
	{
		About.click();
		return null;
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logout_link;
	public LoginPage Logout_link() throws IOException
	{
		Logout_link.click();
		return new LoginPage();
	}
		
	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
	private WebElement All_items_link ;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement About_link ;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout_link ;
	
	@FindBy(xpath="////a[@id='reset_sidebar_link']")
	private WebElement Reset_App_link ;
	

	public void AllLinks() {
		
		assert All_items_link.isDisplayed();
		System.out.println(All_items_link.isDisplayed()+" "+All_items_link.getText());
		
		assert All_items_link.isEnabled();
		System.out.println(All_items_link.isEnabled());
		
		assert About_link.isDisplayed();
		System.out.println(About_link.isDisplayed()+" "+About_link.getText());
		
		assert About_link.isEnabled();
		System.out.println(About_link.isEnabled());
		
		assert logout_link.isDisplayed();
		System.out.println(logout_link.isDisplayed()+" "+logout_link.getText());
		
		assert logout_link.isEnabled();
		System.out.println(logout_link.isEnabled());
		
		assert Reset_App_link.isDisplayed();
		System.out.println(Reset_App_link.isDisplayed()+" "+Reset_App_link.getText());
		
		assert Reset_App_link.isEnabled();
		System.out.println(Reset_App_link.isEnabled());
		
	}

	

}
