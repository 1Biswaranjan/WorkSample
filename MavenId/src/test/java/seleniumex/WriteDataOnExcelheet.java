 package seleniumex;


import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataOnExcelheet {

	
	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("student");
		
		Object stud [][] = { {"studentid","studentname","studentmark"},
				             {116,"Atish",150},
				             {117,"Sam",170},
				             {118,"Linkan",200}};
		
        int row = stud.length;
		System.out.println(row);
		int col= stud[0].length;
		System.out.println(col);
		
		for(int r=0; r<row;r++) {
			
			XSSFRow rows=sheet.createRow(r);
			
			for(int c= 0; c<col;c++) {
				
				XSSFCell cell=rows.createCell(c);
				Object value=stud[r][c];
				
				if(value instanceof String) {
				cell.setCellValue((String)value);
				}
				
				if(value instanceof Integer) {
					
					cell.setCellValue((Integer)value);
				}
				
				if(value instanceof Boolean) {
					cell.setCellValue((Boolean)value);
				}
     }
    }
			String filePath =  "H://Manual Testing/book.xlsx";
			FileOutputStream stream = new FileOutputStream(filePath);
			book.write(stream);
	}
}
