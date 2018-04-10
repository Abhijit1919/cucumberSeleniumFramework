package za.co.discovery.cucumber.framework.stepdefinition.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;
import za.co.discovery.cucumber.framework.PageObject.DiscoveryLoginPage;
import za.co.discovery.cucumber.framework.configreader.ObjectRepo;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;

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
        // Write code here that turns the phrase above into concrete actions
        //loginpage= new LoginPage(TestBase.driver);
        //discoveryLoginPage = new DiscoveryLoginPage(TestBase.driver);
            discoveryLoginPage.clickEventHandler(action);
            log.info("Click Action perfrom on....." + (action).trim());
        Thread.sleep(10000);
        //loginpage.clickEventHandler(action);


    }

    @And("^User should be able to click on \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void userShouldBeAbleToClickOnAndEnter(String enterAtion, String userDetails) throws Throwable {
       discoveryLoginPage.enterEventHandler(enterAtion,userDetails);
        log.info("Click Action perfrom on....." + enterAtion);
        //Thread.sleep(10000);
        // Write code here that turns the phrase above into concrete actions

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


}


