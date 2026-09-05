# Software Test Automation with Selenium

A maintainable web UI test automation framework built with **Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM)**.

## Project Overview

This project demonstrates practical QA automation skills by automating a sample e-commerce application using reusable page objects and TestNG test cases.

**Application under test:** SauceDemo — https://www.saucedemo.com/

## Tech Stack

- Java 17
- Selenium WebDriver 4
- TestNG
- Maven
- Page Object Model (POM)
- GitHub Actions CI

## Automated Scenarios

- Verify successful login with valid credentials
- Verify login validation with invalid credentials
- Verify a product can be added to the shopping cart
- Verify the selected product appears in the cart

## Framework Structure

```text
src
├── main/java
│   ├── base
│   │   └── BaseTest.java
│   └── pages
│       ├── LoginPage.java
│       ├── ProductsPage.java
│       └── CartPage.java
│
└── test/java
    └── tests
        ├── LoginTest.java
        └── CartTest.java

pom.xml
testng.xml
.github/workflows/ci.yml
```

## Design Approach

The framework follows the Page Object Model pattern. Locators and page actions are kept inside page classes, while test classes focus on business scenarios and assertions. A reusable base class manages WebDriver setup and teardown.

## Run Locally

### Prerequisites

- JDK 17 or later
- Maven 3.8+
- Google Chrome

Recent Selenium versions can manage the required browser driver automatically through Selenium Manager.

### Execute Tests

```bash
mvn clean test
```

## Continuous Integration

A GitHub Actions workflow runs the Maven test suite on pushes and pull requests targeting the `main` branch.

## Skills Demonstrated

Selenium WebDriver, Java, TestNG, Maven, Page Object Model, test automation, assertions, reusable test setup/teardown, Git, and CI/CD basics.
