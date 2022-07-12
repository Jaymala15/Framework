package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {

    WebDriver driver;
    public LoginLocators(WebDriver ldriver)
    {
        this.driver = ldriver;
    }

    @FindBy(id = "email")
    WebElement username;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(name = "login")
    WebElement LogInButton;

    public void LoginToApplication(String uname, String pass)
    {
        username.sendKeys(uname);
        password.sendKeys(pass);
        LogInButton.click();
    }
}
