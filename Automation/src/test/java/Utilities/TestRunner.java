package Utilities;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:/Feature" }, glue = {"StepDef", "hooks" }, monochrome = true, plugin = {
		"pretty", "html:target/cucumber-html-report" }, tags = "@tag1")

public class TestRunner extends AbstractTestNGCucumberTests {

}
