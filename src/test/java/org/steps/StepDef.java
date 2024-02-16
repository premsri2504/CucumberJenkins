package org.steps;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass{

	LoginPage loginPage;

	@Given("User is on Facebook login page")
	public void user_is_on_facebook_login_page() {
		browserLaunch("Chrome");
		urlLaunch("https://www.facebook.com/");
	}

	@When("User enter valid email and invalid password")
	public void user_enter_valid_email_and_invalid_password() {
		loginPage = new LoginPage();
		WebElement txtUserName = loginPage.getTxtUserName();
		insertValue(txtUserName, "Hello");
		
		WebElement txtPassword = loginPage.getTxtPassword();
		insertValue(txtPassword, "Hello@123");
		
	}

	@When("User enter valid email and valid password")
	public void user_enter_valid_email_and_valid_password() {
		loginPage = new LoginPage();
		WebElement txtUserName = loginPage.getTxtUserName();
		insertValue(txtUserName, "Hi");
		
		Assert.fail();
		
		
		WebElement txtPassword = loginPage.getTxtPassword();
		insertValue(txtPassword, "Hi@123");
	}

	
	@When("User click on login button")
	public void user_click_on_login_button() {
		WebElement btnLogin = loginPage.getBtnLogin();
		clickButton(btnLogin);
		
	}
	@Then("User should be going to home page and validate the Username")
	public void user_should_be_going_to_search_hotel_page_and_validate_the_username() {
		System.out.println("Invalid Credentials");
	}

	@When("User prints Success message")
	public void user_prints_success_message() {
		System.out.println("Success");
	}



}
