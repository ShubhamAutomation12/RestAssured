package com.qa.restassuredapi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BestBuyProductDeleteTest {
	int id = 9999682;

	@Test
	public void ProductDelete() {
		RestAssured.baseURI = "http://localhost:3030";

		RequestSpecification httprequest = RestAssured.given();

		Response httpResponse = httprequest.request(Method.DELETE , "/products/" +id );
		
		String body = httpResponse.getBody().asString();
		System.out.println("Response Body is" +body);
		
		int statuscode = httpResponse.getStatusCode();
		System.out.println("Status Code is" +statuscode);
		Assert.assertEquals(statuscode, 200);
		
		String SessionId = httpResponse.getSessionId();
		System.out.println("Session Id is "+SessionId);
		
		String StatusLine = httpResponse.getStatusLine();
		System.out.println("Status Line is"+StatusLine);
		
		Headers allheaders = httpResponse.getHeaders();
		
		for ( Header header :allheaders)
		{
			System.out.println(header.getValue()+" "+ header.getName());
		}
	}

}
