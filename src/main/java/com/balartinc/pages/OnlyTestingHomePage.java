package com.balartinc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlyTestingHomePage {

    WebDriver driver;
    By title = By.xpath("//*[@id=\"header-inner\"]/div[1]/h1");
    public OnlyTestingHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

}
