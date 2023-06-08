package Stepdefinitions_ExcelReader;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Utility.Config;
import com.Utility.ExcelReader;
import com.Utility.utility;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex03_steps extends utility {
		 
	    public LoginPage lp;
	    public HomePage hp;
	    ExcelReader reader;
	 
	    public void objectMethod() throws IOException {
	        lp = new LoginPage();
	        hp = new HomePage();
	    }
	
	@Given("chrome is opened and and swag labs app is opened")
	public void chrome_is_opened_and_and_swag_labs_app_is_opened() throws IOException, InterruptedException {		
		objectMethod();
        Thread.sleep(5000);

        logger = report.createTest("test01");
        logger.log(Status.INFO, "Validating landing page title");

        String actualTitle = lp.validateLoginPageTitle();
        String expectedTitle = "Swag Labs";

        try {
            assertEquals(actualTitle, expectedTitle);
            logger.log(Status.PASS, "Step1 is passed");
            System.out.println(actualTitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step1 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
	}
	@When("User fills Username data from given sheetname {string} and rownumber {int} in Username and Password")
	public void user_fills_username_data_from_given_sheetname_and_rownumber_in_username_and_password(String sheetName, Integer rowNumber) throws InterruptedException, IOException, InvalidFormatException {
		Thread.sleep(10000);
        objectMethod();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);

        String uname = testData.get(rowNumber).get("Username");
        String pword = testData.get(rowNumber).get("Password");
        
        lp.loginUserName(uname);
        Thread.sleep(5000);
        lp.loginPassword(pword);
        Thread.sleep(5000);
		
	}
	

	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
        hp = lp.loginButton();
        Thread.sleep(5000);

        logger.log(Status.INFO, "Step3 is executed");
	}
	@Then("It shows Home page")
	public void it_shows_home_page() throws IOException, InterruptedException {
		
		objectMethod();
        Thread.sleep(5000);

        logger.log(Status.INFO, "Validating home page text");
    
        String actualText = hp.validateHomePageTitle();
        String expectedText = "Swag Labs";

        try {
            logger.log(Status.INFO, "Step4 is executed");
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
		
	}
	}
	
