package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage {

    @FindBy(name = "UserFirstName" )
    public WebElement firstName;

    @FindBy(name = "UserLastName" )
    public WebElement lastName;

    @FindBy(name = "UserTitle" )
    public WebElement jobTitleName;

    @FindBy(css = ".btn-primary")
    public WebElement nextButton;

    @FindBy(name = "CompanyEmployees" )
    public WebElement employeesStrengthDropdown;

    @FindBy(name = "CompanyName" )
    public WebElement companyName;

    @FindBy(name = "CompanyCountry" )
    public WebElement countryDropdown;

    @FindBy(name = "UserPhone" )
    public WebElement phoneNo;

    @FindBy(name = "UserEmail" )
    public WebElement email;

    @FindBy(id = "hyperForceDummyTest")
    public WebElement usingSaleForce;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@id='SubscriptionAgreement']/following::div")
    public WebElement agreemnt;

    @FindBy(css = ".uiButton--modal-closeBtn")
    public WebElement signSuccessfully;

    @FindBy(xpath = "//*[contains(@class,'profileTrigger')]")
    public WebElement profileIcon;

    @FindBy(xpath = "//*[contains(@class,'walkthrough-close')]")
    public WebElement walkthroughClose;

    @FindBy(xpath = "//*[@title='Close This Dialog']")
    public WebElement tryOutClose;

    @FindBy(linkText = "Log Out")
    public WebElement logoutLink;

}
