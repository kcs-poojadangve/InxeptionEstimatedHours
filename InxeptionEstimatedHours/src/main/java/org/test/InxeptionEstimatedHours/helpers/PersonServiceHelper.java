package org.test.InxeptionEstimatedHours.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.test.InxeptionEstimatedHours.constants.EndPoints;
import org.test.InxeptionEstimatedHours.model.Datum;
import org.test.InxeptionEstimatedHours.model.Response;
import org.test.InxeptionEstimatedHours.utils.ConfigManager;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import io.restassured.specification.RequestSpecification;

public class PersonServiceHelper {
	public static RequestSpecification httpRequest;
	public static String response;

	static String source1 = ConfigManager.getInstance().getString("dataSource");
	public static final String BASE_URL = ConfigManager.getInstance().getString("base_url");
	public List<String> list = new ArrayList<> (Arrays.asList(EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE,EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE1,EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE2));
	 public int totalList = list.size();
	public PersonServiceHelper() {
		RestAssured.baseURI = BASE_URL;
		RestAssured.useRelaxedHTTPSValidation();
	}

	public Response getSearchProductByDataSource() {
		
	String source2 =  source1;
		System.out.println(" test :" +source1);
		

	/*	String response = RestAssured.given().log().all().queryParam("data_source", "https://www.mustbatteries.com/supplier-457902-lithium-iron-phosphate-battery")
				.when().get(EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE).then().log().all().extract().response()
				.asString(); */
		
		/*String response = RestAssured.given().log().all()
				.when().get(EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE).then().log().all().extract().response()
				.asString();
		
		
		
		return response;*/
		
		 
			Response response = RestAssured.given().log().all().expect().defaultParser(Parser.JSON).when()
					.get(EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE).then().log().all().extract().response()
					.as(Response.class);
			return response;
	}
	

	public Response getData(int data) {
		
		

		/*
		 * Datum response1 =
		 * RestAssured.given().contentType(ContentType.JSON).expect().defaultParser(
		 * Parser.JSON).when()
		 * .get(EndPoints.GET_SEARCH_PRODUCT_BY_DATA_SOURCE).as(Datum.class); return
		 * response1;
		 */
		Response response = RestAssured.given().log().all().expect().defaultParser(Parser.JSON).when()
				.get((String)list.get(data)).then().log().all().extract().response()
				.as(Response.class);
		return response;
	}
	
	

}
