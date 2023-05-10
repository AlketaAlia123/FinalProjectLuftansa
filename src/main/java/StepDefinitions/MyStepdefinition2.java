package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FirstPage;
import pages.SearchPage;
import pages.confirmPage;
import utilities.ConfigurationReader;

public class MyStepdefinition2 {
    FirstPage firstPage = new FirstPage();
    SearchPage searchPage= new SearchPage();
    @Given("I am on booking page")
    public void iAmOnBookingPage() {
        firstPage.getUrl(ConfigurationReader.getProperty("baseurl"));
    }
    @When("I select round trip")
    public void iSelectRoundTrip() {
        firstPage.clickRoundTrip();
    }
    @And("I enter Frankfurt departure city")
    public void iEnterParisAsDepartureCity() {
        firstPage.setDepartureCity("Mexico");//paris
    }
    @And("I enter Budapest destination city")
    public void iEnterBerlinAsDestinationCity() {
        firstPage.setDestinationCity("Cancun");//berlin
    }
    @And("I select the required dates")
    public void iSelectTheRequiredDates() {
        firstPage.setDepartureDate();
        //firstPage.clickNextMonth();
        firstPage.selectDay();

        firstPage.setReturnDate();
        firstPage.clickNextMonth();
        firstPage.selectDay();
    }
    @And("I select two adult passengers and one Infant")
    public void iSelectTwoAdultPassengersAndOneInfant() {
        firstPage.setAdultCounter(1);
        firstPage.setInfantCounter(1);
    }
    @And("I select Bussiness cabin class and I set advanced options")
    public void iSelectBussinessCabinClassAndISetAdvancedOptions() {
        firstPage.setPrefClass(3);
        firstPage.clickAdvancedOption();
        firstPage.clickFlightType(1);
        // firstPage.setPrefAirline("Bussiness");
    }
    @And("I click search button")
    public void iClickSearchButton() {
        firstPage.clickSearch();
    }

    @And("I click the ratest button")
    public void iClickTheRatestButton() {
        //Search Page
        searchPage.clickRatestButton();

    }
    @And("I click  Book Now")
    public void iClickBookNow() {
        // searchPage.clickPriceBtn();
        searchPage.clickBookBtn(0);
    }
    @And("I set attributes for three passangers")
    public void iSetAttributesForThreePassangers() {
        confirmPage.setFirstName("Alketa");
        confirmPage.setLastName("Alia");
        confirmPage.setEmail("alketa@gmail.com");
        confirmPage.setConfirmEmail("alketa@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Jenny");
        confirmPage.setLastName2("Smith");
        confirmPage.clickThirdPassanger();
        confirmPage.setFirstName3("Tommy");
        confirmPage.setLastName3("Shelby");
        confirmPage.setDateThirdPassanger(2);
        confirmPage.setMonthThirdPassanger("Jun");
        confirmPage.setYearThirdPassanger(3);
    }
    @And("I click Credit card")
    public void iClickCreditCard() {
        confirmPage.clickCredit();

    }
    @And("I book a car")
    public void iBookACar() {
        confirmPage.clickAddCar();
        confirmPage.clickSearchButton();
        confirmPage.clickBookNow(1);
    }
    @And("I fullfill the travellers's infos again")
    public void iFullfillTheTravellersSInfosAgain() {
        confirmPage.setFirstName("Alketa");
        confirmPage.setLastName("Alia");
        confirmPage.setEmail("alketa@gmail.com");
        confirmPage.setConfirmEmail("alketa@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Jenny");
        confirmPage.setLastName2("Smith");
        confirmPage.clickThirdPassanger();
        confirmPage.setFirstName3("Tommy");
        confirmPage.setLastName3("Shelby");
        confirmPage.setDateThirdPassanger(2);
        confirmPage.setMonthThirdPassanger("Jun");
        confirmPage.setYearThirdPassanger(3);
    }
    @And("I enter cvv number")
    public void iEnterCvvNumber() {
        confirmPage.cvv2("1111");
    }
    @And("I fullfill the credit card's info")
    public void iFullfillTheCreditCardSInfo() {
        confirmPage.clickCvvOfCreditCard("737");
        confirmPage.expDateCard(3);
        confirmPage.expYearCard(2);
        confirmPage.enterNameCreditCard("John Doe");
        confirmPage.enterCreditCardNr("5555341244441115");
    }
    @And("I enter city, zip code and address")
    public void iEnterCityZipCodeAndAddress() {
        confirmPage.enterCity("Tirana");
        confirmPage.enterAddress("Don Bosko");
        confirmPage.enterZipCode("1111");
    }
    @And("I confirm the booking is done correctly")
    public void iConfirmTheBookingIsDoneCorrectly() {
        confirmPage.clickAgree();
        confirmPage.clickConfim();
        confirmPage.verifyMsgIsDisplayed();
        String[] travelerNames = {"Alketa Alia", "Jenny Smith", "Tommy Shelby"};
        confirmPage.verifyTravelerNames(travelerNames);
    }
}
