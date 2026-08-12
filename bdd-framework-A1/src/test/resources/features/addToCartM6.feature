Feature: Add to cart

  Scenario: add bagpack
		
		When user navigates to saucedemo
		And enters valid username and password
		And clicks on login button
		Then user should be redirected to homepage
		And user should add some product to cart
		