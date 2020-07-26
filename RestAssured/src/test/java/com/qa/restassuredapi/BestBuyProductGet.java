package com.qa.restassuredapi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BestBuyProductGet {
	
	//int id = 9999681;

	@Test
	public void GetProduct() {
		// Base URI
		RestAssured.baseURI = "http://localhost:3030";

		// Request Object
		RequestSpecification httpRequest = RestAssured.given();

		// Response Object
		Response httpResponse = httpRequest.request(Method.GET, "/products");

		// To Get Response Body
		String responseBody = httpResponse.getBody().asString();
		System.out.println("Response Body is " + responseBody);

		// Status Code Validation
		int statuscode = httpResponse.getStatusCode();
		System.out.println("Status Code id " + statuscode);
		Assert.assertEquals(statuscode, 200);

		// Status line Validation
		String statusline = httpResponse.getStatusLine();
		System.out.println("Status Line is" + statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");

	}

}
