package com.crm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\Contacts.feature",
	glue= {"com.crm.StepDefinition"},
	plugin= {"pretty","html:cucumber_html_report", "junit:cucumber_junit_report"},
	monochrome=true,
	strict=true,
	dryRun=false)

public class TestRunner {

}
	