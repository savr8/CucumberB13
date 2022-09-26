package com.test.tumblr.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTumbler {
    public HomePageTumbler(WebDriver driver) {

        PageFactory.initElements(driver, this);//creating constructor
    }
    @FindBy(xpath = "//a[@href=\"/login\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//button[@class=\"dKGjO\"]")
    WebElement emailLogin;
    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement emailBox;

    @FindBy(xpath = "//div[@class=\"a0A37 hAkP2\"]")
    WebElement errorMessage;
    public void loginBtnClick(){
        loginBtn.click();
        emailLogin.click();
    }
    public void emailLogin(String email){
        emailBox.sendKeys(email, Keys.ENTER);
    }
    public void messageErrorValidate(){
        Assert.assertTrue(errorMessage.isDisplayed());
    }



}
