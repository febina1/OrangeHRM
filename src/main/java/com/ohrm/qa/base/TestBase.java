package com.ohrm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ohrm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Prabhanjan Sharma\\eclipse-workspace\\OrangeHRM\\src\\main\\java\\com\\ohrm\\qa\\config\\config.properties");
		prop.load(ip);
	}

	
	public void initialize()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium sw\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Selenium sw\\chromedriver_win32 (1)\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
				
		
	}
	

}
