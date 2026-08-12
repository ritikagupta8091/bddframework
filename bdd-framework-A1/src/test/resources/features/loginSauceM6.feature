Feature: Login in saucedemo for A15

	@single
  Scenario: login with single user

		Given user navigates to saucedemo
		And enters valid username and password
		And clicks on login button
		Then user should be redirected to homepage
