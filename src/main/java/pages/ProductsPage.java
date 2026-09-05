package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private final WebDriver driver;

    private final By pageTitle = By.cssSelector("span.title");
    private final By backpackAddButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartLink = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public ProductsPage addBackpackToCart() {
        driver.findElement(backpackAddButton).click();
        return this;
    }

    public boolean isBackpackAdded() {
        return driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
    }

    public CartPage openCart() {
        driver.findElement(cartLink).click();
        return new CartPage(driver);
    }
}
