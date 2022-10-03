package org.test.InxeptionEstimatedHours;

import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.test.InxeptionEstimatedHours.helpers.PersonServiceHelper;
import org.test.InxeptionEstimatedHours.model.Datum;
import org.test.InxeptionEstimatedHours.model.Response;
import org.test.InxeptionEstimatedHours.model.Response__1;
import org.test.InxeptionEstimatedHours.model.Source;
import org.test.dataDriven.WritingData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.opencsv.CSVWriter;

public class TestSearchDataByDataSource {

	private PersonServiceHelper personServiceHelper;
	public Response res = null;
	static SoftAssert softassert;
	static Source source1;
	static List<Datum> data;
	static int z = 0;
	static int totalData;

	@BeforeClass
	public void init() {
		personServiceHelper = new PersonServiceHelper();
		softassert = new SoftAssert();
	}

	@Test(priority = 0)
	public void testGetPerson() throws Exception {
		

		 res = personServiceHelper.getSearchProductByDataSource();
		 Response__1 source = res.getResponse();
			List<Datum> data = source.getData();
			totalData = data.size();
			System.out.println("Total product : " + totalData);
			CSVWriter write = new CSVWriter(new FileWriter("resources//allProducts.csv"));
			String set1[] = {"sellerAlias","productURL","productID"};
			List list = new ArrayList();
			list.add(set1);
			write.writeAll(list);
			write.flush();

			
				for(int i=0;i<totalData;i++)
			{
				source1 = data.get(z).getSource();
				String sellerAlias = source1.getSellerAlias();
		String productURL = source1.getProductUrl();
		String productID = source1.getProductId();
				System.out.println("Seller alias : " +productURL );
				
					
					String set[] = {sellerAlias,productURL,productID};
				
					
					List list1 = new ArrayList();
				
					list1.add(set);
				
					write.writeAll(list1);
					write.flush();
				
				
				
				
			}
			
			
			

		
		
	}

	@Test(priority = 1)
	public void getDtata() throws Exception {
		int totalList1 = personServiceHelper.totalList;
		for(int i=0;i<totalList1;i++)
		{
			Response data1 = personServiceHelper.getData(i);
			Response__1 source = data1.getResponse();
			List<Datum> data = source.getData();
			totalData = data.size();
			System.out.println("Total product : " + totalData);
		
		for (z = 0; z < totalData; z++) {

			System.out.println("---------------------------------------Product---------------------------------------");
			source1 = data.get(z).getSource();
		
			validateSellerAlias();
//			validateDataSource();
			validateProductURL();
//			validateProductID();
//			validateName();
//			validatePrice();
//			validateTaxonomy();
//			validateDataSourceSubCategory();
//			validateCreatedAt();
//			ValidateUpdatedAt();
//			validateNoOfReview();
//			validateLength();
//			validateBreadth();
//			validateThickness();
//			validateWattage();
//			validateCertificate();
			validatePowerRange();
		}
	}
	}

	public static void validateSellerAlias() {
		String sellerAlias = source1.getSellerAlias();
		System.out.println("Seller alias : " + sellerAlias);
		// String sellerAlias = "{Alive}";
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher = pattern.matcher(sellerAlias);
		boolean isStringContainsSpecialCharacter = matcher.find();
		if (isStringContainsSpecialCharacter) {
			softassert.assertTrue(false, "Seller alias contains special symbol");
			softassert.assertAll();
		}

		if (sellerAlias.isBlank()) {
			// Assert.assertFalse(values.contains(" "));
			softassert.assertTrue(false, "Seller Alias is empty");
			softassert.assertAll();
		}
	}

	public static void validateDataSource() {
		String dataSource = source1.getDataSource();
		System.out.println("Data sources : " + dataSource);

		// String values = " ";
		if (dataSource.isBlank()) {
			// Assert.assertFalse(values.contains(" "));
			softassert.assertTrue(false, "Data source is empty");
			softassert.assertAll();
		}
	}

	public static void validateProductURL() {
		String productURL1 = source1.getProductUrl();
		// System.out.println(productURL1);

		 //String[] productURL1 =
		 //{"https://www.mustbatteries.com/sale-14165964-25-6v-waterproof-lithium-iron-phosphate-battery-100ah-25-6v-for-solar-system.html","https://www.mustbatteries.com/sale-14165964-25-6v-waterproof-lithium-iron-phosphate-battery-100ah-25-6v-for-solar-system.html"};
		// 2. First convert to List
		List<String> list = Arrays.asList(productURL1);

		// 3. List to Set
		Set<String> set = new HashSet<String>();

		// 4. Iterate
		for (int i = 0; i < list.size(); i++) {

			// 5. add element to Set
			boolean flagForDuplicate = set.add(list.get(i));

			// 6 print index-position of duplicates
			if (!flagForDuplicate) {
				//System.out.println("Duplicate " + list.get(i) + " at " + i + " index-position");
				softassert.assertTrue(false,"duplicate url");
				softassert.assertAll();
			}
		}
	}

