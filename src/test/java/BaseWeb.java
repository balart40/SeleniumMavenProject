import com.balartinc.drivers.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static com.balartinc.config.ConfigurationManager.configuration;

public class BaseWeb {
    protected WebDriver driver;

    @BeforeEach
    public void preCondition() {
        String browserToUse = configuration().browser();

        driver = new DriverFactory().createInstance(browserToUse);

        driver.get(configuration().url());
    }

    @AfterEach
    public void postCondition() {
        driver.quit();
    }
}
