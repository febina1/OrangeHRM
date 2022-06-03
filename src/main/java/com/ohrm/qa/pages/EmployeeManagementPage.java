package com.ohrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.qa.base.TestBase;

public class EmployeeManagementPage extends TestBase {
	
	@FindBy(xpath="//div[text()='Employee Management']")
	WebElement empPageHeader;
	
	@FindBy(xpath="//span[text()='Onboarding']")
	WebElement onbordingLHM;
	
	@FindBy(xpath="//div[text()='Onboarding']")
	WebElement onbordingHeader;
	
	public EmployeeManagementPage(WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean employeeManagementHeader()
	{
		return empPageHeader.isDisplayed();
		
	}
	
	public void clickOnBoarding() throws InterruptedException
	{
		onbordingLHM.click();
		Thread.sleep(6000);
//		return onbordingHeader.isDisplayed();
	}

}
