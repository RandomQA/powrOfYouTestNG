package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_CheckoutStepPage {
    public D_CheckoutStepPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "hlb-ptc-btn-native")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//a[@data-action='page-spinner-show']")
    public WebElement adressButton;

    @FindBy(xpath = "//*[@id='shippingOptionFormId']/div[2]/div/div[1]/div/div/ul/li/div/strong")
    public WebElement productNameCheckout;

    @FindBy(xpath = "//span[@class='a-color-price']")
    public WebElement priceCheckout;

    @FindBy(xpath = "//span[@class='a-color-secondary']")
    public WebElement totalProductonCheckout;

}
