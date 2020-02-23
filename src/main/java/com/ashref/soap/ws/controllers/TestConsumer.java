package com.ashref.soap.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashref.soap.ws.countrydetails.CountryRequest;
import com.ashref.soap.ws.countrydetails.CountryResponse;
import com.ashref.soap.ws.services.CountryService;

@RestController
public class TestConsumer {
	@Autowired
	private CountryService service;
	
	@PostMapping("/country")
	public CountryResponse testConsumer(@RequestBody CountryRequest request) {
		return service.getCountry(request);
	}
}
