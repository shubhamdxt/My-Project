package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Productdetailpage extends BaseClass {
	
	@FindBy(xpath="//div[@class='dec button']")WebElement decQuntity;
	@FindBy(xpath="//div[@class='inc button']")WebElement incQuntity;
	@FindBy(xpath="//button[text()='Add to cart']")WebElement addToCartBtn;
	
	public Productdetailpage()   
	{
		PageFactory.initElements(driver, this);
	}

	public String validateProdDetlPageTitle(){
		return driver.getTitle();
	}
	
	public void decQuntityBtn() {
		
		//for(int i=5;i>0;i--)
		decQuntity.click();
	}
	
    public void incQuntityBtn() {
    //	for(int i=0;i<5;i++)
    		incQuntity.click();
	}
    
    public void addToCartButton() 
    {
    	addToCartBtn.click();	
    }
}
