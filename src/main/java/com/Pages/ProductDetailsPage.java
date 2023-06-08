package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.utility;

public class ProductDetailsPage extends utility {
	

	public ProductDetailsPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 	
	public  String ProductDetailsPageTitle()
	{
		return driver.getTitle(); 
	}
	
	@FindBy(xpath="//div[@class='inventory_details_name large_size']")
	private WebElement Product_name;
	
	public ProductDetailsPage Product_name() throws IOException {
		
		Product_name.isDisplayed();
		return new ProductDetailsPage();
		
		
	}
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement add_back_pack;
	
	public ProductDetailsPage addbackpack() throws IOException
	{
		
		add_back_pack.click();
		return new ProductDetailsPage();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement Remove_Button ;
	
	public ProductDetailsPage RemoveButton() throws IOException
	{
		
		Remove_Button.isDisplayed();
		return new ProductDetailsPage();
}
		
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement Back_To_Products;
	
	public HomePage BackToProducts() throws IOException
	{
		
		Back_To_Products.click();
		return new HomePage();
}
	
	
	@FindBy(xpath="//div[@class='app_logo']")
	private WebElement Product_Page_Heading;
	
	public String Product_Page_Heading()
	{
		return Product_Page_Heading.getText();
		
	}
	 
}
