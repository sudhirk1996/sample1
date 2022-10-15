package JavaScriptExecutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methods_For_JavaScript {
	
	// ## Take Screenshot.
	
	public static void getscreenshots(WebDriver driver) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		String filename = d.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		
		File destination = new File("C:\\Users\\SUDHIR\\Pictures\\Testing Images\\"+filename);
		
		FileUtils.copyFile(source, destination);
	}
	
	// ## Excel File.
	
	public static String excel(String sh,int x, int y) throws EncryptedDocumentException, IOException{
			
	FileInputStream file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\TESTING NOTES\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
	String data=WorkbookFactory.create(file).getSheet(sh).getRow(x).getCell(y).getStringCellValue();
		return data;	
	}
	
	// 1. Drawing the border around the element.
	
	public static void BorderbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	// 2. Capture the title of the webpage.
	
	public static String TitlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	
	// 3. Click on Some Element.
	
	public static void ClickbyJS(WebDriver driver, WebElement element) {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
    js.executeScript("arguments[0].click()", element);
	}
	
	// 4. Generate an Alert.
	
	public static void AlertbyJS(WebDriver driver, String Message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+ Message+ "')");
	}
	
	// 5. Refreshing the webpage.
	
	public static void RefreshbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("history.go(0)");
	}
	
	// 6. Scrolling of the webpage.
	
	public static void ScrolldownbyJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("scroll("+x+","+y+")");
	}
	
	public static void ScrollupbyJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("scroll("+x+","+y+")");
	}
	
	public static void ScrollIntoViewbyJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
