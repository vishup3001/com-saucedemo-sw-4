package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        String expectedText = "Products";
        // Enter “standard_user” username
        loginPage.enterEmailId("standard_user");
        // Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // wait for title to display
        waitUntilVisibilityOfElementLocated(By.xpath("//span[@class='title']"), 5);
        // Verify that product message is displayed
        String actualText = homePage.getProductMessage();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        int expectedText = 6;
        // Enter “standard_user” username
        loginPage.enterEmailId("standard_user");
        // Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // wait for product to display
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='inventory_item']"), 5);
        // Verify that six products are displayed on page
        int actualText = homePage.getNumberofProductOnHomePage();
        Assert.assertEquals(actualText, expectedText, "product not display");
    }


}
