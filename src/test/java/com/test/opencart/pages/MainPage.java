package com.test.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "class=\"btn-close\"")
    WebElement closeButton;
    @FindBy(id = "menu-customer")
    WebElement CustomerMain;
    @FindBy(xpath ="//a[.='Customers']")
    WebElement subCustomer;
    public void closeButtonClick() throws InterruptedException {
        Thread.sleep(2000);
        closeButton.click();
    }
    public void clickCustomerButton(){
        CustomerMain.click();
        subCustomer.click();
    }
}
