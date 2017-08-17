package stepDefinitions;

import PageObject.ContactPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ContactPageStepdef {
    public WebDriver driver;
    ContactPage contactPage;


    public ContactPageStepdef() {

        driver = WebdriverBase.driver;
        contactPage = PageFactory.initElements(driver, ContactPage.class);
    }

    @When ( "^I am presented with a form to submit the enquiry" )
    public void requiredFieldsOnContactPage() {
        assertTrue(contactPage.header.getText().contains("Contact"));
        assertTrue(contactPage.header.isDisplayed());
        assertTrue(contactPage.contactForm.getText().contains("Send us a message"));
        assertTrue(contactPage.contactForm.isDisplayed());
        assertTrue(contactPage.nameText.getText().contains("Name"));
        assertTrue(contactPage.nameText.isDisplayed());
        assertEquals(contactPage.emailText.getText(), "Email");
        assertTrue(contactPage.emailText.isDisplayed());
        assertEquals(contactPage.messageText.getText(), "Message");
        assertTrue(contactPage.messageText.isDisplayed());
    }

    @And ( "^I enter name as \"([^\"]*)\"$" )
    public void iEnterNameAs(String name) throws Throwable {
        contactPage.name.sendKeys(name);
    }

    @And ( "^I enter email as \"([^\"]*)\"$" )
    public void iEnterEmailAs(String email) throws Throwable {
        contactPage.email.sendKeys(email);

    }

    @And ( "^I enter message as \"([^\"]*)\"$" )
    public void iEnterMessageAs(String message) throws Throwable {
        contactPage.message.sendKeys(message);

    }

    @And ( "^I click on send button$" )
    public void iClickOnSendButton() throws Throwable {
        contactPage.submit.submit();

    }

    @And ( "^I am presented with validation errors$" )
    public void iAmPresentedWithValidationErrors() throws Throwable {
        contactPage.emptyEailError.isDisplayed();
        contactPage.emptyNameError.isDisplayed();
        contactPage.emptyMessageError.isDisplayed();

        assertEquals(contactPage.emptyEailError.getText(), "An Email address is required");
        assertEquals(contactPage.emptyNameError.getText(), "Your name is required");
        assertEquals(contactPage.emptyMessageError.getText(), "Please type your message");
    }
}