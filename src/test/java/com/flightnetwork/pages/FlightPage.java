package com.flightnetwork.pages;

import com.flightnetwork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage extends BasePage{
    public FlightPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='css-1ubn1th ewhyijf6']")
    public WebElement filter;

    @FindBy(xpath = "//div[@data-testid='tripDetails-title-TitleText']")
    public WebElement verifyText;

    @FindBy(xpath = "//div[@data-testid='tripDetails-title-date-desktop']")
    public WebElement verifyDate;

    @FindBy(xpath = "//label[@data-testid='MAX_STOPS-direct']")
    public WebElement NumberOfStop;

    @FindBy(xpath = "//span[@class='css-powtjg epwz15m1']")
    public WebElement AirlinesClear;

    @FindBy(xpath = "//input[@value='A3']")
    public WebElement AirlinesSelectOne;
    @FindBy(xpath = "//input[@value='U2']")
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











}
