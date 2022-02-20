package pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
XSSFSheet sh;
	
	public ExcelRead() throws IOException {
		FileInputStream f= new FileInputStream("D:\\Data\\data1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
	}

/*	public double readData(int i, int j) {
		Row r= sh.getRow(i);
		Cell c= r.getCell(j); //Import Cell of apache poi not Table
		double data= c.getNumericCellValue(); //Read integer data and return it as double
		return data;
	}*/
	
	public String readData(int i, int j) {
		Row r= sh.getRow(i);
		Cell c= r.getCell(j); //Import Cell of apache poi not Table
		int celltype=c.getCellType();
/*	 numeric -0
	 string -1*/
		switch(celltype) 
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
			double a=c.getNumericCellValue();
			return String.valueOf(a);
		}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
            }
		return null; 
	}
	
}

	





