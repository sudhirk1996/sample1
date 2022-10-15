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

public class ScreenShots_Advance {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		String filename = "RegistrationPage_" + d.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		
		File destination = new File("C:\\Users\\SUDHIR\\Pictures\\Testing Images\\"+filename);
		FileUtils.copyFile(Source, destination);
	}

}
