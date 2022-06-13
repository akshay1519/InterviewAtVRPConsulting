package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordSetUpPage {
    @FindBy(id = "newpassword")
    public WebElement newPassword;

    @FindBy(id = "confirmpassword")
    public WebElement confirmpassword;

    @FindBy(id = "question")
    public WebElement seqQueDropdown;

    @FindBy(id = "answer")
    public WebElement secQueAns;

    @FindBy(id = "password-button")
    public WebElement submitPass;

    @FindBy(id = "emc")
    public WebElement otp;

    @FindBy(id = "save")
    public WebElement verify;
}
