package com.pages;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Runner.ObjectRepo;

import cucumber.api.DataTable;


public class LoginPage extends ObjectRepo {
	public void emailId() {
		driver.findElement(By.cssSelector("#j_username")).clear();
		driver.findElement(By.cssSelector("#j_username")).sendKeys("usr");
		
	}
	public void password() {
		driver.findElement(By.cssSelector("#j_password")).clear();
		driver.findElement(By.cssSelector("#j_password")).sendKeys("pswd");
	}
	public void loginButton() {
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	public void emailIdPassword(String uname,String password) {
		driver.findElement(By.cssSelector("#j_username")).clear();
		driver.findElement(By.cssSelector("#j_username")).sendKeys(uname);
		driver.findElement(By.cssSelector("#j_password")).clear();
		driver.findElement(By.cssSelector("#j_password")).sendKeys(password);
	}
	public void loginDetails(DataTable logindata)
	{
		Map<String, String> logindetails=logindata.asMap(String.class, String.class);
		driver.findElement(By.cssSelector("#j_username")).clear();
		driver.findElement(By.cssSelector("#j_username")).sendKeys(logindetails.get("Username"));
		driver.findElement(By.cssSelector("#j_password")).clear();
		driver.findElement(By.cssSelector("#j_password")).sendKeys(logindetails.get("password"));
	}	
	public void invaliddetails(String uname, String password) {
		driver.findElement(By.cssSelector("#j_username")).clear();
		driver.findElement(By.cssSelector("#j_username")).sendKeys(uname);
		driver.findElement(By.cssSelector("#j_password")).clear();
		driver.findElement(By.cssSelector("#j_password")).sendKeys(password);	
	}
	public void verifyErrorMsg() {
	    Assert.assertEquals("If you have another Sainsbury's account you will need to register again for Tu.", driver.findElement(By.cssSelector("p[class='ln-u-8/12']")).getText());
	}
}
	


