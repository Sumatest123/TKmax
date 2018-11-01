Feature: Login


Scenario: Login with valid data

Given I am in Home page
When I click on the Login link
And enter valid email id "suma.renukuntla@gmail.com"
And enter valid password "test123"
And enter click on login button
Then I should be logged in.

Scenario Outline: Login with valid data

Given I am in Home page
When I click on the Login link
And enter valid login details "<Username>" and "<password>"
And enter click on login button
Then I should be logged in.
Examples: 
|Username|password|
|arunr@gmail.com|test123|

Scenario: Login with valid data

Given I am in Home page
When I click on the Login link
And enter valid login details
|Username|arunr@gmail.com|
|password|test123| 
And enter click on login button
Then I should be logged in.


Scenario Outline: Login with invalid data

Given I am in Home page
When I click on the Login link
And enter invalid details "<email>" and "<password>" for login
And enter click on login button
Then I should have an error msg
Examples:
|email|password|
|abc@gmail|test123|
|abc@gmail.com||
|abc@gmail.com|.|
||test123|





