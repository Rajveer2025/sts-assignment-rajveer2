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
Feature: Select Row Test
  Verify Select Row feature works as per requirements

	Background: navigate to url large
	Given I navigate to the large page
	
  @interview_assignment
  Scenario Outline: Verify Select Row feature works for given row data
    #Given Open Browser with URL <url_path>
    When select and highlight row <data>
    
    Examples:
    | data 			|
    | Siblings	|
    | 1.3				|
    | 13.2			|
    
    
    
