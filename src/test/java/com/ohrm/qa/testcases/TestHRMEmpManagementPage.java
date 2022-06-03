package com.ohrm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.pages.EmployeeManagementPage;
import com.ohrm.qa.pages.LoginHRM;

public class TestHRMEmpManagementPage extends TestBase {
	
	LoginHRM loginPg;
	EmployeeManagementPage employeePg;
	
	public TestHRMEmpManagementPage() throws IOException
	{
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialize();
		loginPg=new LoginHRM(driver);
		employeePg=new EmployeeManagementPage(driver);
		loginPg.loginToHRM(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		loginPg.loginToHRMAuthPage(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
	}
	
	
//	@Test
//	public void testEmpPageHeader()
//	{
//		Assert.assertTrue(employeePg.employeeManagementHeader());
//	}
	
	@Test
	public void testOnBoarding() throws InterruptedException
	{ 
		Thread.sleep(4000);
//		Assert.assertTrue(employeePg.clickOnBoarding());
		employeePg.clickOnBoarding();
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("End of Test");
//		driver.quit();
	}
}
