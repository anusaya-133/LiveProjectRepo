package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage 
{
	public RegisterPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement eMail; 
	
	@FindBy(id="input-telephone")
	public static WebElement telePhone;
	
	@FindBy(id="input-password")
	public static WebElement passWord; 
	
	@FindBy(id="input-confirm")
	public static WebElement confirm;
	
	@FindBy(css="input[type='checkbox'][name='agree']")
	public static WebElement privacyPolicyCheckBox;
	
	@FindBy(css="input[class$='btn-primary']")
	public static WebElement ctnuButton;
	
	public static void enterAllDetails(DataTable datatable)
	{
		java.util.Map<String, String> Map = datatable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.firstName, Map.get("Firstname"));
		Elements.TypeText(RegisterPage.lastName, Map.get("Lastname"));
		Elements.TypeText(RegisterPage.eMail, System.currentTimeMillis()+Map.get("Email"));
		Elements.TypeText(RegisterPage.telePhone, Map.get("Telephone"));
		Elements.TypeText(RegisterPage.passWord, Map.get("Password"));
		Elements.TypeText(RegisterPage.confirm, Map.get("Password"));
	}
	

}
