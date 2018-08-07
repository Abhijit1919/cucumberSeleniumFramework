package za.co.discovery.cucumber.framework.helper.Excel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import za.co.discovery.cucumber.framework.helper.TestBase.Storage;
import za.co.discovery.cucumber.framework.utility.ExcelReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetDataFromExcel {

    private static final Log LOG = LogFactory.getLog(GetDataFromExcel.class);

    public String returnVal;
    public String nameOfEvent;

    public List medicalQuestionsLookup() {

        List name;
        List operation;
        List typeOfOperation;
        List type;
        List typeIdentifier;


        List myList = new ArrayList();

        try {
            ExcelReader objExl = new ExcelReader("/ScreensInformation.xlsx", "Sheet1");
            name = objExl.getColumnValues(0);
            operation = objExl.getColumnValues(1);
            type = objExl.getColumnValues(2);
            typeIdentifier = objExl.getColumnValues(3);

            for (int i = 0; i < objExl.getLastRowIndex(); i++) {
                HashMap<String, String> operationMap = new HashMap<>();
                operationMap.put("name", name.get(i).toString());
                operationMap.put("operationName", operation.get(i).toString());
                operationMap.put("TYPE", type.get(i).toString());
                operationMap.put("identifier", typeIdentifier.get(i).toString());
                myList.add(i, operationMap);
            }
            Storage.getInstance().setPropertyList(myList);
            LOG.info("(Error) We did not find the name of operation you specified on the excel.");
            return myList;
        } catch (Exception e) {
            //results.setTEST_STEP_DESCRIPTION("(Error) " + e.getMessage());
            LOG.error(e.getStackTrace());
            return null;
        }
    }

    public String getEventData(String nameOfEvent) {

        Storage eventData = Storage.getInstance();
        List<HashMap<String,String>> clickData = eventData.getPropertyList();
        String TYPE = "", operationName = "", identifier = "";
        for(int i = 0 ; i < clickData.size() ; i++) {
            HashMap<String,String> clickDataList = clickData.get(i);
            if (clickDataList.get("name").equals(nameOfEvent)) {
                TYPE = clickDataList.get("TYPE");
                operationName = clickDataList.get("operationName");
                identifier  = clickDataList.get("identifier");
                return TYPE + "%" + operationName +"%" + identifier;

            }
        }

        //return String.valueOf(lists.get("identifier")) + "," + String.valueOf(lists.get("operationName")) + "," + String.valueOf(lists.get("TYPE"));
                //break;
            //return lists.get("identifier").toString() + "," + lists.get("operationName").toString() + "," + lists.get("TYPE").toString();
        return null;

    }
}
