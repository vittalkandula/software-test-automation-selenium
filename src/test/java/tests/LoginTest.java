package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest {

    @Test(description = "Verify successful login with valid credentials")
    public void validLoginTest() {
        ProductsPage productsPage = new LoginPage(driver)
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        Assert.assertEquals(productsPage.getPageTitle(), "Products");
    }

    @Test(description = "Verify login validation for invalid credentials")
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("invalid_user")
                .enterPassword("invalid_password")
                .clickLogin();

        Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"));
    }
}
