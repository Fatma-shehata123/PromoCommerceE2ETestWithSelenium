package promoCommerceTest;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.aspectj.util.FileUtil;
import org.joda.time.field.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import promoCommerce.pages.CheckoutPage;
import promoCommerce.pages.HomePage;
import promoCommerce.pages.LoginPage;
import promoCommerceTestData.CheckOutTestData;
import promoCommerceTestData.ItemsTestData;
import promoCommerceTestData.LoginTestData;
import utils.reader.ConfigManager;
import utils.reader.JsonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseTest {

    protected WebDriver driver;

    public BaseTest() {
        ConfigManager.initialize();
    }

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected CheckoutPage checkoutPage;
    protected LoginTestData loginTestData;
    protected ItemsTestData itemsTestData;
    protected CheckOutTestData checkOutTestData;

    @BeforeClass
    public void loadTestData() {
        loginTestData = JsonUtils.getTestData(
                ConfigManager.getProperty("login.testdata"),
                LoginTestData.class);
        itemsTestData = JsonUtils.getTestData(
                ConfigManager.getProperty("items.testdata"),
                ItemsTestData.class);
        checkOutTestData = JsonUtils.getTestData(
                ConfigManager.getProperty("checkout.testdata"),
                CheckOutTestData.class);
    }

    @BeforeMethod
    @Step("Initialize driver and page objects")
    public void setup() {
        // Start driver
        ChromeOptions options = new ChromeOptions();
        if (System.getenv("CI") != null) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--window-size=1920,1080");
        }
        driver = new ChromeDriver(options);
        driver.get(ConfigManager.getProperty("promocommerce.url"));

        // Initialize pages
        initializePages();
//        loginPage = new LoginPage(driver);
//        homePage = new HomePage(driver);
//        checkoutPage = new CheckoutPage(driver);
    }

    public void initializePages(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @AfterMethod
    @Step("Stop the driver")
    public void stopDriver(ITestResult result) {
        //call screenshot method
        String testCaseName = result.getMethod().getMethodName();
        File destFile = new File("target" + File.separator + "screenshots" + File.separator + testCaseName + ".png");
        takeScreenshot(destFile);
        //Stop driver
        if (driver != null) {
            driver.quit();
        }
    }

    public void takeScreenshot(File destFile){
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtil.copyFile(file, destFile);
            InputStream stream = new FileInputStream(destFile);
            Allure.addAttachment("Screenshot", stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
