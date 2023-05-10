package elements;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

import java.util.List;

public class SearchPageElements {
    public SearchPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "div[class='ui mini light-blue ff-price-padding button']" )
    public WebElement mobileRatesMatrixBtn;


    @FindBy(css = "div.non-mobile-ff button.red" )
    public static List<WebElement> bookBtn;
    @FindBy(css = "   button.ui.button.red" )
    public static WebElement bookNow3;

    // [@class = 'fields non-mobile-ff']


}

