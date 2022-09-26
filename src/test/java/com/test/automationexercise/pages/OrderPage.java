package com.test.automationexercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@class=\"custom-control-label\"]")
    WebElement groupOrderBtn;
    @FindBy(id = "getAddressNextButton")
    WebElement nextbtn;

    @FindBy(id = "InviteNote")
    WebElement inveteesBox;

    @FindBy(id = "Invite List")
    WebElement inviteListBox;
    @FindBy(id = "ConfirmAddressID")
    WebElement location;

    @FindBy(id = "addressPreview")
    WebElement address;
    @FindBy(id = "createGroupOrder")
    WebElement createaGroupOrderBtn;

    @FindBy(tagName = "h1")
    WebElement header;
    @FindBy(xpath = "//label[.=\"Total Participants:\"]//following-sibling::div")
    WebElement totalParticipants;

    public void clickButtons() {
        groupOrderBtn.click();
        nextbtn.click();
    }

    public void sendInvetees(String invitees) {
        inveteesBox.sendKeys(invitees);
    }

    public void sendInviteList(String firstEmail, String secondEmail) {
        inveteesBox.sendKeys(firstEmail + " , " + secondEmail);
    }

    public void validateAddress(String location, String address) {
        BrowserUtils.selectBy(this.location, location, "text");
        Assert.assertTrue(BrowserUtils.getText(this.address).contains(address));
    }

    public void clickGroupOrderBtn() {
        createaGroupOrderBtn.click();
    }

    public String validateHeader() throws InterruptedException {
       Thread.sleep(2000);
        return BrowserUtils.getText(header);
    }

    public int validateParticipants() {
        return Integer.parseInt(BrowserUtils.getText(totalParticipants));
    }

}
