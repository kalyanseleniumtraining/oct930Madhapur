package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "Features", //feature files folder name should be given here
glue = "stepDefinitions", //the code corresponding to the feature file
//should be given here
plugin = { "pretty", "html:target/cucumber-reports" },//the report format
monochrome = true)//sometimes console output will get symbols
//and very hard to read to remove those symbols we use this option

public class TestRunner {

}
