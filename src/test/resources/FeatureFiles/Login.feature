Feature: To check the Login functionality
	@Login @One
	Scenario: Verify whether the user is able to login using valid credentials
	
	Given I launch the application
	And I navigate to Account Login page
	When I login to the Application using Username as "anusayachougule1394@gmail.com" and Password as "anusaya94"
	Then I should see that user is able to login successfully	
	
	@Login @Two
	Scenario: Verify whether the user is able to login with invalid credentials
	
	Given I launch the application
	And I navigate to Account Login page
	When I login to the Application using Username as "anusayachougule194@gmail.com" and Password as "anusaya94"
	Then I should see that user is not able to login successfully	
	
	@Login @Three
	Scenario: Verify if the user is able to login without credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to the Application using Username as "" and Password as ""
	Then I should see that user is not able to login successfully
	
	@Login @Four
	Scenario: I should be able to reset my password sucessfully
	Given I launch the application
	And I navigate to Account Login page
	When I reset the forgotten password for email "anusayachougule1394@gmail.com"
	Then I should see a confirmation message displaying information about resetting password
	
	