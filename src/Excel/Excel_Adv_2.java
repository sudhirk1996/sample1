package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Adv_2 {
	
	public static FileInputStream file;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
		int rows = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
		System.out.println(rows);
		
		file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
		int cols = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		
		for (int i=0; i<=rows;i++) {
			file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
			String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				file = new FileInputStream("C:\\Users\\SUDHIR\\Downloads\\MY NOTES\\OTHER\\Automation Testing Data.xlsx");
				String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
