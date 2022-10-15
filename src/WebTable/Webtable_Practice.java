package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    int rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();
	    System.out.println(rows);
	    
	    int colm = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td")).size();
	    System.out.println(colm);
	    
	    for(int r=1; r<=rows; r++) {
	    	for(int c=1; c<=colm; c++) {
	    		String value = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+r+"]/td["+c+"]")).getText();
	    		System.out.print(value + "-->");
	    	}
	    	System.out.println();
	    }
	    
	}

}
