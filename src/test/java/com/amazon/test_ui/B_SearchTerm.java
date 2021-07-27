package com.amazon.test_ui;

import com.amazon.pages.A_LoginPage;
import com.amazon.pages.B_SearchTermPage;
import com.amazon.utilities.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class B_SearchTerm {

    //=============In this method i am searching the specific product name.=======//
    @Test (priority = 1)
    public void searchTerm() {


        A_LoginPage a_loginPage = new A_LoginPage(); //Created an Object from A_LoginPage
        B_SearchTermPage b_searchTermPage=new B_SearchTermPage();


        Log4j.startLog("Test  is Starting");   // I used Log4j for taking logs.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Log4j.info("Opening Page : " + ConfigReader.getProperty("url"));


        A_LoginAmazon a_loginAmazon=new A_LoginAmazon(); //Created an Object from A_LoginAmazon
        a_loginAmazon.loginAmazon();


        b_searchTermPage.searchTextBox.sendKeys(ConfigReader.getProperty("searchItem"));
        Log4j.info("Search term typed to the textbox");


        String termOfSearch = Driver.getDriver().findElement(By.id("twotabsearchtextbox")).getAttribute("value");
        Log4j.info("Search term taken from the search textbox.");


        String fileName = "products";
        WriteToText.write(fileName, "2b. SEARCH TERM : \n" + termOfSearch);
        Log4j.info("Product details taken from Website to products txt file.");


        ReusableMethods.waitForPageToLoad(3);
        Log4j.info("Waiting for loading of page");


        b_searchTermPage.searchButton.click();
        Log4j.info("Clicked the search button");


        ReusableMethods.waitFor(2);
        Log4j.info("Waiting for loading of page");
    }
}

