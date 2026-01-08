package promoCommerce.pages;

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

    public void ClickOnHomePageButton(){
        actions.clickOnButton(this.homePageLocator);
    }

    public By addItemWithTextToCart(String itemName){
        return By.xpath("//*[contains(text(),'" + itemName + "')]/../../..//button");
    }

    public void clickAddItemToCart(String itemName){
        actions.clickOnButton(addItemWithTextToCart(itemName));
    }

    public void ClickOnCheckOutButton(){
        actions.clickOnButton(this.ckeckOutBtn);
    }
}
