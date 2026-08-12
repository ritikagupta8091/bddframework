
package steps;

import io.cucumber.java.en.Then;

public class AddToCartSteps {

	@Then("user should add some product to cart")
	public void user_should_add_some_product_to_cart() {
		System.out.println("added to cart");
	}

}
