Feature: Registration functionality
 
Scenario: Registration of Users
Given I am on User registration page
When I enter below data
|Fields|Values|
|FirstName|Ajay|
|LastName|Mishra|
And Click on Submit
Then user should be registered
