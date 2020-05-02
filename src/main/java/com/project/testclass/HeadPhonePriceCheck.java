package com.project.testclass;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.project.baseclass.BaseTestClass;
import com.project.baseclass.PageBaseClass;
import com.project.pageclass.HomePage;
import com.project.pageclass.LandingPage;
import com.project.pageclass.ResultPage;
import com.project.pageclass.SearchResultPage;
import com.project.utils.*;

public class HeadPhonePriceCheck extends BaseTestClass {

	LandingPage landingPage;
	HomePage homePage;
	ResultPage resultPage;
	SearchResultPage searchResultPage;
	
	

	@Test(dataProvider = "testData")
	public void checkHeadPhones(String testData) {
		// intiating the report 
		logger = report.createTest("Check New Mobile Under 30000 ");

		// select the browser 
		invokeBrowser();
		
		// inoke the driver 
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);

		// opening the site flipkart 
		landingPage = pageBase.OpenApplication();

		// closing the sigin prompt 
		homePage = landingPage.closePrompt();
		
		// sending the test value 
		searchResultPage = homePage.search(testData);
		
		// filtering the result 
		resultPage = searchResultPage.setFilter();
		
		// take screens shot 
		pageBase.takeScreenShot();
		
		// finding and printing the mobile 
		resultPage.getResult();

	}

	// picking the data from  excel file 
	@DataProvider
	public Object[][] testData() throws IOException {
		Object[][] data = new Object[1][1];
		data[0][0] = Read.ReadExcel();
		return data;
	}

}
