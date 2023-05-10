package elements;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseInformation;

import java.util.List;

public class ConfirmPageElements {
    public ConfirmPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "input[id='fname_0']")
    public static WebElement firstName1;
    @FindBy(css = "input[id='lname_0']")
    public static   WebElement lastName1;
    @FindBy(css = "input[id='email_0']")
    public  WebElement email;
    @FindBy(css = "input[id='email_c_0']")
    public  WebElement confrimEmail;

    @FindBy(css = "input[id='phone_0']")
    public  WebElement phone1;

    @FindBy(css = "input[id='fname_1']")
    public  WebElement firstName2;

    @FindBy(css = "input[id='lname_1']")
    public  WebElement lastName2;
    @FindBy(css = "input[id='fname_2']")
    public  WebElement firstName3;

    @FindBy(css = "input[id='lname_2']")
    public  WebElement lastName3;
    @FindBy(css = "input[id='fname_3']")
    public  WebElement firstName4;

    @FindBy(css = "input[id='lname_3']")
    public  WebElement lastName4;
    @FindBy(css = "input[id='fname_4']")
    public  WebElement firstName5;

    @FindBy(css = "input[id='lname_4']")
    public  WebElement lastName5;
    @FindBy(css = "select[id='bdate_d_2']")
    public  WebElement date3pass;
    @FindBy(css = "select[id='bdate_m_2']")
    public  WebElement month3pass;
    @FindBy(css = "select[id='bdate_y_2']")
    public  WebElement year3pass;
    @FindBy(css = "select[id='bdate_d_0']")
    public  WebElement date1pass;
    @FindBy(css = "select[id='bdate_m_0']")
    public  WebElement month1pass;
    @FindBy(css = "select[id='bdate_y_0']")
    public  WebElement year1pass;
    @FindBy(css = "select[id='bdate_d_1']")
    public  WebElement date2pass;
    @FindBy(css = "select[id='bdate_m_1']")
    public  WebElement month2pass;
    @FindBy(css = "select[id='bdate_y_1']")
    public  WebElement year2pass;
    @FindBy(css = "select[id='bdate_d_3']")
    public  WebElement date4pass;
    @FindBy(css = "select[id='bdate_m_3']")
    public  WebElement month4pass;
    @FindBy(css = "select[id='bdate_y_3']")
    public  WebElement year4pass;
    @FindBy(css = "select[id='bdate_d_4']")
    public  WebElement date5pass;
    @FindBy(css = "select[id='bdate_m_4']")
    public  WebElement month5pass;
    @FindBy(css = "select[id='bdate_y_4']")
    public  WebElement year5pass;
    @FindBy(css = "div.ref_num_btn h2")
    public WebElement bookingConfirmMsg;
    @FindBy(css = "i[class='dropdown icon']")
    public List<WebElement> passangerDropdown;
    @FindBy(css = "button[id= 'seatSelectionBtn']")
    public  WebElement seatBtn;
    @FindBy(css = "span.seat-text")
    public static List<WebElement> seats;
    @FindBy(css = ".ui.blue.button.save-seats")
    public static List<WebElement> save;
    @FindBy(css = " li.pax-item")
    public static List<WebElement> selectSecondPassagerSeat;
    @FindBy(css = "input[id='B2CallMeRadioButton']")
    public  WebElement cash;
    @FindBy(css = "input[id='B2CCreditCardRadioButton']")
    public static WebElement creditCard;
    @FindBy(css = "a[id='btnCreateBooking']")
    public  WebElement confirm;
    @FindBy(css = "input[id='cbRules']")
    public  WebElement agree;
    @FindBy(css = "input[name='shoppingCart']")
    public  WebElement cvv;
    @FindBy(css = "#bookingResultDiv > div.ui.segment.white.ticket_bkng > div.ref_num_btn > h2 > span")
    public  WebElement confirmTable;
    @FindBy(css = "#addCarTravelTypeDiv > button ")
    public static WebElement addCar;
    @FindBy(css = "#addHotelTravelTypeDiv > button ")
    public static WebElement addHotel;
    @FindBy(css = "input[name='city']")
    public static WebElement checkInLocation;
    @FindBy(css = "input[name='departure_date']")
    public static WebElement checkInDate;
    @FindBy(css = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]")
    public static WebElement checkInDate21;
    @FindBy(css = "input[name='return_date']")
    public static WebElement checkOutDate;
    @FindBy(css = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")
    public static WebElement checkOutDate22;
    @FindBy(css = "select[id='Rooms']")
    public static WebElement rooms;
    @FindBy(css = "select[child-counter_1]")
    public static WebElement children;
    @FindBy(css = "#childage_1_Room1")
    public static WebElement ageChild1;
    @FindBy(css = "#childage_2_Room1")
    public static WebElement ageChild2;
    @FindBy(css = "#SelectBtn")
    public static List <WebElement> selectBtn;
    @FindBy(css = "div.four.wide.column.centered.grid")
    public static List <WebElement> hotelPrice;
    @FindBy(css = " button.ui.button.light-blue")
    public static List <WebElement> bookNowHotel;
    @FindBy(css = "adult-counter_1")
    public static WebElement adults;
    @FindBy(css = "div[id='submitBTN']")
    public static WebElement searchButon;
    @FindBy(css = "button.ui.button.light-blue.right.floated")
    public static List <WebElement> bookNow;
    @FindBy(css = " input[id='CARcnN_0']")
    public static WebElement cardNr;
    @FindBy(css = "  input[id='CARcvv_0']")
    public static WebElement cvvOfCreditCard;
    @FindBy(css = "     select[id='CARexp_m_0']")
    public static WebElement expireDate;
    @FindBy(css = "      select[id='CARexp_y_0']")
    public static WebElement expireYear;

    @FindBy(css = "   input[name='cname_0']")
    public static WebElement nameOnCard;
    @FindBy(css = "  input[name='str_0']")
    public static WebElement address;
    @FindBy(css = " input[name='cty_0']")
    public static WebElement city;
    @FindBy(css = "input[name='zip_0']")
    public static WebElement zipCode;
    @FindBy(css = "input[name='zip_0']")
    public static    List<WebElement> travelerNames;

}
