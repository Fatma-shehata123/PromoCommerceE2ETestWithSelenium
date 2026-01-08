package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Actions extends Wait{

    private final WebDriver driver;

    public Actions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterTextToField(By locator, String text) {
//        var element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void clickOnButton(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void singleSelectUsingVisibleText(By locator, String optionText) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(optionText);
    }

    public void selectRadio(By element) {
        driver.findElement(element).click();
    }
}






