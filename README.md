# PromoCommerceE2ETestWithSelenium

A professional End-to-End (E2E) test automation framework built using **Selenium WebDriver** and **Java** to automate and validate critical user journeys in a  promo commerce applications.
The framework is designed following Page Object Model (POM), Data-Driven Testing, and Clean Architecture principles, with Allure Reports for rich and interactive test reporting and GitHub Actions for CI execution.

---

## 🎯 Overview

This project automates the complete E2E flow of a promo commerce web application, including:

- User authentication
- Home page navigation
- Product selection
- Checkout process
- Order completion validation  
The goal is to ensure application stability, high test coverage, and maintainable automation code.
---

## 🧠 Technologies & Tools
- Java
- Selenium WebDriver
- TestNG
- Maven
- Allure Report
- GitHub Actions (CI/CD)
- Page Object Model (POM)
- Data-Driven Testing
---

## 📋 Prerequisites
- Java Development Kit (JDK) installed
- IDE (eg: IntelliJ IDEA, Eclipse)
- Maven or Gradle installed

## Installation
### Step 1: Clone the Repository

```bash
git clone https://github.com/Fatma-shehata123/PromoCommerceE2ETestWithSelenium.git
```

### Step 2: Navigate to the project directory:
```bash
cd PromoCommerceE2ETestWithSelenium
```
### Step 3: Install Project Dependencies

```bash
mvn clean install  
```
#### Run the tests:

```bash
mvn clean test
```
---

## 📁 Project Structure

```
PromoCommerceE2ETestWithSelenium
│
├── .github/
│   └── workflows/
│       └── action.yml                # GitHub Actions CI configuration
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── promoCommerce/
│   │   │   │   └── pages/
│   │   │   │       ├── BasePage.java
│   │   │   │       ├── HomePage.java
│   │   │   │       ├── LoginPage.java
│   │   │   │       └── CheckoutPage.java
│   │   │
│   │   │   └── utils/
│   │   │       ├── Actions.java
│   │   │       ├── Assertions.java
│   │   │       ├── Wait.java
│   │   │       └── reader/
│   │   │           ├── ConfigManager.java
│   │   │           ├── JsonUtils.java
│   │   │           └── ResourceLoader.java
│   │
│   └── test/
│       └── java/
│           ├── promoCommerceTest/
│           │   ├── BaseTest.java
│           │   └── E2ETest.java
│           │
│           └── promoCommerceTestData/
│               ├── LoginTestData.java
│               ├── ItemsTestData.java
│               └── CheckoutTestData.java
│
├── pom.xml
└── README.md
```

---
## 🧩 Framework Design
### 🔹 Page Object Model (POM)
- Each web page has a dedicated class
- UI locators and actions are isolated from test logic
- Improves readability and maintainability

### 🔹 Base Classes
- BasePage → common Selenium actions for all pages
- BaseTest → WebDriver initialization and teardown

### 🔹 Utilities Layer
- Actions → custom Selenium actions
- Wait → explicit waits handling
- Assertions → centralized assertion logic
- ConfigManager → environment and configuration management
- JsonUtils → reading test data from JSON files
  
## 📊 Allure Report Integration
### 🔹 Allure Features Used
- Test execution overview
- Step-by-step test details
- Passed / Failed / Skipped tests
- Attachments (screenshots on failure)
- Execution timeline
---

## 🧪 Running Tests

### Maven Command Line

```bash
# Clean build and run all tests
mvn clean test

# Run tests without cleaning
mvn test
```
---
## 👩‍💻 Author

- Fatma Shehata
- Software Testing Engineer
