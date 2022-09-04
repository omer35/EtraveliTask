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
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


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
    @When("User can complete all the required fields")
    public void user_can_complete_all_the_required_fields() {
        main.from.click();
        actions.sendKeys("Athens").perform();
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.ENTER).perform();

        BrowserUtils.waitFor(1);
        main.to.click();
        actions.sendKeys("Rome").perform();
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.ENTER).perform();
        main.departureDate.click();
        BrowserUtils.waitFor(1);

        main.departureDateSelect.click();
        main.returnDate.click();
        BrowserUtils.waitFor(1);
        main.returnDateSelect.click();

        main.passanger.click();
        BrowserUtils.waitFor(1);
        main.statu.click();
        BrowserUtils.waitFor(1);
        actions.sendKeys(Keys.ENTER).perform();

        main.directFly.click();

    }
    @When("User can click Search Flights Button")
    public void user_can_click_search_flights_button() {
        BrowserUtils.waitFor(1);
        main.searchBtn.click();

    }
    @When("User should see display all available flights, matching the searching criteria")
    public void user_should_see_display_all_available_flights_matching_the_searching_criteria() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(flight.verifyText.getText().contains(main.from.getText()));
        Assert.assertTrue(flight.verifyText.getText().contains(main.to.getText()));
        BrowserUtils.waitFor(1);
      //  Assert.assertTrue(main.departureDateSelect.getText().contains(flight.verifyDate.getText()));
      //  Assert.assertTrue(main.returnDateSelect.getText().contains(flight.verifyDate.getText()));
      //  BrowserUtils.waitFor(1);



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

    }
}
