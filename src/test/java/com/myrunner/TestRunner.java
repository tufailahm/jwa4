package com.myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features", 
		glue = {"com.training.jwa"} ,
		monochrome = true
		
		)
public class TestRunner {

}
