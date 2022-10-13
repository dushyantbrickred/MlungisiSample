package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.InsuranceDataPage;

public class InsuranceData_steps {

    @Page //When using Serenity I don't need to instantiate the Page class.
    InsuranceDataPage insurant;

    @Managed
    WebDriver driver;
    @Given("User navigated to the Insurance data page")
    public void userNavigatedToTheInsuranceDataPage() {
        //Nothing here because of time
    }

    @And("User enters First Name {string}")
    public void userEntersFirstName(String value) {
        insurant.enterFirstName(value);
    }

    @And("User enters Last Name {string}")
    public void userEntersLastName(String value) {
        insurant.enterLastName(value);
    }

    @And("fill in the Date of Birth field {string}")
    public void fillInTheDateOfBirthField(String value) {
        insurant.enterDateOfBirth(value);
    }

    @And("User inform or Gender: Male")
    public void userInformOrGenderMale() {
        insurant.enterGender();
    }

    @And("fill in the Street Address field {string}")
    public void fillInTheStreetAddressField(String value) {
        insurant.enterStreet(value);
    }

    @And("User selects the option: {string}")
    public void userSelectsTheOption(String value) {
        insurant.selectCountry(value);
    }

    @And("fill in the Zip Code field {string}")
    public void fillInTheZipCodeField(String value) {
        insurant.enterZipCode(value);
    }

    @And("fill the City {string}")
    public void fillTheCity(String value) {
        insurant.enterCity(value);
    }

    @And("User clicks on the Occupation: {string} option")
    public void userClicksOnTheOccupationOption(String value) {
        insurant.selectOccupation(value);

    }

    @And("inform the Hoobies")
    public void informTheHoobies() {
        insurant.selectHobbies();
    }

    @And("fill in the Website: {string}")
    public void fillInTheWebsite(String value) {
        insurant.enterWebSite(value);
    }

    @Then("User clicks on Insurance Data Next button to navigate to the Product data page")
    public void userClicksOnInsuranceDataNextButton() {
        insurant.clickInsuranceNextBotton();
    }
}
