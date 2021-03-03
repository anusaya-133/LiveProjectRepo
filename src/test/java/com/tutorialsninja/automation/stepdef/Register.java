package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
 
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register 
{
	@Given("^I launch the application$")
	public void i_launch_the_application() 
	{
	Base.driver.get(Base.reader.getUrl());
   
}

@And("^I navigate to the Registration page$")
public void i_navigate_to_the_Registration_page()  {
    
}

@When("^I provide all the below details$")
public void i_provide_all_the_below_details(DataTable datatable)  {
  
}

@And("^I select the privacy policy$")
public void i_select_the_privacy_policy()  {
   
}

@And("^I click on Continue Button$")
public void i_click_on_Continue_Button() {
   
}

@Then("^I should see that the user account is successfully created$")
public void i_should_see_that_the_user_account_is_successfully_created() {
   
}

}
