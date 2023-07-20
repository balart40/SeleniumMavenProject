package com.balartinc.driver;

import org.openqa.selenium.WebDriver;

public interface IDriverManager<T> {
    WebDriver createDriver();

    T getOptions();
}
