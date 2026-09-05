package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CartTest extends BaseTest {

    @Test(description = "Verify a product can be added to the shopping cart")
    public void addProductToCartTest() {
        ProductsPage productsPage = new LoginPage(driver)
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        productsPage.addBackpackToCart();
        Assert.assertTrue(productsPage.isBackpackAdded(), "Backpack should be added to the cart");

        CartPage cartPage = productsPage.openCart();
        Assert.assertEquals(cartPage.getPageTitle(), "Your Cart");
        Assert.assertTrue(cartPage.containsBackpack(), "Cart should contain the Sauce Labs Backpack");
    }
}
