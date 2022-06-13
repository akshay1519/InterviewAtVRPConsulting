package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmailVarificationPage {

    @FindBy(id = "login-username")
    public WebElement emailId;

    @FindBy(id = "login-signin")
    public WebElement nextButton;

    @FindBy(id = "login-passwd")
    public WebElement pass;

    @FindBy(xpath = "//button[@data-test-id=\"checkbox\"]")
    public WebElement selectAllEmail;

    @FindBy(xpath = "//button[@data-test-id=\"toolbar-delete\"]")
    public WebElement deleteEmail;

    @FindBy(xpath = "//a[contains(text(),'Verify Account')]")
    public WebElement verifyAcc;

    @FindBy(xpath = "//span[contains(text(),'@force.com')]")
    public WebElement userName;

    @FindBy(xpath = "//a[contains(text(),'salesforce.com')]")
    public WebElement loginURL;

    @FindBy(xpath = "//a[@data-test-id='message-list-item']//child::span[@data-test-id='message-subject']")
    public WebElement inboxEmails;

    @FindBy(xpath = "//a[@data-test-id='message-list-item']//child::span[@data-test-id='message-subject']")
    public List<WebElement> emailList;

    @FindBy(xpath = "//div[contains(text(),'Verification Code')]")
    public WebElement OTPCode;

    @FindBy(xpath = "//span[contains(text(),'Inbox')]")
    public WebElement inbox;
}
