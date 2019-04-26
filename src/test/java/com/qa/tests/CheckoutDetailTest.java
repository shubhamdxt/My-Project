package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.BeautyPage;
import com.qa.pages.CartPage;
import com.qa.pages.CheckoutBillingPage;
import com.qa.pages.CheckoutDetailPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.Productdetailpage;

public class CheckoutDetailTest extends BaseClass{
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	BeautyPage beautyPage;
	Productdetailpage productDetailPage;
	CartPage cartPage;
	CheckoutBillingPage chkOutBillPage; 
	CheckoutDetailPage chkoutDetailPage;
	
	public CheckoutDetailTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
    	homePage=new HomePage();
		loginPage=new LoginPage();
		beautyPage=new BeautyPage();
		productDetailPage=new Productdetailpage();
		cartPage=new CartPage();
		chkOutBillPage=new CheckoutBillingPage();
		chkoutDetailPage=new CheckoutDetailPage();
		  
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
			 	
			  Thread.sleep(5000);
			  cartPage.clickOnPrcToChkBtn();
		
		     chkOutBillPage.clickOnNextBtn();
			 Thread.sleep(5000);
		   
		     chkoutDetailPage.clickOnCasRdBtn();	
		     Thread.sleep(5000);
	}
	   
	  /* @Test(priority= 2)
       public void verifyMesgBox() throws Exception {
		   
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
		
		     chkOutBillPage.clickOnNextBtn();
			 Thread.sleep(5000);
		     chkoutDetailPage.clickOnMesgBox("this is my message");	
		     Thread.sleep(5000);
	}
	   
	   @Test(priority= 3)
       public void verifyPlaceOrdBtn() throws Exception {
		   
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
		
		     chkOutBillPage.clickOnNextBtn();
			 Thread.sleep(5000);
		     chkoutDetailPage.clickOnMesgBox("this is my message");	
		     Thread.sleep(5000);
		     chkoutDetailPage.clickOnPlacOrdBtn();
	} */

		 @AfterMethod
			public void tearDown() {
				driver.quit();
			}
}
