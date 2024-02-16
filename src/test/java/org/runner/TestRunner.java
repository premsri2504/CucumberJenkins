package org.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFolder/Login.feature", glue = "org.steps",
					dryRun = false, plugin = "json:target/cucumber-report.json")
public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		JVMReport.generateReport();
	}

}
