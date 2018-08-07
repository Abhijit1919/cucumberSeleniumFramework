package za.co.discovery.cucumber.framework.helper.Hook;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import za.co.discovery.cucumber.framework.PageObject.LoginPage;
import za.co.discovery.cucumber.framework.helper.Excel.GetDataFromExcel;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;
import za.co.discovery.cucumber.framework.helper.Wait.WaitHelper;

import java.util.ArrayList;
import java.util.List;

public class HookEnterEvent {

    WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(LoginPage.class);
    WaitHelper waitHelper;
    public void enterEvent(String action,String inputValue){
        String TYPE = "", identifier  = "";
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
        String operationName = getDataFromExcel.getEventData(action);
        String[] operator = operationName.split("%");
        TYPE = operator[0];
        identifier = operator[2];

        switch (operator[1]){

            case "enter":
                if (TYPE.equals("id")){
                    WebElement webElement = getWebElementid(TestBase.driver, identifier);
                            //getWebElement(TestBase.driver, identifier);
                    if(webElement != null && webElement.isDisplayed()){

                        //WebElement value1 = webElement;
                        webElement.sendKeys(inputValue);


                    }else{
                        List<WebElement> webElements = getIframeWebElement(TestBase.driver, "iframe");
                        int iFrameList = webElements.size();


                        for (int i = 0; i<iFrameList; i++){
                            WebDriver webDriver = TestBase.driver.switchTo().frame(i);
                            webElement = getWebElementid(TestBase.driver,identifier);
                            if (webElement != null && webElement.isDisplayed()){

                                webElement.sendKeys(inputValue);

                                break;
                            }
                            webDriver.switchTo().defaultContent();
                        }

                    }


                }else if (TYPE.equals("xpath")){

                    WebElement webElement = getWebElementxpath(TestBase.driver,identifier);
                    //getWebElement(TestBase.driver, identifier);
                    if(webElement != null && webElement.isDisplayed()){

                        webElement.sendKeys(inputValue);


                    }else{
                        List<WebElement> webElements = getIframeWebElement(TestBase.driver, "iframe");
                        int iFrameList = webElements.size();

                        //DropDownHelper dropDownHelper = new DropDownHelper();
                        for (int i = 0; i<iFrameList; i++){
                            WebDriver webDriver = TestBase.driver.switchTo().frame(i);
                            webElement = getWebElementxpath(TestBase.driver,identifier);
                            if (webElement != null && webElement.isDisplayed()){

                                webElement.sendKeys(inputValue);
                                break;
                            }
                            webDriver.switchTo().defaultContent();
                        }

                    }

                }else if(TYPE.equals("text")) {
                    TestBase.driver.findElement(By.linkText(identifier)).sendKeys(inputValue);
                }else if(TYPE.equals("name")) {
                    TestBase.driver.findElement(By.name(identifier)).sendKeys(inputValue);
                }
                break;
        }


    }



    private List<WebElement> getIframeWebElement(WebDriver driver, String identifier) {
        List<WebElement> webElements = new ArrayList<>();
        try{
            WebElement webElement = driver.findElement(By.tagName(identifier));
            webElements.add(webElement);
        }catch(NoSuchElementException e){
            return webElements;
        }
        return webElements;
    }

    private WebElement getWebElementxpath(WebDriver driver, String identifier) {
        WebElement webElement = null;
        try{
            webElement = driver.findElement(By.xpath(identifier));
        }catch(NoSuchElementException e){
            return webElement;
        }
        return webElement;
    }

    private WebElement getWebElementid(WebDriver driver, String identifier) {
        WebElement webElement = null;
        try{
            webElement = driver.findElement(By.id(identifier));
        }catch(NoSuchElementException e){
            return webElement;
        }
        return webElement;
    }


}
