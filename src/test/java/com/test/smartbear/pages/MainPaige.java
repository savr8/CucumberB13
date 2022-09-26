package com.test.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPaige {
    public MainPaige(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"ctl00_MainContent_username\"]")
    WebElement userNameBox;
    @FindBy(xpath = "//input[@id=\"ctl00_MainContent_password\"]")
    WebElement passwordBox;
    @FindBy(xpath = "//input[@value=\"Login\"]")
    WebElement loginButton;

    public void login(String name,String password){
     this.userNameBox.sendKeys(name);
     this.passwordBox.sendKeys(password);
     loginButton.click();
    }



}
