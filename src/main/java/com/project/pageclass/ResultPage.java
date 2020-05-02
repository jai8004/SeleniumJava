package com.project.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.project.baseclass.PageBaseClass;

public class ResultPage extends PageBaseClass {

	public ResultPage(WebDriver driver, ExtentTest logger) {
		// TODO Auto-generated constructor stub
		super(driver,logger);
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")
	public WebElement min;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[2]")
	public WebElement pop;
	
	
	public Max setMin() {
		
		Select minValue= new Select(min);
		minValue.selectByValue("500");
		
		Max max = new Max(driver,logger);
		PageFactory.initElements(driver, max);
		
		return max;
		//*[@id="container"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select
	}

}
