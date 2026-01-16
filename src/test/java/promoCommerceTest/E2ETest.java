package promoCommerceTest;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({io.qameta.allure.testng.AllureTestNg.class})
@Feature("E2E Feature")
public class E2ETest extends BaseTest{

    public E2ETest(){}

    @Story("User logs in, adds multiple items to cart, and completes checkout")
    @Test (description = "End To End test to promo commerce website")
    public void E2ETestCase(){
    loginPage.assertToLoginUrl();
    loginPage.assertToLoginTitle();
    loginPage.enterUserNameToField(loginTestData.username());
    loginPage.enterEmailToField(loginTestData.email());
    loginPage.enterPasswordToField(loginTestData.password());
    loginPage.selectGender(loginTestData.gender());
    loginPage.selectEmploymentStatus();
    loginPage.enterDateOfBirthToField(loginTestData.date());
    loginPage.enterTextToTwoWayDataField(loginTestData.twowaydata());
    loginPage.clickOnSubmitBtn();
    //home page
    homePage.ClickOnHomePageButton();
    homePage.clickAddItemToCart(itemsTestData.item1());
    homePage.clickAddItemToCart(itemsTestData.item2());
    homePage.clickAddItemToCart(itemsTestData.item3());
    homePage.clickAddItemToCart(itemsTestData.item4());
    homePage.clickOnCheckOutButton();
    //checkout page
    checkoutPage.clickOnCheckOutButton();
    checkoutPage.enterLocationToField(checkOutTestData.location());
    checkoutPage.acceptTermsAndConditions();
    checkoutPage.clickOnCloseBtn();
    checkoutPage.clickOnPurchaseBtn();
    }
}
