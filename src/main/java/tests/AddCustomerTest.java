package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getAddCustomerPage;
import static tests.PageProvider.getOpenAccountPage;
import static tests.PageProvider.getCommonPage;

public class AddCustomerTest {

    @When("^I type first name as (.+), last name as (.+), post code as (.+)$")
    public void inputUserInformation(String firstname, String lastname, String postcode) throws InterruptedException {
        Thread.sleep(3000);
        getAddCustomerPage().setUserInformation(firstname, lastname, postcode);
        Thread.sleep(2000);
    }

    @And("^I click submit$")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        getAddCustomerPage().clickSubmit();
        Thread.sleep(2000);
    }

    @Then("^I verify that system is already added customer as (.+) successfully$")
    public void verifyCustomerAddSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
        Thread.sleep(3000);
        getOpenAccountPage().clickCheckUserName();
        Thread.sleep(3000);
        getOpenAccountPage().checkUserInformation(fullname, true);
        Thread.sleep(2000);
    }

    @Then("^I verify that user is already add$")
    public void verifyAlertAdd() throws InterruptedException {
        Thread.sleep(3000);
        getCommonPage().getAddSuccessfully();
        Thread.sleep(2000);
    }

    @Then("^I verify that system is already added customer as (.+) unsuccessfully")
    public void verifyCustomerAddUnSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
        Thread.sleep(3000);
        getOpenAccountPage().checkUserInformation(fullname, false);
        Thread.sleep(2000);
    }
}
