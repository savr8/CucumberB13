package com.test.etsy.pages;

import com.test.ebay.pages.MainPageEbay;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#global-enhancements-search-query")
    WebElement searchBox;
    public void search(String word){
        searchBox.sendKeys(word, Keys.ENTER);

    }
}
