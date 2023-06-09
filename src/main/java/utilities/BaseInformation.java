package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class BaseInformation {

    public static BaseInformation getBaseInformation(){
        return new BaseInformation();
    }
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    //C:\\Users\\User\\eclipse-workspace\\SeleniumTest\\lib\\seleniumjars\\chromedriver.exe
                    //
                    System.setProperty("webdriver.chrome.driver","C:\\Intel\\FinalProjectLuftansa\\src\\main\\java\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    System.setProperty("","");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }

    public static void quit() {
        driver.quit();
    }


}