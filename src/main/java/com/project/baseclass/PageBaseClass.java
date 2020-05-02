package com.project.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.project.pageclass.LandingPage;

public class PageBaseClass extends BaseTestClass {

	public WebDriver driver;
	public ExtentTest logger;

	public PageBaseClass(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		System.out.print(logger);
	}

	/*
	 * Open Flipkar WebSite
	 */
	public LandingPage OpenApplication() {
	logger.log(Status.INFO, "Open Flipkart Site");
		driver.get("https://www.flipkart.com/");
		logger.log(Status.PASS, "Successfully Opened the flipkart Site");

		LandingPage landingPage = new LandingPage(driver, logger);
		PageFactory.initElements(driver, landingPage);
		return landingPage;
	}

}
