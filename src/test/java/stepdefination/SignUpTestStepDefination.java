package stepdefination;


import base.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.EmailVarificationStep;
import pages.actions.LogInStep;
import pages.actions.PasswordSetUpStep;
import pages.actions.SignUpPageStep;

public class SignUpTestStepDefination {

    Page page;
    LogInStep homePage = new LogInStep();
    SignUpPageStep signUp =  new SignUpPageStep();
    PasswordSetUpStep passwordSetUp = new PasswordSetUpStep();
    EmailVarificationStep emailVerification = new EmailVarificationStep();

    @Given("salesforce test Website")
    public void salesforce_test_website() {
        page = new Page();
    }

    @When("user click on signup link")
    public void user_click_on_signup_link() {
        homePage.clickSIgnUp();
    }

    @When("user enter {string} as firstname and {string} as Lastname")
    public void user_enter_as_firstname_and_as_lastname(String fName, String lName) {
        signUp.sendFirstName(fName);
        signUp.sendLastName(lName);
    }

    @When("user enter {string} as Job title")
    public void user_enter_as_job_title(String title) {
        signUp.sendJobTitle(title);
    }

    @When("user click on next")
    public void user_click_on_next() {
        signUp.clickNext();
    }

    @When("user enter {string} as no of employees in company")
    public void user_enter_as_no_of_employees_in_company(String count) {
        signUp.noOfEmployees(count);
    }

    @When("user enter {string} as company name")
    public void user_enter_as_company_name(String company) {
        signUp.sendCompanyName(company);
    }

    @When("user enter {string} as country")
    public void user_enter_as_country(String country) {
        signUp.contrySelect(country);
    }

    @When("user enter {string} as phone no")
    public void user_enter_as_phone_no(String phone) {
        signUp.sendPhone(phone);
    }

    @When("user enter {string} as email")
    public void user_enter_as_email(String email) {
        signUp.sendEmail(email);
    }

    @When("user select service agrement")
    public void user_select_service_agrement() {
        signUp.selectAgreement();
    }

    @Then("user click on submit button")
    public void user_click_on_submit_button() {
        signUp.clickSubmit();
    }


    @When("user enter email url")
    public void userEnterEmailUrl() {
        emailVerification.getYahooUrl();
    }

    @And("user enter {string} as email id")
    public void userEnterAsEmailId(String email) {
        emailVerification.sendEmail(email);
    }

    @And("user enter {string} as password")
    public void userEnterAsPassword(String password) {
        emailVerification.sendPassword(password);
    }

    @And("user open verify account email")
    public void userOpenVerifyAccountEmail() {
        emailVerification.emailVerification();
    }

    @And("user click on verify account link")
    public void userClickOnVerifyAccountLink() {
        emailVerification.verifyAccountClick();
    }

    @And("user set {string} new password for an account")
    public void userSetNewPasswordForAnAccount(String password) {
        passwordSetUp.setPassword(password);
    }

    @And("user set security {string} as que and {string} as answer")
    public void userSetSecurityAsQueAndAsAnswer(String que, String ans) {
        passwordSetUp.secQues(que,ans);
    }

    @And("user click on submit on set password page")
    public void userClickOnSubmitOnSetPasswordPage() {
        passwordSetUp.submitButton();
    }

    @Then("user validate signup successfully")
    public void userValidateSignupSuccessfully() {
        signUp.signupSuccessfull();
        signUp.closeInfoToolTip();
        signUp.logout();
    }
}
