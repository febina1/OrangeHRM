package com.ohrm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.pages.EmployeeManagementPage;
import com.ohrm.qa.pages.LoginHRM;
import com.ohrm.qa.pages.OnboardingPage;
import com.ohrm.qa.util.TestUtil;

public class TestHRMOnboardingPage extends TestBase{
	
	LoginHRM loginPg;
	EmployeeManagementPage employeePg;
	OnboardingPage onboardPg;
	
	public TestHRMOnboardingPage() throws IOException
	{
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialize();
		loginPg=new LoginHRM(driver);
		employeePg= new EmployeeManagementPage(driver);
		onboardPg=new OnboardingPage(driver);
		loginPg.loginToHRM(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		loginPg.loginToHRMAuthPage(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		employeePg.clickOnBoarding();
		Thread.sleep(6000);
		
	}

//	@Test
//	public void TestOnBoardingHeader() throws InterruptedException
//	{
//	
//		onboardPg.onboardHeader();
//	}
	
	
	@Test
	public void TestOnBoardingaddEvent() throws InterruptedException
	{
		Assert.assertTrue(onboardPg.addEventDueDate());
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("End Of Test");
		driver.quit();
	}
}