	public static void validateProductID() {
		String productID = source1.getProductId();
		// System.out.println(productID);
		// String[] productID =
		// {"c026b0bee56d47e1b9b149d457573e84","c026b0bee56d47e1b9b149d457573e84"};
		List<String> list = Arrays.asList(productID);

		// 3. List to Set
		Set<String> set = new HashSet<String>();

		// 4. Iterate
		for (int i = 0; i < list.size(); i++) {

			// 5. add element to Set
			boolean flagForDuplicate = set.add(list.get(i));

			// 6 print index-position of duplicates
			if (!flagForDuplicate) {
				System.out.println("Duplicate " + list.get(i) + " at " + i + " index-position");
			}
		}
	}

	public static void validateName() {
		String name = source1.getName();
		System.out.println("name : " + name);
		// String name = "[abcd]";
		// System.out.println(name);
		Pattern p = Pattern.compile("[{}\\[\\]()]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(name);
		boolean isStringContainsSpecialCharacter1 = m.find();
		if (isStringContainsSpecialCharacter1) {
			softassert.assertTrue(false, "name field contain brackets");
			softassert.assertAll();
		}
		if (name.isBlank()) {
			// Assert.assertFalse(values.contains(" "));
			softassert.assertTrue(false, "name field is empty");
			softassert.assertAll();
		}
	}

	public static void validatePrice() {
	
		String price = source1.getPrice();
		System.out.println("price : " + price);
		if(price == null)
		{
			return;
		}
//		 String price="1324";
//		String currency = "$";
		String currency = source1.getCurrency();
		System.out.println("currency : " + currency);
		if (price.isBlank()) {
			if (currency.contains("$")) {
				// currency = currency + null;
				softassert.assertTrue(false, "not valid");
				softassert.assertAll();
			}
		}
	}

	public static void validateTaxonomy() {
		String taxonomy = source1.getTaxonomy();
		System.out.println("Taxonomy : " + taxonomy);

		if (taxonomy.isBlank()) {
			// Assert.assertFalse(values.contains(" "));
			softassert.assertTrue(false, "taxonomy field is empty");
			softassert.assertAll();
		}

		String str[] = taxonomy.split(">>");
		// System.out.println("Test Test :" + str.length);
		if (str.length < 2) {
			softassert.assertFalse(true, "Due to format");
		}
	}

	public static void validateDataSourceSubCategory() {
		String dataSourceSubcategory = source1.getDataSourceSubcategory();
		System.out.println("Data Source Sub Category : " + dataSourceSubcategory);
		if(dataSourceSubcategory == null)
		{
			return;
		}
		Pattern p1 = Pattern.compile("[{}\\[\\]()]", Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher(dataSourceSubcategory);
		boolean isDataSourceSubCategory = m1.find();
		if (isDataSourceSubCategory) {
			softassert.assertTrue(false, "dataSourceSubcategory field contain brackets");
			softassert.assertAll();
		}
	}

	public static void validateCreatedAt() {
		String CreatedAt = source1.getCreatedAt();
		// System.out.println(CreatedAt);
		// String CreatedAt="";

		if (CreatedAt.trim().equals("")) {
			System.out.println("Created date is empty");
		} else {
			SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
			sdfrmt.setLenient(false);
			try {
				Date date = sdfrmt.parse(CreatedAt);
				softassert.assertTrue(true, "Valid date");
				softassert.assertAll();
				System.out.println("Created date is valid date format : " + CreatedAt);
			} catch (ParseException e) {
				softassert.assertFalse(false, "InvaliValid date");
				softassert.assertAll();
				System.out.println("Created date is Invalid Date format : " + CreatedAt);
			}
		}

	}

	public static void ValidateUpdatedAt() {
		String updatedAt = source1.getUpdatedAt();
		// System.out.println(CreatedAt);
		// String CreatedAt="";
		if (updatedAt.trim().equals("")) {
			System.out.println("Updated date is empty");
		} else {
			SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
			sdfrmt.setLenient(false);
			try {
				Date date = sdfrmt.parse(updatedAt);
				softassert.assertTrue(true, "Valid date");
				softassert.assertAll();
				System.out.println("Updated date is valid date format : " + updatedAt);
			} catch (ParseException e) {
				softassert.assertFalse(false, "InvaliValid date");
				softassert.assertAll();
				System.out.println("Updated date is Invalid Date format : " + updatedAt);
			}
		}
	}

	public static void validateNoOfReview() {
		Object numberOfReview = source1.getNumberOfReviews();
		System.out.println("Number Of Review : " +numberOfReview);

		String numberOfReview1 = String.valueOf(numberOfReview);
		if (numberOfReview1 == null) {
			return;
		}

		Pattern p3 = Pattern.compile("^[0-9]");
		Matcher m3 = p3.matcher(numberOfReview1);
		boolean res = m3.find();
		if (res) {
			softassert.assertFalse(true, "Due to alphabetical or special character");
			softassert.assertAll();
		}
	}

	public static void validateLength() {
		if(source1.getLength() == null)
		{
			return;
		}
		
		else if (source1.getLength().length() > 1 && source1.getLength().endsWith("mm")) {
			String characters = "[^0-9[mm.]]";
			Pattern p4 = Pattern.compile(characters);
			Matcher m4 = p4.matcher(source1.getLength());
			boolean res1 = m4.find();
			if (res1) {
				softassert.assertTrue(false, "Due to alphabetical and special character ");
				softassert.assertAll();
			}
		} else {
			softassert.assertFalse(true, "Invalid formate ");
			softassert.assertAll();
		}
	}
	
	public static void validateBreadth() {
		String breadth = source1.getBreadth();
		System.out.println("Breadth : " +breadth);
		//String breadth = "@123";
		if (breadth == null) {
			return;
		} else if (breadth.length() > 1 && breadth.endsWith("mm")) {
			String characters = "[^0-9[mm.]]";
			Pattern p4 = Pattern.compile(characters);
			Matcher m4 = p4.matcher(breadth);
			boolean res1 = m4.find();
			if (res1) {
				softassert.assertTrue(false, "Due to alphabetical and special character ");
				softassert.assertAll();
			}
		} else {
			softassert.assertFalse(true, "Invalid formate ");
			softassert.assertAll();
		}
	}
	
	public static void validateThickness() {
		String thickness = source1.getThickness();
		System.out.println("Thickness : " +thickness);
		//String breadth = "@123";
		if (thickness == null) {
			return;
		} else if (thickness.length() > 1 && thickness.endsWith("mm")) {
			String characters = "[^0-9[mm.]]";
			Pattern p4 = Pattern.compile(characters);
			Matcher m4 = p4.matcher(thickness);
			boolean res1 = m4.find();
			if (res1) {
				softassert.assertTrue(false, "Due to alphabetical and special character ");
				softassert.assertAll();
			}
		} else {
			softassert.assertFalse(true, "Invalid formate ");
			softassert.assertAll();
		}
	}
	
	public static void validateWattage()
	{
		Object wattage = source1.getWattage();
		System.out.println("wattage : " +wattage);

		String wattage1 = String.valueOf(wattage);
		if (wattage1 == null) {
			return;
		}
		else if(wattage1.length()>1)
		{
		Pattern p3 = Pattern.compile("^[0-9]");
		Matcher m3 = p3.matcher(wattage1);
		boolean res = m3.find();
		if (res) {
			softassert.assertTrue(true, "Due to alphabetical or special character");
			softassert.assertAll();
		}
		}else
		{
			softassert.assertFalse(false, "Invalid formate");
		}
	}
	
	public static void validateCertificate()
	{
		String certificate = source1.getCertificate();
		System.out.println("Certificate : " +certificate);
				
		if(certificate.isBlank())
		{
			softassert.assertTrue(true," is blank");
			softassert.assertAll();
		}
		if(certificate == null)
		{
			return;
		}
		else {
			Pattern p = Pattern.compile("[{}\\[\\]()]", Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(certificate);
			boolean isStringContainsSpecialCharacter1 = m.find();
			if (isStringContainsSpecialCharacter1) {
				softassert.assertTrue(false, "certificate field contain brackets");
				softassert.assertAll();
			}
		}
	}
	
	public static void validatePowerRange()
	{
//		Object powerRange = source1.getPowerRange();
//		System.out.println(powerRange);
		
		String powerRange = " 0.15 - 55kW";
		//System.out.println(powerRange.length());
		
		
		String[] parts = powerRange.split("-");
		String part1 = parts[0]; // 5533
		String part2 = parts[1]; // 65600
		System.out.println(part1);
		System.out.println(part2);
		
		String max = part2.replaceAll("[^0-9[kW.]]", " ").replaceAll("\\s", "").trim();
		
		 if (max.length() > 1 && max.endsWith("kW")) {
				String characters = "[^0-9[kW.]]";
				Pattern p4 = Pattern.compile(characters);
				Matcher m4 = p4.matcher(max);
				boolean res1 = m4.find();
				if (res1) {
					softassert.assertTrue(false, "Due to alphabetical and special character ");
					softassert.assertAll();
				}
			} else {
				softassert.assertFalse(true, "Invalid formate ");
				softassert.assertAll();
			}
	}
}
