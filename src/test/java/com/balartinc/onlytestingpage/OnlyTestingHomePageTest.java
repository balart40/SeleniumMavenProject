package com.balartinc.onlytestingpage;

import com.balartinc.BaseWeb;
import com.balartinc.pages.OnlyTestingHomePage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.balartinc.config.ConfigurationManager.configuration;

@Slf4j
public class OnlyTestingHomePageTest extends BaseWeb {

    OnlyTestingHomePage objHomePage;

    @Test
    void homePage(){
        log.info("HomePage Test initiating...");

        driver.navigate().to(configuration().url());

        objHomePage = new OnlyTestingHomePage(driver);
        String expectedTile = "Only Testing";

        Assertions.assertEquals(objHomePage.getTitle(), expectedTile);

        log.info("Test finished successfully...");
    }
}
