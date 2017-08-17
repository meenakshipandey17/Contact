package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class ContactPage {

   @FindBy (id = "ContactHead")
   public WebElement header;

   @FindBy (id = "ContactForm")
   public WebElement contactForm;

   @FindBy (id = "ContactNameBox")
   public WebElement nameText;

    @FindBy (id = "ctl00_MainContent_NameBox")
    public WebElement name;

   @FindBy (id = "ContactEmailBox")
   public WebElement emailText;

    @FindBy (id = "ctl00_MainContent_EmailBox")
    public WebElement email;

   @FindBy (id = "ContactMessageBox")
   public WebElement messageText;

    @FindBy (id = "ctl00_MainContent_MessageBox")
    public WebElement message;

   @FindBy (className = "SendButton")
   public WebElement submit;

    @FindBy (id = "ctl00_MainContent_rfvName")
    public WebElement emptyNameError;

    @FindBy (id = "ctl00_MainContent_rfvEmailAddress")
    public WebElement emptyEailError;

    @FindBy (id = "ctl00_MainContent_rfvMessage")
    public WebElement emptyMessageError;




}



