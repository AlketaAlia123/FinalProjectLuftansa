package Tests;


import org.testng.annotations.AfterTest;

import pages.FirstPage;
import pages.SearchPage;
import pages.confirmPage;
import utilities.BaseInformation;
import utilities.ConfigurationReader;

public class TestScenario3 {
    FirstPage firstPage = new FirstPage();
    SearchPage searchPage= new SearchPage();
    @AfterTest
    public void quit(){
        BaseInformation.quit();
    }
    public void test(){
        firstPage.getUrl(ConfigurationReader.getProperty("baseurl"));
        firstPage.clickMultiDes();;

        firstPage.setDepartureCity0("New York"); //Tirana
        //firstPage.setDepartureCity0("Paris"); //Tirana
        firstPage.setDestinationCity0("Miami"); //Vienna
        firstPage.setDepartureDate0();
        //firstPage.selectDay();
        firstPage.DayMultiFirstDep();
        firstPage.clickAddLeg0();
        firstPage.setDepartureCity1("Miami"); //Vienna
        firstPage.setDestinationCity1("San Francisco");//Bangkok
        firstPage.setDepartureDate1();
        //firstPage.selectDay();
        firstPage.DayMultiFirstDep();
        firstPage.clickAddLeg1();
        firstPage.setDepartureCity2("San Francisco"); //Bangkok
        firstPage.setDestinationCity2("Miami");//Vienna
        firstPage.setDepartureDate2();
        firstPage.DayMultiThirdDep();
        //firstPage.selectDay();
        //firstPage.clickNextMonth();
        firstPage.setAdultCounter(2);
        firstPage.setCildCounterter(2);
        firstPage.setPrefClass(1);
        firstPage.clickAdvancedOption();
        firstPage.clickFlightType(1);
        //firstPage.setPrefAirline("Austrian");
        firstPage.clickSearch();
        searchPage.clickRatestButton();

        searchPage.clickBookNow3();

        //confirmPage.setMultiFirstName("Test");
        //confirmPage.setMultiLastName("Test");
        confirmPage.setFirstName("Test");
        confirmPage.setLastName("Test1");
        confirmPage.setEmail("Test@gmail.com");
        confirmPage.setConfirmEmail("Test@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.setDateFirstPassanger(4);
        confirmPage.setMonthFirstPassanger("July");
        confirmPage.setYearFirstPassanger(1);
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Testt");
        confirmPage.setLastName2("Testtt");
        confirmPage.setDateSecondPassanger(2);
        confirmPage.setMonthSecondPassanger("July");
        confirmPage.setYearSecondPassanger(3);
        confirmPage.clickThirdPassanger();
        confirmPage.setFirstName3("Testtttt");
        confirmPage.setLastName3("Testtttttt");
        confirmPage.setDateThirdPassanger(2);
        confirmPage.setMonthThirdPassanger("Jun");
        confirmPage.setYearThirdPassanger(3);
        confirmPage.clickFourthPassanger();
        confirmPage.setFirstName4("Testtttt");
        confirmPage.setLastName4("Testtttttt");
        confirmPage.setDateFourthPassanger(2);
        confirmPage.setMonthFourthPassanger("Jun");
        confirmPage.setYearFourthPassanger(3);
        confirmPage.clickFifthPassanger();
        confirmPage.setFirstName5("Testtttt");
        confirmPage.setLastName5("Testtttttt");
        confirmPage.setDateFifthPassanger(2);
        confirmPage.setMonthFifthPassanger("Jun");
        confirmPage.setYearFifthPassanger(3);
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
        confirmPage.setFirstName("Test");
        confirmPage.setLastName("Test1");
        confirmPage.setEmail("Test@gmail.com");
        confirmPage.setConfirmEmail("Test@gmail.com");
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
    }
}
