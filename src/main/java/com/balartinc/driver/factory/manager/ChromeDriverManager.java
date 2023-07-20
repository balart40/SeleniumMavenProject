package com.balartinc.driver.factory.manager;

import com.balartinc.driver.IDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.balartinc.config.ConfigurationManager.configuration;
import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

public class ChromeDriverManager implements IDriverManager<ChromeOptions> {
    @Override
    public WebDriver createDriver() {
        WebDriverManager.getInstance(CHROME).setup();
        return new ChromeDriver();
    }

    @Override
    public ChromeOptions getOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setHeadless(configuration().headless());

        return chromeOptions;
    }
}
