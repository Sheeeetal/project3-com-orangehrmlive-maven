package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility
{   By usernameField = By.name("username");
    public void enterUsername(String Username){
        sendTextToElement(usernameField, Username);
    }

    By passwordField = By.name("password");
    public void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }

    By clickOnLoginButton = By.xpath("//button[normalize-space()='Login']");
    public void loginButton(){
        clickOnElement(clickOnLoginButton);
    }

    By clickOnForgotPassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    public void forgotPassword(){
        clickOnElement(clickOnForgotPassword);
    }

    By verifyResetPassword = By.xpath("//h6[normalize-space()='Reset Password']");
    public String verifyMessage() {
        return getTextFromElement(verifyResetPassword);
    }
}

