package org.test.dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {
	
	public void getData() throws Exception {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("ProductDetails");
		
		/*Object productDetails[][] = {{"EMPID","EMPName","Job"},
									{101,"puja","QA"},
									{102,"Neha","QC"},
									{103,"Geeta","Engineer"}};*/
		//using for loop
		/*int row = productDetails.length;
		int col = productDetails[0].length;
		
		System.out.println(row);
		System.out.println(col);
		for(int r=0;r<row;r++)
		{
			XSSFRow rows =sh.createRow(r);
			for(int c=0;c<col;c++)
			{
				XSSFCell cell = rows.createCell(c);
				Object value = productDetails[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);

				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);

			}
		}*/
		
		ArrayList<Object[]> productDetails =new ArrayList<Object[]>();
		
		productDetails.add(new Object[] {"EMPID","EMPName","Job"});
		productDetails.add(new Object[] {101,"puja","QA"});
		productDetails.add(new Object[] {102,"neha","Dev"});
		productDetails.add(new Object[] {103,"Geeta","Manager"});
		
		//using for each
		int rowCount = 0;
		for(Object data[]:productDetails)
		{
			XSSFRow row = sh.createRow(rowCount++);
			int columnCount = 0;
			for(Object value:data)
			{
				XSSFCell cell = row.createCell(columnCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);

				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);

						
			}
		}
		
		String filePath = ".\\resources\\productDetails.xlsx";
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		fos.close();
		System.out.println("Product details are successfully written in Excel");
		
	}

}
