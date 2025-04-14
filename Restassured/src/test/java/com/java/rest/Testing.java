package com.java.rest;

import java.util.HashMap;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.java.rest.requestmodel.usercreation;

import io.restassured.response.Response;

@Listeners(com.api.listners.TestListner.class)
public class Testing extends Base {
	
	
	@Test
	public void getuserlist() {
		// usercreation payload = new usercreation.Builder().setname("vishal").setjob("QA").build();
		
		
		//small payloads can be made usng key value data structure like hashpaps
		
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("name", "hitesh");
		payload.put("job", "utijob");
		Response response = postreq(payload ,Endpoint.CREATE_USER);
		System.out.println(response.jsonPath().getString("id"));
		
	}
		
}
