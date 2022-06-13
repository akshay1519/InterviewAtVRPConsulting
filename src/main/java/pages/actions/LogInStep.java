package pages.actions;


import base.Constants;
import base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.LogInPage;

public class LogInStep extends Page {

    public LogInPage logInPage;

    public LogInStep(){
        this.logInPage = new LogInPage();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.getDriver(),10);
        PageFactory.initElements(factory,this.logInPage);
    }

        public SignUpPageStep clickSIgnUp(){
            swithchtoFrame(logInPage.signupFrame);
            clickOnListValue(logInPage.homePageLinks, Constants.signupText);
            return new SignUpPageStep();
    }
    public void login(){
        explicitWait(logInPage.useName,10);
        type(logInPage.useName, storyMap.get("UserId"));
        type(logInPage.password,storyMap.get("pass"));
        click(logInPage.login);
        if (isElementPresent(logInPage.remindLater))
            click(logInPage.remindLater);
    }

    public void login(String uname,String pass){
        getUrl(storyMap.get("URLLogin"));
        type(logInPage.useName, storyMap.get("UserId"));
        type(logInPage.password,pass);
        click(logInPage.login);
        if (isElementPresent(logInPage.otp)){
            EmailVarificationStep emv = new EmailVarificationStep();
            emv.getYahooUrl();
            emv.sendEmail("akshayglasswala");
            emv.sendPassword("Test@1234");
            emv.emailVerification();
            emv.verifyAccountClick();
            emv.otpVerificationEMail();
            PasswordSetUpStep psp = emv.verificationCode();
            psp.otpVerification();
        }
        if (isElementPresent(logInPage.remindLater))
            click(logInPage.remindLater);
    }


}
