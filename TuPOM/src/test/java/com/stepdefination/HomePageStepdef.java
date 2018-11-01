package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Runner.ObjectRepo;
import com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepdef extends ObjectRepo {
	@Given("^I am in Home page$")
	public void i_am_in_Home_page() throws Throwable {
		homePage.verifyHomePage();
	  
	}

	@When("^I click on the Login link$")
	public void i_click_on_the_Login_link() throws Throwable {
		homePage.clickOnLoginLink();
		
	
	}
	@Then("^I should be logged in\\.$")
	public void i_should_be_logged_in() throws Throwable {
		homePage.verifyLoginPage();
		
	   
	}
	@When("^I mouse over on Top menu$")
	public void i_mouse_over_on_Top_menu() throws Throwable {
		homePage.mouseOverTopMenu();
	   
	}

	@When("^select an item from the drop down$")
	public void select_an_item_from_the_drop_down() throws Throwable {
		homePage.selectFromDropDown();
	    
	}
	@When("^click on register button$")
	public void click_on_register_button() throws Throwable {
		homePage.clickOnRegisterLink();
	    
	}

}
