package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;
    private final By pageTitle = By.cssSelector("span.title");
    private final By backpack = By.id("item_4_title_link");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public boolean containsBackpack() {
        return driver.findElement(backpack).isDisplayed();
    }
}
