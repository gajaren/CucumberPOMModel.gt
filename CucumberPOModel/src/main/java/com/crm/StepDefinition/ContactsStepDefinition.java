package com.crm.StepDefinition;

import java.util.Map;

import com.crm.Pages.ContactsPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.LoginPage;
import com.crm.Pages.SavedContactPage;
import com.crm.TestBase.TestBase;
import com.crm.Utils.TestUtils;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactsStepDefinition extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	SavedContactPage savedcontactpage;
	TestUtils testutils= new TestUtils();
	
	public static String FORM_TITLE = "Contact Information";
	public static String CONTACT_CREATE = "Contact created";
	
	@Given("^User is on Home page$")
	public HomePage user_is_on_Home_page(){
		TestBase.initialize();
		 loginpage= new LoginPage();
		 loginpage.enterUsernamePassword();
		 homepage=loginpage.clickLoginButton();
		 testutils.switchFrame("mainpanel");
		 return homepage;
	}

	@When("^User clicks on new contact from Contact dropdown$")
	public void user_clicks_on_new_contact_from_Contact_dropdown(){
	    homepage.moveToContacts();
	    contactspage=homepage.clickNewForm();
	}

	@When("^User fills form and click save$")
	public void user_fills_form_and_click_save(DataTable formdata){
		//System.out.println(contactspage.getTitleOfContactForm());
		
		Assert.assertTrue(contactspage.getTitleOfContactForm().contains(FORM_TITLE));
		contactspage.enterContactinfo();
		
		for ( Map<String, String> datamap : formdata.asMaps(String.class, String.class)) {
		contactspage.enterCompanyName(datamap.get("Company"));
		contactspage.enterPosition(datamap.get("Position"));
		savedcontactpage=contactspage.clickSave();
		}
	}

	@Then("^new contact is added$")
	public void new_contact_is_added(){
	    Assert.assertTrue(savedcontactpage.isContactHeaderDisaplyed());
	}

	@Then("^close the browser$")
	public void close_the_browser(){
	    driver.quit();
	}

//	@When("^User fills form and click save and Create Another$")
//	public void user_fills_form_and_click_save_and_Create_Another() {
//		Assert.assertTrue(contactspage.getTitleOfContactForm().contains(FORM_TITLE));
//		contactspage.enterContactinfo();
//		contactspage.clickSaveAndAddAnother();
//	}

//	@Then("^contact is saved and new Form opened$")
//	public void contact_is_saved_and_new_Form_opened(){
//		System.out.println(contactspage.contactCreatedMSG());
//	    Assert.assertTrue(contactspage.contactCreatedMSG().contains(CONTACT_CREATE));
//	}


}
