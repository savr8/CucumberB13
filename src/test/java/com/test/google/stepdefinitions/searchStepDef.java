package com.test.google.stepdefinitions;

import com.test.google.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class searchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("User navigates to the Google")
    public void user_navigates_to_the_google() {
        driver.get(ConfigReader.readProperty("googleurl"));


    }

    @When("User searches for Techtorial")
    public void user_searches_for_techtorial() {
        homePage.searchWord("Techtorial");

    }

    @Then("User validates less than ten links on the google page")
    public void user_validates_less_than_ten_links_on_the_google_page() {
        Assert.assertTrue(homePage.validateNumberOfLinks());
    }


}
