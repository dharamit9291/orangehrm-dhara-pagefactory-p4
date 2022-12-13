package com.orangehrm.testsuite;

import com.orangehrm.pages.ForgotPasswordPage;
import com.orangehrm.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPassword = new ForgotPasswordPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPassword.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.getResetPasswordMessage(), expectedMessage, "Not matching message");
    }
}
