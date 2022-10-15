package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Advance {
	
	static WebDriver driver;
	static FileInputStream file;
	static String username;
	static String pw;
	
	public static void excel_file() throws FileNotFoundException {
		file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\TESTING NOTES\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		excel_file();
		username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(username);
		excel_file();
		pw = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(pw);
		driver.findElement(By.xpath("//input[@type  = 'text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type  = 'password']")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@value  = '1']")).click();
		
	}

}
