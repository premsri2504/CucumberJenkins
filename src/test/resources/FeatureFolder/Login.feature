Feature: Login Validation

Background: 

Given User is on Facebook login page

When User prints Success message

Scenario: Facebook login validation

When User enter valid email and invalid password

And User click on login button

Then User should be going to home page and validate the Username

Scenario: Facebook login validation using valid credentials

When User enter valid email and valid password

And User click on login button

Then User should be going to home page and validate the Username