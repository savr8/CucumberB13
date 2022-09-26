package com.test.ebay.pages;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class MainPageEbay {
    public MainPageEbay(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"gh-ac\"]")
    WebElement searchBox;

    @FindBy(xpath = "//span[@aria-level=\"3\"]")
    List<WebElement> allLaoptops;

    public void setSearchBoxClick(String keys) {
        searchBox.sendKeys(keys, Keys.ENTER);

    }

    public void validateLaptopResult(String word) {
       List<String> dellLaptops = new ArrayList<>();
        for (int i = 0; i < allLaoptops.size(); i++) {
            if (allLaoptops.get(i).getText().contains(word)) {
                dellLaptops.add(allLaoptops.get(i).getText().trim());
            }


        }
        System.out.println(dellLaptops);
    }
}
