package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_DDT {
	
	
	@When("i enter the email address (.+)$")
	public void i_enter_the_email_to_the_email_field(String email) {
	    System.out.println("user entered email "+email);
	    
	}
	
	@And("i enter the password (.+)$")
	public void i_enter_the_pwd_to_the_pwd_field(String password) {
	    System.out.println("user enter thepassword to the password  field"+ password);
	}
	@And("i click on  the login  button")
	public void i_click_on_the_login_button() {
	    System.out.println("user clicks the login button succesufully");
	}
	@Then("i should be able to logged succesfully .")
	public void i_should_be_able_to_logged_succesfully() {
	   System.out.println("iam able to login succesfully");
	}

}
