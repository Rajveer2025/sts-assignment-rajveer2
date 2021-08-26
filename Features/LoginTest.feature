#Author: Rajveer S
#Keywords Summary : Login Feature Test
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
@interview_assignment
Feature: Login Test
  Verify login feature works as per requirements

	Background: navigate to url login
	Given I navigate to the login page
	
  @interview_assignment
  Scenario Outline: Verify login feature works for given credentials
    Given Open Browser with URL
    When I enter user with <user_name>
    And I enter password with <password>
    And I click on Login button
    Then Should display notification <message>
    
    Examples:
    | user_name | password 							| message 											|
    | tomsmith	| SuperSecretPassword!	| You logged into a secure area!|
    | tomsmith	| SuperSecretPassword		| Your password is invalid!			|
    | tomsmith1	| SuperSecretPassword!	| Your username is invalid!			|
    
    
    
