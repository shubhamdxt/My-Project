package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class BeautyPage extends BaseClass
{
	
	@FindBy(xpath="(//img[@class='img-responsive'])[2]")WebElement productDetails;
	

	public BeautyPage()   {
		PageFactory.initElements(driver, this);
	}

	public Productdetailpage clickForProdDetail() {
		
		productDetails.click();
		
		return new Productdetailpage();
	}
}
