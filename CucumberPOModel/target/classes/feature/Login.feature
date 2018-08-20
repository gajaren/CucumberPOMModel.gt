Feature: Free CRM Login Feature

Scenario: Free CRM Valid Login Feature

	Given User is on login page 
	When User enters "gajaren" and "*Test123#" and clicks on login button
	Then Home page is displayed
	Then check contacts tab on home page
	Then Close the browser
	
Scenario: Free CRM Invalid login

	Given User is on login page 
	When User enters Invalid username and password and clicks on login button
	Then User not logged in and stays on the same page
	Then Close the browser