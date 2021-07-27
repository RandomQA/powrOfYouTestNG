package com.amazon.test_ui;

import com.amazon.pages.A_LoginPage;
import com.amazon.utilities.*;

public class A_LoginAmazon {

    //=============In this method; i am log in to the Amazon page.================//
    public void loginAmazon() {


        A_LoginPage a_LoginPage = new A_LoginPage();


        ReusableMethods.hover(a_LoginPage.signInMenu);
        Log4j.info("Hower over to the Sign In Menu");


        ReusableMethods.waitFor(2);
        Log4j.info("Waiting for loading of page");


        a_LoginPage.signInButton.click();
        Log4j.info("Sign In button is Clicked");


        a_LoginPage.emailTextBox.sendKeys(ConfigReader.getProperty("email"));
        Log4j.info("Email Entered.");


        a_LoginPage.continueButton.click();
        Log4j.info("Continue button Clicked");


        a_LoginPage.passwordTextBox.clear();
        Log4j.info("Password TextBox cleared.");


        a_LoginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
        Log4j.info("Password Entered.");


        a_LoginPage.LastSingInButton.click();
        Log4j.info("Sign In button is Clicked");
    }
}
