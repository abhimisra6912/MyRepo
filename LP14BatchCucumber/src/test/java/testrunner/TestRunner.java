package testrunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
	 features = "src/test/java/features"
	 ,glue={"stepdefinitions","utilities"},
			 
		 tags= {"@SDET1"},
		 monochrome = true,
		 //dryRun = false,
		 plugin= {"pretty" , "html:reports"}
 )
 
public class TestRunner {
 
}


