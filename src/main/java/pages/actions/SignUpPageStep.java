package pages.actions;

import base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.SignUpPage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SignUpPageStep extends Page {

    public SignUpPage signup;

    public SignUpPageStep(){
        this.signup = new SignUpPage();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.getDriver(),10);
        PageFactory.initElements(factory,this.signup);
    }

    public void sendFirstName(String fName){
        Set<String> windows = driver.getWindowHandles();
        List<String> allWindowsList = new ArrayList<>(windows);
        driver.switchTo().window(allWindowsList.get(1));
        type(signup.firstName,fName);
    }
    public void sendLastName(String lName){
        type(signup.lastName,lName);
    }
    public void sendJobTitle(String jobTitle){
        type(signup.jobTitleName,jobTitle);
    }
    public void clickNext(){
        click(signup.nextButton);
    }
    public void noOfEmployees(String employeeCount){
        selectByValues(signup.employeesStrengthDropdown,employeeCount);
    }
    public void sendCompanyName(String company){
        type(signup.companyName,company);
    }
    public void contrySelect(String country){
        selectByVisibleText(signup.countryDropdown,country);
    }
    public void sendPhone(String phone){
        type(signup.phoneNo,phone);
    }
    public void sendEmail(String email){
        type(signup.email,email);
    }

    public void usingSalesForce(){
        if (isElementPresent(signup.usingSaleForce)){
            click(signup.usingSaleForce);
        }
    }
    public void selectAgreement(){
        click(signup.agreemnt);
    }
    public EmailVarificationStep clickSubmit(){
        click(signup.submitButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new EmailVarificationStep();
    }

    public void signupSuccessfull(){
        explicitWait(signup.signSuccessfully,50);
        click(signup.signSuccessfully);
    }
    public void closeInfoToolTip(){
        explicitWait(signup.walkthroughClose,10);
        click(signup.walkthroughClose);
        explicitWait(signup.tryOutClose,10);
        click(signup.tryOutClose);
    }

    public void logout(){
        click(signup.profileIcon);
        click(signup.logoutLink);
    }
}
