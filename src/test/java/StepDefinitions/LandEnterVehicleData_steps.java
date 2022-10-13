package StepDefinitions;

import ReportManager.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EnterVehicleData;
import pages.LaunchLendingPage;


public class LandEnterVehicleData_steps {

    @Page //When using Serenity I don't need to instantiate the Page class.

    LaunchLendingPage launchLendingPage;
    EnterVehicleData vehicle;

    @Managed
    WebDriver driver;

    @Given("User navigated to the Tricentis website")
    public void userNavigatesToEnterVehicleDataLandingPage() {

        launchLendingPage.navigateToLaunchPage();
    }

    @And("User clicks on Automobile")
    public void userClicksAutomobile() {
    launchLendingPage.clickAutomobileLink();

    }


    @And("User clicks on the Make as {string}")
    public void iClickOnTheMakeAs(String makeValue) {
        vehicle.selectMakeAs("Honda");
    }

    @And("Fill in the Engine Performance [kW] field: {string}")
    public void fillInTheEnginePerformanceKWField(String value) {
        vehicle.preencherEngine(value);
    }

    @And("Enter a Date of Manufacture: {string}")
    public void informoADateOfManufacture(String date) {
        vehicle.enterDateOfManufacturerAs(date);
    }

    @And("User clicks on the Number of Seats {string} option")
    public void iClickOnTheNumberOfSeatsOption(String value) {
        vehicle.selectNumberOfSeats(value);
    }

    @And("User clicks on the option Fuel Type: {string}")
    public void iClickOnTheOptionFuelType(String value) {
        vehicle.selecionarFuelType(value);
    }

    @And("Enter a List Price [$]: {string}")
    public void enterAListPrice$(String value) {
        vehicle.enterListPrice(value);
    }

    @And("Enter a License Plate Number: {string}")
    public void enterALicensePlateNumber(String value) {
        vehicle.enterLicenseNumber(value);
    }

    @And("Enter a Annual Mileage [mi]: {string}")
    public void enterAAnnualMileageMi(String value) {
        vehicle.enterAnnualMileage(value);
    }

    @Then("User clicks on Vehicle Data Next button and Navigated successfully to Insurance Page")
    public void iMustClickOnNext() {
        vehicle.clickVehicleDataNextButton();
    }


}
