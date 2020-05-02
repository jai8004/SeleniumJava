package com.project.testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.project.baseclass.BaseTestClass;
import com.project.baseclass.PageBaseClass;
import com.project.pageclass.HomePage;
import com.project.pageclass.LandingPage;
import com.project.pageclass.Max;
import com.project.pageclass.Popular;
import com.project.pageclass.ResultPage;


public class HeadPhonePriceCheck extends BaseTestClass {
	
	LandingPage landingPage;
	HomePage homePage;
	ResultPage  resultPage;
	Max max;
	Popular popular;
	@Test
	public void checkHeadPhones() {
		logger = report.createTest("Login Rediff: " );
		invokeBrowser("Chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);

		landingPage = pageBase.OpenApplication();
		
//	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
		
	//	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
		
		//driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		homePage = landingPage.loginUser("jai.si8004@gmail.com", "harry12678");
		resultPage = homePage.search("headphone");
	//	max= resultPage.setMin();
	//	popular = max.setMax();
		
		
	/*Select min = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")));
		
	min.selectByVisibleText("Min");
	min.selectByIndex(1);
		
	//	Select max = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")));
			
	//	max.selectByVisibleText("₹5000+");
		//max.selectByIndex(2);
		//WebElement Rates=driver.findElement(By.xpath("(//select[@class='fPjUPw'])[2]"));
	
	//	Select rate=new Select(Rates);
		//rate.selectByValue("1500");*/
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[2]")).click();
		
		
				
		
		
	}
	
	

}
