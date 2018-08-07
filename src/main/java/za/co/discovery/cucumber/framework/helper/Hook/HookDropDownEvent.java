package za.co.discovery.cucumber.framework.helper.Hook;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import za.co.discovery.cucumber.framework.PageObject.LoginPage;
import za.co.discovery.cucumber.framework.helper.DropDown.DropDownHelper;
import za.co.discovery.cucumber.framework.helper.Excel.GetDataFromExcel;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;
import za.co.discovery.cucumber.framework.helper.Wait.WaitHelper;

public class HookDropDownEvent {
    WebDriver driver;

    private final Logger log = LoggerHelper.getLogger(LoginPage.class);
    WaitHelper waitHelper;

    public void dropDownSelectEvent(String action){
            String TYPE = "", identifier  = "";
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
        String operationName = getDataFromExcel.getEventData(action);
        String[] operator = operationName.split("%");
        TYPE = operator[0];
        identifier = operator[2];

        switch (operator[1].toUpperCase()){
            case "SELECT":
                if (TYPE.equals("id")){

                    WebElement dropdownIdentifier = TestBase.driver.findElement(By.id(identifier));
                    DropDownHelper dropDownHelper = new DropDownHelper();
                    dropDownHelper.SelectUsingIndex(dropdownIdentifier,1);

                }else if (TYPE.equals("xpath")){
                    WebElement dropdownIdentifier = TestBase.driver.findElement(By.xpath(identifier));
                    DropDownHelper dropDownHelper = new DropDownHelper();
                    dropDownHelper.getSelectedValue(dropdownIdentifier);

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
