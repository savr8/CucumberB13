package com.test.ebay.stepdefinitions;

import com.test.ebay.pages.MainPageEbay;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class StepDefEbay {
    WebDriver driver = DriverHelper.getDriver();
    MainPageEbay mainPageEbay = new MainPageEbay(driver);

    @Given("User navigates to ebay")
    public void user_navigates_to_ebay() {
        driver.get(ConfigReader.readProperty("ebayurl"));
    }

    @When("USer searches Laptop")
    public void u_ser_searches_laptop() {
        mainPageEbay.setSearchBoxClick("laptop");

    }

    @Then("User validatest result")
    public void user_validatest_result() {
        mainPageEbay.validateLaptopResult("Dell");


    }



}
