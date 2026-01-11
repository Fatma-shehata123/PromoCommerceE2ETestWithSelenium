package promoCommerce.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Assertions;

public class LoginPage extends BasePage {
    private Assertions assertions = new Assertions(driver);

    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //locators
    private final String expectedUrl = "https://rahulshettyacademy.com/angularpractice/";
    private final String expectedTitle = "ProtoCommerce";
    private final By userNameFieldLocator = By.xpath("(//input[@name=\"name\"])[1]");
    private final By emailFieldLocator = By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid");
    private final By passwordFieldLocator = By.cssSelector("[id=\"exampleInputPassword1\"]");
    private final By genderFieldLocator =  By.cssSelector("[id=\"exampleFormControlSelect1\"]");
    private final By employmentStatusFieldLocator =  By.cssSelector("[id=\"inlineRadio1\"]");
    private final By dateOfBirthFieldLocator =  By.cssSelector("[name=\"bday\"]");
    private final By submitBtnLocator = By.cssSelector("[class=\"btn btn-success\"]");
    private final By visibleText =  By.xpath("//strong");
    private final By twoWayDataFieldLocator =  By.xpath("(//input[@name=\"name\"])[2]");
    @Step("Assert that the login page url is expected")
    public void assertToLoginUrl(){
        assertions.assertUrlEquals(expectedUrl);
    }
    @Step("Assert that the login page title is expected")
    public void assertToLoginTitle(){
        assertions.assertTitleEquals(expectedTitle);
    }
    @Step("Enter the username")
    public void enterUserNameToField(String userName) {
        actions.sendTextToField(this.userNameFieldLocator, userName);
    }
    @Step("Enter the email")
    public void enterEmailToField(String email) {
        actions.sendTextToField(this.emailFieldLocator, email);
    }
    @Step("Enter the password")
    public void enterPasswordToField(String password) {
        actions.sendTextToField(this.passwordFieldLocator, password);
    }
    @Step("Choose the gender from drop down")
    public void selectGender(String gender) {
        actions.singleSelectUsingVisibleText(this.genderFieldLocator, gender);
    }
    @Step("Choose the employment status")
    public void selectEmploymentStatus() {
        actions.selectRadio(this.employmentStatusFieldLocator);
    }
    @Step("Choose the employment status")
    public void enterDateOfBirthToField(String date) {
        actions.sendTextToField(this.dateOfBirthFieldLocator, date);
    }
    @Step("Enter the date of birth")
    public void clickOnSubmitBtn() {
        actions.clickOnButton(this.submitBtnLocator);
    }
    @Step("Enter the two way Data")
    public void enterTextToTwoWayDataField(String twoWayData){
        actions.sendTextToField(this.twoWayDataFieldLocator, twoWayData);
    }
}




