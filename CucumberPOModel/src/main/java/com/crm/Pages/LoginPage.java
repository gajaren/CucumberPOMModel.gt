package com.crm.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy (css = "input[name='username']")
	WebElement username;
	
	@FindBy (css = "input[name='password']")
	WebElement password;
	
	@FindBy (css = "input[type='submit']")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfLoginPage() {
		return driver.getTitle();
	}
	
	public void enterUsernamePassword(String user_name,String pass_word) {
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
		//username.sendKeys(prop.getProperty("username"));
		//password.sendKeys(prop.getProperty("password"));
	}
	
	public void enterUsernamePassword() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
	}
	
	public void enterInvalidUsernamePassword() {
		username.sendKeys("InvalidUsername");
		password.sendKeys("InvalidPassword");
	}
	
	public HomePage clickLoginButton() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);
		return new HomePage();
	}
	

}
