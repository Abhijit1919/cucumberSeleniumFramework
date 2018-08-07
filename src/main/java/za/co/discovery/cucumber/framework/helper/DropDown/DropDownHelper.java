
package za.co.discovery.cucumber.framework.helper.DropDown;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import za.co.discovery.cucumber.framework.helper.Logger.LoggerHelper;

import java.util.List;


public class DropDownHelper {

	private WebDriver driver;
	private Logger Log = LoggerHelper.getLogger(DropDownHelper.class);

	public DropDownHelper(WebDriver driver) {
		this.driver = driver;
		Log.debug("DropDownHelper : " + this.driver.hashCode());
	}

	public DropDownHelper() {

	}


	public void SelectUsingVisibleValue(WebElement element,String visibleValue) {
		try{
			Select select = new Select(element);
			select.selectByVisibleText(visibleValue);

		}catch (NoSuchElementException e){

			System.out.println(e.getMessage() + visibleValue);
		}

		Log.info("Locator : " + element + " Value : " + visibleValue);
	}

	public String getSelectedValue(WebElement element) {
		String value = new Select(element).getFirstSelectedOption().getText();
		Log.info("WebELement : " + element + " Value : "+ value);
		return value;
	}

	public void SelectUsingIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		Log.info("Locator : " + element + " Value : " + index);
	}


//	public List<String> getAllDropDownValues(WebElement locator) {
////		Select select = new Select(locator);
////		List<WebElement> elementList = select.getOptions();
////		List<String> valueList = new LinkedList<String>();
////
////		for (WebElement element : elementList) {
////			Log.info(element.getText());
////			valueList.add(element.getText());
////		}
////		return valueList;
////	}


	public List<String> getAllDropDownValue(WebElement element, String value){

		try{

			List<WebElement> allValues = (List<WebElement>) element;

			for(int i = 0 ; i< allValues.size();i++)
			{
				WebElement element1 = allValues.get(1);
				String innerhtml = element1.getAttribute("innerHTML");

				if(innerhtml.contentEquals(value)){
					element1.click();
					break;
				}
			}

		}catch(NoSuchElementException e){
			System.out.println(e.getMessage());

		}
		return null;
	}


}
