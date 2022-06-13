package stepdefination;

import base.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Pa;
import pages.actions.AccountsStep;
import pages.actions.LogInStep;

public class LoggedInCreateACcStepDefination {
    LogInStep logInStep = new LogInStep();
    AccountsStep account = new AccountsStep();

    @When("user login at salesforce")
    public void user_login_at_salesforce() {
        logInStep.login();
    }

    @When("user click on account link")
    public void user_click_on_account_link() {
        account.accountClick();
    }

    @When("user click on create new company")
    public void user_click_on_create_new_company() {
        account.newCompany();
    }

    @When("user enter {string} as company role")
    public void user_enter_as_company_role(String role) {
        account.roleType(role);
    }

    @When("user enter {string} as no of employees")
    public void user_enter_as_no_of_employees(String count) {
        account.noOfEMplyees(count);
    }

    @When("user enter {string} as industry type")
    public void user_enter_as_industry_type(String industry) {
        account.industryType(industry);
    }

    @When("user enter {string} as company description")
    public void user_enter_as_company_description(String description) {
       account.descDetails(description);
    }

    @When("user enter {string} as billing street")
    public void user_enter_as_billing_street(String street) {
        account.billingStreetDetails(street);
    }

    @When("user enter {string} as billing state")
    public void user_enter_as_billing_state(String state) {
        account.billingStateDetails(state);
    }

    @When("user enter {string} as billing post code")
    public void user_enter_as_billing_post_code(String postCOde) {
        account.billingPostCodeDetails(postCOde);
    }

    @When("user enter {string} as billing country")
    public void user_enter_as_billing_country(String country) {
        account.billingCountryDetails(country);
    }

    @When("user enter {string} as shipping street")
    public void user_enter_as_shipping_street(String street) {
        account.shippingStreetDetails(street);
    }

    @When("user enter {string} as shipping state")
    public void user_enter_as_shipping_state(String state) {
        account.shippingStateDetails(state);
    }

    @When("user enter {string} as shipping post code")
    public void user_enter_as_shipping_post_code(String postCode) {
        account.shippingPostCodeDetails(postCode);
    }

    @When("user enter {string} as shipping country")
    public void user_enter_as_shipping_country(String country) {
        account.shippingCountryDetails(country);
    }

    @When("user click on save button")
    public void user_click_on_save_button() {
        account.clickSave();
    }

    @Then("user validate account is created")
    public void user_validate_account_is_created() {
        account.validateAccCreated();
    }

    @And("user enter {string} as account company name")
    public void userEnterAsAccountCompanyName(String company) {
        account.accName(company);
    }

    @And("user enter {string} as account phone no")
    public void userEnterAsAccountPhoneNo(String phone) {
        account.phoneDetails(phone);
    }

    @When("user click on edit account link")
    public void userClickOnEditAccountLink() {
        account.clickEdit();
    }

    @And("user validate account is edited")
    public void userValidateAccountIsEdited() {
        account.validateAccEdited();
    }
}
