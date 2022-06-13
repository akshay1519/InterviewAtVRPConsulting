package pages.actions;

import base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.PasswordSetUpPage;


public class PasswordSetUpStep extends Page {

    public PasswordSetUpPage passSetUp;
    EmailVarificationStep emailVerification;

    public PasswordSetUpStep(){
        this.passSetUp = new PasswordSetUpPage();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.getDriver(),10);
        PageFactory.initElements(factory,passSetUp);
    }

    public void setPassword(String password){
        emailVerification = new EmailVarificationStep();
        emailVerification.otpVerificationEMail();
        emailVerification.verificationCode();
        otpVerification();
        activeWindowsList();
        selectWindow("Password");
        storyMap.put("pass",password);
        type(passSetUp.newPassword, password);
        type(passSetUp.confirmpassword, password);
    }
    public void secQues(String que,String ans){
        selectByValues(passSetUp.seqQueDropdown, que);
        type(passSetUp.secQueAns, ans);
    }
    public void submitButton(){
        click(passSetUp.submitPass);
    }

    public void otpVerification(){
        activeWindowsList();
        selectWindow("Verify");
        type(passSetUp.otp, storyMap.get("OTPPass"));
        click(passSetUp.verify);
    }
}
