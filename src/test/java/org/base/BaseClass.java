package org.base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {


	public static WebDriver driver;
	
	public static void browserLaunch(String browserName) { 
		if (browserName.equalsIgnoreCase("Chrome")) {
		 driver = new ChromeDriver();
 
		}else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Invalid Browser Name");
		}		
	}
	
	public static void waitForElement(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void insertValue(WebElement element, String value) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		jk.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
	}
	
	public static void clickButton(WebElement element) {
		waitForElement(element);
		element.click();
	}
	

}
