package promoCommerce.pages;

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

    public void assertToUrlEquals(){
        assertions.assertUrlEquals(expectedUrl);
    }
    public void assertToTitleEquals(){
        assertions.assertTitleEquals(expectedTitle);
    }

    public void enterUserNameToField(String userName) {
        actions.enterTextToField(this.userNameFieldLocator, userName);
    }
    public void enterEmailToField(String email) {
        actions.enterTextToField(this.emailFieldLocator, email);
    }
    public void enterPasswordToField(String password) {
        actions.enterTextToField(this.passwordFieldLocator, password);
    }
    public void selectGender(String gender) {
        actions.singleSelectUsingVisibleText(this.genderFieldLocator, gender);
    }
    public void selectEmploymentStatus() {
        actions.selectRadio(this.employmentStatusFieldLocator);
    }
    public void enterDateOfBirthToField(String date) {
        actions.enterTextToField(this.dateOfBirthFieldLocator, date);
    }
    public void clickOnSubmitBtn() {
        actions.clickOnButton(this.submitBtnLocator);
    }
    public void enterTextToTwoWayData(String twoWayData){
        actions.enterTextToField(this.twoWayDataFieldLocator, twoWayData);
    }
}




