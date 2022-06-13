package testcase;

import org.testng.annotations.Test;
import pages.actions.*;


public class SignUpTest {

    @Test
    public void startPoint() {

            LogInStep homePage = new LogInStep();
            SignUpPageStep spStep =  homePage.clickSIgnUp();  ;
            spStep.sendFirstName("Akshay");
            spStep.sendLastName("Glasswala");
            spStep.sendJobTitle("QA Tester");
            spStep.clickNext();
            spStep.noOfEmployees("100");
            spStep.sendCompanyName("Some Company");
            spStep.contrySelect("India");
            spStep.clickNext();
            spStep.sendPhone("9898656532");
            spStep.sendEmail("akshayglasswala@yahoo.com");
            spStep.selectAgreement();
            EmailVarificationStep emv = spStep.clickSubmit();
            emv.getYahooUrl();
            emv.sendEmail("akshayglasswala");
            emv.sendPassword("Test@1234");
            emv.emailVerification();
            emv.verifyAccountClick();
            emv.otpVerificationEMail();
            PasswordSetUpStep psp = emv.verificationCode();
            psp.otpVerification();
            psp.setPassword("Test1234");
            psp.secQues("2","Temp");
            psp.submitButton();
            spStep.signupSuccessfull();
            System.out.println("Passed");
    }
}
