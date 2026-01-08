package utils;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Wait {
    protected FluentWait<WebDriver> wait;
    protected ArrayList<Class<? extends Exception>> expectedExceptions = new ArrayList<>();

    public Wait(WebDriver driver) {

        // Exceptions
        expectedExceptions.add(ClassCastException.class);
        expectedExceptions.add(org.openqa.selenium.NoSuchElementException.class);
        expectedExceptions.add(org.openqa.selenium.StaleElementReferenceException.class);
        expectedExceptions.add(org.openqa.selenium.JavascriptException.class);
        expectedExceptions.add(org.openqa.selenium.ElementClickInterceptedException.class);
        expectedExceptions.add(org.openqa.selenium.ElementNotInteractableException.class);
        expectedExceptions.add(org.openqa.selenium.InvalidElementStateException.class);
        expectedExceptions.add(org.openqa.selenium.interactions.MoveTargetOutOfBoundsException.class);
        expectedExceptions.add(org.openqa.selenium.WebDriverException.class);
        expectedExceptions.add(ExecutionException.class);
        expectedExceptions.add(InterruptedException.class);
        expectedExceptions.add(NoAlertPresentException.class);

        // FluentWait
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(200))
                .ignoreAll(expectedExceptions);
    }
}

