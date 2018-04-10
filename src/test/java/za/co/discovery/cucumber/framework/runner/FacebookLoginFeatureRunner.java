package za.co.discovery.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/FacebookLogin.feature" }, glue = {
		"classpath:za.co.discovery.cucumber.framework.stepdefinition",
		"classpath:za.co.discovery.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class FacebookLoginFeatureRunner extends AbstractTestNGCucumberTests {

}
