package pages;


import StepDefinitions.CommonFuctions;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuoteDataPage extends PageObject {

	protected WebDriverWait wait =  new WebDriverWait(getDriver(), 10);
	private CommonFuctions commonFuctions = new CommonFuctions(getDriver()) ;

	@FindBy(how = How.ID, using = "email")
	WebElement inputEmail;

	@FindBy(how = How.ID, using = "phone")
	WebElement inputPhone;

	@FindBy(how = How.ID, using = "username")
	WebElement inputUsername;

	@FindBy(how = How.ID, using = "password")
	WebElement inputPassword;

	@FindBy(how = How.ID, using = "confirmpassword")
	WebElement inputConfirmPassword;

	@FindBy(how = How.ID, using = "Comments")
	WebElement inputCommets;

	@FindBy(how = How.ID, using = "sendemail")
	WebElement sendButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/h2")
	WebElement successMessageLabel;

	public void enterEmail(String email) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputEmail,wait,email,"enterEmail()");
	}

	public void enterPhone(String phone) {

		commonFuctions.waitUntilVisibleThenEnterTextAs(inputPhone,wait,phone,"enterPhone()");

	}

	public void enterUserName(String date) {

		commonFuctions.waitUntilVisibleThenEnterTextAs(inputUsername,wait,date,"enterUserName()");


	}

	public void enterPassword(String password) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputPassword,wait,password,"enterPassword()");

	}


	public void enterConfirmPassword(String confirm) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputConfirmPassword,wait,confirm,"enterConfirmPassword()");
	}

	public void enterComments(String comments) {
		commonFuctions.waitUntilVisibleThenEnterTextAs(inputCommets,wait,comments,"enterComments()");
	}


	public void clickSendButton() {
		commonFuctions.waitUntilClickableThenClickAs(sendButton, wait,"clickSendButton()");
	}

	public String getSuccessMessage() {
		return successMessageLabel.getText();
	}
}
