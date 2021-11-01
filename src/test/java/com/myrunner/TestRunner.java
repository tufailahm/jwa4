package com.myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features", 
		glue = {"com.training.jwa"} ,
		monochrome = true,
		plugin = {"pretty", "html:target/HtmlReports/reports.html",
				            "json:target/JSONReports/report.json",
				            "junit:target/XMLReports/report.xml"
				},
		tags = "@googlesearch and @servicetest"
		
		)
public class TestRunner {

}
