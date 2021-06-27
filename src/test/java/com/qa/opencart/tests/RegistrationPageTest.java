package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;

public class RegistrationPageTest extends BaseTest {
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}

}
