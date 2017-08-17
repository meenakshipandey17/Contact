package stepDefinitions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
public class WebdriverBase
{
 static WebDriver driver;
 static String URL ="http://www.qaworks.com/";

@Before
public void openBrowser() throws MalformedURLException {
    driver = new FirefoxDriver();
    driver.manage().deleteAllCookies();
}

@After
public void quitBrowser() {
    driver.quit();
}
}