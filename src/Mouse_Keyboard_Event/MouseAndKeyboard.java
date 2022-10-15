package Mouse_Keyboard_Event;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.record.InteractiveInfoAtom.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.next.co.uk/");
//	    driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1. Hover on the elements
		
//		WebElement popupClose = driver.findElement(By.xpath("//button[@aria-label='Close']"));
//		popupClose.click();
//		
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@data-testid='snail-trail-container']/li/a"));
//		
//		for(int i=0; i<links.size(); i++) {
//			WebElement link = links.get(i);
//			Actions action = new Actions(driver);
//			action.moveToElement(link);
//			action.build().perform();
//			System.out.println(link.getText());
//		}
		
	    
		// 2. How to handle resizable items
		
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement Resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(Resizable, 70, 70).build().perform();
		
		
		// 3. How to handle drag and drop in selenium.
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Actions action = new Actions(driver);
//		action.dragAndDrop(drag, drop).build().perform();
	    
	    
	    // 4. How to handle draggable item.
	    
//	    driver.get("https://jqueryui.com/draggable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(drag, 200, 150).build().perform();
		
		
		// 5. How to perform RightClick.
		
//		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement img = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//		Actions action = new Actions(driver);
//		action.contextClick(img).build().perform();
		
		
	    // 6. How to use Sendkeys using Actions Class.
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Actions action = new Actions(driver);
		action.sendKeys(username, "sk").build().perform();
		    //action.keyDown(username, Keys.SHIFT).sendKeys("paresh").keyUp(Keys.SHIFT).build().perform();
		action.sendKeys(password, "sk@123").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
	}

}
