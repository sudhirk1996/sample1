package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_Advance_ActualWork {
	
	public static WebDriver driver;
	
	public static void getscreenshots() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		String filename = d.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		
		File destination = new File("C:\\Users\\SUDHIR\\Pictures\\Testing Images\\"+filename);
		
		FileUtils.copyFile(source, destination);
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		getscreenshots();
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/reg/");
		getscreenshots();
		
		
	}

}
