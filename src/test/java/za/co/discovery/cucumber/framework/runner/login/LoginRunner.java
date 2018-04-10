package za.co.discovery.cucumber.framework.runner.login;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/login/AMS_Login.feature" }, glue = {
		"classpath:za.co.discovery.cucumber.framework.stepdefinition",
		"classpath:za.co.discovery.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class LoginRunner extends AbstractTestNGCucumberTests {

}
