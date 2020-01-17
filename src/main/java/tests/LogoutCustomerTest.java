package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getLogoutCustomerPage;

public class LogoutCustomerTest {
    @When("^I click Logout Button$")
    public void clickLogoutBtn() throws InterruptedException {
        Thread.sleep(5000);
        getLogoutCustomerPage().clickLogoutBtn();
        Thread.sleep(2000);
    }

    @Then("^I verify that user logout successfully$")
    public void verifyLogoutSuccesfully() throws InterruptedException {
        Thread.sleep(5000);
        getLogoutCustomerPage().verifyLogOut();
        Thread.sleep(2000);
    }
}
