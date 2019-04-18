package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class CartPage extends BaseClass{
	
	
	@FindBy(xpath="//span[@class='custom-radio selected']")WebElement freRadioDlryBtn;
	@FindBy(xpath="//span[@class='custom-radio']")WebElement oneDayRadioDlryBtn;
	@FindBy(xpath="//button[text()=' Continue Shopping']")WebElement continShopBtn;
	@FindBy(xpath="//button[text()='Proceed to checkout']") WebElement prcToChkoutBtn;
	
	public CartPage()   
	{
		PageFactory.initElements(driver, this);
	}

	public String validateProdDetlPageTitle(){
		return driver.getTitle();
	}
	
	
	public void clickOnFreeDlBtn() {
		if(freRadioDlryBtn.isSelected()) {
			freRadioDlryBtn.click();	
		}
		else
			if(oneDayRadioDlryBtn.isSelected()) {
				oneDayRadioDlryBtn.click();
			}
	//	freRadioDlryBtn.click();
	}
	
	public HomePage clickOnContShopBtn() {
		continShopBtn.click();
		return new HomePage();
	}
	
	public CheckoutBillingPage clickOnPrcToChkBtn() {
		
		prcToChkoutBtn.click();	
		
		return new CheckoutBillingPage();
	}
}
