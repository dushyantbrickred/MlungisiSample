package pages;


import StepDefinitions.CommonFuctions;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProductDataPage extends PageObject {

	protected WebDriverWait wait =  new WebDriverWait(getDriver(), 10);
	private CommonFuctions commonFuctions = new CommonFuctions(getDriver()) ;
	@FindBy(how = How.ID, using = "startdate")
	WebElement inputStartDate;

	@FindBy(how = How.ID, using = "insurancesum")
	WebElement comboInsuranceSum;

	@FindBy(how = How.ID, using = "meritrating")
	WebElement comboMeritRating;

	@FindBy(how = How.ID, using = "damageinsurance")
	WebElement comboDamageInsurance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	WebElement checkOptionalProducts;

	@FindBy(how = How.ID, using = "courtesycar")
	WebElement comboCourtesyCar;

	@FindBy(how = How.ID, using = "nextselectpriceoption")
	WebElement botaoNext;


	public void enterStartDate() {
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Calendar now = Calendar.getInstance(); now.add(Calendar.MONTH, 2);
		String dateString = formatter.format(now.getTime());
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputStartDate,wait,dateString,"enterStartDate()");

	}


	public void selectInsuranceSum(String sum) {
		commonFuctions.selectFromDropDownAs(comboInsuranceSum,sum,"selectInsuranceSum()");

	}

	public void selectMeritRating(String rating) {
		commonFuctions.selectFromDropDownAs(comboMeritRating,rating,"selectMeritRating()");

	}

	public void selectDamageInsurance(String damage) {
		commonFuctions.selectFromDropDownAs(comboDamageInsurance,damage,"selectDamageInsurance()");

	}

	public void selectOptionalProducts() {
		commonFuctions.waitUntilClickableThenClickAs(checkOptionalProducts, wait,"selectOptionalProducts()");

	}


	public void selectCourtesyCar(String cars) {
		commonFuctions.selectFromDropDownAs(comboCourtesyCar,cars,"selectCourtesyCar()");
	}


	public void cliCarNextButton() {
		
		commonFuctions.waitUntilClickableThenClickAs(botaoNext, wait,"clicarNextButton()");

	}
	 
	
}
