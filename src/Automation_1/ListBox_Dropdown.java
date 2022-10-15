package Automation_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		// ## Handle year dropdown box in registration functionality.
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select yr = new Select(year);
		
		//yr.selectByIndex(3);
		
		//yr.selectByValue("1996");
		
		//yr.selectByVisibleText("1998");
		
		
		// ## Get all option gives under dropdown box.
		
//		List<WebElement> all_ele = yr.getOptions();
//		
//		for(WebElement ele:all_ele) {
//			System.out.println(ele.getText());
//		}
		
		
		// ## Get first selected option from the list box.
		
		String firstopt = yr.getFirstSelectedOption().getText();
		System.out.println(firstopt);
	}

}
