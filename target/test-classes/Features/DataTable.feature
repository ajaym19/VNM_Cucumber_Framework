Feature: Learning Data Table

Scenario: Trying to print some fruits name
Given User knows which fruits to be printed
When User starts printing
|apple|mango|orange|
|a|b|c|
Then Fruits should be displayed
And user should be happy