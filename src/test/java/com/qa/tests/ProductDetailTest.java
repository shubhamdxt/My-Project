package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.BeautyPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MenPage;
import com.qa.pages.Productdetailpage;

public class ProductDetailTest extends BaseClass {
	
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	BeautyPage beautyPage;
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
		beautyPage=new BeautyPage();
		productDetailPage=new Productdetailpage();
	}
	
//  @Test(priority=1)
//   public void verfiyDecQuntityButton() throws Exception {
//	   Thread.sleep(2000);
//	  System.out.println("dec...");
//	   productDetailPage.decQuntityBtn();
//	   System.out.println("dec...after");  
//	   Thread.sleep(2000);
//   }
//   
//   @Test(priority=2)
//   public void verifyIncQuntityButton() throws Exception {
//	   Thread.sleep(2000);
//	//  System.out.println("gfdg");
//	   productDetailPage.incQuntityBtn();
//	   Thread.sleep(2000);
//   }
//  
	
	@Test(priority=1)
	public void verifySizeItem() throws Exception 
	{
		  homePage.clickOnBeautyLink();
		
		  beautyPage.clickForProdDetail();
		  
		  productDetailPage.clickOnSizeOfItems();
		
	}
   @Test(priority=2)
   public void verifyAddToCart() throws Exception {
	      homePage.clickOnBeautyLink();
		
		  beautyPage.clickForProdDetail();
		  
		  productDetailPage.clickOnSizeOfItems();
	      productDetailPage.addToCartButton();
	  
   }
   
   @AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
