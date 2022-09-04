package com.flightnetwork.step_definitions;

import com.flightnetwork.pages.FlightPage;
import com.flightnetwork.pages.MainPage;
import com.flightnetwork.utilities.BrowserUtils;
import com.flightnetwork.utilities.ConfigurationReader;
import com.flightnetwork.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;


public class FlightNetwork {

    MainPage main = new MainPage();
    FlightPage flight = new FlightPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("User lands on main page")
    public void user_lands_on_main_page() {
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        BrowserUtils.waitFor(1);
        main.cookies.click();

    }
    @When("User selects {string}, {string}, {string}, {string} and clicks Search Flight Button")
    public void userSelects(String departureAirport, String ArrivalAirport, String departureDate, String returnDate) {
        main.from.click();
        actions.sendKeys(departureAirport).perform();
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.ENTER).perform();

        BrowserUtils.waitFor(1);
        main.to.click();
        actions.sendKeys(ArrivalAirport).perform();
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.ENTER).perform();

        main.departureDateClick.click();
        BrowserUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+departureDate+"')]")).click();

        main.returnDateClick.click();
        BrowserUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+returnDate+"')]")).click();

        main.passanger.click();
        BrowserUtils.waitFor(1);
        main.statu.click();
        BrowserUtils.waitFor(1);
        actions.sendKeys(Keys.ENTER).perform();

        main.directFly.click();

        BrowserUtils.waitFor(1);
        main.searchBtn.click();
    }

    @When("User should see display all available flights, matching the searching criteria")
    public void user_should_see_display_all_available_flights_matching_the_searching_criteria() {
        String expextedDepartureAirport="Athens";
        String expextedArrivalAirport="Rome";
        BrowserUtils.waitFor(3);
        System.out.println("Expected Departure Airport = " + expextedDepartureAirport);
        System.out.println("Actual Departure Airport = " + flight.DepartureAirport.getText());
        Assert.assertEquals(expextedDepartureAirport,flight.DepartureAirport.getText());


        Assert.assertEquals(expextedArrivalAirport,flight.ArrivalAirport.getText());
        System.out.println("Expected Arrival Airport = " + expextedArrivalAirport);
        System.out.println("Actual Arrival Airport = " + flight.ArrivalAirport.getText());

        BrowserUtils.waitFor(1);
//        System.out.println("Expected Departure date = " + main.departureDateSelect.getText());
        String initialDepartureDate=flight.DepartureDate.getText();
        String actualDepartureDate=initialDepartureDate.substring(3,initialDepartureDate.length()-1);
        System.out.println("Actual Departure date = " + actualDepartureDate);
        Assert.assertEquals(main.departureDateSelect.getText(),flight.DepartureDate.getText());

      //  System.out.println("Expected Return date = " + main.returnDateSelect.getText());
        System.out.println("Actual Return date = " + flight.ReturnDate.getText());
        Assert.assertEquals(main.returnDateSelect.getText(),flight.ReturnDate.getText());


    }
    @Then("User can click Filter button and can be applied")
    public void user_can_click_filter_button_and_can_be_applied() {
        BrowserUtils.waitFor(2);
        flight.filter.click();
        BrowserUtils.waitFor(1);
        flight.NumberOfStop.click();

        flight.AirlinesClear.click();
        BrowserUtils.waitFor(1);
        flight.AirlinesSelectOne.click();
        BrowserUtils.waitFor(1);
        flight.AirlinesSelectTwo.click();

        flight.Arrival.click();

        BrowserUtils.waitFor(2);
        actions.dragAndDropBy(flight.PriceBegin, 104,257).perform();

        BrowserUtils.waitFor(2);
       // actions.dragAndDropBy(flight.FromLast, 750,707).perform();

       // BrowserUtils.waitFor(2);
       // actions.dragAndDropBy(flight.ToBegin, 100,707).perform();
      //  BrowserUtils.waitFor(2);
      //  actions.dragAndDropBy(flight.ToLast, 140,707).perform();

     //   BrowserUtils.waitFor(2);
     //   actions.dragAndDropBy(flight.TravelTime, 71,819).perform();
    }
    @Then("User verify the changes")
    public void user_verify_the_changes() {
   //     for (WebElement each : flight.AirlineVerify) {
       //     System.out.println(Arrays.asList(each.getText()));


       // Assert.assertTrue(flight.AirlineVerify.getText().contains(flight.AirlinesSelectOne.getText()));
    }


}

