# PromoCommerceE2ETestWithSelenium

A comprehensive End-to-End testing framework for promo commerce applications using **Selenium WebDriver** and **Java**.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Running Tests](#running-tests)
- [Test Scenarios](#test-scenarios)
- [Page Object Model](#page-object-model)
- [Best Practices](#best-practices)
- [Troubleshooting](#troubleshooting)
- [Test Reporting](#test-reporting)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Resources](#resources)

---

## 🎯 Overview

PromoCommerceE2ETestWithSelenium is a robust, maintainable automation testing framework designed to validate promo commerce functionalities through end-to-end testing. Built with Selenium WebDriver and Java, this framework provides a solid foundation for testing web applications with a focus on reliability, reusability, and scalability.

This framework ensures comprehensive test coverage of user workflows, including:
- User authentication and account management
- Product browsing and search functionality
- Promotional offers and discounts application
- Shopping cart operations
- Checkout and payment processing
- Order confirmation and tracking

---

## ✨ Features

- ✅ **Selenium WebDriver Integration** - Industry-standard web automation tool
- 📦 **Maven-Based Build** - Efficient dependency management and project structure
- 🏗️ **Page Object Model (POM)** - Maintainable and scalable test architecture
- 🔍 **Comprehensive Test Coverage** - Complete end-to-end user workflows
- ⚙️ **Configuration Management** - Flexible environment configurations
- 📊 **Test Reporting** - Detailed HTML test execution reports
- 🔄 **Cross-Browser Testing** - Support for Chrome, Firefox, Safari, and Edge
- 🎯 **Parallel Execution** - Run tests in parallel for faster feedback
- 📝 **Logging & Debugging** - Comprehensive logging for troubleshooting
- ⏱️ **Wait Strategies** - Smart waits for reliable test execution
- 🔐 **Secure Credential Management** - Safe handling of test credentials
- 📦 **Reusable Components** - Base classes and utilities for code reuse

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed on your system:

### Core Requirements

- **Java Development Kit (JDK)** - Version 8 or higher
  - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
  - Verify: `java -version`

- **Maven** - Version 3.6.0 or higher
  - [Download Maven](https://maven.apache.org/download.cgi)
  - Verify: `mvn -version`

- **Git** - For version control
  - [Download Git](https://git-scm.com/)
  - Verify: `git --version`

### Browser Drivers

Download and configure the appropriate drivers for your browsers:

- **ChromeDriver** - For Chrome/Chromium
  - [Download ChromeDriver](https://chromedriver.chromium.org/)
  - Version should match your Chrome browser version

- **GeckoDriver** - For Firefox
  - [Download GeckoDriver](https://github.com/mozilla/geckodriver/releases)

- **WebDriver for Edge** - For Microsoft Edge
  - [Download EdgeDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)

- **SafariDriver** - For Safari (usually included with Xcode)

### IDE (Optional but Recommended)

- **IntelliJ IDEA** - [Download](https://www.jetbrains.com/idea/)
- **Eclipse** - [Download](https://www.eclipse.org/)
- **Visual Studio Code** - [Download](https://code.visualstudio.com/)

---

## 🚀 Installation

### Step 1: Clone the Repository

```bash
git clone https://github.com/Fatma-shehata123/PromoCommerceE2ETestWithSelenium.git
cd PromoCommerceE2ETestWithSelenium
```

### Step 2: Verify Java Installation

```bash
java -version
javac -version
```

Expected output should show Java 8 or higher.

### Step 3: Verify Maven Installation

```bash
mvn -version
```

### Step 4: Install Project Dependencies

```bash
mvn clean install
```

This command will:
- Clean previous builds
- Download all required dependencies from Maven repositories
- Compile the project
- Run any tests during installation

### Step 5: Configure WebDriver Paths (Optional)

Add drivers to your system PATH or configure in the project:

**Windows:**
```bash
set PATH=%PATH%;C:\path\to\drivers
```

**macOS/Linux:**
```bash
export PATH=$PATH:/path/to/drivers
```

Or set in code:
```java
System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
```

---

## 📁 Project Structure

```
PromoCommerceE2ETestWithSelenium/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/                    # Page Object Model classes
│   │       │   ├── BasePage.java
│   │       │   ├── LoginPage.java
│   │       │   ├── HomePage.java
│   │       │   ├── ProductPage.java
│   │       │   ├── CartPage.java
│   │       │   ├── CheckoutPage.java
│   │       │   └── OrderConfirmationPage.java
│   │       │
│   │       ├── utils/                   # Utility classes and helpers
│   │       │   ├── DriverManager.java
│   │       │   ├── WaitHelper.java
│   │       │   ├── ExcelDataProvider.java
│   │       │   ├── ConfigReader.java
│   │       │   ├── ScreenshotUtility.java
│   │       │   └── LoggerUtility.java
│   │       │
│   │       ├── config/                  # Configuration management
│   │       │   ├── ConfigProperty.java
│   │       │   └── Constants.java
│   │       │
│   │       └── base/                    # Base classes
│   │           └── TestBase.java
│   │
│   └── test/
│       └── java/
│           ├── tests/                   # Test classes
│           │   ├── LoginTest.java
│           │   ├── ProductSearchTest.java
│           │   ├── ShoppingCartTest.java
│           │   ├── CheckoutTest.java
│           │   ├── PromoCodeTest.java
│           │   └── OrderTest.java
│           │
│           └── resources/               # Test resources
│               ├── config.properties
│               ├── testdata.xlsx
│               └── log4j.properties
│
├── target/                              # Built artifacts and reports
│   └── surefire-reports/
│
├── pom.xml                              # Maven configuration file
├── .gitignore                           # Git ignore patterns
├── README.md                            # This file
└── .github/                             # GitHub workflows (CI/CD)
    └── workflows/
        └── tests.yml
```

---

## 🏃 Getting Started

### Quick Start

1. **Clone and setup the project**
```bash
git clone https://github.com/Fatma-shehata123/PromoCommerceE2ETestWithSelenium.git
cd PromoCommerceE2ETestWithSelenium
mvn clean install
```

2. **Configure your environment**
```bash
# Edit src/test/resources/config.properties
base.url=https://your-app-url.com
browser=Chrome
implicitly.wait=10
```

3. **Run your first test**
```bash
mvn test
```

### Running Tests

#### Run All Tests
```bash
mvn clean test
```

#### Run Specific Test Class
```bash
mvn test -Dtest=LoginTest
```

#### Run Specific Test Method
```bash
mvn test -Dtest=LoginTest#validLoginTest
```

#### Run Multiple Test Classes
```bash
mvn test -Dtest=LoginTest,ProductSearchTest,CartTest
```

#### Run Tests with Specific Browser
```bash
mvn test -Dbrowser=Firefox
```

#### Run Tests with Tags
```bash
mvn test -Dgroups=smoke
mvn test -Dgroups=regression
mvn test -Dgroups=smoke,sanity
```

#### Run Tests in Parallel
```bash
mvn test -DthreadCount=3 -DthreadCountSuites=1
```

---

## ⚙️ Configuration

### Environment Configuration File

Create or update `src/test/resources/config.properties`:

```properties
# ============================================
# Application Configuration
# ============================================
base.url=https://your-promo-commerce-app.com
api.base.url=https://api.your-app.com

# ============================================
# Browser Configuration
# ============================================
browser=Chrome
# Options: Chrome, Firefox, Safari, Edge, IE

# Headless mode (true/false)
headless=false

# Browser window size
window.width=1920
window.height=1080

# ============================================
# Wait Configuration (in seconds)
# ============================================
implicitly.wait=10
explicitly.wait=15
page.load.timeout=30

# ============================================
# Logging Configuration
# ============================================
log.level=INFO
screenshot.on.failure=true

# ============================================
# Credentials (Use environment variables in production!)
# ============================================
username=testuser@example.com
password=Test@123456

# ============================================
# Test Data
# ============================================
testdata.file=testdata.xlsx
```

### Log4j Configuration

Create `src/test/resources/log4j.properties`:

```properties
# Set root logger level to DEBUG and its only appender to A1.
log4j.rootLogger=DEBUG, A1

# A1 is set to be a ConsoleAppender.
log4j.appender.A1=org.apache.log4j.ConsoleAppender

# A1 uses PatternLayout.
log4j.appender.A1.layout=org.apache.log4j.PatternLayout
log4j.appender.A1.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n

# File Appender
log4j.appender.FILE=org.apache.log4j.FileAppender
log4j.appender.FILE.File=logs/test_execution.log
log4j.appender.FILE.layout=org.apache.log4j.PatternLayout
log4j.appender.FILE.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
```

---

## 🧪 Running Tests

### Maven Command Line

```bash
# Clean build and run all tests
mvn clean test

# Run tests without cleaning
mvn test

# Run specific test suite
mvn test -Dtest=SmokeTests

# Run with custom configuration
mvn test -Dbrowser=Chrome -Dbase.url=https://staging.app.com
```

### Using IDE

**IntelliJ IDEA:**
1. Right-click test class/method → Run
2. Right-click test class/method → Run with Coverage

**Eclipse:**
1. Right-click test class → Run As → JUnit Test
2. Use Test Runner interface

**VS Code:**
1. Install Test Explorer for Java
2. Click Run on test method/class

### Continuous Integration

Tests can be automatically run on code push using GitHub Actions. See `.github/workflows/tests.yml`

---

## 📋 Test Scenarios

### 1. Login Tests (LoginTest.java)
- ✓ Valid login with correct credentials
- ✓ Invalid login with wrong credentials
- ✓ Empty email field validation
- ✓ Empty password field validation
- ✓ Session persistence after login
- ✓ Logout functionality

### 2. Product Search Tests (ProductSearchTest.java)
- ✓ Search by product name
- ✓ Search by category
- ✓ Filter by price range
- ✓ Filter by ratings
- ✓ Sort by price (ascending/descending)
- ✓ Sort by popularity
- ✓ No results message display

### 3. Shopping Cart Tests (ShoppingCartTest.java)
- ✓ Add product to cart
- ✓ Remove product from cart
- ✓ Update product quantity
- ✓ Apply coupon code
- ✓ Remove coupon code
- ✓ Calculate cart total correctly
- ✓ Cart persistence after logout

### 4. Promotional Code Tests (PromoCodeTest.java)
- ✓ Apply valid promo code
- ✓ Apply expired promo code
- ✓ Apply invalid promo code
- ✓ Apply multiple promo codes
- ✓ Promo code discount calculation
- ✓ Promo code terms and conditions

### 5. Checkout Tests (CheckoutTest.java)
- ✓ Complete checkout process
- ✓ Fill billing address
- ✓ Select shipping method
- ✓ Verify order summary
- ✓ Apply promo during checkout
- ✓ Payment method selection

### 6. Order Tests (OrderTest.java)
- ✓ Order confirmation display
- ✓ Order number generation
- ✓ Order email verification
- ✓ Order tracking
- ✓ Order history retrieval
- ✓ Download invoice

---

## 🏗️ Page Object Model

### BasePage Class

All page classes inherit from `BasePage`:

```java
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    protected void clickElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    
    protected void enterText(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }
    
    protected String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
}
```

### Page Object Example

```java
public class LoginPage extends BasePage {
    
    // Locators
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[text()='Login']");
    private By errorMessage = By.className("error-message");
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    // Page Methods
    public void enterEmail(String email) {
        enterText(emailField, email);
    }
    
    public void enterPassword(String password) {
        enterText(passwordField, password);
    }
    
    public void clickLoginButton() {
        clickElement(loginButton);
    }
    
    public String getErrorMessage() {
        return getText(errorMessage);
    }
    
    public boolean isErrorMessageDisplayed() {
        return isElementVisible(errorMessage);
    }
}
```

### Test Class Example

```java
@Test
public class LoginTest extends TestBase {
    
    private LoginPage loginPage;
    
    @BeforeMethod
    public void setUp() {
        driver = initializeDriver();
        loginPage = new LoginPage(driver);
    }
    
    @Test(description = "Verify user can login with valid credentials")
    public void validLoginTest() {
        loginPage.enterEmail("user@example.com");
        loginPage.enterPassword("Password@123");
        loginPage.clickLoginButton();
        
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.com/home");
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
```

---

## 📝 Best Practices

### 1. Use Explicit Waits

```java
// ❌ Bad
Thread.sleep(5000);

// ✅ Good
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOf(element));
```

### 2. Page Object Model Pattern

```java
// ❌ Avoid
driver.findElement(By.id("email")).sendKeys("user@test.com");

// ✅ Use
loginPage.enterEmail("user@test.com");
```

### 3. Meaningful Test Names and Descriptions

```java
// ✅ Good
@Test(description = "Verify user receives error when entering invalid credentials")
public void invalidCredentialsErrorTest() { }

// ❌ Avoid
@Test
public void test1() { }
```

### 4. Test Data Management

```java
// ✅ Separate test data from test logic
@DataProvider(name = "validUsers")
public Object[][] validUsers() {
    return new Object[][] {
        {"user1@test.com", "Pass@123"},
        {"user2@test.com", "Pass@456"}
    };
}

@Test(dataProvider = "validUsers")
public void loginTest(String email, String password) { }
```

### 5. Assertion Best Practices

```java
// ✅ Use meaningful assertions
Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
Assert.assertTrue(element.isDisplayed(), "Element should be visible");
Assert.assertFalse(element.isEnabled(), "Element should be disabled");
```

### 6. Exception Handling

```java
try {
    element.click();
} catch (NoSuchElementException e) {
    logger.error("Element not found", e);
    Assert.fail("Required element not found: " + e.getMessage());
}
```

### 7. Logging

```java
logger.info("Navigating to login page");
logger.debug("Entering email: " + email);
logger.warn("Retry attempt " + retryCount);
logger.error("Test failed due to: " + exception);
```

### 8. Screenshot on Failure

```java
@AfterMethod
public void captureScreenshotOnFailure(ITestResult result) {
    if (ITestResult.FAILURE == result.getStatus()) {
        ScreenshotUtility.takeScreenshot(driver, result.getName());
    }
}
```

---

## 🐛 Troubleshooting

### Issue 1: NoSuchElementException

**Problem:** Element not found on the page

**Solutions:**
```java
// 1. Verify locator accuracy
WebElement element = driver.findElement(By.xpath("//correct/xpath"));

// 2. Use explicit wait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.presenceOfElementLocated(locator));

// 3. Check if element is inside iframe
driver.switchTo().frame(frameElement);
element = driver.findElement(locator);
driver.switchTo().defaultContent();
```

### Issue 2: StaleElementReferenceException

**Problem:** Element is no longer attached to the DOM

**Solution:**
```java
// Re-locate the element
WebElement element = driver.findElement(locator);
element.click();
```

### Issue 3: TimeoutException

**Problem:** Wait condition not met within timeout period

**Solution:**
```java
// Increase wait time
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

// Or use FluentWait for more control
Wait<WebDriver> wait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(20))
    .pollingEvery(Duration.ofSeconds(2))
    .ignoring(NoSuchElementException.class);
```

### Issue 4: ChromeDriver Version Mismatch

**Problem:** WebDriver version doesn't match browser version

**Solution:**
```bash
# Update ChromeDriver to match Chrome version
# Check Chrome version: Menu → About Google Chrome
# Download matching driver: https://chromedriver.chromium.org/
```

### Issue 5: Tests Passing Locally but Failing in CI/CD

**Problem:** Environment-specific issues

**Solutions:**
```java
// 1. Use headless mode for CI/CD
if (System.getProperty("headless") != null) {
    options.addArguments("--headless");
}

// 2. Increase wait times for slower CI/CD environments
int waitTime = System.getenv("CI") != null ? 20 : 10;
wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));

// 3. Disable browser cache in CI/CD
options.addArguments("--incognito");
```

### Issue 6: Flaky Tests

**Problem:** Tests fail intermittently

**Solutions:**
```java
// 1. Use explicit waits instead of sleep
// 2. Retry failed tests
@Test(retryAnalyzer = RetryAnalyzer.class)
public void flakyTest() { }

// 3. Add synchronization waits
waitForElementAndClick(element);
```

---

## 📊 Test Reporting

### View Test Reports

After running tests, reports are generated in `target/surefire-reports/`:

```bash
# Generate HTML report
mvn surefire-report:report

# View report
open target/site/surefire-report.html  # macOS
start target/site/surefire-report.html # Windows
```

### Report Contents

- ✓ Test execution summary
- ✓ Test pass/fail statistics
- ✓ Test execution time
- ✓ Failure details
- ✓ System information

### Integration with CI/CD

Reports are automatically generated and can be viewed in:
- GitHub Actions: Summary tab
- Jenkins: Test Result Trend
- Azure Pipelines: Test Plans

---

## 🤝 Contributing

### How to Contribute

1. **Fork the repository**
```bash
Click 'Fork' button on GitHub
```

2. **Create a feature branch**
```bash
git checkout -b feature/add-new-tests
```

3. **Make your changes**
- Add new test classes
- Enhance existing tests
- Improve documentation

4. **Commit your changes**
```bash
git commit -m "Add: New test for checkout functionality"
```

5. **Push to your fork**
```bash
git push origin feature/add-new-tests
```

6. **Create a Pull Request**
- Go to GitHub
- Click 'New Pull Request'
- Add description of changes
- Submit for review

### Contribution Guidelines

- Follow the existing code style
- Add meaningful commit messages
- Include tests for new features
- Update documentation
- Ensure all tests pass

---

## 📄 License

This project is licensed under the MIT License.

```
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 📧 Contact

For questions, issues, or suggestions, please reach out:

- **Author**: Fatma Shehata
- **GitHub**: [@Fatma-shehata123](https://github.com/Fatma-shehata123)
- **Email**: fatma.shehata@example.com
- **LinkedIn**: [Your LinkedIn Profile]

---

## 🔗 Resources

### Selenium Documentation
- [Selenium Official Documentation](https://www.selenium.dev/documentation/)
- [WebDriver API Reference](https://www.selenium.dev/webdriver/)
- [Best Practices](https://www.selenium.dev/documentation/test_practices/)

### Java Testing
- [TestNG Documentation](https://testng.org/)
- [JUnit 4 Documentation](https://junit.org/junit4/)
- [Java Best Practices](https://www.oracle.com/java/technologies/)

### Page Object Model
- [Page Object Models](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
- [Design Patterns in Test Automation](https://www.browserstack.com/guide/page-object-model-in-selenium)

### Maven
- [Maven Official Documentation](https://maven.apache.org/guides/)
- [POM Reference](https://maven.apache.org/pom.html)

### CI/CD
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Jenkins Selenium Integration](https://www.jenkins.io/)

---

## 📈 Project Statistics

- **Language**: Java (100%)
- **Build Tool**: Maven
- **Testing Framework**: TestNG / JUnit
- **Automation Tool**: Selenium WebDriver
- **Current Version**: 1.0.0
- **Last Updated**: 2026-02-26

---

## 🙏 Acknowledgments

- Selenium community
- TestNG contributors
- All contributors who have helped with bug reports and feature requests

---

## ⭐ Show Your Support

If you find this project helpful, please consider:
- ⭐ Starring the repository
- 📤 Sharing with others
- 🤝 Contributing improvements
- 📝 Reporting issues

---

**Happy Testing! 🧪**