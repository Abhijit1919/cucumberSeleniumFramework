package za.co.discovery.cucumber.framework.configreader;

import za.co.discovery.cucumber.framework.configuration.browser.BrowserType;

public interface ConfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite(String WebSiteName);
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}
