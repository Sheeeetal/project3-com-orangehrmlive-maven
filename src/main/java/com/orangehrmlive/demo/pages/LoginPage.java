package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {By usernameField = By.name("username");

    public void enterUserName(String name){
        sendTextToElement(usernameField,name);
    }

    By passwordField = By.name("password");

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    By clickOnLoginButton = By.xpath("//button[@type='submit']");

    public void loginButton(){
        clickOnElement(clickOnLoginButton);
    }
    By verifyDashboardText = By.xpath("//h6[contains(@class,'header-breadcrumb-module')]");

    public String verifyMessage(){
        return getTextFromElement(verifyDashboardText);
    }


}
