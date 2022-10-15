package JavaScriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type  = 'text']")).sendKeys(Methods_For_JavaScript.excel("Sheet1", 0, 0));
		driver.findElement(By.xpath("//input[@type  = 'password']")).sendKeys(Methods_For_JavaScript.excel("Sheet1", 0, 1));
		driver.findElement(By.xpath("//button[@value  = '1']")).click();
	}

}
