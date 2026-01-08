package promoCommerceTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import promoCommerce.pages.CheckoutPage;
import promoCommerce.pages.HomePage;
import promoCommerce.pages.LoginPage;
import promoCommerceTestData.CheckOutTestData;
import promoCommerceTestData.ItemsTestData;
import promoCommerceTestData.LoginTestData;
import utils.reader.ConfigManager;
import utils.reader.JsonUtils;

public class E2ETest extends BaseTest{
    private LoginPage loginPage;
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    private ItemsTestData itemsTestData;
    private LoginTestData loginTestData;
    private CheckOutTestData checkOutTestData;

    public E2ETest(){
        this.loginTestData = JsonUtils.getTestData(ConfigManager.getProperty("login.testdata"), LoginTestData.class);
        this.itemsTestData = JsonUtils.getTestData(ConfigManager.getProperty("items.testdata"), ItemsTestData.class);
        this.checkOutTestData = JsonUtils.getTestData(ConfigManager.getProperty("checkout.testdata"), CheckOutTestData.class);

    }
    @BeforeMethod
    public void setupPage() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
    }
    @Test
    public void E2ETestCase(){
    loginPage.assertToUrlEquals();
    loginPage.assertToTitleEquals();
    loginPage.enterUserNameToField(loginTestData.username());
    loginPage.enterEmailToField(loginTestData.email());
    loginPage.enterPasswordToField(loginTestData.password());
    loginPage.selectGender(loginTestData.gender());
    loginPage.selectEmploymentStatus();
    loginPage.enterDateOfBirthToField(loginTestData.date());
    loginPage.enterTextToTwoWayData(loginTestData.twowaydata());
    loginPage.clickOnSubmitBtn();
    //home page
    homePage.ClickOnHomePageButton();
    homePage.clickAddItemToCart(itemsTestData.item1());
    homePage.clickAddItemToCart(itemsTestData.item2());
    homePage.clickAddItemToCart(itemsTestData.item3());
    homePage.clickAddItemToCart(itemsTestData.item4());
    homePage.ClickOnCheckOutButton();
    //checkout page
    checkoutPage.clickOnCheckOutButton();
    checkoutPage.enterLocationToField(checkOutTestData.location());
    checkoutPage.clickOnTerms();
    checkoutPage.clickOnCloseBtn();
    checkoutPage.clickOnPurchase();

    }
}
