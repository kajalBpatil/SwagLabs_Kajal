Feature: Product details page

Scenario: Validate product details page Navigation  on chrome
    Given Chrome is opened and swag labs app is opened
		When User enters correct Username "standard_user" and Password "secret_sauce"
    And User clicks on login button
    Then It shows Home page
 		When User clicks on product image 
		Then It shows product details page
		
		
		Scenario: Validate product details page UI  on chrome
    Given Chrome is opened and swag labs app is opened
		When User enters correct Username "standard_user" and Password "secret_sauce" 
    And User clicks on login button
    Then It shows Home page
 		When user clicks on product image
		Then It shows product details page
		Then User is able to see heading of the product 
		When User clicks on Menu button field
		Then user is able to see the Menu button container fields
		
		
		
 Scenario: Validate product details page fields (verify all buttons are clickable)
		Given: Chrome is opened and swag labs app is opened 
		When User enters correct Username "standard_user" and Password "secret_sauce"
		And User clicks on login button
		Then It shows Home page
		When User clicks on product image 
		Then product image is clickable and It shows product details page
		When User clicks on Add to cart button on product details page
		Then Add to cart button is clickable and it shows Remove button on product details page on swag labs 
		When User clicks on Back to Products button 
		Then It shows Home Page
		When User again clicks on product image
		When User clicks on Menu button field
		When user clicks on All items
		Then It shows Home page
		When User clicks on Menu button field
		When user clicks on About link 
		Then It shows About page
		
		Scenario: Validate Logout Functionality in menu page
		Given Chrome is opened and swag labs app is opened
		When User enters correct Username "standard_user" and Password "secret_sauce"
    And User clicks on login button
    Then It shows Home page
		When user clicks on product image
		Then It shows product details page
 		When User clicks on product image 
		Then It shows product details page
		When User clicks on Menu button field
		When User clicks on logout button link
		Then It shows Login Page
		
		
