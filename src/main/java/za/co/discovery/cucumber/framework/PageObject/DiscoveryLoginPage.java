package za.co.discovery.cucumber.framework.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import za.co.discovery.cucumber.framework.helper.Hook.*;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.Wait.WaitHelper;
import za.co.discovery.cucumber.framework.helper.genericHelper.GenericHelper;

public class DiscoveryLoginPage {

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(DiscoveryLoginPage.class);
    WaitHelper waitHelper;

    @FindBy(xpath="//*[@id='js-login-btn']")
    WebElement loginButton;

    @FindBy(xpath="//*[@id='controlTestFlag']/div[1]/div/div/div[1]/h3[12]")
    WebElement yourHealthPlan;

    @FindBy(xpath="//*[@id='controlTestFlag']/div[1]/div/div/div[1]/h3[12]")
    WebElement yourHealthPlanDetails;


    public DiscoveryLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
       // waitHelper.waitForElement(driver, loginButton, ObjectRepo.reader.getExplicitWait());
    }

    public void clickEventHandler(String action){


        HookClickEvent hookClickEvent = new HookClickEvent();
        hookClickEvent.clickEvent(action);

    }

    public void dropDownEventHandler(String action){


        HookDropDownEvent dropDownEvent = new HookDropDownEvent();
        dropDownEvent.dropDownSelectEvent(action);


    }
    public void dropDownSelectSpecifiValue(String action, String value){


        HookDropDownSpecificValue hookDropDownSpecificValue = new HookDropDownSpecificValue();
        hookDropDownSpecificValue.dropDownSelectValue(action,value);


    }





    public boolean verifySuccessLoginMessage(){
        return new GenericHelper().isDisplayed(yourHealthPlan);
    }

    public boolean verifyMessage(){

        return new GenericHelper().isDisplayed(yourHealthPlanDetails);
    }

    public boolean verifyHeader(String header){


        HookVerifyHeader hookVerifyHeader = new HookVerifyHeader();
        return hookVerifyHeader.verifHeader(header);
    }



    public boolean verifyPageTitle(String pageTitle){
        HookVerifyPageTitle hookVerifyPageTitle = new HookVerifyPageTitle();
        return hookVerifyPageTitle.verifyPageTitle(pageTitle);
    }


    public void enterEventHandler(String action,String inputValue){


        HookEnterEvent hookEnterEvent = new HookEnterEvent();
        hookEnterEvent.enterEvent(action,inputValue);
    }

    public void typeOfWebSite(String webSite){
        HookOpenWebSite hookOpenWebSite = new HookOpenWebSite();
        hookOpenWebSite.openWebSite(webSite);

    }

    public boolean verifyTextEventHandler(String action,String text){


        HookVerifyText hookVerifyText = new HookVerifyText();
        return hookVerifyText.verifyText(action,text);
    }




}
