package com.orangehrm.pages;


import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordTitle;

    public void clickOnForgotPasswordLink() {
        Reporter.log("Click on forgot password link : " + forgotPasswordLink.getText());
        clickOnElement(forgotPasswordLink);
    }

    public String getResetPasswordMessage() {
        Reporter.log("Get password reset message :  " + resetPasswordTitle.getText());
        return getTextFromElement(resetPasswordTitle);
    }
}
