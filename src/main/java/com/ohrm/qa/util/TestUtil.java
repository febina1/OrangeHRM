package com.ohrm.qa.util;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ohrm.qa.base.TestBase;

public class TestUtil extends TestBase{
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT=10;
	public static long IMPLICIT_WAIT=20;
	
	public static void frame()
	{
		driver.switchTo().frame(0);
	}
	
	public static void list(List<WebElement> calElementList, String data)
	{
	      
//	      System.out.println("Size:  "+calElementList.size());
	      
	      for(int i=0;i<calElementList.size();i++)
	            {
//	            	System.out.println(calElementList.get(i).getText());
	            	if(calElementList.get(i).getText().contains(data))
	            	{
	            		calElementList.get(i).click();
	            		break;
	            	}
	            }
	}
	
	public static String datePicker()
	{
		Date d=new Date();
		String s1=d.toString();
//		System.out.println("Date: "+s1);
		String[] s2=s1.split(" ");
		String today=s2[2];
//		System.out.println("Today: "+today);
		return today;
		
	}



}
