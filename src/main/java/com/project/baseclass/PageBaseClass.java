package com.project.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.project.pageclass.LandingPage;
import com.project.utils.DateUtils;

public class PageBaseClass extends BaseTestClass {

	public WebDriver driver;
	public ExtentTest logger;

	public PageBaseClass(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
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

	/*
	 * Take Screen Shot and Save in the Screen Shot folder Integrate screen shot
	 * with report log
	 */
	public void takeScreenShot() {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" + DateUtils.getTimeStamp() + ".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
			logger.addScreenCaptureFromPath(
					System.getProperty("user.dir") + "/ScreenShots/" + DateUtils.getTimeStamp() + ".png");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
