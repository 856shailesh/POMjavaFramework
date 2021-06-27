package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class RegsitrationPage {
	private WebDriver driver;
	private ElementUtil elementUtil;

	// 1. By locator:
	private By firstName = By.id("input-firstname");
	private By lastName = By.id("input-lastname");
	private By eMail = By.id("input-email");
	private By telephone = By.id("input-telephone");

	private By password = By.id("input-password");
	private By confirmPassword = By.id("input-confirm");

	private By privacyPolicy = By.xpath("//input[@name='agree']");
	private By continueBtn = By.xpath("//input[@value='Continue']");

	// 2. constructor:
	public RegsitrationPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	// 3. page actions:
		public void doRegister (String fName, String lName , String Mail , String tphone , String pword) {
			elementUtil.doSendKeys(firstName, fName);
			elementUtil.doSendKeys(lastName, lName);
			elementUtil.doSendKeys(eMail, Mail);
			elementUtil.doSendKeys(telephone, tphone);
			
			elementUtil.doSendKeys(password, pword);
			elementUtil.doSendKeys(confirmPassword, pword);
			
			elementUtil.doClick(privacyPolicy);
			elementUtil.doClick(continueBtn);
			
		}
}
