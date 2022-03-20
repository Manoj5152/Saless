Feature: This is to test google search
Scenario: Google search scenario
	Given user is on login
	When user is typing the search term "Agniprasath"
	And enters the return key
	Then the user should see the search results