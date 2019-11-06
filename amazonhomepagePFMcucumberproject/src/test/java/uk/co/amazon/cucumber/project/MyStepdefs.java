package uk.co.amazon.cucumber.project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.amazon.pages.HomePage;

public class MyStepdefs {
    @Given("^I am amazon homepage$")
    public void iAmAmazonHomepage() {
    }

    @When("^I shold click on login link$")
    public void iSholdClickOnLoginLink() {
new HomePage().clickOnSignIn();
    }

    @Then("^I should successfully navigate to login page$")
    public void iShouldSuccessfullyNavigateToLoginPage() {
    }
}
