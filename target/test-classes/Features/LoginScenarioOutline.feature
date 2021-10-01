Feature: Orange HRM Login Feature with Paramters

# to execute same TC with different set of data
# we use Scenario Outline

Scenario Outline: Validate Login feature with valid credentials
Given User is on Login Page
When User enters username as <username> and password as <password>
And User clicks on Login Button
Then User should be logged in successfully
Examples:
	|username|password|
	|admin	|admin123|
	|test	|test123|
