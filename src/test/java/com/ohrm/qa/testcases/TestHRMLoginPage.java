package com.ohrm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.pages.EmployeeManagementPage;
import com.ohrm.qa.pages.LoginHRM;

public class TestHRMLoginPage extends TestBase{
	
	LoginHRM loginPg;
	EmployeeManagementPage employeePg;
	
	public TestHRMLoginPage() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException
	{
		initialize();
		loginPg=new LoginHRM(driver);
		employeePg=new EmployeeManagementPage(driver);

	}
	
	@Test(priority=4)
	public void testHRMLogin() throws InterruptedException, IOException
	{
//		EmployeeManagementPage epage=loginPg.loginToHRM(prop.getProperty("username"), prop.getProperty("password"));
		loginPg.loginToHRM("Admin","Canada@190");
		Thread.sleep(3000);
		loginPg.loginToHRM("Admin","Canada@190");
//		Assert.assertEquals(epage., expected);
	}
//	
//	@Test(priority=1)
//	public void testHRMLoginLogo()
//	{
//		Assert.assertTrue(loginPg.loginPageLogo());
//	}
//	
//	@Test(priority=2)
//	public void testHRMLoginSmallLogo()
//	{
//		Assert.assertTrue(loginPg.loginPageSmallLogo());
//	}
//	
//	@Test(priority=3)
//	public void testHRMLoginVeriosn()
//	{
//		Assert.assertTrue(loginPg.loginPageHrmVersion());
//	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
