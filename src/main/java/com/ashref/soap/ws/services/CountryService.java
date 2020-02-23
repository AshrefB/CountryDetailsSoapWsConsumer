package com.ashref.soap.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.ashref.soap.ws.countrydetails.CountryRequest;
import com.ashref.soap.ws.countrydetails.CountryResponse;

@Service
public class CountryService {
	@Autowired
	private Jaxb2Marshaller marshaller;
	private WebServiceTemplate template;
	private static final String URL = "http://localhost:8081/ws";
	
	public CountryResponse getCountry(CountryRequest request) {
		template = new WebServiceTemplate(marshaller);
		return (CountryResponse) template.marshalSendAndReceive(URL, request);
	}
}
