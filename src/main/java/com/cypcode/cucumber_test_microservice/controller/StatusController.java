package com.cypcode.cucumber_test_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping("status")
	public String status() {
		return "UP";
	}
	
	
	@GetMapping("valid")
	public String valid() {
		return "SUCCESS";
	}
}
