package com.ods.customer.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ods.customer.domain.response.Category;

@Component
public class CustomerODSService {

	public List<Category> test() {
		String url = "https://developers.zomato.com/api/v2.1/categories";
		String user_key = "0f8ab55bf6db23fadc2ad9193346cab5";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("user-key", user_key);
		
		HttpEntity<String> entity = new HttpEntity<>("body", headers);
		List<Category> categoryList = new LinkedList<>();
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		System.out.println(response);
//		ResponseEntity<Category[]> res = restTemplate.getForEntity(url, Category[].class);
		
		
//		categoryList = Arrays.asList(res.getBody());
		return categoryList;
	}
	
	
	public void ping() {
		System.out.println("successful....");
	}
}
