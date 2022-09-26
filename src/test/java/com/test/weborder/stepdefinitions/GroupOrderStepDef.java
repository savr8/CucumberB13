package com.test.weborder.stepdefinitions;

import com.test.automationexercise.pages.OrderPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class GroupOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    OrderPage orderPage = new OrderPage(driver);

    @When("User clicks Group Order box and Next Button")
    public void user_clicks_group_order_box_and_next_button() {
        orderPage.clickButtons();
    }

    @When("User sends the {string} for Note to Invitees section")
    public void user_sends_the_for_note_to_invitees_section(String invitees) {
        orderPage.sendInvetees(invitees);

    }

    @When("User sends e-mail addresses which are {string} and {string} to Invite List")
    public void user_sends_e_mail_addresses_which_are_and_to_invite_list(String firstEmail, String secondEmail) {
        orderPage.sendInviteList(firstEmail, secondEmail);
    }

    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String location, String address) {
        orderPage.validateAddress(location, address);
    }

    @When("User clicks create group order button")
    public void user_clicks_create_group_order_button() {
        orderPage.clickGroupOrderBtn();
    }

    @Then("User validates the header of page which is {string}")
    public void user_validates_the_header_of_page_which_is(String expectedHeader) throws InterruptedException {
        Assert.assertEquals(expectedHeader, orderPage.validateHeader());
    }

    @Then("User validates total participant is {int}")
    public void user_validates_total_participant_is(int expectedParticipants) {
        Assert.assertEquals(expectedParticipants, orderPage.validateParticipants());
    }
}
