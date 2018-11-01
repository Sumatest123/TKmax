Feature: CheckOut

Scenario: Check out with valid data

Given I am in Home page
When I mouse over on Top menu
And select an item from the drop down
And set a filter for a size
And select an item form the product list page
And select a size for the item
And select the quantity for an item
And click on add to basket button
And item should be added to the basket
And click on view basket
And click on view basket and check out
And click on proceed to check out
And enter valid email id "arunr@gmail.com" for check out
And enter valid password "test123" for check out
And click on log in button for check out
And I have proceeded to check out
Then I should see delivery page


Scenario Outline: Check out with Invalid data                    

Given I am in Home page
When I mouse over on Top menu
And select an item from the drop down
And set a filter for a size
And select an item form the product list page
And select a size for the item
And select the quantity for an item
And click on add to basket button
And item should be added to the basket
And click on view basket
And click on view basket and check out
And click on proceed to check out
And enter "<email>" and "<password>" for check out
And click on log in button for check out
And I have proceeded to check out
Then I should see an error
Examples: 
|email|password|
|arunr@gmail|test123|
|arunr@gmail.com||
|arunr@gmail|.|
||test123|

