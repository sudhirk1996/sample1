package JavaScriptExecutor;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class excel_util {
	
	static String data;
	public static String excel() throws EncryptedDocumentException, IOException{
		
		FileInputStream file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\TESTING NOTES\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
		for(int i=0; i<9; i++) {
			data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();	
		}
		return data;
		}

}
