package com.crm.Utils;

import org.apache.commons.lang3.RandomStringUtils;

import com.crm.TestBase.TestBase;

public class TestUtils extends TestBase{
	
	public void switchFrame(String framename) {
		driver.switchTo().frame(framename);
	}
	
	public static String generateRandomString() {
		int length=5;
		boolean alphabets = true;
		boolean numbers = false;
		String randomString= RandomStringUtils.random(length, alphabets, numbers);
		return randomString;
	}

}
