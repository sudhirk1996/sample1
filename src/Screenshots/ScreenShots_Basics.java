 package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_Basics {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
//		FileUtils.copyFile(Source, new File("C:\\Users\\SUDHIR\\Pictures\\Testing Images\\FbLogin.png"));
		
		// OR
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		File destination = new File("C:\\Users\\SUDHIR\\Pictures\\Testing Images\\FbLogin.png");
		FileUtils.copyFile(Source, destination);
	}

}
