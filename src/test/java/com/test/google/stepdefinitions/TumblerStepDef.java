package com.test.google.stepdefinitions;

import com.test.ebay.pages.MainPageEbay;
import com.test.tumblr.pages.HomePageTumbler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class TumblerStepDef {
    WebDriver driver = DriverHelper.getDriver();
    HomePageTumbler homePageTumbler=new HomePageTumbler(driver);
    @Given("User navigates to the Tumbler")
    public void user_navigates_to_the_tumbler() {
        driver.get(ConfigReader.readProperty("tumblerurl"));
    }
    @When("User logges in with wrong crudential")
    public void user_logges_in_with_wrong_crudential() {
        HomePageTumbler homePageTumbler=new HomePageTumbler(driver);
        homePageTumbler.loginBtnClick();
        homePageTumbler.emailLogin("fgdh");
    }
    @Then("User validates error message")
    public void user_validates_error_message() {
        HomePageTumbler homePageTumbler=new HomePageTumbler(driver);
        homePageTumbler.messageErrorValidate();
    }

}
