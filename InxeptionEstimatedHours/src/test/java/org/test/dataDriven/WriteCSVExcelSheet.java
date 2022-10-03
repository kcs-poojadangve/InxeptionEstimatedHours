package org.test.dataDriven;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class WriteCSVExcelSheet {

	public static void main(String[] args) throws Exception {
		
		// Initiating the CSVWriter class
		CSVWriter write = new CSVWriter(new FileWriter("resources//productDetails1.csv"));
		
		//writing the data into csv file
		String set1[] = {"name","country","id","dept"};
		String set2[] = {"pooja","INDIA","1","QA"};
		String set3[] = {"neha","INDIA","2","HR"};
		String set4[] = {"Geetha","INDIA","3","Dev"};
		String set5[] = {"Sita","INDIA","4","Manager"};
		
		/*write.writeNext(set1);
		write.writeNext(set2);
		write.writeNext(set3);
		write.writeNext(set4);
		write.writeNext(set5);*/
		
		//arraylist to handle data
		List list = new ArrayList();
	
		list.add(set1);
		list.add(set2);
		list.add(set3);
		list.add(set4);
		list.add(set5);
		
		write.writeAll(list);
		
		
		//flush data to create csv file data
		write.flush();
		
		System.out.println("Data is save sucessfully");
		
	}

}
