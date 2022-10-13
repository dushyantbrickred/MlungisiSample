package pages;

import ReportManager.ReportManager;
import StepDefinitions.CommonFuctions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LaunchLendingPage extends PageObject {


 private CommonFuctions commonFuctions = new CommonFuctions(getDriver());
    @FindBy(css =  "#nav_automobile")
    private WebElementFacade autoMobileLink;

    public void navigateToLaunchPage(){

        String url = "http://sampleapp.tricentis.com/101/";

        getDriver().get(url);

    }

 public void clickAutomobileLink() {
        commonFuctions.waitUntilClickableThenClickAs(autoMobileLink, new WebDriverWait(getDriver(), 200),
                "clickedAutoMobileLink()");
 }

}
