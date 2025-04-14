package com.java.rest;

import java.util.HashMap;

import com.java.rest.requestmodel.usercreation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.api.Filter.*;

public class Base {

		public Base(){
			
			RestAssured.baseURI = "https://reqres.in";
		}
		
		static {
			RestAssured.filters(new ApiFilter());
		}
		
		protected Response postreq(HashMap payload, String endpoint) {
			Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).post(endpoint);
			return response;
		}
		
		protected Response getreq( String endpoint) {
			Response response = RestAssured.given().contentType(ContentType.JSON).get(endpoint);
			return response;
		}
}
