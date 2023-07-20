package com.balartinc.driver;

import com.balartinc.driver.factory.LocalDriverFactory;
import com.balartinc.exceptions.BrowserNotSupportedException;
import com.balartinc.exceptions.TargetNotValidException;
import org.openqa.selenium.WebDriver;

import static com.balartinc.config.ConfigurationManager.configuration;

public class DriverFactory implements IDriverFactory {

    @Override
    public WebDriver createInstance(String browser) {
        Target target = Target.valueOf(configuration().target().toUpperCase());
        WebDriver webdriver;

        switch (target) {

            case LOCAL:
                webdriver = new LocalDriverFactory().createInstance(browser);
                break;
            default:
                throw new TargetNotValidException(target.toString());
        }
        return webdriver;
    }

    enum Target {
        LOCAL,
        REMOTE
    }
}
