package com.project.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.baseclass.PageBaseClass;

public class LandingPage extends PageBaseClass {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	// creating web element of close promt button
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public WebElement close;

	// clsoe the promt fucntion call
	public HomePage closePrompt() {

		close.click();
		logger.log(Status.PASS, "Close the Popup");
		HomePage homePage = new HomePage(driver, logger);
		PageFactory.initElements(driver, homePage);
		return homePage;

	}

}
