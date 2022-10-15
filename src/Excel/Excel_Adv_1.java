package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Adv_1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Read the data.
		
		ArrayList <String> al = new ArrayList<String>();
		
		for (int i=0;i<5;i++) {
		FileInputStream file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			al.add(value);
		}
			System.out.println(al.size());
				
			System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\SELENIUM\\CHROME DRIVER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			for(int j=0;j<al.size();j++) {
			   driver.get(al.get(j));
			   String Title = driver.getTitle();
			   System.out.println(al.get(j)+"==>"+Title);
			    }
	}

}
