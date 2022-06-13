package testcase;

import org.testng.annotations.Test;
import pages.actions.AccountsStep;
import pages.actions.EmailVarificationStep;
import pages.actions.LogInStep;

public class LoginTest {

    @Test
    public void loginTest() throws InterruptedException {
        LogInStep logInStep = new LogInStep();
        logInStep.login("akshayglasswala-eleu@force.com","Test1234");
        AccountsStep acc = new AccountsStep();
        acc.accountClick();
        acc.newCompany();
        acc.accName("ABC");
        acc.phoneDetails("9875412367");
        acc.websiteDetails("abc@abc.com");
        acc.roleType("Partner");
        acc.noOfEMplyees("100");
        acc.industryType("Energy");
        acc.descDetails("Hello World");
        acc.billingStreetDetails("103 Geere Road");
        acc.billingCityDetails("Texas");
        acc.billingStateDetails("New State");
        acc.billingPostCodeDetails("85241");
        acc.billingCountryDetails("USA");
        acc.shippingStreetDetails("103 Geere Road");
        acc.shippingCityDetails("Texas");
        acc.shippingStateDetails("New State");
        acc.shippingPostCodeDetails("85241");
        acc.shippingCountryDetails("USA");
        acc.clickSave();
        acc.validateAccCreated();
        acc.clickEdit();
        acc.accName("Edit Acc");
        acc.phoneDetails("5252541238");
        acc.websiteDetails("bbb@bbb.com");
        acc.roleType("Investor");
        acc.noOfEMplyees("150");
        acc.industryType("Electronics");
        acc.descDetails("Again Hello World");
        acc.billingStreetDetails("23 My Road");
        acc.billingCityDetails("Verginia");
        acc.billingStateDetails("New Edited State");
        acc.billingPostCodeDetails("24141");
        acc.billingCountryDetails("Canada");
        acc.shippingStreetDetails("23 My Road");
        acc.shippingCityDetails("Verginia");
        acc.shippingStateDetails("New Edited State");
        acc.shippingPostCodeDetails("24141");
        acc.shippingCountryDetails("Canada");
        acc.clickSave();
        acc.validateAccEdited();
    }
}
