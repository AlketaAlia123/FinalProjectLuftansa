package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FirstPage;
import pages.SearchPage;
import pages.confirmPage;
import utilities.ConfigurationReader;

public class MyStepdefinition3 {
    FirstPage firstPage = new FirstPage();
    SearchPage searchPage= new SearchPage();

    @Given("I am on  booking page")
    public void iAmOnBookingPage() {
        firstPage.getUrl(ConfigurationReader.getProperty("baseurl"));
    }

    @When("I select multi destination trip")
    public void iSelectMultiDestinationTrip() {
        firstPage.clickMultiDes();;
    }
    @And("I enter the routes")
    public void iEnterTheRoutes() {
        firstPage.setDepartureCity0("Mexico City");
        //  firstPage.setDepartureCity0("Paris");
        firstPage.setDestinationCity0("Cancun");
        firstPage.setDepartureDate0();
        // firstPage.selectDay();
        firstPage.DayMultiFirstDep();
        firstPage.clickAddLeg0();
        firstPage.setDepartureCity1("Cancun");
        firstPage.setDestinationCity1("Tijuana");
        firstPage.setDepartureDate1();
        // firstPage.selectDay();
        firstPage.DayMultiFirstDep();
        firstPage.clickAddLeg1();

        firstPage.setDepartureCity2("Tijuana");
        firstPage.setDestinationCity2("Mexico City");
        firstPage.setDepartureDate2();
        firstPage.DayMultiThirdDep();
    }
    @And("I select three adult passengers and two children")
    public void iSelectAdultPassengersAndChildren() {
        firstPage.setAdultCounter(2);
        firstPage.setCildCounterter(2);
    }
    @And("I select  cabin class Economy")
    public void iSelectCabinClassEconomy() {
        firstPage.setPrefClass(1);
        firstPage.clickAdvancedOption();
        firstPage.clickFlightType(1);
    }

    @And("I click  search button")
    public void iClickSearchButton() {
        firstPage.clickSearch();
    }
    @And("I click  ratest button")
    public void iClickRatestButton() {
        searchPage.clickRatestButton();
    }
    @And("I click Book Now  button")
    public void iClickBookNowButton() {
        searchPage.clickBookNow3();
    }
    @And("I set attributes for three adults and two children")
    public void iSetAttributesForThreeAdultsAndTwoChildren() {

        confirmPage.setFirstName("Alketa");
        confirmPage.setLastName("Alia");
        confirmPage.setEmail("alketa@gmail.com");
        confirmPage.setConfirmEmail("alketa@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.setDateFirstPassanger(4);
        confirmPage.setMonthFirstPassanger("Jul");
        confirmPage.setYearFirstPassanger(1);
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Jenny");
        confirmPage.setLastName2("Smith");
        confirmPage.setDateSecondPassanger(2);
        confirmPage.setMonthSecondPassanger("Jul");
        confirmPage.setYearSecondPassanger(3);
        confirmPage.clickThirdPassanger();
        confirmPage.setFirstName3("Tommy");
        confirmPage.setLastName3("Shelber");
        confirmPage.setDateThirdPassanger(2);
        confirmPage.setMonthThirdPassanger("Jun");
        confirmPage.setYearThirdPassanger(3);
        confirmPage.clickFourthPassanger();
        confirmPage.setFirstName4("Jeff");
        confirmPage.setLastName4("Bezos");
        confirmPage.setDateFourthPassanger(2);
        confirmPage.setMonthFourthPassanger("Jun");
        confirmPage.setYearFourthPassanger(3);
        confirmPage.clickFifthPassanger();
        confirmPage.setFirstName5("Ann");
        confirmPage.setLastName5("Taylor");
        confirmPage.setDateFifthPassanger(2);
        confirmPage.setMonthFifthPassanger("Jun");
        confirmPage.setYearFifthPassanger(3);
    }
    @And("I add a hotel")
    public void iAddAHotel() {
        confirmPage.clickCredit();
        confirmPage.clickAddHotel();
        confirmPage.setCheckInLocation("Miami");
        confirmPage.setCheckInDate();
        confirmPage.setCheckOutdate();
        confirmPage.setRooms(1);
        confirmPage.setNrofChildren(3);
        confirmPage.setNrofAdults(2);
        confirmPage.setAgeChild1(2);
        confirmPage.setAgeChild2(2);
        confirmPage.selectHotel(0);
        confirmPage.showMaxPrice();
        confirmPage.bookHotel(2);
    }
    @And("I finally confirm the booking")
    public void iFinallyConfirmTheBooking() {
        confirmPage.setFirstName("Alketa");
        confirmPage.setLastName("Alia");
        confirmPage.setEmail("alketa@gmail.com");
        confirmPage.setConfirmEmail("alketa@gmail.com");
        confirmPage.cvv2("1111");
        confirmPage.clickCvvOfCreditCard("737");
        confirmPage.expDateCard(3);
        confirmPage.expYearCard(2);
        confirmPage.enterNameCreditCard("John Doe");
        confirmPage.enterCreditCardNr("5555341244441115");
        confirmPage.enterCity("Tirana");
        confirmPage.enterAddress("Don Bosko");
        confirmPage.enterZipCode("1111");
        confirmPage.clickAgree();
        confirmPage.clickConfim();
        confirmPage.verifyMsgIsDisplayed();
        String[] travelerNames = {"Alketa Alia", "Jenny Smith", "Tommy Shelber"," Jeff Bezos", "Ann Taylor"};
        confirmPage.verifyTravelerNames(travelerNames);
    }
}
