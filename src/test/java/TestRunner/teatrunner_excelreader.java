package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features/03_Scenario.feature"},
		glue = {"Stepdefinitions_ExcelReader","apphooks"},
				 plugin= {"pretty" ,
						 "html:Cucumber_Report/cucumber",
						 "json:Cucumber_Report/cucumber.json",
				 		 "junit:Cucumber_Report/cucumber.xml"}
)
public class teatrunner_excelreader extends AbstractTestNGCucumberTests {
  
}
