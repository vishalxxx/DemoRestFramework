package com.api.Filter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class ApiFilter implements Filter {

	public static final Logger logger = LogManager.getLogger(ApiFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec);
		logResponse(response);
		return response;
	}
	
	public void logRequest(FilterableRequestSpecification requestSpec) {
		
		logger.info("Request Header : " + requestSpec.getHeaders());
		logger.info("Request BASE URI : " + requestSpec.getBaseUri());

		logger.info("Request Body : " + requestSpec.getBody());

	}
	
	public void logResponse(Response responseSpec) {
		logger.info("Response Header : " + responseSpec.getHeaders());
		
		logger.info("Response Status Code : " + responseSpec.getStatusCode());

		logger.info("Response Body : " + responseSpec.getBody());
		
	}

	
		
}
