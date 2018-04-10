//---------This Method help to verify all page title
//---------Pass page title from excelsheet
//--Author:- Abhijit Totewar
//-- 22-03-2018

package za.co.discovery.cucumber.framework.helper.Hook;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import za.co.discovery.cucumber.framework.PageObject.LoginPage;
import za.co.discovery.cucumber.framework.helper.Excel.GetDataFromExcel;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;
import za.co.discovery.cucumber.framework.helper.TestBase.TestBase;
import za.co.discovery.cucumber.framework.helper.Wait.WaitHelper;

public class HookVerifyPageTitle {
    WebDriver driver;

    private final Logger log = LoggerHelper.getLogger(LoginPage.class);
    WaitHelper waitHelper;

    public boolean verifyPageTitle(String action) {

        String TYPE = "", identifier = "" , operation = "";
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();
        String operationName = getDataFromExcel.getEventData(action);
        String[] operator = operationName.split("%");
        TYPE = operator[0];
        identifier = operator[2];
        operation = operator[1];

    if (TYPE.equals("pageTitle")){
        if (identifier.equals(TestBase.driver.getTitle())) {
            log.info("Page Title as expected..");
            return true;
        }
        else{
            log.info("Page Title is missing in excel");
            return false;
        }
    }
        else{
        log.info("Please check pageTitle Spelling in excel, It should be pageTitle");

        }
        return false;
    }

}




