package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        LoginPage loginPage = new LoginPage();
        //login with valid username
        loginPage.enterUserName("Admin");

        //login with valid password
        loginPage.enterPassword("admin123");

        //click on loginButton
        loginPage.loginButton();

        //verify Dashboard text
        String expectedText = "Dashboard";
        String actualText = loginPage.verifyMessage();
        Assert.assertEquals(actualText,expectedText,"page not displayed");
    }
}

