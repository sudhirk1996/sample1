package Automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Customized_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// ## Customized Xpaths.
		
		// 1. Basic Xpath. ==> //tagname[@attribute ='value']
		driver.findElement(By.xpath("paste the xpath from the website"));
		driver.findElement(By.xpath("//input[@id='email']"));
				
		// 2. xpath by text() ==> //tagname[text()='value']
		driver.findElement(By.xpath("mention the xpath expression from website"));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
				
		// 3. xpath by contains() ==> part of attribute or text function. ==> //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("xpth expression from the website"));
		driver.findElement(By.xpath("//input[contains(@aria-label,'or email address')]"));
				
		// 4. xpath by starts-with() ==> part of attribute but this starting part 
		// ==> //tagname[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("xpth expression from the website"));
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Mobile number or')]"));
				
		// ## Xpath by using logical operators. 
				
		// 1. and operator ==> // tagname[@attribute1 ='value' and @attribute2='value']
		driver.findElement(By.xpath("xpath expression from the website"));
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']"));
				
		//2. or operator // tagname[@attribute1 ='value' or @attribute2='value']
		driver.findElement(By.xpath("xpath expression from the website"));
		driver.findElement(By.xpath("//input[@id ='u_0_2_My' or @value='1']"));
					
		// ## Css Selectors  ==> locating the element with css components
				
		// 1. tag and id ==> tag#id
		driver.findElement(By.cssSelector("use css expression from the website"));
		driver.findElement(By.cssSelector("input#password_step_input"));
				
		// 2. tag and class ==> tag.class
		driver.findElement(By.cssSelector("use css expression from the website"));
		driver.findElement(By.cssSelector("input.inputtext"));
				
		// 3. tag and attribute ==> tagname[attribute=value]
		driver.findElement(By.cssSelector("use css expression from the website"));
		driver.findElement(By.cssSelector("input[name=lastname]"));
				
		// 4. tag class and attribute ==> tag.class[attribute=value]
		driver.findElement(By.cssSelector("use css expression from the website"));
		driver.findElement(By.cssSelector("input.inputtext[name=firstname]"));
			
	}

}
