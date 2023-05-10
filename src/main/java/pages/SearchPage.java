package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import elements.SearchPageElements;
import utilities.BaseInformation;
import utilities.BasePageObject;

public class SearchPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    SearchPageElements searchPageElements =  new SearchPageElements();

    public SearchPage(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }
    public void clickRatestButton(){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(searchPageElements.mobileRatesMatrixBtn)
                .click();
    }

    public void clickBookBtn(int i){

        WebElement button = SearchPageElements.bookBtn.get(i);
        basePageObject.getWebElementUtils().scrollToElement2(button);
        button.click();
    }
    public void clickBookNow3(){

        basePageObject
                .getWaitUtils()
                .waitForElementVisible(searchPageElements.bookNow3)
                .click();
    }

}
