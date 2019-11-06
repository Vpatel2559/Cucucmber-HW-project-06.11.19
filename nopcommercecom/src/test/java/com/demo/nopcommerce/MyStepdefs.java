package com.demo.nopcommerce;

import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    @Given("^I should be on homepage$")
    public void iShouldBeOnHomepage() {
    }

    @When("^I should click on register link$")
    public void iShouldClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();

    }

    @And("^click on 'Gender' radio button$")
    public void clickOnGenderRadioButton() {
        new RegisterPage().genderRadioBtn();
    }

    @And("^enter first name \"([^\"]*)\" into first name field$")
    public void enterFirstNameIntoFirstNameField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().firstNameField(arg0);
    }

    @And("^enter last name \"([^\"]*)\" in to last name field$")
    public void enterLastNameInToLastNameField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().lastNameField(arg0);
    }

    @And("^select day \"([^\"]*)\" from DOB field$")
    public void selectDayFromDOBField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().birthDayField(arg0);
    }

    @And("^selece month \"([^\"]*)\" from DOB field$")
    public void seleceMonthFromDOBField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().birthMonthField(arg0);
    }

    @And("^selece year \"([^\"]*)\" from DOB field$")
    public void seleceYearFromDOBField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().birthYearField(arg0);
    }

    @And("^enter email address$")
    public void enterEmailAddress() {
        new RegisterPage().emailField();
    }

    @And("^enter company name \"([^\"]*)\" into company name field$")
    public void enterCompanyNameIntoCompanyNameField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().companyField(arg0);
    }



    @And("^selece newsletter field$")
    public void seleceNewsletterField() {
    }

    @And("^enter \"([^\"]*)\" into password field$")
    public void enterIntoPasswordField(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().passwordField(arg0);
    }

    @And("^enter \"([^\"]*)\" into confirm password$")
    public void enterIntoConfirmPassword(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        new RegisterPage().confirmPwdField(arg0);
    }



    @And("^click on register button$")
    public void clickOnRegisterButton() {

    }

    @Then("^I should successfully register with nop commerce$")
    public void iShouldSuccessfullyRegisterWithNopCommerce() {
        Assert.assertEquals("Your registration completed", new RegisterPage().registerText());
    }

    @Given("^I should open browser$")
    public void iShouldOpenBrowser() {

    }

    @When("^I should enter https://demo\\.nopcommerce\\.com/ and press enter$")
    public void iShouldEnterHttpsDemoNopcommerceComAndPressEnter() {
        new HomePage().clickOnSearchButton();

    }


    @And("^I should click on computer link$")
    public void iShouldClickOnComputerLink() {
        new HomePage().computersLink();

    }

    @And("^I should click on electronics link$")
    public void iShouldClickOnElectronicsLink() {
        new HomePage().electronicsLink();

    }

    @Then("^electronics page should be open$")
    public void electronicsPageShouldBeOpen() {
    }
}
