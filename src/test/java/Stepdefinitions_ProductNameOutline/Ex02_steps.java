package Stepdefinitions_ProductNameOutline;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.Product_Name_Outline;
import com.Pages.ProductDetailsPage;
import com.Utility.utility;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex02_steps extends utility {
	
	public LoginPage lp;
	public HomePage hp;
	public ProductDetailsPage PDP;
	public Product_Name_Outline PNO;
	
	public void objectMethod() throws IOException {

		lp = new LoginPage();
		hp = new HomePage();
		PDP = new ProductDetailsPage();
		PNO = new Product_Name_Outline();
	}
	
	       
	@Given("chrome is opened and and swag labs app is opened")
	public void chrome_is_opened_and_and_swag_labs_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		
		logger = report.createTest("test01");
		logger.log(Status.INFO,"Validating login page title");
		
		String actualtitle = lp.validateLoginPageTitle();
		String expectedtitle = "Swag Labs"; 
		//assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle);
		//utility.implicitWait();
		Thread.sleep(2000);
		System.out.print("chrome is opened and swag labs app is opened");
		
		try {
          assertEquals(actualtitle, expectedtitle);
          logger.log(Status.PASS, "Step1 is passed");
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
	public void user_clicks_on_login_button() throws IOException {
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
	public void it_shows_home_page() throws IOException {
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
	@When("user clicks on product image")
	public void user_clicks_on_product_image() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		hp.inventory_item_img();
		Thread.sleep(2000);
		
		logger.log(Status.INFO, "Step 5 is executed");
		System.out.println("User clicks on product image");
	}
	@Then("It shows product details page")
	public void it_shows_product_details_page() {
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
	@Then("User is able to see the Name of the product in {string}")
	public void user_is_able_to_see_the_name_of_the_product_in(String string) throws IOException {
		objectMethod();
		boolean ProductName = PNO.Products();
		assertTrue(ProductName);
		System.out.println(ProductName);
		
	   
	}
	     
	}

