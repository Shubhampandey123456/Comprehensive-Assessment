Feature: Blogs
@2Blogs
Scenario: Read Quotes in Blogs

Given User lands on Home Page
When User Cliked on a blog in Latest Blog Section
Then Page loaded and User Validated a Quote
And close driver