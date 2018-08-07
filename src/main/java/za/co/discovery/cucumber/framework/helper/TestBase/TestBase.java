package za.co.discovery.cucumber.framework.helper.TestBase;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.discovery.cucumber.framework.configreader.ObjectRepo;
import za.co.discovery.cucumber.framework.configreader.PropertyFileReader;
import za.co.discovery.cucumber.framework.configuration.browser.*;
import za.co.discovery.cucumber.framework.helper.Excel.GetDataFromExcel;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TrasnferFiles.TransferFiles;
import za.co.discovery.cucumber.framework.listener.Reporter;
import za.co.discovery.cucumber.framework.utility.DateTimeHelper;
import za.co.discovery.cucumber.framework.utility.ResourceHelper;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static za.co.discovery.cucumber.framework.listener.Reporter.addScreenCaptureFromPath;


/**
 * 
 * @author bsingh5
 *
 */
	public class TestBase {

		private final Logger log = LoggerHelper.getLogger(TestBase.class);

	
	public static WebDriver driver;

	public void waitForElement(WebElement element, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(ElementNotFoundException.class);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.until(elementLocated(element));
	}

	private Function<WebDriver, Boolean> elementLocated(final WebElement element) {
		return new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {
				log.debug("Waiting for Element : " + element);
				return element.isDisplayed();
			}
		};
	}

	public String takeScreenShot(String name) throws IOException {

		if (driver instanceof HtmlUnitDriver) {
			log.fatal("HtmlUnitDriver Cannot take the ScreenShot");
			return "";
		}

		File destDir = new File(ResourceHelper.getResourcePath("screenshots/") + DateTimeHelper.getCurrentDate());
		if (!destDir.exists())
			destDir.mkdir();

		File destPath = new File(destDir.getAbsolutePath() + System.getProperty("file.separator") + name + ".jpg");
		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), destPath);
		} catch (IOException e) {
			log.error(e);
			throw e;
		}
		log.info(destPath.getAbsolutePath());
		return destPath.getAbsolutePath();
	}

	public WebElement getElement(By locator) {
		log.info(locator);
		if (IsElementPresentQuick(locator))
			return driver.findElement(locator);

		try {
			throw new NoSuchElementException("Element Not Found : " + locator);
		} catch (RuntimeException re) {
			log.error(re);
			throw re;
		}
	}

	/**
	 * Check for element is present based on locator If the element is present
	 * return the web element otherwise null
	 * 
	 * @param locator
	 * @return WebElement or null
	 */

	public WebElement getElementWithNull(By locator) {
		log.info(locator);
		try {
			return driver.findElement(locator);
		} catch (NoSuchElementException e) {
			// Ignore
		}
		return null;
	}

	public boolean IsElementPresentQuick(By locator) {
		boolean flag = driver.findElements(locator).size() >= 1;
		log.info(flag);
		return flag;
	}

	public WebDriver getBrowserObject(BrowserType bType) throws Exception {
		try {
			log.info(bType);

			switch (bType) {

			case Chrome:
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				return chrome.getChromeDriver(chrome.getChromeCapabilities());

			case Firefox:
				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
				return firefox.getFirefoxDriver(firefox.getFirefoxCapabilities());

			case HtmlUnitDriver:
				HtmlUnitBrowser htmlUnit = HtmlUnitBrowser.class.newInstance();
				return htmlUnit.getHtmlUnitDriver(htmlUnit.getHtmlUnitDriverCapabilities());

			case Iexplorer:
				IExploreBrowser iExplore = IExploreBrowser.class.newInstance();
				return iExplore.getIExplorerDriver(iExplore.getIExplorerCapabilities());
			default:
				throw new Exception(" Driver Not Found : " + new PropertyFileReader().getBrowser());
			}
		} catch (Exception e) {
			log.equals(e);
			throw e;
		}
	}
	
	public void setUpDriver(BrowserType bType) throws Exception {
		
		driver = getBrowserObject(bType);
		log.debug("InitializeWebDrive : " + driver.hashCode());
		driver.manage().timeouts().pageLoadTimeout(ObjectRepo.reader.getPageLoadTimeOut(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ObjectRepo.reader.getImplicitWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before
	public void before() throws Exception {
		Reporter.assignAuthor("WebSite Automatiopn QA- Abhijit Totewar");

		readinfExcelInBefore();

		ObjectRepo.reader = new PropertyFileReader();
		setUpDriver(ObjectRepo.reader.getBrowser());
		log.info(ObjectRepo.reader.getBrowser());
	}

	@After(order = 1)
	public void after(Scenario scenario) throws Exception {

		TransferFiles files = new TransferFiles();
		String buildPath;
		String finalFile;

        if (scenario.isFailed()) {
			Random r = new Random();
			int Low = 100000;
			int High = 999999;
			int random = r.nextInt(High - Low) + Low;

            String screenshotName = scenario.getName().replaceAll(" ", "_") + "_" + String.valueOf(random);
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));

                InetAddress addr;
                addr = InetAddress.getLocalHost();

                buildPath = String.valueOf(sourcePath).replaceAll("C:", addr.getHostName());
                finalFile = "//" + buildPath.replaceAll("\\\\", "/");

                files.transferFiles(finalFile,screenshotName,"png");

                //This attach the specified screenshot to the test
                addScreenCaptureFromPath("//DHTQTP01/MobileScreenShots/" + screenshotName + ".png");
            } catch (IOException e) {
                // e.printStackTrace();
            }
        }


        //-------------code imp--------------
//        if (scenario.isFailed()) {
//            String screenshotName = scenario.getName().replaceAll("", "_");
//            try {
//                File sourcePath = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
//
////				Thread.sleep(3000);
//                File desstinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-extend-reports/screenshots/");
//
//                if(!desstinationPath.exists()){
//                    desstinationPath.mkdirs();
//                }
//
//                if(sourcePath.isFile() && desstinationPath.isDirectory()){
//
//					Random r = new Random();
//					int Low = 100000;
//					int High = 999999;
//					int random = r.nextInt(High - Low) + Low;
//
//
//
//
//
//					File destinationFile = new File(desstinationPath + "/" +String.valueOf(random)+".png");
//					//File destinationFile = new File(desstinationPath + "/" + screenshotName+"_"+String.valueOf(random)+".png");
//                    if(destinationFile.exists()){
//                        destinationFile.delete();
//						Thread.sleep(5000);
//                        FileUtils.copyFile(sourcePath, destinationFile);
//                    }else{
//						//Thread.sleep(5000);
//
//                        FileUtils.copyFile(sourcePath, destinationFile);
//                    }
//                    Thread.sleep(5000);
//                    //Reporter.addScreenCaptureFromPath(destinationFile.getAbsolutePath());
//                    Reporter.addScreenCaptureFromPath(destinationFile.getAbsolutePath());
//                    //destinationFile.delete();
//					Thread.sleep(2000);
//
//                }
//
//
//            } catch (IOException e) {
//
//            }
			//-------------code imp--------------


        driver.quit();

		//log.info("");
	}

	@After(order = 0)
	public void AfterStep(){
		Reporter.loadXMLConfig(new File("//DHTQTP01/MobileScreenShots/Config_Web/extent-config.xml"));
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("64 Bit", "Windows 10");
        Reporter.setSystemInfo("2.53.0", "Selenium");
        Reporter.setSystemInfo("3.3.9", "Maven");
        Reporter.setSystemInfo("1.8.0_66", "Java Version");
        Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");



	}

	public void readinfExcelInBefore(){
		GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
		List<HashMap<String, String>> operationMap = getDataFromExcel.medicalQuestionsLookup();
		Storage propertyStorage = Storage.getInstance();
		propertyStorage.setPropertyList(operationMap);

	}
}
