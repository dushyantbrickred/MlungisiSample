package pages;


import StepDefinitions.CommonFuctions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterVehicleData extends PageObject {
	

	protected WebDriverWait wait =  new WebDriverWait(getDriver(), 10);
	private CommonFuctions commonFuctions = new CommonFuctions(getDriver()) ;

	
	@FindBy(how = How.ID, using = "make")
	WebElement comboMakeWB;
	
	@FindBy(how = How.ID, using = "engineperformance")
	WebElement campoEnginePerformance;
	
	@FindBy(how = How.ID, using = "dateofmanufacture")
	WebElement dateOfManufacture;
	
	@FindBy(how = How.ID, using = "numberofseats")
	WebElement comboNumberOfSeats;
	
	@FindBy(how = How.ID, using = "fuel")
	WebElement comboFuelType;
	
	@FindBy(how = How.ID, using = "listprice")
	WebElement campoListPrice;
	
	@FindBy(how = How.ID, using = "licenseplatenumber")
	WebElement campoLicenseNumber;
	
	@FindBy(how = How.ID, using = "annualmileage")
	WebElement campoAnnualMileage;
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	WebElement nextButton;
				

	public void selectMakeAs(String make) {
		commonFuctions.selectFromDropDownAs(comboMakeWB,make, "selectedMAke()");
		
	}
	
	public void preencherEngine(String engine) {	
		wait.until(ExpectedConditions.visibilityOf(campoEnginePerformance)).sendKeys(engine);
	
    }
	
	public void enterDateOfManufacturerAs(String date) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(dateOfManufacture,wait,date,"enterDateOfManufacturerAs()");
	
    }
	
	public void selectNumberOfSeats(String seats) {

		commonFuctions.selectFromDropDownAs(comboNumberOfSeats,seats,"selectNumberOfSeats()");
		
	}
	
	public void selecionarFuelType(String type) {	
		Select comboType = new Select(comboFuelType);
		comboType.selectByVisibleText(type);
		
	}
	
	public void enterListPrice(String price) {
	commonFuctions.waitUntilVisibleThenEnterTextAs(campoListPrice,wait,price,"enterListPrice()");
    }
	
	public void enterLicenseNumber(String license) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(campoLicenseNumber,wait,license,"enterLicenseNumber()");
	
    }
	
	public void enterAnnualMileage(String mileage) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(campoAnnualMileage,wait,mileage,"enterAnnualMileage()");


	}
	
	public void clickVehicleDataNextButton() {
		commonFuctions.waitUntilClickableThenClickAs(nextButton, wait,"clickNext()");
	}
	 
	
}
