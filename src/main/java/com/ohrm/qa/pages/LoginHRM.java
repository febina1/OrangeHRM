package com.ohrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.qa.base.TestBase;

public class LoginHRM extends TestBase{
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='organization-logo shadow']")
	WebElement hrmLogo;
	
	@FindBy(xpath="//div[@class='orangehrm-logo']")
	WebElement hrmSmallLogo;
	
	@FindBy(xpath="//span[contains(text(),'OrangeHRM')]")
	WebElement hrmVersion;
	
	@FindBy(id="btnLogin")
	WebElement loginBtntwo;
	
	public LoginHRM(WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginToHRM(String un, String pwd) throws InterruptedException, IOException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtn.click();
	}
		
	public void loginToHRMAuthPage(String un, String pwd) throws InterruptedException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtntwo.click();
		Thread.sleep(2000);
		
	
	}
	
	public boolean loginPageLogo()
	{
		return hrmLogo.isDisplayed();
	}
	
	public boolean loginPageSmallLogo()
	{
		return hrmSmallLogo.isDisplayed();
		
	}
	public boolean loginPageHrmVersion()
	{
		return hrmVersion.isDisplayed();
	}
}
