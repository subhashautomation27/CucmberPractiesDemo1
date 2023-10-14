package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	
	
	@Given("^user navigate to the login page$")
	public void user_navigate_to_the_login_page()
	{
		System.out.println("%%%%%user naviagtes to the login page succesfully%%%%");
	}
	@When("user enters the email as {string} to the email field")
	public void user_enters_the_email_as_to_the_email_field (String emailAddress)
	{
	     System.out.println("email address"+emailAddress);
	}
	@And("user enters the password  as {string} to the password field")
		public void user_enters_the_password_to_the_password_field(String pwd)
		{   
		System.out.println("password "+pwd);
		}
	@Then("^user should be succesfully logged$")
	public void user_should_be_succesfully_logged()
	{
		System.out.println("%%%%% user succesfully logged account%%%%");
	}
	@When("user enters invalid email as {string} to the email field")
	public void user_enters_invalid_email_as_to_the_email_field(String email) {
	   System.out.println("user entered ivalid email"+email );
	}
	@And("user enters invalid password as {string} to the password field")
	public void user_enters_invalid_password_as_to_the_password_field(String pwd) {
		System.out.println("user enetered invalid pwd"+pwd);
	}
	@Then("user should be able to see warnning mesage successfully")
	public void user_should_be_able_to_see_warnning_mesage_successfully() {
	   System.out.println("user able to see warning message succesfully");
	}
	@Then("user should be able to see succsfully logged message")
	public void user_should_be_able_to_see_succsfully_logged_message() {
	  System.out.println("user able to see logged message without  provideng valid credentials");
	}
	@When("user not enters the email id and password into the fields")
	public void user_not_enters_the_email_id_and_password_into_the_fields() {
	    System.out.println("user trying to logging without entering the credentials");
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    System.out.println("user clicks on the logging button");
	}
	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    System.out.println("user clicks on the logging button");
	}
}
