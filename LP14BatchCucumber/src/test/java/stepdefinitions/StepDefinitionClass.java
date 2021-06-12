package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Hooks;

public class StepDefinitionClass {
	
	WebDriver driver = Hooks.driver;
	
	@Given("^: User is on the search page$")  
	public void user_is_on_the_search_page() throws Throwable {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	  
	}

	@When("^: User enters IBM on Search page$")
	public void user_enters_IBM_on_Search_page() throws Throwable {
	    System.out.println("Step 2");
	    
	}

	@When("^: Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		System.out.println("Step ");
	    
	}

	@Then("^: Search result is displayed$")
	public void search_result_is_displayed() throws Throwable {
		System.out.println("Step 4");
	    
	}

}
