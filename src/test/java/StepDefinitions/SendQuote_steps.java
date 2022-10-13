package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ProductDataPage;
import pages.SendQuoteDataPage;

public class SendQuote_steps {

    @Page //When using Serenity I don't need to instantiate the Page class.
    SendQuoteDataPage sendQuoteDataPage;

    @Managed
    WebDriver driver;
    @And("User enters the E-mail: {string}")
    public void userEntersTheEMail(String value) {
        sendQuoteDataPage.enterEmail(value);
    }

    @And("User enters in the Phone field: {string}")
    public void userEntersInThePhoneField(String value) {
        sendQuoteDataPage.enterPhone(value);
    }

    @And("User enters in the Username field: {string}")
    public void userEntersInTheUsernameField(String value) {
        sendQuoteDataPage.enterUserName(value);
    }

    @And("User enters in the Password field: {string}")
    public void userEntersInThePasswordField(String value) {
        sendQuoteDataPage.enterPassword(value);
    }

    @And("User confirms the Password field: {string}")
    public void userConfirmsThePasswordField(String value) {
        sendQuoteDataPage.enterConfirmPassword(value);
    }

    @And("User enters comment as {string}")
    public void userEntersCommentAs(String value) {
        sendQuoteDataPage.enterComments(value);
    }

    @Then("User must click on Send")
    public void userMustClickOnSend() {
        sendQuoteDataPage.clickSendButton();
    }

    @And("checks the message: {string}")
    public void checksTheMessage(String expectedValue) {
        Assert.assertEquals(expectedValue, sendQuoteDataPage.getSuccessMessage());
    }
}
