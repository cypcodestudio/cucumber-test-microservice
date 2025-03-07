package com.cypcode.cucumber_test_microservice.integration;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/java/com/cypcode/cucumber_test_microservice/RETRIEVE_SERVICE_STATUS.feature",
		"src/test/java/com/cypcode/cucumber_test_microservice/RETRIEVE_SERVICE_VALID.feature"
},
glue = {
		"com.cypcode.cucumber_test_microservice.steps",
		"com.cypcode.cucumber_test_microservice"
},
monochrome = true,
plugin = {"pretty"})
public class CucumberTest {

}
