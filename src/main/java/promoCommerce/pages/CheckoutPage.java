package promoCommerce.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    //constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    //locators
    private final By checkoutBtnLocator = By.cssSelector("[class=\"btn btn-success\"]");
    private final By countryFieldLocator = By.cssSelector("[id=\"country\"]");
    private final By termsLinkLocator = By.xpath("//*[text()=\"term & Conditions\"]");
    private final By closeBtnLocator = By.cssSelector("[class=\"btn btn-info\"]");
    private final By PurchaseBtnLocator =By.cssSelector("[class=\"btn btn-success btn-lg\"]");
    //methods
    @Step("Click on check out button")
    public void clickOnCheckOutButton(){
        actions.clickOnButton(this.checkoutBtnLocator);
    }
    @Step("Enter location: {location}")
    public void enterLocationToField(String location){
        actions.sendTextToField(this.countryFieldLocator, location);
    }
    @Step("Accept terms and conditions")
    public void acceptTermsAndConditions(){
        actions.clickOnButton(this.termsLinkLocator);
    }
    @Step("Close terms popup")
    public void clickOnCloseBtn(){
        actions.clickOnButton(this.closeBtnLocator);
    }
    @Step("Confirm purchase")
    public void clickOnPurchaseBtn(){
        actions.clickOnButton(this.PurchaseBtnLocator);
    }
}
