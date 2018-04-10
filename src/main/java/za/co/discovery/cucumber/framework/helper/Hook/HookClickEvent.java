package za.co.discovery.cucumber.framework.helper.Hook;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import za.co.discovery.cucumber.framework.PageObject.LoginPage;
import za.co.discovery.cucumber.framework.helper.Excel.GetDataFromExcel;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;
import za.co.discovery.cucumber.framework.helper.Wait.WaitHelper;

public class HookClickEvent {
    WebDriver driver;

    private final Logger log = LoggerHelper.getLogger(LoginPage.class);
    WaitHelper waitHelper;

    public void clickEvent(String action){
            String TYPE = "", identifier  = "";
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
        String operationName = getDataFromExcel.getEventData(action);
        String[] operator = operationName.split("%");
        TYPE = operator[0];
        identifier = operator[2];

        switch (operator[1]){
            case "click":
                if (TYPE.equals("id")){
                    //TestBase.driver.findElement(By.id(identifier)).click();
                    TestBase.driver.findElement(By.id(identifier)).click();
                }else if (TYPE.equals("xpath")){
                    TestBase.driver.findElement(By.xpath(identifier)).click();
                }else if(TYPE.equals("text")) {
                    TestBase.driver.findElement(By.linkText(identifier)).click();
                }else if(TYPE.equals("name")) {
                    TestBase.driver.findElement(By.name(identifier)).click();

                }
                break;
            case "enter":
        }

    }
}
