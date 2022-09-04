package com.flightnetwork.pages;

import com.flightnetwork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class FlightPage extends BasePage{
    public FlightPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='css-1ubn1th ewhyijf6']")
    public WebElement filter;

    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-TitleText']/span)[1]")
    public WebElement DepartureAirport;

    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-TitleText']/span)[3]")
    public WebElement ArrivalAirport;


    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-date-desktop']/span)[1]")
    public WebElement DepartureDate;

    @FindBy(xpath = "(//div[@data-testid='tripDetails-title-date-desktop']/span)[3]")
    public WebElement ReturnDate;

    @FindBy(xpath = "//div[@data-testid='tripDetails-title-travelers-desktop']")
    public WebElement passangerInfoFlightPage;

    @FindBy(xpath = "//label[@data-testid='MAX_STOPS-direct']")
    public WebElement NumberOfStop;

    @FindBy(xpath = "//span[@class='css-powtjg epwz15m1']")
    public WebElement AirlinesClear;

    @FindBy(xpath = "(//input[@class='_3n3vnt1'])[2]")
    public WebElement AirlinesSelectOne;
    @FindBy(xpath = "(//input[@class='_3n3vnt1'])[4]")
    public WebElement AirlinesSelectTwo;

    @FindBy(xpath= "(//div[@class='_3won560 welvw82 _3won567 _3won562'])[7]")
    public WebElement Arrival;

    @FindBy(xpath = "//div[@class='css-13vekqn']")
    public WebElement PriceBegin;
    @FindBy(xpath = "//div[@class='css-o9ojlh']")
    public WebElement PriceLast;


    @FindBy(xpath = "(//div[@class='css-13vekqn'])[2]")
    public WebElement FromBegin;
    @FindBy(xpath = "(//div[@class='css-o9ojlh'])[2]")
    public WebElement FromLast;


    @FindBy(xpath = "(//div[@class='css-13vekqn'])[3]")
    public WebElement ToBegin;
    @FindBy(xpath = "(//div[@class='css-o9ojlh'])[3]")
    public WebElement ToLast;

    @FindBy(xpath = "(//div[@class='css-o9ojlh'])[4]")
    public WebElement TravelTime;

    @FindBy(xpath = "//span[text() = 'Done']")
    public WebElement DoneBtn;

    @FindBy(xpath = "//div[@class='css-akpcxl e1ngmrql4']")
    public List<WebElement> AirlineVerify;











}
