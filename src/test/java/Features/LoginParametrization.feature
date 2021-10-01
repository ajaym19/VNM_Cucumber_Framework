Feature: Orange HRM Login Feature with Paramters

Scenario: Validate Login feature with valid credentials
Given User is on Login Page
When User enters username as "Admin"
And User enters password as "admin123"
And User clicks on Login Button
Then User should be logged in successfully
