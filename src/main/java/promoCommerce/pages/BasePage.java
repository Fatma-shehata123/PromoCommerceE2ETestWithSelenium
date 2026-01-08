package promoCommerce.pages;

import org.openqa.selenium.WebDriver;
import utils.Actions;

public class BasePage {
    protected WebDriver driver;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }
}

