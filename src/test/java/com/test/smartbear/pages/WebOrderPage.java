package com.test.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class WebOrderPage {
    public WebOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href=\"Process.aspx\"]")
    WebElement orderButton;
    @FindBy(xpath = "//title")
    WebElement title;

    public void orderButtonClick(){
        orderButton.click();
    }
    public void titleValidation(WebDriver driver){
        Assert.assertEquals("Web Orders", driver.getTitle().trim());
    }

}
