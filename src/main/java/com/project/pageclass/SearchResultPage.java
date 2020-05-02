package com.project.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.baseclass.PageBaseClass;

public class SearchResultPage extends PageBaseClass {
	
	
	
	public SearchResultPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}


	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"+ "")
	public WebElement min;
	

	@FindBy(xpath="//*[@id=\\\'container\\\']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select"+ "")
	public WebElement max;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[2]")
	public WebElement popularity;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	public WebElement cost;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[5]")
	public WebElement newFirst;
	
	

	
	public ResultPage setFilter() {
		
	//	Select minValue= new Select(min);
		//minValue.selectByValue("500");
		
		//Select maxValue= new Select(max);
	//	maxValue.selectByValue("1500");
		
		//popularity.click();
		
		
		logger.log(Status.INFO, "Set the Price 30000");
		Select rate=new Select(cost);
		 rate.selectByValue("30000");
		 
		 logger.log(Status.INFO, "Check the New Mobile ");
		 newFirst.click();
		
	
		
		ResultPage resultPage = new ResultPage(driver,logger);
		PageFactory.initElements(driver, resultPage);
		
		return resultPage;
	}	

}
