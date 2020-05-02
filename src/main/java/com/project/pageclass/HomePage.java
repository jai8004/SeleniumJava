package com.project.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.baseclass.PageBaseClass;

public class HomePage extends PageBaseClass {

	public HomePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	public WebElement searchBox;

	@FindBy(id = "fk-top-search-box")
	public WebElement searchb;

	@FindBy(xpath = "//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	public WebElement searchButton;

	/*
	 * Creating Search box web elements Search the value provided
	 */

	public SearchResultPage search(String searchvalue) {

		searchBox.sendKeys(searchvalue);
		logger.log(Status.PASS, "Search value  " + searchvalue);

		searchButton.click();
		logger.log(Status.PASS, "Search Button Clicked");

		SearchResultPage resultPage = new SearchResultPage(driver, logger);

		PageFactory.initElements(driver, resultPage);

		return resultPage;

	}

}
