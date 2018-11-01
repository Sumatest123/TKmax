package com.stepdefination;

import java.util.Map;

import com.Runner.ObjectRepo;
import com.google.common.collect.Maps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepdef extends ObjectRepo{
	@When("^enter valid email id \"([^\"]*)\"$")
	public void enter_valid_email_id(String Username) throws Throwable {
		loginPage.emailId();
	   
	}

	@When("^enter valid password \"([^\"]*)\"$")
	public void enter_valid_password(String Password) throws Throwable {
		loginPage.password();
	   
	}

	@When("^enter click on login button$")
	public void enter_click_on_login_button() throws Throwable {
		loginPage.loginButton();
	   
	}
	@When("^enter valid login details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_login_details_and(String usr, String pswd) throws Throwable {
		loginPage.emailIdPassword(usr, pswd);
	   
	}

@When("^enter valid login details$")
public void enter_valid_login_details(DataTable logindata) throws Throwable {
	loginPage.loginDetails(logindata);
 
}

@When("^enter invalid details \"([^\"]*)\" and \"([^\"]*)\" for login$")
public void enter_invalid_details_and_for_login(String usname, String password) throws Throwable {
	loginPage.invaliddetails(usname, password);
   
}

@Then("^I should have an error msg$")
public void i_should_have_an_error_msg() throws Throwable {
	loginPage.verifyErrorMsg();
    
}



}
