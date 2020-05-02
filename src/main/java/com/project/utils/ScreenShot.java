package com.project.utils;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.project.baseclass.BaseTestClass;


public class ScreenShot extends BaseTestClass {
	public static int i=0;
	public static void screenShot() {
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File Src=scrShot.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir")+"ScreenShots/screenshot"+i+".png";
		i++;
		File Dest=new File(filePath);
		try {
			FileUtils.copyFile(Src, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
