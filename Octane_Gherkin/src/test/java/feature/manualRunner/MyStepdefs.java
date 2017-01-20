package feature.manualRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Administrator on 7/6/2016.
 */
public class MyStepdefs {
    @Then("^I confirm my payment method is Visa and proceed to checkout$")
    public void iConfirmMyPaymentMethodIsVisaAndProceedToCheckout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^payment security system is up$")
    public void paymentSecuritySystemIsUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^a customer named Bob$")
    public void aCustomerNamedBob() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();
    }

    @Given("^I am logged in as Bob$")
    public void iAmLoggedInAsBob() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^I have at least one item in cart$")
    public void iHaveAtLeastOneItemInCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I try to buy items in my cart$")
    public void iTryToBuyItemsInMyCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();

    }

      @Given("^a customer named \"([^\"]*)\"$")
    public void aCustomerNamed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^I am logged in as \"([^\"]*)\"$")
    public void iAmLoggedInAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^I confirm my payment method \"([^\"]*)\" and proceed to checkout$")
    public void iConfirmMyPaymentMethodAndProceedToCheckout(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

}
