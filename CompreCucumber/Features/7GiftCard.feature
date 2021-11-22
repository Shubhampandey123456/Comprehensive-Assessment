Feature: GiftCard
@7GiftCard
Scenario: Clicking on the GiftCard and checking its delivery status using postal code

Given User lands on Home Page
And User clicks on Gift Card
Then A box for entering postal code is displayed
When The User enters the postal code and click on check
Then The Available Message should be displayed on the screen
And close driver