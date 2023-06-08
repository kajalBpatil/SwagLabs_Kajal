Feature: Product Name Outline
 
 Scenario Outline: Validate Product name Visibility in product details page
    Given chrome is opened and and swag labs app is opened
    When User enters correct Username "standard_user" and Password "secret_sauce" 
    And User clicks on login button
    Then It shows Home page
 		When user clicks on product image
		Then It shows product details page
		Then User is able to see the Name of the product in "<Product Name>"
		
		Examples:
		|    Product Name          |
		|    Sauce Labs Backpack	 |
		
		
 