package com.stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Runner.ObjectRepo;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GlobalHooks extends ObjectRepo{
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", 
	       		"C:\\Users\\Sumarun\\Documents\\Selenium\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.get("https://tuclothing.sainsburys.co.uk/");
		
	}
		

	@After
	public void close() {
		driver.close();
		
	}

}
