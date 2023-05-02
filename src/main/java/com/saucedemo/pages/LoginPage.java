package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.xpath("//input[@id='user-name']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");


    /**
     * enter EmailId
     * @param email
     */
    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    /**
     * enter Password
     * @param password
     */
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    /**
     * click On Login Button
     */
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


}
