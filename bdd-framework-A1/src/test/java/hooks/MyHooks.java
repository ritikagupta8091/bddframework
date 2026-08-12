package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks extends BaseTest{
	@Before
	public void beforeScenario() {
		setUp();
	}
	
	@After
    public void tearDown(Scenario scenario) {		
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            
            
            byte[] ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(ss, "image/png", screenshotName);
        }
        
        tearDown();
	}
}
