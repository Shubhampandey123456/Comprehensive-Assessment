Feature: SortItem
@ZShortItem
Scenario: Sorting Items

Given User lands on Home Page
And Click on Secret Santa Gifts section
Then The page with results should be displayed
When User clicks on sort by
Then The Page showing results sorted with hot sellers should be displayed
And close driver