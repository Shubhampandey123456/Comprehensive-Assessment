Feature: WishList
@9WishList
Scenario: Validating WishList

Given User lands on Home Page
And User search for gifts in search box
When The Page is displayed user clicks on the product
Then The Page with product details open
And User clicks on add to Wishlist Option
Then A popup is displayed where user clicks on View wishlist url in the popup
When The wishlist Page is displayed close popups
Then The product added should be displayed correctly
And close driver