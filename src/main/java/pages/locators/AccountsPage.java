package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountsPage {

    @FindBy(xpath = "//a[@title='Accounts']")
    public WebElement accountsLink;

    @FindBy(xpath = "//div[@title='New']")
    public WebElement newAcc;

    @FindBy(css = ".modal-body")
    public WebElement newAccPopupModel;

    @FindBy(xpath = "//h2[contains(text(),'New Account')]")
    public WebElement newAccPopup;

    @FindBy(xpath = "//div/label/span[text()='Account Name']/../following::input[1]")
    public WebElement accountName;

    @FindBy(xpath = "//span[contains(text(),'Parent Account')]/parent::label/following::div")
    public WebElement parentCompany;

    @FindBy(xpath = "//div/label/span[text()='Phone']/../following::input[1]")
    public WebElement phone;


    @FindBy(xpath = "//div/label/span[text()='Website']/../following::input[1]")
    public WebElement website;

    @FindBy(xpath = "//div/span/span[text()='Type']/../following::a[1]")
    public WebElement type;

    @FindBy(xpath = "//style[@id='salesforce-global-nav-branding']/following::div/child::div/child::ul/child::li/child::a")
    public List<WebElement> roleType;

    @FindBy(xpath = "//div/span/span[text()='Industry']/../following::a[1]")
    public WebElement industry;

    @FindBy(xpath = "//a[text()='Agriculture']/ancestor::ul/child::li")
    public List<WebElement> industryType;

    @FindBy(css = ".uiInputSmartNumber")
    public WebElement employee;

    @FindBy(xpath = "//div/label/span[text()='Description']/../following::textarea[1]")
    public WebElement description;

    @FindBy(xpath = "//label/span[text()='Billing Street']/../following::textarea")
    public WebElement billingStreet;

    @FindBy(xpath = "//label/span[text()='Shipping Street']/../following::textarea")
    public WebElement shoppingStreet;

    @FindBy(xpath = "//input[@placeholder=\"Billing City\"]")
    public WebElement billingCity;

    @FindBy(xpath = "//input[@placeholder=\"Billing State/Province\"]")
    public WebElement billingState;

    @FindBy(xpath = "//input[@placeholder=\"Shipping City\"]")
    public WebElement shippingCity;

    @FindBy(xpath = "//input[@placeholder=\"Shipping State/Province\"]")
    public WebElement shippingState;

    @FindBy(css = ".postalCode")
    public WebElement billingPostCode;

    @FindBy(css = ".country")
    public WebElement billingCountry;

    @FindBy(xpath = "//input[@placeholder=\"Shipping Zip/Postal Code\"]")
    public WebElement shippingPostCode;

    @FindBy(xpath = "//input[@placeholder=\"Shipping Country\"]")
    public WebElement shippingCountry;

    @FindBy(css = "button[title=\"Save\"]")
    public WebElement save;

    @FindBy(xpath = "//span[contains(@class,'toastMessage')]")
    public WebElement toastMsg;

    @FindBy(xpath = "//button[@name='Edit']")
    public WebElement edit;

}
