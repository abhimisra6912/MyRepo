package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Hooks;

public class assignment1_LP14 {
	
	WebDriver driver = Hooks.driver;
	
	@Given("^: User is able to navigate to the \"([^\"]*)\" URL$")
	public void user_is_able_to_navigate_to_the_URL(String URL) throws Throwable {
		
		driver.get(URL);
		driver.manage().window().maximize();
	   
	}

	@When("^: User signs up by entering mandatory \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_signs_up_by_entering_mandatory_and(String FNAME, String LNAME, String EMAIL, String USERNAME, String PASS, String CFPASS) throws Throwable {
		
		Hooks.signUp(FNAME, LNAME, EMAIL, USERNAME, PASS, CFPASS);
	}

	@When("^: User validates the Successful Signup \"([^\"]*)\" message$")
	public void user_validates_the_Successful_Signup_message(String TEXT) throws Throwable {
		
		Hooks.verifySignupMsg(TEXT);
	    
	}

	@Then("^: Login to the application using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_to_the_application_using_and(String EMAIL, String PASS) throws Throwable {
		
		Hooks.verifyLogin(EMAIL, PASS);
	    
	}
	
	@Then("^: User verify the correct \"([^\"]*)\" is displayed$")
	public void user_verify_the_correct_is_displayed(String EMAIL) throws Throwable {
	    
		Hooks.verifyEmailID(EMAIL);
		
	}

	@Then("^: User compose the mail using \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" send it to specific email id$")
	public void user_compose_the_mail_using_and_send_it_to_specific_email_id(String EMAIL, String SUB, String BODY) throws Throwable {
		
		Hooks.composeEmail(EMAIL, SUB, BODY);
	    
	}

}
