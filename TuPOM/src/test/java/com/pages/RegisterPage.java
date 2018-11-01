package com.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.Runner.ObjectRepo;

import cucumber.api.DataTable;

public class RegisterPage extends ObjectRepo{
	
	public void entervaliddetails(DataTable registerdata) {
		Map<String, String> registerdetails=registerdata.asMap(String.class, String.class);
		driver.findElement(By.cssSelector("#register_email")).clear();
        driver.findElement(By.cssSelector("#register_email")).sendKeys(registerdetails.get("email"));
        Select title = new Select(driver.findElement(By.cssSelector(registerdetails.get("title"))));
        title.selectByValue("mr");
        driver.findElement(By.cssSelector("#register_firstName")).clear();
        driver.findElement(By.cssSelector("#register_firstName")).sendKeys(registerdetails.get("Firstname"));
        driver.findElement(By.cssSelector("#register_lastName")).clear();
        driver.findElement(By.cssSelector("#register_lastName")).sendKeys(registerdetails.get("surname"));
        driver.findElement(By.cssSelector("#password")).clear();
        driver.findElement(By.cssSelector("#password")).sendKeys(registerdetails.get("password"));
        driver.findElement(By.cssSelector("#register_checkPwd")).clear();
        driver.findElement(By.cssSelector("#register_checkPwd")).sendKeys(registerdetails.get("password"));
		
	}

}
