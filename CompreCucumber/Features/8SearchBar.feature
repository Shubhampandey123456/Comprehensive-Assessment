Feature: SearchBar Validation
@SearchBar
Scenario: Entering data into search box and validating the results

Given User lands on Home Page
And User pass the input into search box and press Enter
Then The relevant products should be displayed onto the screen
And close driver
