package com.project.testclass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.baseclass.BaseTestClass;
import com.project.baseclass.PageBaseClass;
import com.project.pageclass.HomePage;
import com.project.pageclass.LandingPage;

import com.project.pageclass.ResultPage;
import com.project.pageclass.SearchResultPage;

import com.project.utils.*;


public class HeadPhonePriceCheck extends BaseTestClass  {
	
	LandingPage landingPage;
	HomePage homePage;
	ResultPage  resultPage;
	SearchResultPage searchResultPage;
	@Test(dataProvider ="testData")
	public void checkHeadPhones(String testData) {
		logger = report.createTest("Check New Mobile Under 30000 ");
		invokeBrowser("Chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		
		landingPage = pageBase.OpenApplication();

		homePage = landingPage.closePrompt();
		searchResultPage = homePage.search(testData);
		resultPage = searchResultPage.setFilter();
		pageBase.takeScreenShot();
		resultPage.getResult();
		
	}
	
	 @DataProvider
	  public Object[][] testData() throws IOException {
	    Object[][] data = new Object[1][1];
	    data[0][0] = Read.ReadExcel();
	    return data;
	  }

				
		
		
	
	
	

}
