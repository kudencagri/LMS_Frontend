package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends  Parent{
    public LocatorPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "")
    public WebElement first;
}
