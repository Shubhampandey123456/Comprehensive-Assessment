Feature: Account
@1Account
Scenario: SignIn into Account

Given User lands on Home Page
Then User Cliked on Signin Tab
When Page loaded User filled credentials
Then User Clicked on Submit button
And close driver