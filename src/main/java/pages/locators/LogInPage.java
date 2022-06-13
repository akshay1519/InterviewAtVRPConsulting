package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LogInPage {
    @FindBy(id = "marketing")
    public WebElement signupFrame;

    @FindBy(tagName = "a")
    public List<WebElement> homePageLinks;

    @FindBy(id = "username")
    public WebElement useName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Login")
    public WebElement login;

    @FindBy(xpath = "//a[contains(text(),'Remind Me Later')]")
    public WebElement remindLater;

    @FindBy(id = "emc")
    public WebElement otp;
}
