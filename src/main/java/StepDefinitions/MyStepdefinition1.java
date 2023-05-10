package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FirstPage;
import pages.SearchPage;
import pages.confirmPage;
import utilities.ConfigurationReader;

public class MyStepdefinition1 {

    FirstPage firstPage = new FirstPage();
    SearchPage searchPage= new SearchPage();
    @Given("I am on the booking page")
    public void iAmOnTheBookingPage() {
        firstPage.getUrl(ConfigurationReader.getProperty("baseurl"));
    }

    @When("I select one way trip")
    public void iSelectOneWayTrip() {
        firstPage.clickOneWayButton();
    }

    @And("I enter Frankfurt as the departure city")
    public void iEnterAsTheDepartureCity() {
        firstPage.setDepartureCity("Tijuana");
    }//Berlin

    @And("I enter Munich as the destination city")
    public void iEnterAsTheDestinationCity() {firstPage.setDestinationCity("Temuco");}//Paris

    @And("I select 2 adult passengers")
    public void iSelectAdultPassengers() {
        firstPage.setAdultCounter(1);
    }

    @And("I select Economy cabin class")
    public void iSelectCabinClass() {
        firstPage.setPrefClass(1);
       // firstPage.setPrefAirline("Economy");
    }

    @And("I select a date on the upcoming month")
    public void iSelectADateOnTheUpcomingMonth() {
        firstPage.setDepartureDate();
        firstPage.clickNextMonth();
        firstPage.selectDay();
    }
    @And("I click search")
    public void iClickSearch() {
        firstPage.clickSearch();

    }
    @And("I click ratest button")
    public void iClickRatestButton() {
        searchPage.clickRatestButton();
    }

    @And("I click Book Now button")
    public void iClickBookNowButton() {
        searchPage.clickBookBtn(0);
    }

    @And("I set attributes for two passangers")
    public void iSetAttributesForTwoPassangers() {
        confirmPage.setFirstName("Alketa");
        confirmPage.setLastName("Alia");
        confirmPage.setEmail("alketa@gmail.com");
        confirmPage.setConfirmEmail("alketa@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Jenny");
        confirmPage.setLastName2("Smith");
    }
    @And("I select seat 22A, or any available window seat")
    public void iSelectSeatAOrAnyAvailableWindowSeat() {
        confirmPage.selectSeat();
        confirmPage.clickSeat(44);
        confirmPage.passangerTwoSeat(2);
        confirmPage.clickSeat(45);
        confirmPage.save(0);

    }
    @And("I confirm the booking")
    public void iConfirmTheBooking() {
        confirmPage.cvv("1111");
        confirmPage.clickAgree();
        confirmPage.clickConfim();
        confirmPage.verifyMsgIsDisplayed();
    }
}
