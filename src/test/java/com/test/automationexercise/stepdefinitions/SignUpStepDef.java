package com.test.automationexercise.stepdefinitions;

import com.test.automationexercise.pages.HomePage;
import com.test.automationexercise.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SignUpStepDef {
    WebDriver driver = DriverHelper.getDriver();

    HomePage homePage = new HomePage(driver);

    LoginPage loginPage = new LoginPage(driver);

    @Given("User navigates to the automationExercise web page")
    public void user_navigates_to_the_automation_exercise_web_page() {
        driver.get(ConfigReader.readProperty("automationurl"));
    }

    @Given("User validates the url of the page")
    public void user_validates_the_url_of_the_page() {
        Assert.assertEquals("https://www.automationexercise.com/", driver.getCurrentUrl().trim());
    }

    @When("User clicks signUplogin button")
    public void user_clicks_sign_up_login_button() {
        homePage.clickSignUpButton();

    }

    @Then("User verifies New User signUp is visible")
    public void user_verifies_new_user_sign_up_is_visible() {
        Assert.assertTrue(loginPage.vaildateHeader());
    }

    @Then("User Enter name,email address and click signup Button")
    public void user_enter_name_and_email_address_signup() {
        loginPage.sendingInformation("savr8","savr@gmail.com");
    }

}
