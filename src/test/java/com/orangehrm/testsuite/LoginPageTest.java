package com.orangehrm.testsuite;


import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"smoke", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        String expectedMessage  = "Dashboard";
        Assert.assertEquals(loginPage.getHeaderTitleDashboard(),expectedMessage,"Login page not displayed");
    }
}
