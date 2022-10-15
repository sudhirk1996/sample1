package Automation_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Wait_in_Selenium {
	
	public static void main(String[] args) {
		
		// 1. implicit wait
		
	System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("21may");
//	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("21maypass");

	//2 explicit wait.
			    
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
//	
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgotten password?']"))).click();
			  	     
	//3.fluent wait.
			     
//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			.withTimeout(30,TimeUnit.SECONDS)
//			.pollingEvery(5,TimeUnit.SECONDS)
//			.ignoring(NoSuchElementException.class);
//
//	WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//		public WebElement apply(WebDriver driver) {
//		       return driver.findElement(By.xpath("//button[@name='websubmit']"));
//		     }
//		   });
//
//	element.click();
	}

}
