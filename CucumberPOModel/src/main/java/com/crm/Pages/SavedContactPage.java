package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.TestBase.TestBase;

public class SavedContactPage extends TestBase{
	
	@FindBy (css = "table.datacard")
	WebElement contactHeader;
	
	public SavedContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isContactHeaderDisaplyed() {
		return contactHeader.isDisplayed();
	}
}
