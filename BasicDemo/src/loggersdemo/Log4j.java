package loggersdemo;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	
	private static WebDriver driver;
    private static Logger log=Logger.getLogger(Log4j.class.getName());
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		 
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Implicit wait applied on the driver for 10 seconds");
		 
	        //Launch the Online Store Website
	 
	        driver.get("https://store.demoqa.com/");
	 
	        log.info("Web application launched");
	 
	        // Find the element that's ID attribute is 'account'(My Account)
	 
	        driver.findElement(By.id("account")).click();
	 
	        log.info("Click action performed on My Account link");
	 
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	 
	        driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	        log.info("Username entered in the Username text box");
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	        log.info("Password entered in the Password text box");
	 
	        // Now submit the form. WebDriver will find the form for us from the element
	 
	        driver.findElement(By.id("login")).click();
	 
	        log.info("Click action performed on Submit button");
	 
	        // Print a Log In message to the screen
	 
	        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	         // Find the element that's ID attribute is 'account_logout' (Log Out)
	 
	        driver.findElement(By.id("account_logout"));
	 
	        log.info("Click action performed on Log out link");
	 
	        // Close the driver
	 
	        driver.quit();
	 
	        log.info("Browser closed");
	}

}
