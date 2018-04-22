package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	//Picko container is used for  dependency management
	//It create dependant object first and that will be provided 
	//to every step defination
	@Before
	public WebDriver setup(){
		if(driver==null){
			//System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","E:\\RadicalSoftware\\RadicalSoftware\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
