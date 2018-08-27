Feature: Free CRM Examples keyword

Scenario Outline: Free CRM Invalid login

	Given User is on login page 
	When User enters Invalid "<username>" and "<password>"
	And clicks on login button
	Then User not logged in and stays on the same page
	Then Close the browser
	
	Examples:
	| username | password |
	| invalid | invalid |
	| invpass | invpass |