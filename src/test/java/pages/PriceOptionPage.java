package pages;


import StepDefinitions.CommonFuctions;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionPage extends PageObject {

	protected WebDriverWait wait =  new WebDriverWait(getDriver(), 10);
	private CommonFuctions commonFuctions = new CommonFuctions(getDriver()) ;



	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
	WebElement radioOptionPlatinum;

	@FindBy(how = How.ID, using = "nextsendquote")
	WebElement priceOptionNextButton;


	public void selectPriceOption() {

		commonFuctions.waitUntilClickableThenClickAs(radioOptionPlatinum, wait,"selectPriceOption()");

	}	
	
	
	public void clickPriceOptionNextButton() {
		commonFuctions.waitUntilClickableThenClickAs(priceOptionNextButton, wait,"clickPriceOptionNextButton()");

	}	 
	
}
