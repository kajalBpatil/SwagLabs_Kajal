package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features/02_Scenario.feature"},
		glue = {"Stepdefinitions_ProductNameOutline","apphooks"},
				 plugin= {"pretty" ,
						 "html:Cucumber_Report/cucumber",
						 "json:Cucumber_Report/cucumber.json",
				 		 "junit:Cucumber_Report/cucumber.xml"}
)
public class testrunner_ProductNameOutline extends AbstractTestNGCucumberTests{
  @Test
  public void f() {
  }
}
