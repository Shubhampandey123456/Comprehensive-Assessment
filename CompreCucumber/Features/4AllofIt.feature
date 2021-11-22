Feature: AllofIt
@4AllOfIt
Scenario: Clicking AllofIt and validating Next Page

Given User lands on Home Page
And Clicks on AllOfIt Section from Navigation Bar
Then A page with product should be displayed
When the Product is displayed Click on Next Page arrow Button
Then The user should be taken to second page of product results
And close driver