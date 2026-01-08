package promoCommerceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.reader.ConfigManager;

public class BaseTest {

    public BaseTest() {
        ConfigManager.initialize();
    }

    protected WebDriver driver;

    @BeforeMethod
    public void startDriver() {

        ChromeOptions options = new ChromeOptions();

        if (System.getenv("CI") != null) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
        }

        this.driver = new ChromeDriver(options);
        driver.get(ConfigManager.getProperty("promocommerce.url"));
    }

    @AfterMethod
    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
