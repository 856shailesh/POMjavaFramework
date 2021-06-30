package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.ElementUtil;

public class SearchResultsPage {
	
	//1. Locators
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By searchHeaderName = By.cssSelector("div#content h1");
	private By productResults = By.cssSelector("div.caption a");
	
	//2. constructors
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public int getProductListCount() {
		int resultCount = elementUtil.waitForElementsToBeVisible(productResults, 5).size();
		System.out.println("Search product count = " + resultCount);
		return resultCount;
	}
	
	public ProductInfoPage selectProduct(String mainProductName) {
		System.out.println("main product name is : " + mainProductName);
		List<WebElement> searchList = elementUtil.waitForElementsToBeVisible(productResults, 5);
		for (WebElement e : searchList) {
			String text = e.getText();
			if (text.equals(mainProductName)) {
				e.click();
				break;
			}
		}
		return new ProductInfoPage(driver);
	}
}