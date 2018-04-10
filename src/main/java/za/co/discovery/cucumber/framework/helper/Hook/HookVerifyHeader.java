package za.co.discovery.cucumber.framework.helper.Hook;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import za.co.discovery.cucumber.framework.PageObject.LoginPage;
import za.co.discovery.cucumber.framework.helper.Excel.GetDataFromExcel;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;
import za.co.discovery.cucumber.framework.helper.Wait.WaitHelper;
import za.co.discovery.cucumber.framework.helper.genericHelper.GenericHelper;

public class HookVerifyHeader {
    WebDriver driver;

    private final Logger log = LoggerHelper.getLogger(LoginPage.class);
    WaitHelper waitHelper;

    public boolean verifyHeader(String action) {

        String TYPE = "", identifier = "";
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
        String operationName = getDataFromExcel.getEventData(action);
        String[] operator = operationName.split("%");
        TYPE = operator[0];
        identifier = operator[2];


        switch (operator[1]) {
            case "verify":
                if (TYPE.equals("id")) {
                    new GenericHelper().isDisplayed(TestBase.driver.findElement(By.id(identifier)));
                    //TestBase.driver.findElement(By.id(identifier)).click();
                    //TestBase.driver.findElement(By.id(identifier)).click();
                    return true;
                } else if (TYPE.equals("xpath")) {
                    new GenericHelper().isDisplayed(TestBase.driver.findElement(By.xpath(identifier)));
                    return true;
                } else if (TYPE.equals("text")) {
                    new GenericHelper().isDisplayed(TestBase.driver.findElement(By.linkText(identifier)));
                    return true;
                } else if (TYPE.equals("name")) {
                    new GenericHelper().isDisplayed(TestBase.driver.findElement(By.name(identifier)));
                    return true;
                }

                break;



            //String actionInstration = getDataFromExcel.getEventData()


        }
        return false;
    }
}




