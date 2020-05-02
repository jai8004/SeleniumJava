package com.project.pageclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.baseclass.PageBaseClass;



public class HomePage extends PageBaseClass{

	public HomePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	public WebElement searchBox;
	
	@FindBy(id="fk-top-search-box")
	public WebElement searchb;
	
	@FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	//@FindBy(xpath="//li[contains(text(),'in')]//span")
	public WebElement searchButton;
	
	
	
	
	public ResultPage search(String searchvalue)  {

		searchBox.sendKeys(searchvalue);
		logger.log(Status.PASS, "Search value  " + searchvalue);
		
		searchButton.click();
		logger.log(Status.PASS, "Search Button Clicked");
	
		ResultPage resultPage = new ResultPage(driver,logger);
		
		PageFactory.initElements(driver, resultPage);
		
		return resultPage;
		
		
	}
	
	
	
}
