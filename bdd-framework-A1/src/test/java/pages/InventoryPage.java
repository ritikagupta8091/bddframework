package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
