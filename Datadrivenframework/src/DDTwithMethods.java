import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTwithMethods extends TDDXLSX{
	public static XSSFSheet sheet;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	
	
	public static int Rowcount(String xlpath, int sheetid) throws IOException {

		File src = new File(xlpath);
		 fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetid);
		int rc = sheet.getLastRowNum();
		return rc;

	}

	public static String getdata(int row, int column) {
		String data = sheet.getRow(row).getCell(column).getStringCellValue();

		return data;

	}

	public void setdata(int row, int column, String xlpath, String input) throws IOException {
		sheet.getRow(row).createCell(column).setCellValue(input);
		FileOutputStream fos = new FileOutputStream(xlpath);
		wb.write(fos);
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		DDTwithMethods dd = new DDTwithMethods();
		int x = dd.Rowcount("C:\\Users\\qm21247\\Documents\\TDD.xlsx", 0);
		System.out.println(x);
		//String un = dd.getdata(0, 0);
		
		for (int i = 0; i <=x; i++) {
			String username = dd.getdata(i, 0);
			String password = dd.getdata(i, 1);
			dd.login(username, password);
			System.out.println(username+" "+password);
			
		}

	}

}
