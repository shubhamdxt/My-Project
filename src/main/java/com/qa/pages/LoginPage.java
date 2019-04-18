package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement homePageLoginlink;
	
	@FindBy(xpath="//input[@name='useremail']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='userpassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotPassLink;
	
	
	public LoginPage()   {
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginPageTitle() 
	{
		
		return driver.getTitle();
	}
	
	
	public void clickHomeLoginLink() 
	{
		homePageLoginlink.click();
	}
	
	
	public HomePage login(String emil,String pass) throws InterruptedException 
	{
		Thread.sleep(2000);
		emailId.clear();
		emailId.sendKeys(emil);
	
		Thread.sleep(2000);
		password.clear();
		password.sendKeys(pass);
	
		Thread.sleep(2000);
		
		loginBtn.click();
		Thread.sleep(2000);
		return new HomePage();
	
	}
	

	
}
