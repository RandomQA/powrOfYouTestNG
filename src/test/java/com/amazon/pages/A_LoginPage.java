package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class A_LoginPage {
    public A_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Hello, Sign in']")
    public WebElement signInMenu;

    @FindBy(className = "nav-action-inner")
    public WebElement signInButton;

    @FindBy(id = "ap_email")
    public WebElement emailTextBox;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordTextBox;

    @FindBy(id = "signInSubmit")
    public WebElement LastSingInButton;
}
