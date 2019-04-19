package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.BeautyPage;
import com.qa.pages.CartPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.Productdetailpage;

public class CartTest extends BaseClass {
	
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	BeautyPage beautyPage;
	Productdetailpage productDetailPage;
	CartPage cartPage;
	
	
	public CartTest()
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
		cartPage=new CartPage();
	}
	

	@Test(priority=1)
	public void verifyRadioBtn() throws Exception {
		homePage.clickOnBeautyLink();
		
		  beautyPage.clickForProdDetail();
		  
		  productDetailPage.clickOnSizeOfItems();
	
		  productDetailPage.addToCartButton();
		  Thread.sleep(5000);
		  productDetailPage.clickOnViewCartBtn();
		  Thread.sleep(5000);
		  cartPage.clickOnFreeDlBtn();	
		  Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void verifyContBtn() throws Exception{
		homePage.clickOnBeautyLink();
		
		  beautyPage.clickForProdDetail();
		  
		  productDetailPage.clickOnSizeOfItems();
	
		  productDetailPage.addToCartButton();
		  Thread.sleep(5000);
		  productDetailPage.clickOnViewCartBtn();
		  Thread.sleep(5000);
		  cartPage.clickOnFreeDlBtn();	
		  Thread.sleep(2000);
		  cartPage.clickOnContShopBtn();	
		  Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void verifyProcChkoutBtn() throws Exception {
		homePage.clickOnBeautyLink();
		
		  beautyPage.clickForProdDetail();
		  
		  productDetailPage.clickOnSizeOfItems();
	
		  productDetailPage.addToCartButton();
		  Thread.sleep(5000);
		  productDetailPage.clickOnViewCartBtn();
		  Thread.sleep(5000);
		  cartPage.clickOnFreeDlBtn();	
		 	
		  Thread.sleep(5000);
		cartPage.clickOnPrcToChkBtn();
	}
	
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
