package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static stepDefs.Hooks.driver;
import static stepDefs.Hooks.cfr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BookingElements {

    public static CptScreenSht screenSht = new CptScreenSht();
    String pickermmyy = " ";

    @FindBy(xpath = "//span [contains(text(),'Register')]")
    static WebElement register;

    @FindBy(xpath = "//div [@class=\"sign_in_wrapper\"] //span[ contains(text(),'Sign in')]")
    //  @FindBy (xpath = "//a [@id=\"b_tt_holder_1\"]")
    static WebElement sign_in;

    @FindBy(xpath = "//input [@id='ss']")
    static WebElement search_place;

    @FindBy(xpath = "//div  [@data-mode=\"checkin\"]")
    // @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")
    static WebElement checkin;

    @FindBy(xpath = "//div  [@data-mode=\"checkout\"]")
    // @FindBy(xpath = "//div[1]/div[2]/div[1]/div[3]/div/div/div/div/span")
    static WebElement checkout;

    @FindBy(xpath = "//label [@id=\"xp__guests__toggle\"]")
    static WebElement no_of_guests;

    @FindBy(xpath = "//input [@id=\"no_rooms\"]")
    static WebElement no_of_rooms;

    @FindBy(xpath = "//input [@id=\"group_adults\"]")
    static WebElement no_of_adults;

    @FindBy(xpath = "//input [@id=\"group_children\"]")
    static WebElement no_of_children;

    @FindBy(xpath = "//input [@id=\"sb_travel_purpose_checkbox\"]")
    static WebElement chk_work_trvl;

//    @FindBy(xpath = "//input [@id=\"sb_need_taxi\"]")
//    static WebElement chk_need_taxi;
//
//    @FindBy(xpath = "//input [@id=\"sb_need_car\"]")
//    static WebElement chk_need_car;

   @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")
    static WebElement sub_search;

    @FindBy(xpath = "//input [@id=\"username\"]")
    static WebElement signin_email;

    @FindBy(xpath = "//button [@type=\"submit\"]")
    static WebElement signin_start;

    @FindBy(xpath = "//input [@id=\"password\"]")
    static WebElement signin_pwd;

    @FindBy(xpath = "//button [@type=\"submit\"]")
    static WebElement signin_submit;

//    @FindBy(xpath = "//button [@class=\"modal-mask-closeBtn\"]")
//    static WebElement popup_close;

    @FindBy(xpath = "//span [@class=\"header_name user_firstname ge-no-yellow-bg\"]")
    static WebElement signin_acc;

    @FindBy(xpath = "//input [@value=\"Sign out\"]")
    static WebElement signout_acc;

    @FindBy(xpath = "//div [@class=\"bui-calendar__control bui-calendar__control--next\"]")
    static WebElement datenext;


    public void find_all_elements() {
//******************************       finding all elements in a page        ************************************
        List<WebElement> elements = driver.findElements(By.xpath("//*"));
        System.out.println("Total Elements in Page : " + Integer.toString(elements.size()));

        //                   for(WebElement elements1:elements) {
        //                       System.out.println(elements1.getTagName() + " " + elements1.getText());
        //                   }
//**********************************************************************************************************************
    }

    public void find_print_elements() {

        System.out.println(" Checking Elements in Booking.com Page");
        System.out.println("Register Element Exists - " + register.isDisplayed());
        System.out.println("Sign Element Exists - " + sign_in.isDisplayed());
        System.out.println("Search Text Element Exists - " + search_place.isDisplayed());
        System.out.println("Checkin date Element Exists - " + checkin.isDisplayed());
        System.out.println("Checkout date Element Exists - " + checkout.isDisplayed());
        System.out.println("Guest info Element Exists - " + no_of_guests.isEnabled());
        System.out.println("no of rooms Element Exists - " + no_of_rooms.isEnabled());
        System.out.println("no of adults Element Exists - " + no_of_adults.isEnabled());
        System.out.println("no of children Element Exists - " + no_of_children.isEnabled());
        System.out.println("Checkbox for work travel Element Exists - " + chk_work_trvl.isEnabled());
     //   System.out.println("Checkbox for need taxi Element Exists - " + chk_need_taxi.isEnabled());
     //   System.out.println("Checkbox for need rent car Element Exists - " + chk_need_car.isEnabled());
        System.out.println("Search Submit Element Exists - " + sub_search.isDisplayed());
        screenSht.cptScrSht(driver, "Signup before ScreenSht1");
    }

    public void booking_signup() {
        sign_in.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signin_email.sendKeys("vijayalakshmipanga@gmail.com");
        signin_start.click();
        signin_pwd.sendKeys("Test@123!");
        signin_submit.click();
      //  popup_close.click();
        signin_acc.click();
        screenSht.cptScrSht(driver, "Signup after ScreenSht2");
        signout_acc.click();

    }

    public void booking_search() {

        search_place.sendKeys(cfr.getSearchPlace());
        checkin.click();
        System.out.println("picker starting month year " + driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/div")).getText());

        DateFormat dateFormat = new SimpleDateFormat("MMMM yyyy ");
        Date date = new Date();     //get current date time with Date()
        String systemmmyy = dateFormat.format(date);    // Format the date
        System.out.println("System current month year " + systemmmyy);    // Print the Date

        pickermmyy = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/div")).getText();

        String givenDate = cfr.getFromDate();
        pickerDate(givenDate);
        givenDate = cfr.getToDate();
        pickerDate(givenDate);

//************ Search with no of Guests/rooms/children******************
        no_of_guests.click();

        long adults=cfr.getAdultsCount();
        long rooms=cfr.getRoomsCount();
        long children=cfr.getChildrenCount();

            if(adults==1)
            {
                driver.findElement(By.xpath("//input [@name=\"group_adults\"]")).click();
            }
            if(adults==2){}
            if(adults>2)
            {
                for(int i=0;i<adults;i++){
              driver.findElement(By.xpath("//div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]")).click();
            }
            }


        if(rooms==1){}
        if(rooms>1) {
            for (int i = 0; i < rooms-1; i++) {
                driver.findElement(By.xpath("//div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[2]")).click();
            }
        }
        for(int i=0;i<children;i++)
        {
            driver.findElement(By.xpath("//div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/button[2]")).click();
        }

//**********************************************************************************

        screenSht.cptScrSht(driver,"Search Before ScreenSht3");
        sub_search.click();
        screenSht.cptScrSht(driver,"Search After ScreenSht4");

    }

    public void pickerDate(String givenDate)
    {

        String indate=givenDate;

        String spilitter[]=indate.split("-");

        String stdate = spilitter[0];
        String stdatemmyy = spilitter[1];


        while (!(stdatemmyy.equals(pickermmyy)))
        {
            datenext.click();
            pickermmyy = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/div")).getText();
            System.out.println(pickermmyy);
            if(stdatemmyy.equals(pickermmyy))
            {
                break;
            }
        }

        if(stdatemmyy.equals(pickermmyy))
        {

            //picking no of enable dates as a list, then selecting date in loop
            //xpath for enable dates(in table-data(td))

            List<WebElement> dates = driver.findElements(By.xpath("//td [@class=\"bui-calendar__date\"]"));
            int datesize = dates.size();

            for (int i = 0; i < datesize; i++)
            {
                String display_date = dates.get(i).getText();

                if (display_date.equals(stdate))
                {
                    dates.get(i).click();
                    break;
                }
            }
        }
    }


}



