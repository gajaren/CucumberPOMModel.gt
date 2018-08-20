package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.TestBase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy (xpath = "//td[contains(text(),'User: Nilesh Gajare')]")
	WebElement loggedinUser;
	
	@FindBy (xpath = "//a[@title='Contacts']")
	WebElement contacts;
	
	@FindBy (xpath = "//a[@title='New Contact']")
	WebElement newForm;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoggedinUser() {
		return loggedinUser.getText();
	}
	
	public String getContactsTab() {
		return contacts.getText();
	}
	
	public void moveToContacts() {
		Actions action=new Actions(driver);
		action.moveToElement(contacts).build().perform();
	}
	
	public ContactsPage clickNewForm() {
		newForm.click();
		return new ContactsPage();
	}

}
