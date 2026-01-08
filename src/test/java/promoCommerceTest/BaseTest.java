package promoCommerceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        this.driver = new ChromeDriver();
        driver.get(ConfigManager.getProperty("promocommerce.url"));
    }
    @AfterMethod
    public  void stopDriver(){
        driver.quit();
    }
}

