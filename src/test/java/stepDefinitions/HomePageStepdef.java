package stepDefinitions;

import PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class HomePageStepdef {
    public WebDriver driver;
    HomePage homePage;


    public HomePageStepdef() {
        driver = WebdriverBase.driver;
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Given ( "^I open QAWorks website$" )
    public void iOpenWebsite() {
        driver.get(WebdriverBase.URL);
        assertEquals( driver.getTitle(), "Home Page - QAWorks");

    }

    @When ( "^I click on contact tab" )
    public void iClickOnContactButton() {
        homePage.contactTab.click();
        assertEquals( driver.getTitle(), "Contact Us - QAWorks");
    }


}