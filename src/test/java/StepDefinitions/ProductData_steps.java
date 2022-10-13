package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.ProductDataPage;

public class ProductData_steps {
    @Page //When using Serenity I don't need to instantiate the Page class.
    ProductDataPage productDataPage;

    @Managed
    WebDriver driver;

    @And("User informs the Start Date more than one month into the future")
    public void userInformsTheStartDate() {

        productDataPage.enterStartDate();
    }

    @And("User I clicks on the Insurance Sum [$] {string} option")
    public void userIClicksOnTheInsuranceSum$Option(String value) {
        productDataPage.selectInsuranceSum(value);
    }

    @And("User clicks on the Merit Rating: {string} option")
    public void userClicksOnTheMeritRatingOption(String value) {
        productDataPage.selectMeritRating(value);
    }

    @And("User clicks on the option Damage Insurance: {string}")
    public void userClicksOnTheOptionDamageInsurance(String value) {
        productDataPage.selectDamageInsurance(value);
    }

    @And("User selects information Optional Products: Euro Protection")
    public void informationOptionalProductsEuroProtection() {
        productDataPage.selectOptionalProducts();

    }

    @And("User clicks on the option Courtesy Car: {string}")
    public void userClicksOnTheOptionCourtesyCar(String value) {
        productDataPage.selectCourtesyCar(value);
    }

    @Then("User clicks on Car Next button to land on Price Option Page")
    public void userClicksOnCarNextButton() {
        productDataPage.cliCarNextButton();
    }
}
