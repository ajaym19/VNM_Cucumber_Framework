Feature: Orange HRM Login Feature

Scenario: Validate Login feature with valid credentials
Given User is on Login Page
When User enters username
And User enters password
And User clicks on Login Button
Then User should be logged in successfully


#Scenario: Validate Add feature
#Given Application is launched
#When User provides number1 and number2
#And User clicks on Add Button
#Then The sum of both the numbers should be displayed on UI