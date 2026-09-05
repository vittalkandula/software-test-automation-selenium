package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage enterUsername(String value) {
        driver.findElement(username).sendKeys(value);
        return this;
    }

    public LoginPage enterPassword(String value) {
        driver.findElement(password).sendKeys(value);
        return this;
    }

    public ProductsPage clickLogin() {
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
