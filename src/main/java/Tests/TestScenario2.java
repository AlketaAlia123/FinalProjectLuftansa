package Tests;



import org.testng.annotations.AfterTest;


import pages.FirstPage;
import pages.SearchPage;
import pages.confirmPage;
import utilities.BaseInformation;
import utilities.ConfigurationReader;

public class TestScenario2 {
    FirstPage firstPage = new FirstPage();
    SearchPage searchPage= new SearchPage();
    @AfterTest
    public void quit(){
        BaseInformation.quit();
    }
    public void test(){
        firstPage.getUrl(ConfigurationReader.getProperty("baseurl"));
        firstPage.clickRoundTrip();
        firstPage.setDepartureCity("Paris");
        firstPage.setDestinationCity("Berlin"); //Budapest
        firstPage.setDepartureDate();
        //firstPage.clickNextMonth();
        firstPage.selectDay();

        firstPage.setReturnDate();
        firstPage.clickNextMonth();
        firstPage.selectDay();

        firstPage.setAdultCounter(1);
        firstPage.setInfantCounter(1);
        firstPage.setPrefClass(3);
        firstPage.clickAdvancedOption();
        firstPage.clickFlightType(1);
        firstPage.clickSearch();

        //Search Page
        searchPage.clickRatestButton();
       // searchPage.clickPriceBtn();
          searchPage.clickBookBtn(0);
        confirmPage.setFirstName("Test");
        confirmPage.setLastName("Test1");
        confirmPage.setEmail("Test@gmail.com");
        confirmPage.setConfirmEmail("Test@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Testt");
        confirmPage.setLastName2("Testtt");
        confirmPage.clickThirdPassanger();
        confirmPage.setFirstName3("Testtttt");
        confirmPage.setLastName3("Testtttttt");
        confirmPage.setDateThirdPassanger(2);
        confirmPage.setMonthThirdPassanger("Jun");
        confirmPage.setYearThirdPassanger(3);
        confirmPage.clickCredit();
        confirmPage.clickAddCar();
        confirmPage.clickSearchButton();
        confirmPage.clickBookNow(1);
        confirmPage.setFirstName("Test");
        confirmPage.setLastName("Test1");
        confirmPage.setEmail("Test@gmail.com");
        confirmPage.setConfirmEmail("Test@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Testt");
        confirmPage.setLastName2("Testtt");
        confirmPage.clickThirdPassanger();
        confirmPage.setFirstName3("Testtttt");
        confirmPage.setLastName3("Testtttttt");
        confirmPage.setDateThirdPassanger(2);
        confirmPage.setMonthThirdPassanger("Jun");
        confirmPage.setYearThirdPassanger(3);

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
        //  Assert.assertTrue(firstPage.checkRegister());
    }
}
