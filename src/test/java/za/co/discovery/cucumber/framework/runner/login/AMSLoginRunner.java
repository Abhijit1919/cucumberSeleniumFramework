package za.co.discovery.cucumber.framework.runner.login;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import za.co.discovery.cucumber.framework.managers.FileReaderManager;

import java.io.File;

@CucumberOptions(features = {"classpath:featurefile/login/AMS_Login.feature","classpath:featurefile/login/AMS_Nagithion_To_MyDetails.feature"
		},
		glue = {
		"classpath:za.co.discovery.cucumber.framework.stepdefinition",
		"classpath:za.co.discovery.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report","za.co.discovery.cucumber.framework.listener.ExtentCucumberFormatter:target/cucumber-extend-reports/ExtenreportGenrate.html"})
public class AMSLoginRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport(){
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));


		//Driver.Instance.quit();
	}

}
