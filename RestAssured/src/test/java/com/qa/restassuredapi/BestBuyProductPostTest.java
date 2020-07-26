package com.qa.restassuredapi;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.RestAssured.Utils.TestDataCreation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BestBuyProductPostTest extends TestDataCreation {

	@Test
	public void PostProduct()
	{
		// Base URI
				RestAssured.baseURI = "http://localhost:3030";

				// Request Object
				RequestSpecification httpRequest = RestAssured.given();

				// Request Payload sending with POST request
				JSONObject requestparam = new JSONObject();
				requestparam.put("name",TestDataCreation.name());
				requestparam.put("type",TestDataCreation.type());
				requestparam.put("price",TestDataCreation.price());
				requestparam.put("shipping",TestDataCreation.shipping());
				requestparam.put("upc",TestDataCreation.upc());
				requestparam.put("description",TestDataCreation.description());
				requestparam.put("manufacturer",TestDataCreation.manufacturer());
				requestparam.put("model",TestDataCreation.model());
				requestparam.put("url",TestDataCreation.url());
				requestparam.put("image",TestDataCreation.image());
				//requestparam.put("service", "{}");
				
				httpRequest.header("Content-Type", "application/json");
				
				httpRequest.body(requestparam.toJSONString());
										
				// Response Object
				Response httpResponse = httpRequest.request(Method.POST, "/products");
				
				// To Get Response Body
				String responseBody = httpResponse.getBody().asString();
				System.out.println("Response Body is " + responseBody);
				
				// Status Code Validation
				int statuscode = httpResponse.getStatusCode();
				System.out.println("Status Code id " + statuscode);
				Assert.assertEquals(statuscode, 201);
				
				int id = httpResponse.jsonPath().get("id");
				System.out.println(" Response" + id);
				
				String response = httpResponse.jsonPath().get("updatedAt");
				System.out.println(" Response" + response);

	}
	
}
