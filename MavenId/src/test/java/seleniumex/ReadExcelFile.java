package seleniumex;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		
		String filePath = "H://Manual Testing/Book1.xlsx";
		
		FileInputStream inputStream = new FileInputStream(filePath);
		
		XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		//String user = sheet.getRow(0).getCell(0).getStringCellValue();
		//String pass = sheet.getRow(0).getCell(1).getStringCellValue();
		
	//	System.out.println(user);
	//	System.out.println(pass);
		
		     int rows  = sheet.getLastRowNum();
		     System.out.println(rows);
		     int col = sheet.getRow(0).getLastCellNum();
		     System.out.println(col);
		     
		     for(int i = 0; i<=rows;i++)
		     {
		    	 XSSFRow row = sheet.getRow(i);
		    	 
		    	 for(int j = 0;j<col;j++)
		    	 {
		    		System.out.print(row.getCell(j).toString()+" || ");
		    		 //System.out.println(a+" || "+" ");
		    	 }
		    		System.out.println();
		     }

	}
	
}
