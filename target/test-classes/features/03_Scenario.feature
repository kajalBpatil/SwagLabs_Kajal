Feature: Excel
Scenario: Validate Login functionality with valid data
Given chrome is opened and and swag labs app is opened
When User fills Username data from given sheetname "<sheetname>" and rownumber <Rownumber> in Username and Password  
And User clicks on login button
Then It shows Home page
 
 Examples:
 	| sheetname  | Rownumber |
 	| Sheet1     |     0     |