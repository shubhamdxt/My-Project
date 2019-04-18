package com.qa.tests;

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
	public void verifyRadioBtn() {
		cartPage.clickOnFreeDlBtn();	
	}
	@Test(priority=2)
	public void verifyContBtn() {
		cartPage.clickOnContShopBtn();	
	}
	
	@Test(priority=3)
	public void verifyProcChkoutBtn() {
		cartPage.clickOnPrcToChkBtn();
	}
}
