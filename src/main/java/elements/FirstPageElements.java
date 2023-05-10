package elements;

import utilities.BaseInformation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPageElements {
    public FirstPageElements(){

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "li[id='OneWay']")
    public  WebElement oneWay;

    @FindBy(css = "li[id='RoundTrip']")
    public  WebElement roundTrip;

    @FindBy(css = "li[id='MultiDestination']")
    public  WebElement multiDes;

    @FindBy(css = "input[id='departure_city']")
    public  WebElement departureCity;


    @FindBy(css = "input[id='destination_city']")
    public  WebElement destinationCity;

    //for multi Destinations
    @FindBy(css = "input[id='departure_city_0']")
    public  WebElement departureCity0;


    @FindBy(css = "input[id='destination_city_0']")
    public  WebElement destinationCity0;

    @FindBy(css = "input[id='departure_city_1']")
    public  WebElement departureCity1;
    @FindBy(css = "input[id='departure_city_1']")
    public  WebElement  firstSuggestionDep3;
    @FindBy(xpath = "/html/body/div[11]/div/ul/li/a")
    public  WebElement  Vienna;
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/div/ul/li[2]/a")
    public  WebElement Paris;
    @FindBy(css = "ul.ui-autocomplete li:first-child a")
    public  WebElement  Tirana;
    @FindBy(xpath = "/html/body/div[11]/div/div/ul/li[1]/a")
    public  WebElement  NewYork;
    @FindBy(css = "ul[id='ui-id-17'] li:first-child a:first-child")
    public  WebElement  Frankfurti;
    @FindBy(css = "input[id='destination_city_1']")
    public  WebElement destinationCity1;

    @FindBy(css = "input[id='departure_city_2']")
    public  WebElement departureCity2;


    @FindBy(css = "input[id='destination_city_2']")
    public  WebElement destinationCity2;


    @FindBy(css = "a[id='addLeg_0']")
    public  WebElement addLeg0;

    @FindBy(css = "a[id='addLeg_1']")
    public  WebElement addLeg1;


    @FindBy(css = "input[id='departure_date_0']")
    public  WebElement departureDate0;

    @FindBy(css = "input[id='return_date_0']")
    public  WebElement returnDate0;


    @FindBy(css = "input[id='departure_date_1']")
    public  WebElement departureDate1;

    @FindBy(css = "input[id='return_date_1']")
    public  WebElement returnDate1;


    @FindBy(css = "input[id='departure_date_2']")
    public  WebElement departureDate2;

    @FindBy(css = "input[id='return_date_2']")
    public  WebElement returnDate2;
    //end of multi Destinations



    @FindBy(css = "ul[id='ui-id-1'] li:first-child a:first-child")
    public  WebElement firstSuggestionDep;

    @FindBy(css = "ul[id='ui-id-2'] li:first-child a:first-child")
    public  WebElement firstSuggestionDest;


    @FindBy(css = "input[id='departure_date']")
    public  WebElement departureDate;

    @FindBy(css = "input[id='return_date']")
    public  WebElement returnDate;

    @FindBy(css = "a[class='ui-datepicker-next ui-corner-all']" )
    public WebElement nextMonth;

    @FindBy(css = "td[data-handler='selectDay']" )
    public WebElement selectDay;
    @FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a" )
    public WebElement multi1dep;
    @FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(7) > a" )
    public WebElement multi3dep;

    @FindBy(css = "select[id='adult-counter']")
    public  WebElement adultCounter;


    @FindBy(css = "select[id='child-counter']")
    public  WebElement childCounter;

    @FindBy(css = "select[id='infant-counter']")
    public  WebElement infantCounter;

    @FindBy(css = "select[id='pref_class']")
    public  WebElement prefClass;



    @FindBy(css = "i[class='dropdown icon']")
    public  WebElement advancedOption;

    @FindBy(css = "select[id='non_stop_flights']")
    public  WebElement flightType;


    @FindBy(css = "input[name='pref_airline']")
    public  WebElement prefAirline;

    @FindBy(css = "div[id='submitBTN']")
    public  WebElement submitBTN;

}
