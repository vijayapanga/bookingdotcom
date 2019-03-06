package stepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigFileReader;

import java.util.concurrent.TimeUnit;

import static stepDefs.Hooks.driver;

public class Hooks {
    public static WebDriver driver;
    public static ChromeOptions options;
    public static ConfigFileReader cfr = new ConfigFileReader();

    @Before
    public void beforeTest(){
        options=new ChromeOptions();
        options.addArguments("--start-maximized");  // window maximizing
        options.addArguments("--disable-notifications"); //disable popup notifications

        System.setProperty("webdriver.chrome.driver", "C:\\JavaWorkSpace\\ChromeDirver Download\\chromedriver.exe");
        driver = new ChromeDriver(options);
       // driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);//implicit wait
        PageFactory.initElements(driver, BookingElements.class);

    }

    @After
    public void afterTest(){
      //  driver.quit();

    }
}

