package Automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Hit the URL 
		
		driver.get("https://www.facebook.com/");
		
		// to verify exact url is available on browser.
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.facebook.com/";
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL is verified");
		}
		else {
			System.out.println("Check correct URL");
		}
		
		// TO Pass the data to the element.
		
		//SendKeys() -
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("9865564535");
		
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		pw.sendKeys("sadvsdhfvdflnsv");
		
		WebElement login = driver.findElement(By.xpath("//button[@value = '1']"));
		login.click();
		
		// ## To check Element Status.
		
		// 1. is Enabled - 		// gives result in boolean format
		
//		WebElement username1 = driver.findElement(By.xpath("//input[@id='email']"));
//		System.out.println("Checking enable status -" + username1.isEnabled());
//		
//		if(username1.isEnabled()==true) {
//		    username1.sendKeys("34354541245");
//		}else {
//		    System.out.println("username field is disabled");
//		}
		
		// 2. is Displayed - 	// gives result in boolean format
		
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		
//		if(logo.isDisplayed()==true) {
//			System.out.println("FB logo is displaying on login page");
//		}
//		else {
//			System.out.println("FB logo is displaying on login page");
//		}
		
		// 3. is Selected - 
		
//		driver.navigate().to("https://www.facebook.com/reg/");
//		
//		WebElement femaleRB = driver.findElement(By.xpath("//input[@value='1']"));
//		
//		if(femaleRB.isSelected()==true) {
//			System.out.println("Female option is selected on website");
//		}
//		else {
//			System.out.println("Female option is not selected on website");
//			femaleRB.click();
//		}
		
//		if(femaleRB.isSelected()==false) {
//			System.out.println("not selected");
//			femaleRB.click();
//		}
		
		
	}

}
