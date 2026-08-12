package steps;

import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends BaseTest {

	@Given("user navigates to saucedemo")
	public void user_navigates_to_saucedemo() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("enters valid username and password")
	public void enters_valid_username_and_password() {
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("tried to login");
	}

	@Then("user should be redirected to homepage")
	public void user_should_be_redirected_to_homepage() {
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Redirection failed!");
	}
}