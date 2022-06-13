package pages.actions;

import base.Constants;
import base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.EmailVarificationPage;
import java.util.List;

public class EmailVarificationStep extends Page {

    public EmailVarificationPage emailStep;

    public EmailVarificationStep(){
        this.emailStep = new EmailVarificationPage();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.getDriver(),10);
        PageFactory.initElements(factory,this.emailStep);
    }

    public void getYahooUrl() {
//        driver.get(Constants.emailUrl);
        getUrl(Constants.emailUrl);
    }

    public void sendEmail(String uname){
        type(emailStep.emailId,uname);
        click(emailStep.nextButton);
    }
    public void sendPassword(String pass){
        type(emailStep.pass,pass);
        click(emailStep.nextButton);
    }

    public void emailVerification(){
        if (isElementPresent(emailStep.selectAllEmail)) {
            click(emailStep.selectAllEmail);
            click(emailStep.deleteEmail);
        }
        explicitWait(emailStep.inboxEmails, 150);
        List<WebElement> selectEmail = emailStep.emailList;
        for (WebElement element:selectEmail){
            explicitWait(element,5);
            String messageSubject = element.getAttribute("title");
            System.out.println(messageSubject);
            if (messageSubject.contains("Welcome to Salesforce")){
                element.click();
            }
        }
    }

    public void verifyAccountClick(){
        storyMap.put("UserId",emailStep.userName.getText());
        storyMap.put("URLLogin",emailStep.loginURL.getText());
        click(emailStep.verifyAcc);
        System.out.println(storyMap);
    }


    public void otpVerificationEMail(){
        selectWindowIndex(1);
        click(emailStep.inbox);
        if (isElementPresent(emailStep.selectAllEmail)) {
            click(emailStep.selectAllEmail);
            click(emailStep.deleteEmail);
        }
        explicitWait(emailStep.inboxEmails, 100);
        List<WebElement> selectEmail = emailStep.emailList;
        for (WebElement element:selectEmail){
            String messageSubject = element.getAttribute("title");
            System.out.println(messageSubject);
            if (messageSubject.contains(" your Verifyidentity")){
                element.click();
            }
        }
    }
    public PasswordSetUpStep verificationCode(){
        explicitWait(emailStep.OTPCode,100 );
        String codeVal = emailStep.OTPCode.getText();
        String OTPValue = codeVal.split("Verification Code:")[1].replaceAll("[^0-9]","");
        storyMap.put("OTPPass",OTPValue);
        System.out.println(codeVal);
        System.out.println(OTPValue);
        return new PasswordSetUpStep();
    }

}
