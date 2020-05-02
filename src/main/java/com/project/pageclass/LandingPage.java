package com.project.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.baseclass.PageBaseClass;

public class LandingPage extends PageBaseClass{

	public LandingPage(WebDriver driver, ExtentTest logger) {
		// TODO Auto-generated constructor stub
		super(driver,logger);
	}
		
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public WebElement close;
	
	
	
	@FindBy(xpath="//div[@class='_1XBjg- row']//form//input[@type='text']")
	public WebElement loginId;
	
	@FindBy(xpath="//div[@class='_1XBjg- row']//form//input[@type='password']")
	public WebElement loginPassword;

	@FindBy(xpath="//div[@class='_1XBjg- row']//form//button[@type='submit']")
	public WebElement loginButton;
	
	
	public HomePage loginUser(String userName, String password)
	{

		close.click();
		
		/*loginId.sendKeys(userName);
		logger.log(Status.PASS, "Entered the UserName : " + userName);
		
		loginPassword.sendKeys(password);
		logger.log(Status.PASS, "Entered the Password : " + password);
		
		loginButton.click();
		
		*/
		
		HomePage homePage = new HomePage(driver,logger);
		PageFactory.initElements(driver, homePage);
		return homePage;
		
	}
	
	
	
	
	
}
