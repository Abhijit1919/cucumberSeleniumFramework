package za.co.discovery.cucumber.framework.helper.TestBase;

import java.util.List;

public class Storage {

    private static volatile Storage instance;

    public static Storage getInstance() {
    if (instance == null) {
       synchronized (Storage.class){
           if(instance == null){
               instance = new Storage();

            }
        }
    }
        return instance;
    }
    private List propertyList;

    public List getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List propertyList) {
        this.propertyList = propertyList;
    }
}
