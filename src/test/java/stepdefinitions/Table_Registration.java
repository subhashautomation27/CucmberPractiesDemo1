package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Table_Registration {
	
	@When("user enter the below data into the fields")
	public void user_enter_the_below_data_into_the_fields(DataTable dataTable) 
	{
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		System.out.println("Fn is"+"_" + map.get("firstName"));
		System.out.println("Ln is" +"_"+map.get("lastName"));
		System.out.println("email is" +"_"+ map.get("email address"));
		System.out.println("phone is"+"_" + map.get("telephone"));
		System.out.println("pwd is"+"_" + map.get("password"));
		System.out.println("pwd confirm is"+"_" + map.get("password confirm"));
	}

	@And("^user clicks the newsettlers yes button$")
	public void user_clicks_the_newsettlers_yes_button() {
	   System.out.println("&$@ user clicks the yes button &$@");
	}

	@And("^user clicks the privacy policy check box filed$")
	public void user_clicks_the_privacy_policy_check_box_filed() {
		System.out.println("&$@ user clicks the privacy policy check box &$@");
	}

	@And("^user clicks the continu button$")
	public void user_clicks_the_continu_button() {
		System.out.println("&$@ user clicks the continue button &$@");
	}

	@Then("^user should be succesfully registred$")
	public void user_should_be_succesfully_registred() {
		System.out.println("&$@ user succesfully registred account &$@");
	}


}
