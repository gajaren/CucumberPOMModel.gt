package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.TestBase.TestBase;
import com.crm.Utils.TestUtils;

public class ContactsPage extends TestBase{
	
	@FindBy (xpath = "//legend[contains(text(),'Contact Information')]")
	WebElement contactForm;
	
	@FindBy (id = "first_name")
	WebElement firstName;
	
	@FindBy (id = "surname")
	WebElement lastName;
	
	@FindBy (css = "input[type='submit']")
	WebElement saveButton; 
	
	@FindBy (css = "input[name='addmore']")
	WebElement saveAndAddmore;
	
	@FindBy (xpath = "//td[contains(text(),'Contact created')]")
	WebElement contactCreated;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfContactForm() {
		return contactForm.getText();
	}
	
	public void enterContactinfo() {
		String first_name= "fname" + TestUtils.generateRandomString();
		String last_name= "lname" + TestUtils.generateRandomString();
		firstName.sendKeys(first_name);
		lastName.sendKeys(last_name);
	}
	
	public SavedContactPage clickSave() {
		saveButton.click();
		return new SavedContactPage();
	}
	
	public void clickSaveAndAddAnother() {
		saveAndAddmore.click();
	}
	
	public String contactCreatedMSG() {
		return contactCreated.getText();
	}

}
