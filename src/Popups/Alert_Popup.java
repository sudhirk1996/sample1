package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement iframecomp = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframecomp);
		
		WebElement tryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryitBtn.click();
		
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		String textfromPopup = al.getText();
		System.out.println(textfromPopup);
		
		al.accept();
		
		}

	}