package za.co.discovery.cucumber.framework.runner.login;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import za.co.discovery.cucumber.framework.managers.FileReaderManager;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@CucumberOptions(features = {"classpath:featurefile/login/Malcore_Login.feature"
//		,"classpath:featurefile/login/AMS_Nagithion_To_MyDetails.feature"
		},
		glue = {
		"classpath:za.co.discovery.cucumber.framework.stepdefinition",
		"classpath:za.co.discovery.cucumber.framework.helper" },
		plugin = {"za.co.discovery.cucumber.framework.listener.ExtentCucumberFormatter:"}
		//plugin = {"html:target/cucumber-html-report","za.co.discovery.cucumber.framework.listener.ExtentCucumberFormatter:target/cucumber-extend-reports/ExtenreportGenrate.html"}
		)
public class MalcoreLoginRunner extends AbstractTestNGCucumberTests {


	@BeforeClass
	public static void setup() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd HH mm ss");
		LocalDateTime now = LocalDateTime.now();
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("C:/Users/abhijit1/Documents/output/Malcor_"+String.valueOf(dtf.format(now))+".html");
//		extentProperties.setExtentXServerUrl("http://localhost:1337");
//		extentProperties.setProjectName("MyProject");
	}
	@AfterClass
	public static void writeExtentReport(){
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));


		//Driver.Instance.quit();
	}

}
