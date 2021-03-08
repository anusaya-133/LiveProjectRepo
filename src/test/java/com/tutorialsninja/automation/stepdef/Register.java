package com.tutorialsninja.automation.stepdef;
import java.util.*;

import org.junit.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register 
{
	HeaderSection headerSection =new HeaderSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage asp = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() 
	{
	Base.driver.get(Base.reader.getUrl());
   
}

@And("^I navigate to the Registration page$")
public void i_navigate_to_the_Registration_page()  {
	Elements.click(HeaderSection.myAccountLink);
	Elements.click(HeaderSection.register);
    
}

@When("^I provide all the below details$")
public void i_provide_all_the_below_details(DataTable datatable)  
{
	RegisterPage.enterAllDetails(datatable);
}

@And("^I select the privacy policy$")
public void i_select_the_privacy_policy()  
{
   Elements.click(RegisterPage.privacyPolicyCheckBox);
}

@And("^I click on Continue Button$")
public void i_click_on_Continue_Button() 
{
	Elements.click(RegisterPage.ctnuButton);
  }

@Then("^I should see that the user account is successfully created$")
public void i_should_see_that_the_user_account_is_successfully_created() 
{
	Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.success));
   
}

}
