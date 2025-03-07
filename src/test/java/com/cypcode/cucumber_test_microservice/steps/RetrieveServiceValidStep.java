package com.cypcode.cucumber_test_microservice.steps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.mockito.Mock;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetrieveServiceValidStep {

	@Mock
	private RestTemplate restTemplate;
	
	private ResponseEntity<String> response = null;
	
	@When("^the client calls /valid$")
	public void the_client_issues_GET_valid() throws Throwable{
		response = executeGet("http://localhost:8080/valid");
	}
	
	@Then("^the client receives valid code of (\\d+)$")
	public void the_client_receives_valid_code_of(int statusCode) throws Throwable{
		HttpStatus currentStatus = (HttpStatus) response.getStatusCode();
		assertThat("valid code is incorrect : " + response.getBody(), currentStatus.value(), is(statusCode));
	}
	
	@And("^the client receives server valid (.+)$")
	public void the_client_receives_valid(String status) throws Throwable{
		assertThat(response.getBody(), is(status));
	}
	
	private ResponseEntity<String> executeGet(String url) throws IOException{
		if(restTemplate == null) {
			restTemplate = new RestTemplate();
		}
		return restTemplate.exchange(url, HttpMethod.GET, null, String.class);
	}
}

