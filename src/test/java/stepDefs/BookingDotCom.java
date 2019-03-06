package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static stepDefs.BookingElements.*;
import static stepDefs.Hooks.driver;

public class BookingDotCom {

    BookingElements BE=new BookingElements();


    @Given("^Browser and Booking.com page launch$")
    public void browser_webpage_launch() {
        driver.get("https://www.booking.com");
        System.out.println("Browser and Booking.com launch successful");
    }

    @When("^Finding no of Elements of Booking.com Web page$")
    public void find_webelements() {

        BE.find_all_elements(); // finding all Elements in web page

    }

    @Then("^Printing Selected WebElements and Close browser$")
    public void print_webelements() {

        BE.find_print_elements(); // finding and printing selected Elements
        driver.close();

    }

    @When("^SignUp process$")
    public void signup() {

        BE.booking_signup();
        System.out.println("Booking Sign-up and Sign-out successful");

    }

    @Then("^SignUp Successful and close browser$")
    public void signup_success() {

    driver.close();
    System.out.println("Booking Sign-out page close");

    }

    @When("^Searching Hotels on Bank holiday$")
    public void search_period() {

        System.out.println("Booking Search page open");
        BE.booking_search();

    }

    @Then("^Searching Successful and close Browser$")
    public void search_success() {

    driver.close();
    System.out.println("Booking Search page close");

    }


}
