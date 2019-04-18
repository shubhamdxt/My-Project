package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.BeautyPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class BeautyTest extends BaseClass{
	HomePage homePage;
LoginPage loginPage;
DashboardPage dashboardPage;
BeautyPage beautyPage;

public BeautyTest()
{
	super();
}	


@BeforeMethod
public void setUp() {
	initialization();
	homePage=new HomePage();
	loginPage=new LoginPage();
	dashboardPage=new DashboardPage();
	beautyPage=new  BeautyPage();
}

@Test(priority=1)
public void verifyProductDetails() {
	homePage.clickOnBeautyLink();
	beautyPage.clickForProdDetail();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

}
