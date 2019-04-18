package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Productdetailpage extends BaseClass {
	
	@FindBy(xpath="//a[text()=' L ']")WebElement sizeOfProd;
	
//	@FindBy(xpath="//div[@class='dec button']")WebElement decQuntity;
//	@FindBy(xpath="//div[@class='inc button']")WebElement incQuntity;
	@FindBy(xpath="//button[text()='Add to cart']")WebElement addToCartBtn;
	
	public Productdetailpage()   
	{
		PageFactory.initElements(driver, this);
	}

	public String validateProdDetlPageTitle(){
		return driver.getTitle();
	}
	
	public void clickOnSizeOfItems() {
		
		sizeOfProd.click();
	}
	
//	public void decQuntityBtn() {
//		
//		//for(int i=5;i>0;i--)
//		System.out.println("this is dec button fun");
//		decQuntity.click();
//		System.out.println("this is dec button fun last");
//	}
//	
//    public void incQuntityBtn() {
//    //	for(int i=0;i<5;i++)
//   		incQuntity.click();
//	}
    
    public void addToCartButton() 
    {
    	addToCartBtn.click();	
    }
}
