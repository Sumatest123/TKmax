package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.Runner.ObjectRepo;

public class HomePage extends ObjectRepo {
	public void verifyHomePage() {
		driver.get("https://tuclothing.sainsburys.co.uk");
		
	}
	public void clickOnLoginLink() {
	driver.findElement(By.cssSelector("a[href='/login']")).click();
	}
	public void verifyLoginPage() {
		Assert.assertEquals("Hello arun jangiti", driver.findElement(By.cssSelector(".logged_in")).getText());
	}
	public void mouseOverTopMenu() {
		Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("a[title='Women']"))).build().perform();
	}
	public void selectFromDropDown() {
		 driver.findElement(By.cssSelector("a[title='Workwear']")).click();
	}
	public void clickOnRegisterLink() {
		driver.findElement(By.cssSelector("a[href='/login']")).click();
	}
}
