package za.co.discovery.cucumber.framework.runner.productCategory;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/productCategory/TestProductsCountBasedOnColor.feature" }, glue = {
		"classpath:za.co.discovery.cucumber.framework.stepdefinition",
		"classpath:za.co.discovery.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report","za.co.discovery.cucumber.framework.listener:target.cucumber-extend-reports/ExtenreportGenrate.html"})
public class TestProductsCountBasedOnColorRunner extends AbstractTestNGCucumberTests {

}
