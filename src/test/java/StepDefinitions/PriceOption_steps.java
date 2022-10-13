package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.PriceOptionPage;
import pages.ProductDataPage;

public class PriceOption_steps {

    @Page //When using Serenity I don't need to instantiate the Page class.
    PriceOptionPage priceOptionPage;

    @Managed
    WebDriver driver;
    @And("User selects the price option")
    public void userSelectsThePriceOption() {
        priceOptionPage.selectPriceOption();

    }

    @Then("User click on the Next button to land on Send Quote Page")
    public void userClickOnTheNextButton() {
        priceOptionPage.clickPriceOptionNextButton();
    }
}
