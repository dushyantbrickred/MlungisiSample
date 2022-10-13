package StepDefinitions;

import ReportManager.ReportManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFuctions {

    private WebDriver webDriver;
    public CommonFuctions(WebDriver webDriverValue) {
        webDriver = webDriverValue;


    }

    public void waitUntilClickableThenClickAs(WebElement element, WebDriverWait waitDriver,String screenShotName)
    {
        waitDriver.until(ExpectedConditions.elementToBeClickable(element)).click();

        ReportManager.test.info(screenShotName).addScreenCaptureFromPath(ReportManager.takeStepScreenshot(webDriver,
                screenShotName, ReportManager.scenarioName));
    }


    public void selectFromDropDownAs(WebElement element, String value,String screenShotName)
    {
        Select comboType = new Select(element);
        comboType.selectByVisibleText(value);
        ReportManager.test.info(screenShotName).addScreenCaptureFromPath(ReportManager.takeStepScreenshot(webDriver, screenShotName, ReportManager.scenarioName));

    }

    public void waitUntilVisibleThenEnterTextAs(WebElement element, WebDriverWait waitDriver, String inputValue,String screenShotName)
    {

        waitDriver.until(ExpectedConditions.visibilityOf(element)).sendKeys(inputValue);
        ReportManager.test.info(screenShotName).addScreenCaptureFromPath(ReportManager.takeStepScreenshot(webDriver,
                screenShotName, ReportManager.scenarioName));
    }
}
