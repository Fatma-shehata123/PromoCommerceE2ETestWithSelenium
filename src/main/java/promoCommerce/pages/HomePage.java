package promoCommerce.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    //constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //locators
    private  final By homePageLocator = By.cssSelector("[href=\"/angularpractice/shop\"]");
    private final By ckeckOutBtn = By.cssSelector("[class=\"nav-link btn btn-primary\"]");
    //locator method
    public By addItemWithTextToCart(String itemName){
        return By.xpath("//*[contains(text(),'" + itemName + "')]/../../..//button");
    }
    @Step("Navigate to Home page")
    public void ClickOnHomePageButton(){
        actions.clickOnButton(this.homePageLocator);
    }
    @Step("Add item to cart: {itemName}")
    public void clickAddItemToCart(String itemName){
        actions.clickOnButton(addItemWithTextToCart(itemName));
    }
    @Step("Click on Checkout button")
    public void clickOnCheckOutButton(){
        actions.clickOnButton(this.ckeckOutBtn);
    }
}
