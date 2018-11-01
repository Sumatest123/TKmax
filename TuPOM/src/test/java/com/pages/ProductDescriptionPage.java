package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.Runner.ObjectRepo;

public class ProductDescriptionPage extends ObjectRepo {
	public void selectAsizeForAnItem() {
		 Select size = new Select(driver.findElement(By.cssSelector("#productVariantSize")));
         size.selectByIndex(1);
	}
	public void selectQuantityForAnItem() throws InterruptedException {
		Select quantity = new Select(driver.findElement(By.cssSelector("select[title='Quantity']")));
        Thread.sleep(1000);
        quantity.selectByIndex(1);
	}
	public void ItemShouldBeAdded() throws InterruptedException {
		 driver.findElement(By.cssSelector("#AddToCart")).click();
         Thread.sleep(5000);
	}

}
