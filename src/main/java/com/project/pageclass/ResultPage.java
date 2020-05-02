package com.project.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.baseclass.PageBaseClass;

public class ResultPage extends PageBaseClass {

	public ResultPage(WebDriver driver, ExtentTest logger) {
		// TODO Auto-generated constructor stub
		super(driver,logger);
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement firstResult;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement secondResult;
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement thirdResult;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement fourthResult;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[6]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement fifthResult;
	
	public void getResult() {
		
		logger.log(Status.INFO,"Getting Result");
		
		System.out.println(firstResult.getText());
		System.out.println(secondResult.getText());
		System.out.println(thirdResult.getText());
		System.out.println(fourthResult.getText());
		System.out.println(fifthResult.getText());
		
		
		logger.log(Status.PASS, firstResult.getText());
		logger.log(Status.PASS, secondResult.getText());
		logger.log(Status.PASS, thirdResult.getText());
		logger.log(Status.PASS, fourthResult.getText());
		logger.log(Status.PASS, fifthResult.getText());
		
	}
	
	
	
	
	

}
