package com.test.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
