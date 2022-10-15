package Popups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popups {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Set<String> window;
	Iterator<String> itr;
	
	// 1st Window -->
	
	window = driver.getWindowHandles();
	itr = window.iterator();
	String firstwindow = itr.next();
	System.out.println(firstwindow);
	driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']")).click();
	
	// 2nd Window -->
	
    window = driver.getWindowHandles(); //2
    itr = window.iterator();
    itr.next(); // first window
    String Secondwindow  = itr.next(); // second window
    System.out.println(Secondwindow);
    driver.switchTo().window(Secondwindow);
    driver.findElement(By.xpath("//a[text()='Payments Privacy Policy']")).click();
    
    // 3rd Window -->
    
    window = driver.getWindowHandles(); //3
    itr = window.iterator();
    itr.next(); // first window
    itr.next(); // second window
    String Thirdwindow  = itr.next(); // Third window
    System.out.println(Thirdwindow);
    driver.switchTo().window(Thirdwindow);
    System.out.println(driver.getCurrentUrl());
    
    // Again switch to first window.
    
    driver.switchTo().window(firstwindow);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");;
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@123");;
    driver.findElement(By.xpath("//button[@name='login']")).click();
    
    //driver.close();
  //  driver.quit();
	
	
	
	
	
	
	}
}
