package com.flightnetwork.pages;

import com.flightnetwork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{
    Actions actions =new Actions(Driver.getDriver());
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class='_1hglkl65 _1hglkl60 _1hglkl63 css-8ftosc']")
    public WebElement cookies;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    public WebElement from;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    public WebElement to;

    @FindBy(xpath= "//input[@placeholder='Departure']")
    public WebElement departureDateClick;

    @FindBy(xpath = "//input[@placeholder='Return']")
    public WebElement returnDateClick;

    @FindBy(xpath = "//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Sep 15 2022')]")
    public WebElement departureDateSelect;

    @FindBy(xpath = "//div[@class='DayPicker-Day'][contains(@aria-label,'Sun Sep 18 2022')]")
    public WebElement returnDateSelect;

    @FindBy(xpath = "//div[@class='css-1a8en2k em00kgn0']")
    public WebElement passengerClick;

    @FindBy(xpath = "(//div[@class='css-1a8en2k em00kgn0']/div)[1]/div/div/div/span[1]")
    public WebElement passengerSelect;

    public void selectPassenger(String passengerAmaountString) throws InterruptedException {
        int passengerAmount=Integer.parseInt(passengerAmaountString);
        for (int i=0; i<=passengerAmount;i++){
            System.out.println("passengerAmount = " + passengerAmount);
            passengerClick.click();
            Thread.sleep(2000);
            passengerSelect.click();
            Thread.sleep(2000);
            actions.moveByOffset(80,450).perform();
            Thread.sleep(4000);
            actions.click().perform();
            Thread.sleep(2000);
            statu.click();
            i++;
        }
    }


    @FindBy(xpath = "(//div[@class='css-fv3lde css-1wy0on6'])[2]")
    public WebElement statu;
    @FindBy(xpath = "//input[@value='ECONOMY']")
    public WebElement statuSelect;

    @FindBy(xpath = "//input[@class='_3n3vnt1']")
    public WebElement directFly;

    @FindBy(xpath = "//button[@data-testid='searchForm-searchFlights-button']")
    public WebElement searchBtn;




}
