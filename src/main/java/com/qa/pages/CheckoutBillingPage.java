package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class CheckoutBillingPage extends BaseClass{
	
	@FindBy (xpath="//input[@name='billemail']")@CacheLookup WebElement bEmailId;
	@FindBy (xpath="//input[@name='billfname']") @CacheLookup WebElement bFstNameFild;
	@FindBy (xpath="//input[@name='billlname']") @CacheLookup WebElement bLstNameFild;
	@FindBy (xpath="//input[@name='billaddress']")@CacheLookup WebElement bAddrsFild;
	@FindBy (xpath="(//select[@class='form-control'])[1]")@CacheLookup WebElement bCounyFild;
	@FindBy (xpath="(//select[@class='form-control'])[2]")@CacheLookup WebElement bStateFild;
	@FindBy (xpath="(//select[@class='form-control'])[3]")@CacheLookup WebElement bCityFild;
	@FindBy (xpath="//input[@name='billzipcode']") @CacheLookup WebElement bZipCode;
	@FindBy (xpath="//input[@name='billmobile']") @CacheLookup WebElement bMoblFild;
	@FindBy (xpath="//button[text()='Next']")WebElement bNextBtn;
	
	public CheckoutBillingPage()   
	{
		PageFactory.initElements(driver, this);    
	}

	public String validateCheckoutBillingPageTitle(){
		return driver.getTitle();
	}
	
	public void entrEmailFild() {
		bEmailId.clear();
		bEmailId.sendKeys("sf@gmail.com");
	}
	
	public void entrFrstFild() {
		bFstNameFild.clear();
		bFstNameFild.sendKeys("sdgg");
	}
	
	public void entrLstFild() {
		bLstNameFild.clear();
		bLstNameFild.sendKeys("gdg");
	}
	
	public void entrAddrFild() {
		bAddrsFild.clear();
		bAddrsFild.sendKeys("QEWW");
	}
	
	public  void countryDropDown(String country) {
	      Select coutryDrop = new Select(bCounyFild);
	   //   coutryDrop.selectByValue(country);
	      coutryDrop.selectByVisibleText(country);
	}
	
	public  void stateDropDown(String state) {
	      Select statDrop = new Select(bStateFild);
	      
	      statDrop.selectByVisibleText(state);  
	}
	
	public  void cityDropDown(String city) {
	      Select cityDrop = new Select(bCityFild);
	      cityDrop.selectByVisibleText(city);
	}
	public void entrZipCdFild() {
		bZipCode.clear();
		bZipCode.sendKeys("19701");
	}
	
	public void entrMoblFild() {
		bMoblFild.clear();
		bMoblFild.sendKeys("987456612");
	}
	
	public void clickOnNextBtn() {
		bNextBtn.click();
	}
}
