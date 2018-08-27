Feature: Free CRM Login Feature

Scenario: Free CRM Valid Login Feature

	Given User is on login page 
	When User enters "gajaren" and "*Test123#"
	And clicks on login button
	Then Home page is displayed
	Then check contacts tab on home page
	Then Close the browser
	
