package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MenPage;
import com.qa.pages.Productdetailpage;

public class ProductDetailTest extends BaseClass {
	
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	MenPage menPage;
	Productdetailpage productDetailPage;
	
	public ProductDetailTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
		dashboardPage=new DashboardPage();
		menPage=new MenPage();
		productDetailPage=new Productdetailpage();
	}
	
  @Test(priority=1)
   public void verfiyDecQuntityButton() throws Exception {
	   Thread.sleep(2000);
	  
	   productDetailPage.decQuntity();
	   Thread.sleep(2000);
   }
   
   @Test(priority=2)
   public void verifyIncQuntityButton() throws Exception {
	   Thread.sleep(2000);
	  
	   productDetailPage.incQuntity();
	   Thread.sleep(2000);
   }
   
   @Test(priority=3)
   public void verifyAddToCart() throws Exception {
	   Thread.sleep(2000);
	   productDetailPage.addToCartButton();
	   Thread.sleep(2000);
   }
   
   @AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
