package Reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class getData {
	//POI 
	public static String[][] getDataFromExcel(String FileName, String SheetName) throws IOException{
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\testdata.xlsx";
		System.out.println(path);
		File file = new File(path);
		FileInputStream ips = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(ips);
		Sheet sh = wb.getSheet(SheetName);
		int rownum = sh.getLastRowNum()+1;
		int colnum = sh.getRow(0).getLastCellNum();
		String[][] data =  new String[rownum][colnum];
		String value="";
		for(int i=0;i<rownum;i++){
			Row row = sh.getRow(i);
			for(int j=0;j<colnum;j++){
				value= row.getCell(j).getStringCellValue();
				data[i][j]=value;	
			}
		}
		return data;
	}
}
