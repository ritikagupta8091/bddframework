package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
					features = "src/test/resources/features",
					glue = {"steps","hooks"},
					plugin = { 
							"pretty",  // console will be beautiful
							"html:target/cucumberhtml.html",  // gen rep in html
							"json:target/cucumberjson.json"  // gen rep in json
							}
		
				)
public class TestRunner extends AbstractTestNGCucumberTests {}
