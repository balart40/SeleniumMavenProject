package com.balartinc.driver.factory;

import com.balartinc.driver.BrowserList;
import com.balartinc.driver.IDriverFactory;
import com.balartinc.driver.factory.manager.ChromeDriverManager;
import com.balartinc.exceptions.BrowserNotSupportedException;
import org.openqa.selenium.WebDriver;

public class LocalDriverFactory  implements IDriverFactory {

    @Override
    public WebDriver createInstance(String browser) {
        WebDriver driver;
        BrowserList browserToCreate = BrowserList.valueOf(browser.toUpperCase());

        switch (browserToCreate) {
            case CHROME:
                driver = new ChromeDriverManager().createDriver();
                break;
            default:
                throw new BrowserNotSupportedException(browser + "is not supported");
        }
        return driver;
    }
}
