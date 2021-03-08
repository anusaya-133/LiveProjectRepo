package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage 
{
	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-email")
	public static WebElement Username;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginButton;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPassword;

	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	public static void doLogin(String email, String password)
	{
		Elements.TypeText(LoginPage.Username, email);
		Elements.TypeText(LoginPage.Password, password);
		Elements.click(LoginPage.loginButton);

	}
}
