package za.co.discovery.cucumber.framework.stepdefinition.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import za.co.discovery.cucumber.framework.PageObject.DiscoveryLoginPage;
import za.co.discovery.cucumber.framework.configreader.ObjectRepo;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;
import za.co.discovery.cucumber.framework.helper.genericHelper.OtpGenerator;

public class LoginToDiscoveryWebSite {

    private final Logger log = LoggerHelper.getLogger(LoginToAutomationPractices.class);
    //LoginPage loginpage = new LoginPage(TestBase.driver);
    DiscoveryLoginPage discoveryLoginPage;

//    @Given("^navigate to application$")
//    public void navigate_to_application() throws Throwable {
//        //TestBase.driver.get("https://newtestwww.discsrv.co.za/portal/");
////        TestBase.driver.get(ObjectRepo.reader.getWebsite());
////        discoveryLoginPage = new DiscoveryLoginPage(TestBase.driver);
////        log.info("Website open");
//    }

    @Given("^navigate to application \"([^\"]*)\"$")
    public void navigateToApplication(String webSite) throws Throwable {

        TestBase.driver.get(ObjectRepo.reader.getWebsite(webSite));
        //discoveryLoginPage.typeOfWebSite(webSite);
        discoveryLoginPage = new DiscoveryLoginPage(TestBase.driver);
        //discoveryLoginPage.typeOfWebSite(webSite);
        log.info("Website open");

    }

    @And("^User Should able to click on \"([^\"]*)\"$")
    public void userShouldAbleToClickOn(String action) throws Throwable {

            discoveryLoginPage.clickEventHandler(action);
            log.info("Click Action perfrom on....." + (action).trim());
        Thread.sleep(10000);
        //loginpage.clickEventHandler(action);


    }

    @And("^User should be able to click on \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void userShouldBeAbleToClickOnAndEnter(String enterAtion, String userDetails) throws Throwable {
       discoveryLoginPage.enterEventHandler(enterAtion,userDetails);
        log.info("Click Action perfrom on....." + enterAtion);
   

    }

    @Then("^Verify user Login successfully$")
    public void verifyUserLoginSuccessfully() throws Throwable {
        if(discoveryLoginPage.verifySuccessLoginMessage()){
            log.info("login test is pass");
        }
        else{
            Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
        }
    }


    @Then("^User should successfully naviget to Manage your health plan$")
    public void userShouldSuccessfullyNavigetToManageYourHealthPlan() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        if(discoveryLoginPage.verifyNavigationMessage()){
//            log.info("login test is pass");
//        }
//        else{
//            Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
//        }
    }

    @Then("^Verify Header \"([^\"]*)\"$")
    public void verifyHeader(String header) throws Throwable {

            if(discoveryLoginPage.verifyHeader(header)){
                log.info("login test is pass");
            }
            else{
                Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
            }

    }

    @Then("^Verify Page Title \"([^\"]*)\"$")
    public void verifyPageTitle(String pageTitle) throws Throwable {

                if(discoveryLoginPage.verifyPageTitle(pageTitle)){
            log.info("page Title Matching");
        }
        else{
            Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
        }
    }



    @And("^Enter OTP on \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void enterOTPOnAndEnter(String arg0, String entityNo) throws Throwable {

        OtpGenerator otpGenrater = new OtpGenerator ();
        String result = otpGenrater.otpURL(entityNo);
        discoveryLoginPage.enterEventHandler(arg0,result);

        System.out.println(result);
    }

    @And("^User Should able genrate OTP Number \"([^\"]*)\"$")
    public void userShouldAbleGenrateOTPNumber(String entityNo) throws Throwable {

        OtpGenerator  otpGenrater = new OtpGenerator ();
        String result = otpGenrater.otpURL(entityNo);

        System.out.println(result);
    }

    @And("^User Should be able to select value from dropdown \"([^\"]*)\"$")
    public void userShouldBeAbleToSelectValueFromDropdown(String arg0) throws Throwable {

        discoveryLoginPage.dropDownEventHandler(arg0);
        log.info("Click Action perfrom on....." + arg0);

    }

    @Then("^Verify text \"([^\"]*)\"$")
    public void verifyText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Alert alert =  TestBase.driver.switchTo().alert();
        System.out.println(alert.getText());
    }

    @Then("^Verify \"([^\"]*)\" text \"([^\"]*)\"$")
    public void verifyText(String arg0, String arg1) throws Throwable {

        if (discoveryLoginPage.verifyTextEventHandler(arg0, arg1)) {
            log.info("login test is pass");
        } else {
            Assert.assertTrue(false, this.getClass().getSimpleName() + " is fail");
        }
    }

    @And("^User should be able to update \"([^\"]*)\" and select \"([^\"]*)\" from the dropdown$")
    public void userShouldBeAbleToUpdateAndSelectFromTheDropdown(String arg0, String arg1) throws Throwable {
        discoveryLoginPage.dropDownSelectSpecifiValue(arg0, arg1);
    }

    @And("^scroll down$")
    public void scrollDown() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)TestBase.driver;
        jse.executeScript("window.scrollBy(0,250)", "");

//        TestBase.driver.switchTo().frame("appIFrameObj");
//
//        //TestBase.driver.findElement(By.id("dams-category-select")).click();
//        WebElement value1 = TestBase.driver.findElement(By.id("dams-category-select"));
//                               Select selectvalue1 = new Select(value1);
//                               selectvalue1.selectByIndex(2);
//                               selectvalue1.selectByVisibleText("International Address");
//        TestBase.driver.switchTo().defaultContent();
    }
}


