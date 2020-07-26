package com.test.RestAssured.Utils;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataCreation {

	public static String name() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Name" + generatedString);
	}

	public static String type() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Type" + generatedString);
	}

	public static int price() {
		String generatedString = RandomStringUtils.randomNumeric(5);
		int get = Integer.parseInt(generatedString);
		// System.out.println(generatedString);
		return (get);
	}

	public static int shipping() {
		String generatedString = RandomStringUtils.randomNumeric(3);
		int get = Integer.parseInt(generatedString);
		// System.out.println(generatedString);
		return (get);
	}

	public static String upc() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("UPC" + generatedString);
	}

	public static String description() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("description" + generatedString);
	}

	public static String manufacturer() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("manufacturer" + generatedString);
	}

	public static String model() {
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("model" + generatedString);
	}

	public static String url() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return ("http://" + generatedString);
	}

	public static String image() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		return ("image" + generatedString);
	}

	/*
	 * public static void main(String...args){ TestDataCreation tc = new
	 * TestDataCreation(); tc.price(); tc.shipping();}
	 */

}
