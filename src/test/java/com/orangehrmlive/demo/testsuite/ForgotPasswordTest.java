package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.forgotPassword();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.verifyMessage(), expectedMessage, "Message not found");
    }
}