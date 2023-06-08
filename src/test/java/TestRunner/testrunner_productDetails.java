package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Features/01_Scenario.feature"},
		glue = {"Stepdefinitions_ProductDetails","apphooks"},
				 plugin= {"pretty" ,
						 "html:Cucumber_Report/cucumber",
						 "json:Cucumber_Report/cucumber.json",
				 		 "junit:Cucumber_Report/cucumber.xml"}
		)
public class testrunner_productDetails extends AbstractTestNGCucumberTests{
	
}