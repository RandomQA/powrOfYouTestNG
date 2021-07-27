package com.amazon.test_ui;

import com.amazon.pages.C_AddingProductToCartPage;
import com.amazon.utilities.*;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.util.List;

public class C_AddingProductToCart {

    //=============In this method i am adding a product to the cart.==================//
    @Test (priority = 2)
    public void addingProductToCart() {


        C_AddingProductToCartPage c_addingProductToCartPage=new C_AddingProductToCartPage(); //Created an Object from C_AddingProductToCartPage


        List<WebElement> allProducts = Driver.getDriver().findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col sg-col-4-of-20']"));
        allProducts.get(0).click();
        Log4j.info("Clicked the first product");


        String fileName = "products";
        WriteToText.write
                (fileName, "======================\n======================\n2c. ITEM NAME : \n"
                        + c_addingProductToCartPage.productTitle.getText());
        Log4j.info("Product Name added to the products txt file.");


        c_addingProductToCartPage.addToCart.click();
        Log4j.info("Product added to cart.");


        c_addingProductToCartPage.showCart.click();
        Log4j.info("Cart button is clicked.");


        ReusableMethods.waitFor(4);
        Log4j.info("Waiting for loading of page");


        WriteToText.write(fileName,
                "======================\n======================\n2e. PRODUCT NAME ON CART : \n"
                        + c_addingProductToCartPage.productName.getText());
        Log4j.info("Product Name added to the products txt file.");


        WriteToText.write(fileName,
                "\nPRODUCT VALUE ON CART: \n"
                        + c_addingProductToCartPage.productValue.getText());
        Log4j.info("Product Value added to the products txt file.");


        WriteToText.write(fileName,
                "\nPRODUCT QUANTITY ON CART: \n"
                        + c_addingProductToCartPage.productQuantity.getText());
        Log4j.info("Product Quantity added to the products txt file.");


        WriteToText.write(fileName,
                "\nTOTAL VALUE OF PRODUCT ON CART : \n"
                        + c_addingProductToCartPage.totalValueOfProduct.getText());
        Log4j.info("Product Total Value added to the products txt file.");


        WriteToText.write(fileName,
                "\nTOTAL NUMBER OF PRODUCT ON CART : \n"
                        + c_addingProductToCartPage.totalProduct.getText());
        Log4j.info("Counts of Product added to the products txt file.");


        Driver.getDriver().navigate().back();
        Log4j.info("Navigate back to the homePage ");
    }
}

