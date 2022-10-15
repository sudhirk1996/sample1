package Automation_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_GetText_Attribute {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// ## getText() - 
		
		driver.navigate().to("https://phonepe.force.com/login?locale=us");
		
		WebElement text = driver.findElement(By.xpath("//div[@id='footer']"));
		    
		String Actualtext = text.getText();
		System.out.println(Actualtext);
		String Expectedtext ="© 2022 salesforce.com. All rights reserved.";
		    
		if(Actualtext.equalsIgnoreCase(Expectedtext)) {
		    System.out.println("Testcase is passed");
		}else {
		    System.out.println("Testcase is failed");
		}
		
		// ## getAttribute () -
		
		 WebElement ftline = driver.findElement(By.xpath("//div[@id='employee_login']"));
		 String fn = ftline.getAttribute("style");
		 System.out.println(fn);
		 
		 // ## Multiple Inputs - 
		 
//		List<WebElement> flinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
//		
//		System.out.println(flinks.size());
		
//		for(WebElement fl: flinks) {
//			System.out.println(fl.getText());
//		}
		
		// OR
		
//		for (int i=0; i<flinks.size();i++) {
//		WebElement footerlink = flinks.get(i);
//		//System.out.println(i + "-->" + footerlink.getText());
//		
//		String hrefatt = footerlink.getAttribute("href");
//		System.out.println(i + "-->" + hrefatt);
		
//		}
	}

}
