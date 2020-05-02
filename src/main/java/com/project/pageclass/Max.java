package com.project.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.project.baseclass.PageBaseClass;

public class Max extends PageBaseClass {

	public Max(WebDriver driver, ExtentTest logger) {
		// TODO Auto-generated constructor stub
		super(driver,logger);
	
	}
	

	@FindBy(xpath="//*[@id=\\\'container\\\']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	public WebElement max;
	
	
	public Popular setMax() {
		Select minValue= new Select(max);
		minValue.selectByValue("1500");
		
		Popular popular = new Popular(driver,logger);
		PageFactory.initElements(driver, max);
		
		return popular;
	}

}
