package com.ohrm.qa.pages;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.util.TestUtil;

public class OnboardingPage extends TestBase {
	
	@FindBy(id="OhrmJob_name")
	WebElement eventName;
	
	@FindBy(id="jobDueDate")
	WebElement eventDueDate;
	
	@FindBy(id="OhrmJob_newHires")
	WebElement eventParticipant;
	
	@FindBy(id="OhrmJob_owners")
	WebElement eventOwner;
	
	@FindBy(xpath="//input[@class='select-dropdown']")
	WebElement eventLocation;
	
	@FindBy(xpath="//i[text()='add']")
	WebElement addEvent;
	
	@FindBy(xpath="//div[text()='Onboarding']")
	WebElement onbordingHeader;
	
	@FindBy(id="OhrmJob_newHires")
	WebElement onboardParticipant;
	
	@FindBy(id="OhrmJob_owners")
	WebElement onboardOwner;
	
	@FindBy(xpath="//input[@value='-- Select --']")
	WebElement onboardLocation;
	
	@FindBy(id="createButton")
	WebElement onboardSaveButton;
	
	@FindBy(xpath="//div[@class='select-wrapper picker__select--month']")
	WebElement selectMonth;
	
	@FindBy(xpath="//div[@class='select-wrapper picker__select--month']//ul//li")
	List<WebElement> calMonthList;
	
	@FindBy(xpath="//div[@class='select-wrapper picker__select--year']")
	WebElement selectYear;
	
	@FindBy(xpath="//div[@class='select-wrapper picker__select--year']//ul//li")
	List<WebElement> calYearList;
	
	@FindBy(xpath="//table[@class='picker__table']//tbody//tr//div")
	List<WebElement> calDateList;
	
	@FindBy(xpath="//input[@value='-- Select --']")
	WebElement location;
	
	@FindBy(xpath="(//ul[@class='dropdown-content select-dropdown active']//li)[4]")
	WebElement locationSelect;
	
	@FindBy(xpath="//div[@class='ac_results']//ul//li")
	List<WebElement> ohrmJob_newHiresList;
	
	@FindBy(xpath="//div[@class='ac_results']//ul//li")
	List<WebElement> ohrmJob_ownersList;
	
	@FindBy(xpath="//div[@class='toast toast-success']")
	WebElement successupdate;
	
	
	
	public OnboardingPage(WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void onboardHeader() throws InterruptedException
	{
		TestUtil.frame();
//		Thread.sleep(7000);
		System.out.println(onbordingHeader.isDisplayed());
	}
	
//	public void addEventName(String name)
//	{
//		eventName.sendKeys(name);
//	}
	
	public boolean addEventDueDate() throws InterruptedException
	{
		TestUtil.frame();
//		Thread.sleep(2000);
		addEvent.click();
//		Thread.sleep(2000);
		eventName.sendKeys("Software Testing");
		
		location.click();
		locationSelect.click();
		
		eventDueDate.click();
				
		selectMonth.click();
		TestUtil.list(calMonthList,"August");
		selectYear.click();
		TestUtil.list(calYearList,"2027");
		TestUtil.list(calDateList,"12");

        onboardParticipant.sendKeys("h");
        TestUtil.list(ohrmJob_newHiresList,"Fisher");
	    onboardOwner.sendKeys("P");
	    TestUtil.list(ohrmJob_ownersList,"Paul");
	    onboardSaveButton.click();
	    return (successupdate.isDisplayed());
	}

}
