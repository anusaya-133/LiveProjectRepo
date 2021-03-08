package com.tutorialsninja.automation.stepdef;


import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.LoginSuccessPage;

import cucumber.api.java.en.*;


public class Login 
{
	LoginPage loginPage = new LoginPage();
	LoginSuccessPage lsp = new LoginSuccessPage();
	ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage();
	@And("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page()
	{
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.login);
	   
	}

	@When("^I login to the Application using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_login_to_the_Application_using_Username_as_and_Password_as(String email, String password) 
	{
		LoginPage.doLogin(email, password);
	}

	@Then("^I should see that user is able to login successfully$")
	public void i_should_see_that_user_is_able_to_login_successfully() 
	{
		Assert.assertTrue(Elements.isDisplayed(LoginSuccessPage.loginDone));
	}
	
	@Then("^I should see that user is not able to login successfully$")
	public void i_should_see_that_user_is_not_able_to_login_successfully() 
	{
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,"Warning: No match for E-Mail Address and/or Password."));	
	}
	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email) {
	  
		Elements.click(LoginPage.forgotPassword);
		Elements.TypeText(ForgotPasswordPage.inputEmail, email);
		Elements.click(ForgotPasswordPage.ContinueButton);
	}

	@Then("^I should see a confirmation message displaying information about resetting password$")
	public void i_should_see_a_confirmation_message_displaying_information_about_resetting_password() 
	{
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,"An email with a confirmation link has been sent your email address."));
	
	}


}
