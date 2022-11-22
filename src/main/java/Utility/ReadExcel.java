package Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import Base.Testbase;

public class ReadExcel extends Testbase {
	
	
	public static String readExcelfile(int row, int cell) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\NopCom\\TestData\\LoginPageTestData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
		
	}

}
