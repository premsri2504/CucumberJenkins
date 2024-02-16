package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass{
	
	@After
	public void failedScreenshot(Scenario scenario) {
		System.out.println("Hi");

		if (scenario.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			System.out.println("Hi");
			scenario.attach(screenshot, "image/png", "Screenshot");
		}
		
		
		
	}



}
