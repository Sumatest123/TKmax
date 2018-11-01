package com.pages;

import org.openqa.selenium.By;

import com.Runner.ObjectRepo;

public class ProductListingPage extends ObjectRepo {

	public void selectAsize() {
		 driver.findElements(By.cssSelector("label[for='12_68']")).get(0).click();
		
	}
	public void selectAnItem() {
		 driver.findElements(By.cssSelector(".details")).get(9).click(); 
		
	}
}
