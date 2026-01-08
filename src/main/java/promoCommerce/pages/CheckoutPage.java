package promoCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    //constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    //locators
    private final By checkoutBtnLocator = By.cssSelector("[class=\"btn btn-success\"]");
    private final By countryField = By.cssSelector("[id=\"country\"]");
    private final By termsLinkLocator = By.xpath("//*[text()=\"term & Conditions\"]");
    private final By termsTitle = By.xpath("//*[text()=\"Terms And Conditions\"]");
    private final By closeBtnLocator = By.cssSelector("[class=\"btn btn-info\"]");
    private final By checkTerms = By.cssSelector("[id=\"checkbox2\"]");
    private final By PurchaseBtnLocator =By.cssSelector("[class=\"btn btn-success btn-lg\"]");
    //methods
    public void clickOnCheckOutButton(){
        actions.clickOnButton(this.checkoutBtnLocator);
    }
    public void enterLocationToField(String location){
        actions.enterTextToField(this.countryField, location);
    }
    public void clickOnTerms(){
        actions.clickOnButton(this.termsLinkLocator);
    }
    public void clickOnCloseBtn(){
        actions.clickOnButton(this.closeBtnLocator);
    }
    public void clickOnPurchase(){
        actions.clickOnButton(this.PurchaseBtnLocator);
    }
}
