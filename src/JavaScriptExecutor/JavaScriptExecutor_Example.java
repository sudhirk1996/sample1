package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Example {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    // 1. Drawing the border around the element.
	    
//	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.switchTo().frame("iframeResult");
//	    WebElement tryit_btn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	    JavascriptExecutor js = ((JavascriptExecutor)driver);
//	    js.executeScript("arguments[0].style.border='3px solid red'", tryit_btn);
	    
	    // 2. Capture the title of the webpage.
	    
//	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    JavascriptExecutor js = ((JavascriptExecutor)driver);
//	    String title = js.executeScript("return document.title").toString();
//	    System.out.println(title);
	    
	    // 3. Click on Some Element.
	    
//	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.switchTo().frame("iframeResult");
//	    WebElement tryit_btn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	    JavascriptExecutor js = ((JavascriptExecutor)driver);
//	    js.executeScript("arguments[0].click()", tryit_btn);
	    
	    // 4. Generate an Alert
	    
//	    driver.get("https://www.facebook.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("alert('"+ "Facebook Login page Launched."+ "')");
	    
	    // 5. Refreshing the webpage.
	    
//		driver.get("https://www.facebook.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    Thread.sleep(2000);
//	    JavascriptExecutor js = ((JavascriptExecutor)driver);
//	    js.executeScript("history.go(0)");
	    
	    // 6. Scrolling of the webpage.
	    
	    // # Scroll down
	    
	    driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("scroll(0,1000)");
	    
	    // # Scroll up
	    
//	    driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    JavascriptExecutor js = ((JavascriptExecutor)driver);
//	    js.executeScript("scroll(0,5000)");
//	    Thread.sleep(2000);
//	    js.executeScript("scroll(0,-500)");
	    
	    // # Scroll into view
	    
//	   driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
//	   driver.manage().window().maximize();
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	   WebElement privacypolicylink = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
//	   JavascriptExecutor js = ((JavascriptExecutor)driver);
//	   js.executeScript("arguments[0].scrollIntoView(true);", privacypolicylink);
//	   privacypolicylink.click();
	   
	}

}
