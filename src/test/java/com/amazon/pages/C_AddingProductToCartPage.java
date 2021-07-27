package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_AddingProductToCartPage {
    public C_AddingProductToCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "productTitle")
    public WebElement productTitle;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(id = "hlb-view-cart-announce")
    public WebElement showCart;

    @FindBy(className = "a-truncate-cut")
    public WebElement productName;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    public WebElement productValue;

    @FindBy(id = "nav-cart-count")
    public WebElement productQuantity;

    @FindBy(id = "sc-subtotal-label-activecart")
    public WebElement totalProduct;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")
    public WebElement totalValueOfProduct;
}
