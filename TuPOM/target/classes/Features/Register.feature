Feature: Register
@suma
Scenario: Register with valid data for register

Given I am in Home page
When I click on the Login link
And click on register button
And enter valid details for register|
|email|arunr@gmail|
|title|mrs|
|Firstname|suma|
|surname|renukuntla|
|password|test123|
|confirmpassword|test123|
And click on accept terms and conditions
And click on the Register button
Then I should be registered 