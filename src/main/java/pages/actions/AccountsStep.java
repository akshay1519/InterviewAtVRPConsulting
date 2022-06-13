package pages.actions;

import base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import pages.locators.AccountsPage;

import java.util.List;

public class AccountsStep extends Page{
    public AccountsPage account = null;

    public AccountsStep(){
        this.account = new AccountsPage();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.getDriver(),10);
        PageFactory.initElements(Page.getDriver(),this.account);
    }

    public void accountClick(){
        explicitWait(account.accountsLink,10);
        clickJs(account.accountsLink);
    }

    public void newCompany(){
        click(account.newAcc);
        explicitWait(account.newAccPopup, 10);
    }
    public void accName(String acc){
        explicitWait(account.accountName, 10);
        clickJs(account.accountName);
        type(account.accountName, acc);
        storyMap.put("AccountName",acc);
    }

    public void parentComp(String pCompany){
        click(account.parentCompany);
        type(account.parentCompany, pCompany);
    }

    public void phoneDetails(String phoneNo){
        type(account.phone, phoneNo);
    }

    public void websiteDetails(String websiteURL){
        type(account.website, websiteURL);
    }

    public void roleType(String role){
        click(account.type);
        clickOnListValue(account.roleType, role);
    }

    public void industryType(String industryName){
        click(account.industry);
        clickOnListValue(account.industryType, industryName);
    }

    public void noOfEMplyees(String empCount){
        type(account.employee, empCount);
    }

    public void descDetails(String details){
        type(account.description, details);
    }

    public void billingStreetDetails(String street){
        type(account.billingStreet, street);
    }

    public void billingCityDetails(String city){
        type(account.billingCity, city);
    }

    public void billingStateDetails(String state){
        type(account.billingState, state);
    }
    public void billingPostCodeDetails(String postCOde){
        type(account.billingPostCode, postCOde);
    }
    public void billingCountryDetails(String country){
        type(account.billingCountry, country);
    }

    public void shippingStreetDetails(String street){
        type(account.shoppingStreet, street);
    }

    public void shippingCityDetails(String city){
        type(account.shippingCity, city);
    }

    public void shippingStateDetails(String state){
        type(account.shippingState, state);
    }
    public void shippingPostCodeDetails(String postCOde){
        type(account.shippingPostCode, postCOde);
    }
    public void shippingCountryDetails(String country) {
        type(account.shippingCountry, country);
    }
    public void clickSave(){
        click(account.save);
    }
    public void clickEdit(){
        explicitWait(account.edit, 10);
        clickJs(account.edit);
    }

    public void validateAccCreated(){
        String expectedString = "Account"+" \""+ storyMap.get("AccountName")+"\" "+ "was created.";
        explicitWait(account.toastMsg,10);
        String actualString = account.toastMsg.getText().trim();
        System.out.println(expectedString);
        System.out.println(actualString);
        Assert.assertTrue(actualString.equals(expectedString));
    }
    public void validateAccEdited(){
        String expectedString = "Account"+" \""+ storyMap.get("AccountName")+"\" "+ "was saved.";
        explicitWait(account.toastMsg,10);
        String actualString = account.toastMsg.getText().trim();
        System.out.println(expectedString);
        System.out.println(actualString);
        Assert.assertTrue(actualString.equals(expectedString));
    }

}
