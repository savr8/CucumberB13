package com.test.smartbear.stepdefinition;

import com.test.smartbear.pages.MainPaige;
import com.test.smartbear.pages.OrderPage;
import com.test.smartbear.pages.WebOrderPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class StepDef {
    WebDriver driver = DriverHelper.getDriver();
    MainPaige mainPaige = new MainPaige(driver);
    WebOrderPage webOrderPage = new WebOrderPage(driver);
    OrderPage orderPage = new OrderPage(driver);

    @When("User login with valid  username and password")
    public void user_login_with_valid_username_and_password() {
        mainPaige.login(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }

//    @Then("User validates title and clicks order button")
//    public void user_validates_title_and_clicks_order_button() {
//        webOrderPage.titleValidation(driver);
//        webOrderPage.orderButtonClick();
//    }

    //    @When("User provides product information {string},{string}")
//    public void user_provides_product_information(String productName, String quantity) {
//        orderPage.provideProductInfo(productName, quantity);
//    }
//
//    @When("User provides address information {string},{string},{string},{string},{string}")
//    public void user_provides_address_information(String name, String street, String city, String state, String zip) {
//        orderPage.provideAdressInfo(name, street, city, state, zip);
//    }
//
//    @When("User provides payment infomation card,{string},{string},{string}")
//    public void user_provides_payment_infomation_card(String cardNumber, String expirationDate, String cardType) {
//orderPage.providePaymentInfo(cardNumber,expirationDate,cardType);
//    }
//
//
//
//    @When("User clicks button and validates message {string}")
//    public void user_clicks_button_and_validates_message(String message) {
//        orderPage.validateMessage(message);
//    }


    @Then("User validates title and clicks order button")
    public void user_validates_title_and_clicks_order_button(DataTable dataTable) {

        Map<String, String> title = dataTable.asMap();
        Assert.assertEquals(title.get("Title"), driver.getTitle().trim());
        webOrderPage.orderButtonClick();
    }

    @When("User provides product information")
    public void user_provides_product_information(DataTable dataTable) {
        Map<String, String> productInformation = dataTable.asMap();
        orderPage.provideProductInfo(productInformation.get("ProductName"),productInformation.get("Quantity"));

    }

    @When("User provides address information")
    public void user_provides_address_information(DataTable dataTable) {
        Map<String ,String > addressInformation=dataTable.asMap();
        orderPage.provideAdressInfo(addressInformation.get("CustomerName"),
                addressInformation.get("Street"),
                addressInformation.get("City"),
                addressInformation.get("State"),
                addressInformation.get("ZipCode"));

    }

    @When("User provides payment infomation")
    public void user_provides_payment_infomation(DataTable dataTable) {
        Map<String ,String>providePaymentInformation=dataTable.asMap();
orderPage.providePaymentInfo(providePaymentInformation.get("CardNumber"),
        providePaymentInformation.get("ExpirationDate"),
                providePaymentInformation.get("CardType"));
    }

    @When("User clicks button and validates message")
    public void user_clicks_button_and_validates_message(DataTable dataTable) {

List<String > message=dataTable.asList();
        orderPage.validateMessage(message.get(0));

    }


}
