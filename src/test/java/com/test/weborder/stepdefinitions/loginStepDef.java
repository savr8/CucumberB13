package com.test.weborder.stepdefinitions;

import com.test.weborder.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class loginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User navigates to the {string}")
    public void user_navigates_to_the(String website) {
        driver.get(website);
    }

    @When("User provides username {string} and password {string}")
    public void user_provides_username_and_password(String username1, String password1) {
        loginPage.login(username1, password1);

    }
    @Then("User validates the titles {string} from homepage")
    public void user_validates_the_titles_from_homepage(String title) {
        Assert.assertEquals(title,driver.getTitle().trim());
       // driver.quit();
    }

    @Then("User validates the message {string} from login page")
    public void user_validates_the_message_from_login_page(String string) {
       loginPage.errorMessage();
    }






}
