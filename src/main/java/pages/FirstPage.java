package pages;
import elements.FirstPageElements;
import org.openqa.selenium.Keys;
import utilities.BaseInformation;
import utilities.BasePageObject;
import utilities.ConfigurationReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.WaitUtils;

public class FirstPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    FirstPageElements firstPageElements = new FirstPageElements();

    public FirstPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void getUrl(String url) {
        BaseInformation.getDriver().get(url);
    }

    public void clickOneWayButton() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.oneWay)
                .click();
    }

    public void clickRoundTrip() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.roundTrip)
                .click();
    }

    public void clickMultiDes() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.multiDes)
                .click();
    }

    public void setDepartureCity(String departureCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.departureCity)
                .sendKeys(departureCity);
        clickFirstDepartureCitySuggestion();
    }

    public void setDestinationCity(String destinationCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.destinationCity)
                .sendKeys(destinationCity);
        clickFirstDestinationCitySuggestion();
    }


    //for multi destination
    public void setDepartureCity0(String departureCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.departureCity0)
                .sendKeys(departureCity);

        basePageObject.getWaitUtils();
        WaitUtils.waitFor(5000);
        basePageObject.getWaitUtils().waitForElementVisible(firstPageElements.departureCity0).sendKeys(Keys.ENTER);
        //clickFirstDepartureCitySuggestion();
        //clickFirstDepartureCity3Suggestion();

    }

    public void setDestinationCity0(String destinationCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.destinationCity0)
                .sendKeys(destinationCity);
        basePageObject.getWaitUtils();
        WaitUtils.waitFor(2000);
        basePageObject.getWaitUtils().waitForElementVisible(firstPageElements.destinationCity0).sendKeys(Keys.ENTER);
        // clickFirstDestinationCity3Suggestion();


    }

    public void setDepartureCity1(String departureCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.departureCity1)
                .sendKeys(departureCity);
        basePageObject.getWaitUtils();
        WaitUtils.waitFor(2000);
        basePageObject.getWaitUtils().waitForElementVisible(firstPageElements.departureCity1).sendKeys(Keys.ENTER);

        //  clickFirstDepartureCitySuggestion();
    }

    public void setDestinationCity1(String destinationCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.destinationCity1)
                .sendKeys(destinationCity);
        basePageObject.getWaitUtils();
        WaitUtils.waitFor(2000);
        basePageObject.getWaitUtils().waitForElementVisible(firstPageElements.destinationCity1).sendKeys(Keys.ENTER);

        //  clickFirstDestinationCitySuggestion();
    }

    public void setDestinationCity2(String destinationCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.destinationCity2)
                .sendKeys(destinationCity);
        basePageObject.getWaitUtils();
        WaitUtils.waitFor(2000);
        basePageObject.getWaitUtils().waitForElementVisible(firstPageElements.destinationCity2).sendKeys(Keys.ENTER);
        //   clickFirstDestinationCitySuggestion();
    }

    public void setDepartureCity2(String departureCity) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.departureCity2)
                .sendKeys(departureCity);
        basePageObject.getWaitUtils();
        WaitUtils.waitFor(2000);
        basePageObject.getWaitUtils().waitForElementVisible(firstPageElements.departureCity2).sendKeys(Keys.ENTER);
        //   clickFirstDepartureCitySuggestion();
    }

    public void clickAddLeg0() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.addLeg0)
                .click();
    }

    public void clickAddLeg1() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.addLeg1)
                .click();
    }

    public void setDepartureDate0() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.departureDate0)
                .click();
    }

    public void setDepartureDate1() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.departureDate1)
                .click();
    }

    public void setDepartureDate2() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.departureDate2)
                .click();
    }
    //end of multi destination


    public void clickFirstDepartureCitySuggestion() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.firstSuggestionDep)
                .click();
    }

    public void clickFirstDepartureCity3Suggestion() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.Paris)
                .click();
    }

    public void clickFirstDestinationCity3Suggestion() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.Vienna)
                .click();
    }

    public void clickFirstDestinationCitySuggestion() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.firstSuggestionDest)
                .click();
    }

    public void setDepartureDate() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.departureDate)
                .click();
    }

    public void setReturnDate() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.returnDate)
                .click();
    }

    public void clickNextMonth() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.nextMonth)
                .click();
    }

    public void selectDay() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.selectDay)
                .click();
    }

    public void DayMultiFirstDep() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.multi1dep)
                .click();
    }

    public void DayMultiThirdDep() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.multi3dep)
                .click();
    }

    public void setAdultCounter(int noOfAdults) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.adultCounter)
                .click();

        Select adult = new Select(firstPageElements.adultCounter);
        adult.selectByIndex(noOfAdults);

    }

    public void setCildCounterter(int noOfChild) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.childCounter)
                .click();

        Select adult = new Select(firstPageElements.childCounter);
        adult.selectByIndex(noOfChild);

    }

    public void setInfantCounter(int noOfInfantCounter) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.infantCounter)
                .click();

        Select adult = new Select(firstPageElements.infantCounter);
        adult.selectByIndex(noOfInfantCounter);

    }

    public void setPrefClass(int prefClass) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.prefClass)
                .click();

        Select prefClassDropDown = new Select(firstPageElements.prefClass);
        prefClassDropDown.selectByIndex(prefClass);

    }

    public void clickAdvancedOption() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.advancedOption)
                .click();
    }


    public void clickFlightType(int setFlightType) {
        Actions scrolldown = new Actions(BaseInformation.getDriver());
        JavascriptExecutor js = (JavascriptExecutor) BaseInformation.getDriver();
        js.executeScript("window.scrollBy(0,270)", "");
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.flightType)
                .click();

        Select flightType = new Select(firstPageElements.flightType);
        flightType.selectByIndex(setFlightType);
    }


    public void setPrefAirline(String prefAirline) {
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(firstPageElements.prefAirline)
                .sendKeys(prefAirline);
    }

    public void clickSearch() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(firstPageElements.submitBTN)
                .click();
    }

}