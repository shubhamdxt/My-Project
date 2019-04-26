package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class CheckoutDetailPage extends BaseClass{
   
	@FindBy(xpath="(//span[@class='custom-radio selected'])[2]")WebElement cashOnDelRadioBtn;
	@FindBy(xpath="//textarea[@class='form-control']")WebElement mesgBoxFild;
	@FindBy(xpath="//button[text()='Place order']")WebElement placOrdrBtn;
	
	
	public CheckoutDetailPage()   
	{
		PageFactory.initElements(driver, this);    
	}
	
	
	public String validateCheckoutDetailPageTitle()
	{
		
		return driver.getTitle();
	}
	
    public void clickOnCasRdBtn() {
    	System.out.println("before selcted");
    	cashOnDelRadioBtn.click();
    	System.out.println("after selcted");
    }
    
    public void clickOnMesgBox(String mes) {
    	mesgBoxFild.sendKeys(mes);
    }
    
    public void clickOnPlacOrdBtn() {
    	
    	placOrdrBtn.click();
    	
    }
}
