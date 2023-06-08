package Stepdefinitions_ProductDetails;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.MenuPage;
import com.Pages.ProductDetailsPage;
//import com.Utility.ExcelReader;
import com.Utility.utility;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex01_steps extends utility
{
	public LoginPage lp;
	public HomePage hp;
	public ProductDetailsPage PDP;
	public MenuPage mp;
	
	
	public void objectMethod() throws IOException {

		lp = new LoginPage();
		hp = new HomePage();
		PDP = new ProductDetailsPage();
		mp = new MenuPage();
		
	}
	
	@Given("Chrome is opened and swag labs app is opened")
	public void chrome_is_opened_and_swag_labs_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		
		logger = report.createTest("test01");
		logger.log(Status.INFO,"Validating login page title");
		
		String actualtitle = lp.validateLoginPageTitle();
		String expectedtitle = "Swag Labs"; 
		utility.implicitWait();
		//Thread.sleep(2000);
		System.out.print("chrome is opened and swag labs app is opened");
		
		try {
            assertEquals(actualtitle, expectedtitle);
            logger.log(Status.PASS, "Step 1 is passed");
            System.out.println(actualtitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step1 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
	}

	@When("User enters correct Username {string} and Password {string}")
public void user_enters_correct_username_and_password(String un, String pw) throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(2000);
		utility.implicitWait();
		lp.loginUserName(un);
		Thread.sleep(2000);
		lp.loginPassword(pw);
		Thread.sleep(2000);
		
		logger.log(Status.INFO,"Step 2 is executed");
		System.out.println("User enters correct Username and Password");	
	}	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(2000);
		utility.implicitWait();
		lp.loginButton();
		//Thread.sleep(2000);
		utility.implicitWait();
		 logger.log(Status.INFO, "Step 3 is executed");
		 System.out.println("User clicks on login button");
		 
	}
	@Then("It shows Home page")
	public void it_shows_Home_page() throws IOException {
	
		 logger.log(Status.INFO, "Validating home page text");
		
		 String actualText = hp.validateHomePageTitle();
	        String expectedText = "Swag Labs";
	        
	        try {
	            logger.log(Status.INFO, "Step 4 is executed");

	            assertEquals(actualText, expectedText);
	            logger.log(Status.PASS, "Test is passed");
	            System.out.println(actualText);
	            assert true;
	        } catch (AssertionError e) {
	            e.printStackTrace();
	            logger.log(Status.FAIL, "Test is failed");
	            captureScreenshotOnFailure();
	            assert false;
	            
	            System.out.println("It shows Home page");
	        }
	}

	@When("User clicks on product image")
	public void user_clicks_on_product_image() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		hp.inventory_item_img();
		Thread.sleep(2000);
		
		logger.log(Status.INFO, "Step 5 is executed");
		System.out.println("User clicks on product image");
}
	@Then("product image is clickable and It shows product details page")
	public void product_image_is_clickable_and_it_shows_product_details_page() {
		
		
		System.out.println("product image is clickable and It shows product details page");
		
	}
	
	
	@Then("It shows product details page")
	public void it_shows_product_details_page() throws IOException, InterruptedException {
		
		logger = report.createTest("test01");
		logger.log(Status.INFO,"Validating product details page title");
		
		String actualtitle = PDP.ProductDetailsPageTitle();
		String expectedtitle = "Swag Labs"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle);
		utility.implicitWait();
		//Thread.sleep(2000);
		
		logger.log(Status.INFO, "Step 6 is executed");
		System.out.println("It shows product details page");
		
	}
	@Then("User is able to see heading of the product")
	public void user_is_able_to_see_heading_of_the_product() throws IOException, InterruptedException {
		//app_logo
		
		objectMethod();
		//Thread.sleep(2000);
		utility.implicitWait();
		PDP.Product_name();
		logger.log(Status.INFO, "Step 7 is executed");
		System.out.println("User is able to see heading of the product");
	}
	
	
	@When("user clicks on product image")
	public void user_clicks_on_product_image1() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(2000);
		utility.implicitWait();
		hp.inventory_item_img();
		//Thread.sleep(2000);
		utility.implicitWait();
		
		logger.log(Status.INFO, "Step 8 is executed");
		System.out.println("user clicks on product image");
	}
	
	
	@When("User clicks on Add to cart button on product details page")
	public void user_clicks_on_add_to_cart_button_on_product_details_page() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(2000);
		utility.implicitWait();
		PDP.addbackpack();
		//Thread.sleep(2000);
		utility.implicitWait();
		logger.log(Status.INFO, "Step 9 is executed");
		System.out.println("User clicks on Add to cart button on product details page");
		
	}
	@Then("Add to cart button is clickable and it shows Remove button on product details page on swag labs")
	public void add_to_cart_button_is_clickable_and_it_shows_remove_button_on_product_details_page_on_swag_labs() throws IOException, InterruptedException {
		
		
	
		objectMethod();
		//Thread.sleep(2000);
		utility.implicitWait();
		PDP.RemoveButton();
		Thread.sleep(2000);
		logger.log(Status.INFO, "Step 10 is executed");
		System.out.println("Add to cart button is clickable and it shows Remove button on product details page on swag labs");
	}
	@When("User clicks on Back to Products button")
	public void user_clicks_on_back_to_products_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(3000);
        //utility.implicitWait();
		PDP.BackToProducts();
		Thread.sleep(3000);
		//utility.implicitWait();
		
		logger.log(Status.INFO, "Step 11 is executed");
		System.out.println("User clicks on Back to Products button");
	}
	@Then("It shows Home Page")
	public void It_shows_home_page() throws IOException {
	
		logger.log(Status.INFO, "Validating home page text");
		
		 String actualText = hp.validateHomePageTitle();
	        String expectedText = "Swag Labs";
	        
	        try {
	           

	            assertEquals(actualText, expectedText);
	            logger.log(Status.PASS, "Test is passed");
	            System.out.println(actualText);
	            assert true;
	        } catch (AssertionError e) {
	            e.printStackTrace();
	            logger.log(Status.FAIL, "Test is failed");
	            captureScreenshotOnFailure();
	            assert false;
	        }
		
		logger.log(Status.INFO, "Step 12 is executed");
		System.out.println("It shows Home Page");
		
	}
	
	@When("User again clicks on product image")
	public void user_again_clicks_on_product_image() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		//utility.implicitWait();
		hp.inventory_item_img();
		Thread.sleep(2000);
		//utility.implicitWait();
		
		logger.log(Status.INFO, "Step  is executed");
		System.out.println("user clicks on product image");
		
	}
	@When("User clicks on Menu button field")
	public void user_clicks_on_menu_button_field() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		mp.MenuButton();
		logger.log(Status.INFO, "Step 13 is executed");
		System.out.println("User clicks on Menu button field");
	}
	


	
	@Then("user is able to see the Menu button container fields")
	public void user_is_able_to_see_the_menu_button_container_fields() {
		
		logger.log(Status.INFO, "Validating menu page");
		
		logger.log(Status.INFO, "Step 14 is executed");
		System.out.println("user navigates to the Menu page");
		
	}
	
	@Then("User is able to see All links")
	public void user_is_able_to_see_all_links() throws IOException, InterruptedException {
		
		objectMethod();
		Thread.sleep(2000);
		mp.AllLinks();
		logger.log(Status.INFO, "Step 15 is executed");
		System.out.println("User is able to see All links");
		
	}
	
	@When("user clicks on All items")
	public void user_clicks_on_all_items() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		mp.All_Items();
		logger.log(Status.INFO, "Step 16 is executed");
		System.out.println("User navigates to the home page");
		
	}
	
	@When("user clicks on About link")
	public void user_clicks_on_about_link() throws IOException, InterruptedException {
		
		objectMethod();
		Thread.sleep(2000);
		//utility.implicitWait();
		mp.About();
		Thread.sleep(2000);
		//utility.implicitWait();
		
		logger.log(Status.INFO, "Step 17 is executed");
		System.out.println("user clicks on About link");
	}
	
	@Then("It shows About page")
	public void it_shows_about_page() throws IOException, InterruptedException {
		
		objectMethod();
		Thread.sleep(2000);
		//utility.implicitWait();
		Thread.sleep(2000);
		//utility.implicitWait();
		
		logger.log(Status.INFO, "Step 18 is executed");
		System.out.println("It shows About page");
	}
	
	@When("User clicks on logout button link")
	public void user_clicks_on_logout_button_link() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		//utility.implicitWait();
		mp.Logout_link();
		Thread.sleep(2000);
		//utility.implicitWait();
		
	}
	@Then("It shows Login Page")
	public void it_shows_login_page() throws IOException, InterruptedException {
	   
		objectMethod();
		Thread.sleep(2000);
		//utility.implicitWait();
		Thread.sleep(2000);
		//utility.implicitWait();
	}
}
	
	

