package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public  class HomePage {

    @FindBy (linkText = "Contact")
    public WebElement contactTab;

}



