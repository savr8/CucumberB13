package com.test.opencart.stepdef;

import com.test.opencart.pages.LoginPage;
import com.test.opencart.pages.MainPage;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class RegisterStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);

    @Given("User Provides valid username and password for openChart website")
    public void user_provides_valid_username_and_password_for_open_chart_website() {
        loginPage.login(ConfigReader.readProperty("opechartusername"), ConfigReader.readProperty("openchartpassword"));
    }

    @Given("User click the close button from alert-pop up")
    public void user_click_the_close_button_from_alert_pop_up() throws InterruptedException {
        mainPage.closeButtonClick();
    }

    @When("User clicks customer button and validate the {string}")
    public void user_clicks_customer_button_and_validate_the(String title) {
mainPage.clickCustomerButton();
        Assert.assertEquals(title,driver.getTitle().trim());

    }

    @When("User clicks add customer button and validate the header {string}")
    public void user_clicks_add_customer_button_and_validate_the_header(String string) {

    }

    @When("User clicks Address Button and provide {string},{string},{string},{string},{string},{string}")
    public void user_clicks_address_button_and_provide(String string, String string2, String string3, String string4, String string5, String string6) {

    }

    @Then("User clicks save Button and validate the message {string}")
    public void user_clicks_save_button_and_validate_the_message(String string) {

    }

}
