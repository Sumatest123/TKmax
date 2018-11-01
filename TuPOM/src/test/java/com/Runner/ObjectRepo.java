package com.Runner;

import org.openqa.selenium.WebDriver;

import com.pages.BasketPage;
import com.pages.BillingPage;
import com.pages.CategoryLandingPage;
import com.pages.DeliveryPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductDescriptionPage;
import com.pages.ProductListingPage;
import com.pages.RegisterPage;
import com.pages.SearchPage;
import com.pages.StoreLocatorPage;

public class ObjectRepo {
	public static WebDriver driver;
	public static HomePage homePage=new HomePage();
	public static BasketPage basketPage= new BasketPage();
	public static BillingPage billingPage=new BillingPage();
	public static CategoryLandingPage categoryLandingPage=new CategoryLandingPage();
	public static DeliveryPage deliveryPage=new DeliveryPage();
	public static LoginPage loginPage=new LoginPage();
	public static ProductDescriptionPage productDescriptionPage=new ProductDescriptionPage();
	public static ProductListingPage productListingPage=new ProductListingPage();
	public static RegisterPage registerPage=new RegisterPage();
	public static SearchPage searchPage=new SearchPage();
	public static StoreLocatorPage storeLocatorPage=new StoreLocatorPage() ;
	

}
