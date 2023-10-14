package stepdefinitions;

import io.cucumber.java.en.*;
public class Registration {
	
	
	@Given("user navigates to the registering page")
	public void user_navigates_to_the_registering_page() {
		System.out.println("user navigates register page");
	}
	
	   
	@When("i enter firstName as {string} into FN field")
	public void i_enter_firstName_into_FN_field(String firstName)
	{
		System.out.println(">>>user enters the FN>>>"+ firstName);
	}
	
	  @And("i enter LastName as {string} into LN field") public void
	  i_enter_last_name_as_into_ln_field(String lastName) {
	  System.out.println(">>>user enters the LN>>>"+lastName); }
	 
	
	@And("i enter emailaddress as {string} into email field")
	public void i_enter_emailaddress_as_into_email_field(String emailAddress) {
		System.out.println(">>>user enters the emailaddress>>>"+emailAddress);
	}

	@And("i enter phone number as {string} into phone field")
	public void i_enter_phone_number_as_into_phone_field(String phoneNumber) {
		System.out.println(">>>user enters the phoneNumber>>>"+phoneNumber);
	}

	@When("i click on checkbox for privacy policy field")
	public void i_click_on_checkbox_for_privacy_policy_field() {
		System.out.println(">>>user click on privacy checkbox>>>");
	}

	@When("i click on continue button")
	public void i_click_on_continue_button() {
		System.out.println(">>>user click on continue buuton>>>");
	}

	@Then("i should be able to registartion  successfully .")
	public void i_should_be_able_to_registartion_successfully() {
	   System.out.println(">>>new  user successfully registred");
	}
	
	




}
