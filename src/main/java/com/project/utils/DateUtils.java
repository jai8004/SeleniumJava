package com.project.utils;

import java.util.Date;

// creating the time stamp format for files and reports naming 

public class DateUtils {

	public static String getTimeStamp(){
		Date date = new Date();
		return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
	}
}
