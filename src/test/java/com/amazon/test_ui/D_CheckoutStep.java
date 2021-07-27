package com.amazon.test_ui;

import com.amazon.pages.D_CheckoutStepPage;
import com.amazon.utilities.*;
import org.testng.annotations.Test;

public class D_CheckoutStep {

    //=============In this method i am checking my products on checkout page==========//
    @Test (priority = 3)
    public void checkoutStep(){


        D_CheckoutStepPage d_checkoutStepPage=new D_CheckoutStepPage();


        d_checkoutStepPage.proceedToCheckout.click();
        Log4j.info("Proceed to the checkout page");


        d_checkoutStepPage.adressButton.click();
        Log4j.info("Adress entered to the system.");


        String fileName = "products";
        WriteToText.write(fileName,
                "======================\n======================\n2f. PRODUCT NAME ON CHECKOUT: \n"
                        + d_checkoutStepPage.productNameCheckout.getText());
        Log4j.info("Product Value added to the products txt file.");


        WriteToText.write(fileName,
                "\nPRODUCT VALUE ON CHECKOUT : \n"
                        + d_checkoutStepPage.priceCheckout.getText());
        Log4j.info("Product Value added to the products txt file.");


        WriteToText.write(fileName,
                "\nPRODUCT QUANTITY ON CHECKOUT: \n"
                        + d_checkoutStepPage.totalProductonCheckout.getText());
        Log4j.info("Product Quantity added to the products txt file.");


        WriteToText.write(fileName,
                "\nTOTAL VALUE ON CHECKOUT : \n"
                        + d_checkoutStepPage.priceCheckout.getText());
        Log4j.info("Product Value added to the products txt file.");


        Driver.closeDriver();
    }
}

