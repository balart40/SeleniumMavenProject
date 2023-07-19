package com.balartinc.onlytestingpage;

import com.balartinc.BaseWeb;
import com.balartinc.pages.OnlyTestingHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.balartinc.config.ConfigurationManager.configuration;

public class OnlyTestingHomePageTest extends BaseWeb {

    OnlyTestingHomePage objHomePage;

    @Test
    void homePage(){
        driver.navigate().to(configuration().url());

        objHomePage = new OnlyTestingHomePage(driver);
        String expectedTile = "Only Testing";

        Assertions.assertEquals(objHomePage.getTitle(), expectedTile);
    }
}
