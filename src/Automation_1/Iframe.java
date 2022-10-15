package Automation_1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");  // id, name, index, webelement
		WebElement ClickmeBtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		ClickmeBtn.click();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		WebElement changeThemeBtn = driver.findElement(By.xpath("//a[@title='Change Theme']"));
		changeThemeBtn.click();
	}

}
