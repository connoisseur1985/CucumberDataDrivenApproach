package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\ASUS\\eclipse-workspace\\FreeCRMCucumberProject\\src\\main\\java\\com\\qa\\feature\\EntryPage.feature"},
				 glue="com.qa.stepdefinitions",
				 plugin= {"pretty","html:html-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"},
				 monochrome=true,
				 dryRun=false,
				 strict=true
				 
)
public class TestRunner {

		
	}


