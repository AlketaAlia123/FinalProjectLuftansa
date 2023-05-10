package pages;

import elements.SearchPageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import elements.ConfirmPageElements;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BaseInformation;
import utilities.BasePageObject;
import utilities.WaitUtils;

public class confirmPage {
    static BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    static ConfirmPageElements confirmPageElements =  new ConfirmPageElements();

    public confirmPage(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public static void setFirstName(String fname){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.firstName1)
                .sendKeys(fname);
    }
    public static void setLastName(String lname){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.lastName1)
                .sendKeys(lname);
    }

    public static void setEmail(String email){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.email)
                .sendKeys(email);
    }
    public static void setConfirmEmail(String email){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.confrimEmail)
                .sendKeys(email);
    }
    public static void setPhoneNo(String phoneNo){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.phone1)
                .sendKeys(phoneNo);
    }
    public static void  clickSecondPassanger() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.passangerDropdown.get(2))
                .click();

        Actions scrolldown =new Actions(BaseInformation.getDriver());
        JavascriptExecutor js=(JavascriptExecutor) BaseInformation.getDriver();
        js.executeScript("window.scrollBy(0,410)", "");

    }
    public static void  clickThirdPassanger() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.passangerDropdown.get(4))
                .click();

        Actions scrolldown =new Actions(BaseInformation.getDriver());
        JavascriptExecutor js=(JavascriptExecutor) BaseInformation.getDriver();
        js.executeScript("window.scrollBy(0,410)", "");

    }
    public static void  clickFourthPassanger() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.passangerDropdown.get(6))
                .click();

        Actions scrolldown =new Actions(BaseInformation.getDriver());
        JavascriptExecutor js=(JavascriptExecutor) BaseInformation.getDriver();
        js.executeScript("window.scrollBy(0,410)", "");

    }
    public static void  clickFifthPassanger() {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.passangerDropdown.get(8))
                .click();

        Actions scrolldown =new Actions(BaseInformation.getDriver());
        JavascriptExecutor js=(JavascriptExecutor) BaseInformation.getDriver();
        js.executeScript("window.scrollBy(0,410)", "");

    }
    public static void setFirstName2(String fname2){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.firstName2)
                .sendKeys(fname2);
    }
    public static void setLastName2(String lname2){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.lastName2)
                .sendKeys(lname2);
    }
    public static void setFirstName3(String fname3){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.firstName3)
                .sendKeys(fname3);
    }
    public static void setLastName3(String lname3){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.lastName3)
                .sendKeys(lname3);
    }
    public static void setFirstName4(String fname4){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.firstName4)
                .sendKeys(fname4);
    }
    public static void setLastName4(String lname4){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.lastName4)
                .sendKeys(lname4);
    }
    public static void setFirstName5(String fname5){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(confirmPageElements.firstName5)
                .sendKeys(fname5);
    }
    public static void setLastName5(String lname5){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.lastName5)
                .sendKeys(lname5);
    }
    public static void setDateThirdPassanger(int date){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.date3pass)
                .click();

        Select date3 =new Select(confirmPageElements.date3pass);
        date3 .selectByIndex(date);
    }
    public static void setMonthThirdPassanger(String month){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.month3pass)
                .click();

        Select month3  =new Select(confirmPageElements.month3pass);
        month3.selectByVisibleText(month);
    }
    public static void setYearThirdPassanger(int year){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.year3pass)
                .click();

        Select year3 =new Select(confirmPageElements.year3pass);
      year3.selectByIndex(year);
    }
    public static void setDateSecondPassanger(int date){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.date2pass)
                .click();

        Select date2 =new Select(confirmPageElements.date2pass);
        date2.selectByIndex(date);
    }
    public static void setMonthSecondPassanger(String month){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.month2pass)
                .click();

        Select month2 =new Select(confirmPageElements.month2pass);
        month2.selectByVisibleText(month);
    }
    public static void setYearSecondPassanger(int year){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.year2pass)
                .click();
        Select year2 =new Select(confirmPageElements.year2pass);
       year2.selectByIndex(year);
    }

    public static void setDateFirstPassanger(int date){        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.date1pass)
                .click();

        Select date1 =new Select(confirmPageElements.date1pass);
        date1.selectByIndex(date);
    }
    public static void setMonthFirstPassanger(String month){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.month1pass)
                .click();

        Select month1 =new Select(confirmPageElements.month1pass);
        month1.selectByVisibleText(month);
    }
    public static void setYearFirstPassanger(int year){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.year1pass)
                .click();

        Select year1 =new Select(confirmPageElements.year1pass);
        year1.selectByIndex(year);
    }


    public static void setDateFourthPassanger(int date){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.date4pass)
                .click();

        Select date4 =new Select(confirmPageElements.date4pass);
        date4.selectByIndex(date);
    }
    public static void setMonthFourthPassanger(String month){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.month4pass)
                .click();

        Select month4=new Select(confirmPageElements.month4pass);
        month4.selectByVisibleText(month);
    }
    public static void setYearFourthPassanger(int year){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.year1pass)
                .click();

        Select year4 =new Select(confirmPageElements.year4pass);
        year4.selectByIndex(year);
    }
    public static void setDateFifthPassanger(int date){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.date5pass)
                .click();
        Select date5=new Select(confirmPageElements.date5pass);
        date5.selectByIndex(date);
    }
    public static void setMonthFifthPassanger(String month){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.month5pass)
                .click();

        Select month5=new Select(confirmPageElements.month5pass);
        month5.selectByVisibleText(month);
    }
    public static void setYearFifthPassanger(int year){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.year5pass)
                .click();

        Select year5 =new Select(confirmPageElements.year5pass);
        year5.selectByIndex(year);
    }    public static void selectSeat(){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.seatBtn)
                .click();
    }
    public static void clickSeat(int i){

        WebElement seat = ConfirmPageElements.seats.get(i);
        basePageObject.getWebElementUtils().scrollToElement2(seat);;
        seat.click();
    }

    public static void passangerTwoSeat(int i){

        WebElement pass2seat = ConfirmPageElements.selectSecondPassagerSeat.get(i);
        basePageObject.getWebElementUtils().scrollToElement2(pass2seat);;
        pass2seat.click();
    }

    public static void save(int i){

        WebElement saveBtn = ConfirmPageElements.save.get(i);
        //basePageObject.getWebElementUtils().scrollToElement2(saveBtn);;
       basePageObject.getWaitUtils().waitForElementClickable(saveBtn).click();
    }

    public static void clickCredit(){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.creditCard);
        ConfirmPageElements.creditCard.click();
    }
    public static void clickAddCar(){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.addCar);
        ConfirmPageElements.addCar.click();
    }
    public static void clickAddHotel(){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.addHotel);
        ConfirmPageElements.addHotel.click();
    }
    public static void setCheckInLocation(String checkInLocation){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(ConfirmPageElements.checkInLocation)
                .sendKeys( checkInLocation);

        basePageObject.getWaitUtils();
        WaitUtils.waitFor(5000);
        basePageObject.getWaitUtils().waitForElementVisible(ConfirmPageElements.checkInLocation).sendKeys(Keys.ENTER);}
    public static void setCheckInDate(){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.checkInDate)
                .click();
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.checkInDate21)
                .click();
    }
    public static void setCheckOutdate(){
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.checkOutDate)
                .click();
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.checkOutDate22)
                .click();
    }

    public static void setRooms(int rooms) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.rooms)
                .click();

        Select room =new Select(ConfirmPageElements.rooms);
        room.selectByIndex(rooms);

    }
    public static void setNrofAdults(int adults) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.adults)
                .click();

        Select adult =new Select(ConfirmPageElements.adults);
        adult.selectByIndex(adults);

    }
    public static void setNrofChildren(int children) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.children)
                .click();

        Select child =new Select(ConfirmPageElements.children);
        child.selectByIndex(children);

    }
    public static void setAgeChild1(int age1) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.ageChild1)
                .click();

        Select child =new Select(ConfirmPageElements.ageChild1);
        child.selectByIndex(age1);

    }
    public static void setAgeChild2(int age2) {
        basePageObject
                .getWaitUtils()
                .waitForElementClickable(ConfirmPageElements.ageChild2)
                .click();

        Select child =new Select(ConfirmPageElements.ageChild2);
        child.selectByIndex(age2);

    }
    public static void selectHotel(int i){

        WebElement button = ConfirmPageElements.selectBtn.get(i);
        basePageObject.getWebElementUtils().scrollToElement2(button);
        button.click();
    }
    public static void showMaxPrice(){
        basePageObject.getWebElementUtils().isElementVisibleWithWait(10000, (WebElement) confirmPageElements.hotelPrice);

        String text =  confirmPageElements.hotelPrice.get(11).getText();
        System.out.println(text);

        String messageText1 =confirmPageElements.hotelPrice.get(1).getText().trim();

        System.out.println("The max price of hotel is: "+messageText1 );
    }
    //thirre me index 2
    public  static void bookHotel(int i){

        WebElement button = ConfirmPageElements.selectBtn.get(i);
        basePageObject.getWebElementUtils().scrollToElement2(button);
        button.click();
    }
    public static void clickSearchButton(){
      basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.searchButon);
        ConfirmPageElements.searchButon.click();
    }
    public static void clickConfim(){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.confirm)
                .click();
    }
    public static void cvv(String cvvNr){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.cvv).sendKeys(cvvNr);
        ;
    }
    public static void cvv2(String cvvNr){
        basePageObject.getWebElementUtils().scrollToBottomOfPage();
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.cvv).sendKeys(cvvNr);
    }
    public static void clickCvvOfCreditCard(String cvvNr){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.cvvOfCreditCard);
        ConfirmPageElements.cvvOfCreditCard.sendKeys(cvvNr);
    }
    public static void enterNameCreditCard(String nameCreditCard){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.nameOnCard);
        ConfirmPageElements.nameOnCard.sendKeys(nameCreditCard);
    }

    public static void expDateCard(int date2){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.expireDate)
                .click();

        Select date =new Select(confirmPageElements.expireDate);
        date.selectByIndex(date2);
    }
    public static void expYearCard(int year){
        basePageObject
                .getWaitUtils()
                .waitForElementVisible(confirmPageElements.expireYear)
                .click();

        Select year2 =new Select(confirmPageElements.expireYear);
        year2.selectByIndex(year);
    }
    public static void enterCreditCardNr(String creditCardNumber){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.cardNr);
        ConfirmPageElements.cardNr.sendKeys(creditCardNumber);
    }
    public static void enterZipCode(String zipCode){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.zipCode);
        ConfirmPageElements.zipCode.sendKeys(zipCode);
    }
    public static void enterCity(String city){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.city);
        ConfirmPageElements.city.sendKeys(city);
    }
    public static void enterAddress(String address){
        basePageObject.getWebElementUtils().scrollToElement2(ConfirmPageElements.address);
        ConfirmPageElements.address.sendKeys(address);
    }
    public static void clickAgree(){

        basePageObject.getWebElementUtils().scrollToElement2(confirmPageElements.agree);
        confirmPageElements.agree.click();
    }
    public static void clickBookNow(int i){

        WebElement button = ConfirmPageElements.bookNow.get(i);
        basePageObject.getWebElementUtils().scrollToElement2(button);
        button.click();
    }
    public  static void verifyMsgIsDisplayed(){
        basePageObject.getWebElementUtils().isElementVisibleWithWait(10000, confirmPageElements.bookingConfirmMsg);
    basePageObject.getWebElementUtils().verifyElementIsDisplayed(confirmPageElements.bookingConfirmMsg);
    String text = confirmPageElements.bookingConfirmMsg.getText();
    System.out.println(text);
    String subText ="booking reference number";
    System.out.println(text.contains(subText));
    String messageText1 =confirmPageElements.confirmTable.getText().trim();
    System.out.println("Your booking number is: "+messageText1 );
}
    public static  void verifyTravelerNames(String[] expectedNames) {
        for(int i=0; i<ConfirmPageElements.travelerNames.size(); i++) {
            String actualName = ConfirmPageElements.travelerNames.get(i).getText();
            Assert.assertEquals(actualName, expectedNames[i]);
        }
    }
}

