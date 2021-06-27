package com.rest.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MathController 
{
	@Autowired
	RestTemplate template;
	@Autowired
	MathService service;
	
	@RequestMapping(value = "/consume/add", method=RequestMethod.POST)
	public String add(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/add", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public long check(@RequestBody Maths ms) {
		
		return service.add(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/consume/subtract", method=RequestMethod.POST)
	public String subtract(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/subtract", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/subtract",method = RequestMethod.POST)
	public long check2(@RequestBody Maths ms) {
		
		return service.subtract(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/consume/multiply", method=RequestMethod.POST)
	public String multiply(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/multiply", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/multiply",method = RequestMethod.POST)
	public long check3(@RequestBody Maths ms) {
		
		return service.multiply(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/consume/division", method=RequestMethod.POST)
	public String division(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/division", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/division",method = RequestMethod.POST)
	public double check4(@RequestBody Maths ms) {
		
		return service.division(ms.getN1(), ms.getN2());
	}
	@RequestMapping(value = "/consume/sqrt", method=RequestMethod.POST)
	public String sqrt(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/sqrt", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/sqrt",method = RequestMethod.POST)
	public double check5(@RequestBody Maths ms) {
		
		return service.sqrt(ms.getN1());
	}
}
