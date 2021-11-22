Feature: Contact Us
@3Contact
Scenario Outline: Fill the details and Submit the contact form

Given User lands on Home Page
Then User clicks on Contact Us link
When the User lands on Contact Us form
Then User should enter <Name> , <Email-id> and <Message>
And User Clicks on submit
And close driver

Examples:
|Name  |Email-id              |Message     |
|Shubham|ShubhamPandey@gmail.com|Nice Website|