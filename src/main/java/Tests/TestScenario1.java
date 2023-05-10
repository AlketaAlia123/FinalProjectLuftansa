package Tests;


import pages.FirstPage;
import pages.SearchPage;
import pages.confirmPage;
import utilities.BaseInformation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class TestScenario1 {
    FirstPage firstPage = new FirstPage();
    SearchPage searchPage= new SearchPage();
    @AfterTest
    public void quit(){
        BaseInformation.quit();
    }
    @Test
    public void test(){
        firstPage.getUrl(ConfigurationReader.getProperty("baseurl"));
        firstPage.clickOneWayButton();
        firstPage.setDepartureCity("Berlin");
        firstPage.setDestinationCity("Paris");
        firstPage.setDepartureDate();
        firstPage.clickNextMonth();
        firstPage.selectDay();
        firstPage.setAdultCounter(1);
        firstPage.setPrefClass(1);
        firstPage.clickSearch();

        //Search Page
        searchPage.clickRatestButton();
        //searchPage.clickPriceBtn();
         searchPage.clickBookBtn(0);
        confirmPage.setFirstName("Test");
        confirmPage.setLastName("Test1");
        confirmPage.setEmail("Test@gmail.com");
        confirmPage.setConfirmEmail("Test@gmail.com");
        confirmPage.setPhoneNo("355691212123");
        confirmPage.clickSecondPassanger();
        confirmPage.setFirstName2("Testt");
        confirmPage.setLastName2("Testtt");
        confirmPage.selectSeat();
        confirmPage.clickSeat(44);
        confirmPage.passangerTwoSeat(2);
        confirmPage.clickSeat(45);
        confirmPage.save(0);

        confirmPage.cvv("1111");
        // confirmPage.clickCash();
       confirmPage.clickAgree();
        confirmPage.clickConfim();
       // confirmPage.getBookingNr();
        confirmPage.verifyMsgIsDisplayed();
        //confirmPage.clickAgree();
        //  Assert.assertTrue(firstPage.checkRegister());
    }
}

