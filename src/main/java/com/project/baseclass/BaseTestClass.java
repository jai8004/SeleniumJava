package com.project.baseclass;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.utils.ExtentReportManager;

public class BaseTestClass {

	public static WebDriver driver;
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public ExtentTest logger;

	/*
	 * Open Browser
	 */

	public void invokeBrowser() {

		Scanner scan = new Scanner(System.in);
		logger.log(Status.INFO, "Selecting the Browser");

		System.out.println("Input the Broswer Number");
		System.out.println("1. Chrome Browser");
		System.out.println("2. FireFox Browser");

		int browser = scan.nextInt();

		if (browser == 1) {
			driver = setChromeBrowser();
			logger.log(Status.INFO, "Selected Chrome Browser");
		} else if (browser == 2) {
			driver = setFireFoxBrowser();
			logger.log(Status.INFO, "Selected FireFox Browser");
		} else {
			System.out.println("Sorry Please Enter A valid Choice");
		}
	}

	// invoke chromeBrowser
	public static WebDriver setChromeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		return driver;

	}

	// invoke firefox browser
	public static WebDriver setFireFoxBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/geckodriver");
			driver = new FirefoxDriver();
			;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		return driver;

	}

	/*
	 * Create Report and Close broswer
	 */

	@AfterMethod
	public void flushReports() {
		report.flush();

		driver.close();
		driver.quit();
	}

	/*
	 * Wait Functions to handle Ajax
	 */
	public void waitForPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		int i = 0;
		while (i != 180) {
			String pageState = (String) js.executeScript("return document.readyState;");
			if (pageState.equals("complete")) {
				break;
			} else {
				waitLoad(1);
			}
		}

		waitLoad(2);

		i = 0;
		while (i != 180) {
			Boolean jsState = (Boolean) js.executeScript("return window.jQuery != undefined && jQuery.active == 0;");
			if (jsState) {
				break;
			} else {
				waitLoad(1);
			}
		}
	}

	public void waitLoad(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
