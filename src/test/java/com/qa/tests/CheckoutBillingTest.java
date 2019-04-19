package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.BeautyPage;
import com.qa.pages.CartPage;
import com.qa.pages.CheckoutBillingPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.Productdetailpage;

public class CheckoutBillingTest extends BaseClass {
	
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	BeautyPage beautyPage;
	Productdetailpage productDetailPage;
	CartPage cartPage;
	CheckoutBillingPage chkOutBillPage; 
	
	public CheckoutBillingTest()
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
		chkOutBillPage=new CheckoutBillingPage();
	}
	
	@Test(priority=1)
	public void verifyBEmlFld() throws Exception {
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
		  
		chkOutBillPage.entrEmailFild();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void verifyFrsNameFld() throws Exception{
		
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
		 
		chkOutBillPage.entrFrstFild();
		 Thread.sleep(2000);
	}
	@Test(priority=3)
	public void verifyLastNamFld()  throws Exception{
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
		  
		chkOutBillPage.entrLstFild();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void verifyAddrsFld()  throws Exception{
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
		
		chkOutBillPage.entrAddrFild();
		  Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void verifyContryFld()  throws Exception{
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
		Thread.sleep(5000);
		chkOutBillPage.countryDropDown("United States");
		  Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void verifyStatFld()  throws Exception{
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
		Thread.sleep(5000);
		chkOutBillPage.stateDropDown("Delaware");
		 Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void verifyCityFld()  throws Exception{
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
		 Thread.sleep(5000);
		 chkOutBillPage.cityDropDown("Wilmington");
	//	chkOutBillPage.cityDropDown("Wilmington");
		  Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void verifyZipCodFld()  throws Exception{
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

	//	chkOutBillPage.cityDropDown(2);
		chkOutBillPage.entrZipCdFild();
		  Thread.sleep(2000);
	}
	@Test(priority=8)
	public void verifyMoblFld()  throws Exception{
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
		 
		/*chkOutBillPage.cityDropDown(2);
		chkOutBillPage.entrZipCdFild();*/
		chkOutBillPage.entrMoblFild();
		 Thread.sleep(2000);
	}
	@Test(priority=9)
	public void verifyNextBtn()  throws Exception{
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
		 
	/*	chkOutBillPage.cityDropDown(2);
		chkOutBillPage.entrZipCdFild();
		chkOutBillPage.entrMoblFild();*/
		chkOutBillPage.clickOnNextBtn();
		 Thread.sleep(2000);
	}
	

	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
