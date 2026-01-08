package utils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Assertions {

    private final WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl(){
       return driver.getCurrentUrl();
    }
    public String getTitle(){
        return driver.getTitle();
    }

    public void assertUrlEquals(String expectedUrl) {
        Assert.assertEquals(expectedUrl,
                            getUrl(),
                            "The expected url"+ expectedUrl +" is not match to the actual url"+  getUrl());
    }

    public void assertTitleEquals(String expectedTitle) {
        Assert.assertEquals(expectedTitle,
                            getTitle(),
                            "The expected title"+ expectedTitle +" is not match to the actual title"+  getTitle());
    }
    public void assertToEquals(String expectedValue, String actualValue) {
        Assert.assertEquals(expectedValue,
                            expectedValue ,
                            "The expected value is not match to the actual value");
    }
}
