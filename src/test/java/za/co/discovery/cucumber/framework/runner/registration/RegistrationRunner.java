package za.co.discovery.cucumber.framework.runner.registration;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import za.co.discovery.cucumber.framework.listener.Reporter;
import za.co.discovery.cucumber.framework.managers.FileReaderManager;

import java.io.File;

@CucumberOptions(features = { "classpath:featurefile/registration/Registration.feature" },
        glue = {"classpath:za.co.discovery.cucumber.framework.stepdefinition", "classpath:za.co.discovery.cucumber.framework.helper" },
        plugin = {"html:target/cucumber-html-report","za.co.discovery.cucumber.framework.listener:target.cucumber-extend-reports/ExtenreportGenrate.html"})

public class RegistrationRunner  extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport(){
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));


		//Driver.Instance.quit();
	}


}
