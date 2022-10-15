package Automation_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Basics {
	
	public static void main(String[] args) {
		
		// Launching The Browser 
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Opening The URL 
		
		driver.get("https://www.facebook.com/");
		
		// Close or Quit The Browser
		
		driver.close();		// Used to close the single tab or current focused tab.
		driver.quit();		// Used to close all tab at a time.
		
		// Get current URL from browser
		
		System.out.println(driver.getCurrentUrl());
		
		// Get title of web page
		
		System.out.println(driver.getTitle());
		
		// How to open the browser with full screen/ how to maximize the browser.
		driver.manage().window().maximize();
		
		// Back, Forward, Refresh by Navigation
		
//	    driver.navigate().to("https://www.facebook.com/");
//	    driver.navigate().to("https://www.google.com/");
		
//	    driver.navigate().back();		// facebook
//	    driver.navigate().forward();	// google
		
//	    Thread.sleep(2000);    // this is used to pause the execution purposefully     
		
//	    driver.navigate().refresh();	// refresh web page
		
		// How to set the size of the browser.
		Dimension d = new Dimension(800,300);
		driver.manage().window().setSize(d);
		 
		// How to set the position of the browser.
		 
		Point p = new Point(300,800);
		driver.manage().window().setPosition(p);
		
	}

}
