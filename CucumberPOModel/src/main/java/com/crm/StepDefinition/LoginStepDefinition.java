package com.crm.StepDefinition;

import com.crm.Pages.HomePage;
import com.crm.Pages.LoginPage;
import com.crm.TestBase.TestBase;
import com.crm.Utils.TestUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtils testutils= new TestUtils();
	
	public static final String LOGGED_USER= "Nilesh Gajare";
	public static final String LOGIN_PAGE_TITLE= "Free CRM software in the cloud for sales and service";
	
	@Given("^User is on login page$")
	public void user_is_on_login_page(){
	    TestBase.initialize();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password_and_clicks_on_login_button(String username,String password){
	    loginpage= new LoginPage();
		loginpage.enterUsernamePassword(username,password);
	}

	@When("^User enters Invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Invalid_username_and_password(String username, String password) {
		loginpage= new LoginPage();
		loginpage.enterUsernamePassword(username,password);
	}
	
	@When("^clicks on login button$")
	public void clicks_on_login_button() {
		homepage=loginpage.clickLoginButton();
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed(){
		
		testutils.switchFrame("mainpanel");
		Assert.assertTrue(homepage.getLoggedinUser().contains(LOGGED_USER));
		driver.switchTo().defaultContent();
	}

	@Then("^check contacts tab on home page$")
	public void check_contacts_tab_on_home_page(){
	
		testutils.switchFrame("mainpanel");
		Assert.assertEquals("CONTACTS", homepage.getContactsTab());
	}
	
	@Then("^Close the browser$")
	public void close_the_browser(){
	    driver.quit();
	}
	

	@When("^User enters Invalid username and password and clicks on login button$")
	public void user_enters_Invalid_username_and_password_and_clicks_on_login_button(){
		loginpage= new LoginPage();
		loginpage.enterInvalidUsernamePassword();
		loginpage.clickLoginButton();
	}
	
	@Then("^User not logged in and stays on the same page$")
	public void user_not_logged_in_and_stays_on_the_same_page() {
	    Assert.assertTrue(loginpage.getTitleOfLoginPage().contains(LOGIN_PAGE_TITLE));
	}

}
