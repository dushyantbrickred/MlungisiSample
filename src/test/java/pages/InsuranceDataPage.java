package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import StepDefinitions.CommonFuctions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuranceDataPage extends PageObject {

	protected WebDriverWait wait =  new WebDriverWait(getDriver(), 10);
	private CommonFuctions commonFuctions = new CommonFuctions(getDriver()) ;

	@FindBy(how = How.ID, using = "firstname")
	WebElement inputFirstName;

	@FindBy(how = How.ID, using = "lastname")
	WebElement inputLasttName;

	@FindBy(how = How.ID, using = "birthdate")
	WebElement inputDateOfBirth;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")
	WebElement radioGender;

	@FindBy(how = How.ID, using = "streetaddress")
	WebElement inputStreetAddress;

	@FindBy(how = How.ID, using = "country")
	WebElement comboCountry;

	@FindBy(how = How.ID, using = "zipcode")
	WebElement inputZipCode;

	@FindBy(how = How.ID, using = "city")
	WebElement inputCity;

	@FindBy(how = How.ID, using = "occupation")
	WebElement comboOccupation;

	@FindBy(how = How.XPATH, using = "//*[@id=\'insurance-form\']/div/section[2]/div[10]/p/label[1]/span")
	WebElement checkHobbies;

	@FindBy(how = How.ID, using = "website")
	WebElement inputWebSite;

	@FindBy(how = How.ID, using = "picture")
	WebElement inputPicture;

	@FindBy(how = How.ID, using = "nextenterproductdata")
	WebElement nextButton;



	public void enterFirstName(String firstName) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputFirstName,wait,firstName, "enterFirstName()");
	}

	public void enterLastName(String lastName) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputLasttName,wait,lastName, "enterLastName()");
	}

	public void enterDateOfBirth(String date) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputDateOfBirth,wait,date, "enterLastName()");
	}


	public void enterGender() {
		commonFuctions.waitUntilClickableThenClickAs(radioGender,wait,"enterGender()");
	}

	public void enterStreet(String street) {
		wait.until(ExpectedConditions.visibilityOf(inputStreetAddress)).sendKeys(street);
	}

	public void selectCountry(String country) {
		commonFuctions.selectFromDropDownAs(comboCountry,country,"selectCountry()");

	}

	public void enterZipCode(String zip) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputZipCode,wait,zip, "enterZipCode()");
	}


	public void enterCity(String city) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputCity,wait,city, "enterCity()");

	}

	public void selectOccupation(String occupation) {
		commonFuctions.selectFromDropDownAs(comboOccupation,occupation,"selectOccupation()");

	}

	public void selectHobbies() {
		commonFuctions.waitUntilClickableThenClickAs(checkHobbies,wait,"selectHobbies()");

	}

	public void enterWebSite(String site) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputWebSite,wait,site, "enterWebSite()");

	}

	public void selectPhoto(String foto) throws AWTException {
		getDriver().findElement(By.id("open")).click();

		StringSelection ss = new StringSelection(foto);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();
		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
	}


	public void clickInsuranceNextBotton() {
		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}
	
}
