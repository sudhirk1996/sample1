package Automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "path of webdriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Regular Locators
		
		// 1.ID
		driver.findElement(By.id("pass the value of id attribute from the website"));
		driver.findElement(By.id("email"));
		
		// 2.Name
		driver.findElement(By.name("Pass the value of name attribute from the website"));
		driver.findElement(By.name("pass"));
		
		// 3.ClassName
		driver.findElement(By.className("pass the value of class attribute from the website"));
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		
		// 4.Tagname
		driver.findElement(By.tagName("pass the value of unique tagname"));
		driver.findElement(By.tagName("button"));
		
		// 5.LinkText
		driver.findElement(By.linkText("pass the  full text of the link from the website"));
		driver.findElement(By.linkText("Forgotten password?"));
		
		// 6.Partial Link Text ==> if link name is too long.
		driver.findElement(By.partialLinkText("pass the partial text of link from the website"));
		driver.findElement(By.partialLinkText("password?"));
		
		
		
		// Customized Locators.
		
		// Xpaths :- 1. Absolute Xpath   2. Relative Xpath
		
		// 1. Absolute Xpath
		
		driver.findElement(By.xpath("capture the absolute xpath from the website"));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		
		// 2. Relative Xpath
		
		driver.findElement(By.xpath("capture the relative xpath from the website"));
		driver.findElement(By.xpath("//form//div[1]/div[2]/div/input"));
		
	}

}
